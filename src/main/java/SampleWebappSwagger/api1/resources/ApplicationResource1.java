package SampleWebappSwagger.api1.resources;

//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.servers.Server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/res1")
public class ApplicationResource1 {

// @GET is request method annotator
    @GET
    @Path("/dino1")
    public Response sayHi() {
        return Response.status(Response.Status.OK)
                .entity("Hello World")
                .build();
    }
}
