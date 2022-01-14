package ch.zuehlke.fullstack.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Book {
    private String isbn;
    private String title;
    private List<String> authorList;
    private Date publishDate;
    private String subtitle;
    private Double rating;
    private Map<String, String> thumbnails;
    private String description;

    public Book(String isbn, String title, List<String> authorList, Date publishDate, String subtitle, Double rating, Map<String, String> thumbnails, String description) {
        this.isbn = isbn;
        this.title = title;
        this.authorList = authorList;
        this.publishDate = publishDate;
        this.subtitle = subtitle;
        this.rating = rating;
        this.thumbnails = thumbnails;
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<String> authorList) {
        this.authorList = authorList;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Map<String, String>  getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Map<String, String>  thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
