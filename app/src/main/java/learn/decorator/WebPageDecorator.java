package learn.decorator;

public abstract class WebPageDecorator implements WebpageInterface {
  protected WebpageInterface page;

  public WebPageDecorator(WebpageInterface page) {
    this.page = page;
  }

  public void display() {
    this.page.display();
  }

}
