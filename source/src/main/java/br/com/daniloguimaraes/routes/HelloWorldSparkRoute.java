package br.com.daniloguimaraes.routes;

import static spark.Spark.get;

public class HelloWorldSparkRoute implements ISparkRoute {

	@Override
	public void initRoute() {
		get("/", (req, res) -> "Hello World");
	}
}
