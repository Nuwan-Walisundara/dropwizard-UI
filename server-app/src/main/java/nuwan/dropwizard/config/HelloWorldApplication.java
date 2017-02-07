package nuwan.dropwizard.config;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import nuwan.dropwizard.service.HelloWorldResource;

public class HelloWorldApplication extends Application<HelloWorldConfiguration>{

	@Override
	public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
	    bootstrap.addBundle(new AssetsBundle("/assets/", "/", "index.html"));
	}
	@Override
	public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {
		 final HelloWorldResource resource = new HelloWorldResource(    );
			    environment.jersey().register(resource);
		
	}

	public static void main(String[] args) {
		try {
			new HelloWorldApplication().run(args);
		}   catch (Exception e) {
			System.out.println("Unable to start the server " + e.getMessage());
		}
	}
}
