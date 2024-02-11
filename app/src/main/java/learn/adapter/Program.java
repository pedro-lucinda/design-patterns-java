package learn.adapter;

public class Program {
  public static void main(String[] args) {
    WebAdapter adapter = new WebAdapter();
    WebService service = new WebService();
    adapter.connect(service);
    int result = adapter.request("Hello");
    System.out.println(result);
  }

}
