package restfull.jersey.first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/helloworld")
public class Helloworld {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		 return "<p>Hola mundo</p>";
	}
	
}
