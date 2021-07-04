package SampleWebappSwagger.api2;

import SampleWebappSwagger.api1.resources.ApplicationResource1;
import SampleWebappSwagger.api2.resources.ApplicationResource2;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

public class Api2Config extends ResourceConfig {

    public Api2Config() {
        register(ApplicationResource2.class);
    }
}
