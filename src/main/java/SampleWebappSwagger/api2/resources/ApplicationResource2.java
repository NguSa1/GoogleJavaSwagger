package SampleWebappSwagger.api2.resources;


//import io.swagger.v3.oas.annotations.OpenAPIDefinition;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

//@OpenAPIDefinition
@Path("/res2")
public class ApplicationResource2 {

    // @GET is request method annotator
    @GET
    @Path("/dino2")
    public Response sayHi() {
        return Response.status(Response.Status.OK)
                .entity("Hello World")
                .build();
    }

}