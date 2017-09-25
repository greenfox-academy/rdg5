public class BlogPost {

  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public static void main(String[] args) {
    BlogPost firstPost = new BlogPost("John Doe", "Lorem Ipsum", "Lorem Ipsum dolor sit amet.",
        "2000.05.04");
    BlogPost secondPost = new BlogPost("Tim Urban", "Wait but why",
        "A popular long-form, stick-figure-illustrated blog about almost everything.",
        "2010.10.10");
    BlogPost thirdPost = new BlogPost("William Turton",
        "One Engineer Is Trying to Get IBM to Reckon With Trump",
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
        "2017.03.28");
  }
}
