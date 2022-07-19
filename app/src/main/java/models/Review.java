package models;

import java.util.Objects;

public class Review {
  public static final String DISPLAY = "DISPLAY";
  public static final String DELETED = "DELETED";

  public static final String AUTHOR = "작성자";
  public static final String TITLE = "제목";
  public static final String TEXT = "내용";

  private String author;
  private String password;
  private String title;
  private String text;
  private String state;

  public Review(String author, String password, String title, String text) {
    this.author = author;
    this.password = password;
    this.title = title;
    this.text = text;
    this.state = DISPLAY;
  }

  public Review(String author, String password, String title, String text, String state) {
    this.author = author;
    this.password = password;
    this.title = title;
    this.text = text;
    this.state = state;
  }

  public String author() {
    return author;
  }

  public String password() {
    return password;
  }

  public String title() {
    return title;
  }

  public String text() {
    return text;
  }

  public String state() {
    return state;
  }

  public void modifyAuthor(String author) {
    this.author = author;
  }

  public void modifyTitle(String title) {
    this.title = title;
  }

  public void modifyText(String text) {
    this.text = text;
  }

  public void deleted() {
    this.state = DELETED;
  }

  public String toCsvRow() {
    return String.join(",", author, password, title, text, state);
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public boolean equals(Object other) {
    Review otherReview = (Review) other;
    return Objects.equals(this.author, otherReview.author)
        && Objects.equals(this.password, otherReview.password)
        && Objects.equals(this.title, otherReview.title)
        && Objects.equals(this.text, otherReview.text)
        && Objects.equals(this.state, otherReview.state);
  }
}
