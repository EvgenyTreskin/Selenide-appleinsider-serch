import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Main page appleinsider.ru
 */

public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage(String URL) {
        Selenide.open(URL);
    }

    /**
     * search on website in articles and press Enter button
     *
     * @param searchString
     */

    public void search(String searchString) throws InterruptedException {
        textBoxInput.setValue(searchString).sendKeys(Keys.ENTER);
    }

}
