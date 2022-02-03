package ch.zuehlke.fullstack.domain.model;

import ch.zuehlke.fullstack.annotations.ExampleAnnotation;

import java.util.Date;
import java.util.List;

@ExampleAnnotation
public class BookDto {

    private Integer id;
    private String isbn;
    private String title;
    private List<String> authorList;
    private Date publishDate;
    private String subtitle;
    private Double rating;
    private List<ThumbnailDto> thumbnails;
    private String description;

    public BookDto(Integer id, String isbn, String title, List<String> authorList, Date publishDate, String subtitle, Double rating, List<ThumbnailDto> thumbnails, String description) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.authorList = authorList;
        this.publishDate = publishDate;
        this.subtitle = subtitle;
        this.rating = rating;
        this.thumbnails = thumbnails;
        this.description = description;
    }

    public BookDto() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<ThumbnailDto> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<ThumbnailDto> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
