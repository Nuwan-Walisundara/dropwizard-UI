package nuwan.dropwizard.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

	@GET
	@Path("/{user}")
	public Response syHello( @PathParam("user") String user){
		return Response.status(HttpStatus.SC_OK).entity("hello "+user).build();
	}
}
