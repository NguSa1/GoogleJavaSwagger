package SampleWebappSwagger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class ApplicationResource {

// @GET is request method annotator
    @GET
    @Path("/dino")
    public Response sayHi() {
        return Response.status(Response.Status.OK)
                .entity("Hello World")
                .build();
    }

}
