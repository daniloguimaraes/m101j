package br.com.daniloguimaraes.routes;

import static spark.Spark.*;

public class NewPostSparkRoute implements ISparkRoute {

	@Override
	public void initRoute() {
		get("/newpost", (req, res) -> getNewPostHtmlForm());
	}
	

	String getNewPostHtmlForm() {
		return "new post form goes here";
	}
}
