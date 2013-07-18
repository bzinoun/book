package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Category extends Model {
@Id
public Long id;
public String label;
public static Finder<Long, Category> find =
new Finder<Long, Category>(Long.class, Category.class);




}