package SampleWebappSwagger.api1;

import SampleWebappSwagger.api1.resources.ApplicationResource1;
import SampleWebappSwagger.api2.resources.ApplicationResource2;
//import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.v3.jaxrs2.integration.resources.AcceptHeaderOpenApiResource;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.models.OpenAPI;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ApplicationPath("/resources/api")
public class Api1Config extends ResourceConfig {

    public Api1Config() {
//        super(MultiPartFeature.class);
//        packages("SampleWebappSwagger.api1.resources");
//        register(io.swagger.jaxrs.listing.ApiListingResource.class);
//        register(io.swagger.jaxrs.listing.SwaggerSerializers.class);
//
//        BeanConfig beanConfig = new BeanConfig();
//        beanConfig.setVersion("1.0.2");
//        beanConfig.setSchemes(new String[]{"http"});
//        beanConfig.setHost("localhost:8080");
//        beanConfig.setBasePath("/resources/api");
//        beanConfig.setResourcePackage("SampleWebappSwagger.api1.resources");
//        beanConfig.setScan(true);
        register(ApplicationResource1.class);
    }
}