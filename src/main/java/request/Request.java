package request;

import java.net.http.HttpRequest;

public interface Request {
		
	public abstract HttpRequest getRequest ();
	public abstract HttpRequest postRequest(String bodyString);

}
