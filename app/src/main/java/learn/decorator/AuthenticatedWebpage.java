package learn.decorator;

public class AuthenticatedWebpage extends WebPageDecorator {

  public AuthenticatedWebpage(WebpageInterface page) {
    super(page);
  }

  public void authenticateUser() {
    System.out.println("User authenticated");
  }

  public void display() {
    authenticateUser();
    super.display();
  }

}
