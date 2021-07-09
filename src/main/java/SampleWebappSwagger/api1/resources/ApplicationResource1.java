package SampleWebappSwagger.api1.resources;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/res1")
@Server(
        description = "operation server 1",
        url = "/api1"
        )
public class ApplicationResource1 {

// @GET is request method annotator
    @GET
    @Path("/dino1")
    @Operation(tags = "test1")
    public Response sayHi() {
        return Response.status(Response.Status.OK)
                .entity("Hello World")
                .build();
    }
}
