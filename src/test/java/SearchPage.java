import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection articlesTitle = $$x("//h2//a");


    /**
     * return href from first article
     * @return
     */
    public String getHrefFromFirstArticle() {
        return articlesTitle.first().getAttribute("href");

    }
}
