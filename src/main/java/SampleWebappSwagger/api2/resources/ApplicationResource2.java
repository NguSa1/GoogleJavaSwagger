package SampleWebappSwagger.api2.resources;


//import io.swagger.v3.oas.annotations.OpenAPIDefinition;

import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/res2")
@Server(
        description = "operation server 2",
        url = "/{var2}",
        variables = {
                @ServerVariable(name = "var2", description = "var 2", defaultValue = "api2", allowableValues = {"api1", "api2"})
        })
public class ApplicationResource2 {

    // @GET is request method annotator
    @GET
    @Path("/dino2")
    public Response sayHi() {
        return Response.status(Response.Status.OK)
                .entity("Hello World 2")
                .build();
    }

}