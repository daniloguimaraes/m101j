package br.com.daniloguimaraes.routes;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class AnotherSparkRoute implements ISparkRoute {
	
	@Override
	public void initRoute() {
		Spark.get("/hi", new Route() {
			
			@Override
			public Object handle(Request arg0, Response arg1) throws Exception {
				return "Hi, I'm another spark route!";
			}
		});
		
	}

}
