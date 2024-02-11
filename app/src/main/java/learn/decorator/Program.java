package learn.decorator;

public class Program {
  public static void main(String args[]) {
    WebpageInterface myPage = new BasicWebpage();
    myPage = new AuthorizedWebPage(myPage);
    myPage = new AuthenticatedWebpage(myPage);
    myPage.display();
  }
}
