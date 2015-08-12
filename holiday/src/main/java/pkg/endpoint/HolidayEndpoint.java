package pkg.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import pkg.schema.beans.HolidayRequest;
import pkg.service.PrintService;

@Endpoint
public class HolidayEndpoint {
	
	private static final String NAMESPACE_URI = "http://mycompany.com/hr/schemas";
	
	@Autowired
	private PrintService printService;
	
	public void setPrintService(PrintService printService) {
		this.printService = printService;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "HolidayRequest")
	public void handleHolidayRequest(@RequestPayload HolidayRequest request) {
				
		printService.printObject(request);
		
	}

}
