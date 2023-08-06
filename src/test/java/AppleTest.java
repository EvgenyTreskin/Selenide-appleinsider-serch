import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest extends BaseTest {
    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_REQUEST = "чем отличается iphone 14 от iphone 13";
    private final static String EXPECTED_WORD = "iphone-14";

    @Test
    public void checkHref() throws InterruptedException {
        MainPage mainPage = new MainPage(BASE_URL);
        Thread.sleep(3000);
        mainPage.search(SEARCH_REQUEST);
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirstArticle();
        boolean contains = href.contains(EXPECTED_WORD);
        Assertions.assertTrue(contains);
    }


}
