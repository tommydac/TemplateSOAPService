package template.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ITemplateService {
	@WebMethod()
	String sayHello(@WebParam(name="myName") String myName);
}
