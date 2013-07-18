package controllers;
import models.Bookmark;
import models.Category;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

public static Result index() {

return ok(index.render("Vous pouvez commencer a saisir ...",
Bookmark.find.fetch("category").orderBy("title").findList(),
Category.find.orderBy("label").findList()));
}

}