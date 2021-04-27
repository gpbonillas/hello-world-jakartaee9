package ec.gob.epmrpsd;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello World";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String doGreeting(@PathParam("name") String name, @QueryParam("language") String language) {
        return "Hello " + name + " with language " + language;
    }
}
