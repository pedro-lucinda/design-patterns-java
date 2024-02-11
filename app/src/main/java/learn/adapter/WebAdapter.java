package learn.adapter;

import org.json.JSONObject;

public class WebAdapter implements WebRequester {
  private WebService service;

  public void connect(WebService currentService) {
    this.service = currentService;
  }

  public int request(Object request) {
    try {
      JSONObject result = this.toJSON(request);
      JSONObject response = this.service.request(result);

      if (response != null) {
        return 200; // OK
      }
    } catch (Exception e) {
      // Log the error, handle the exception, or return an error code
      return 500; // Internal Server Error
    }
    return 500; // Internal Server Error
  }

  private JSONObject toJSON(Object input) {
    return new JSONObject(input);
  }
}
