package template.server;

import javax.jws.WebService;

@WebService(endpointInterface = "template.server.ITemplateService")
public class TemplateSeviceImpl implements ITemplateService {
	public String sayHello(String myName) {
		return "Hello " + myName + " !, Hope you are doing well !!";
	}
}
