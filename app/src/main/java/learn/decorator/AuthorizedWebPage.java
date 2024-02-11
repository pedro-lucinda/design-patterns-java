package learn.decorator;

public class AuthorizedWebPage extends WebPageDecorator {

  public AuthorizedWebPage(WebpageInterface page) {
    super(page);
  }

  public void authorizeUser() {
    System.out.println("User authorized");
  }

  public void display() {
    authorizeUser();
    super.display();
  }
}
