package models;

import javax.persistence.*;

import play.db.ebean.Model;

@Entity
public class Bookmark extends Model{
	@Id
	public Long id;
	public String title;
	public String url;
	public String details;
	@ManyToOne
	public Category category; 
	
	public static Finder<Long ,Bookmark> find = new Finder<Long , Bookmark> (Long.class , Bookmark.class);
	
	public static void saveIt(Bookmark bookmark) {
		bookmark.save ();

		}

		public static void deleteIt(Long id) {
		  find.ref(id).delete();
		}
	
}
