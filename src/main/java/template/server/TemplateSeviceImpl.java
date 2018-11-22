package template.server;

import java.time.LocalDate;

import javax.jws.WebService;

@WebService(endpointInterface = "template.server.ITemplateService")
public class TemplateSeviceImpl implements ITemplateService {
	public String sayHello(String myName) {
		LocalDate date = LocalDate.of(20, 12, 20);
		return "Hello " + myName + " !, Hope you are doing well !!";
	}
}
