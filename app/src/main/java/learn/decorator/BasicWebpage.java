package learn.decorator;

public class BasicWebpage implements WebpageInterface {
  private String html;
  private String styleSheet;
  private String scripts;

  public void display() {
    System.out.print("display webpage");
  }

}
