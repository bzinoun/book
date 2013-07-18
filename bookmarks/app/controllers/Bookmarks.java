package controllers;

import models.Bookmark;
import play.mvc.Result;
import play.data.Form;
import play.data.Form.Display;
import play.mvc.Controller;


public class Bookmarks extends Controller {

	public static Result add() {
		final Form<Bookmark> bookmarkForm = Form.form(Bookmark.class).bindFromRequest();
		final Bookmark bookmark = bookmarkForm.get();
		Bookmark.saveIt(bookmark);
		return redirect(routes.Application.index());

	}

}
