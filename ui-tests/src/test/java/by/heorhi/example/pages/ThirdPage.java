package by.heorhi.example.pages;

public class ThirdPage extends AbstractPage {

    public void openPage() {
        this.navigateFromBaseUrl("thirdPage");
    }

    public Integer getInputsCount() {
        return getPage().querySelectorAll("input").size();
    }
}
