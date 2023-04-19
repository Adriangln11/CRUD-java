package Logic;


public class Autor {
    private int id;
    private String url;
    private String author_id;
    private String name;
    private String affiliations;
    private String email;

    public Autor(int id,String url, String author_id,String name,String affiliations,String email) {
        this.id = id;
        this.url = url;
        this.author_id = author_id;
        this.name = name;
        this.affiliations = affiliations;
        this.email = email;
    }

    public Autor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getAuthorId() {
        return author_id;
    }

    public void setAuthorId(String author_id) {
        this.author_id = author_id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }  public String getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(String affiliations) {
        this.affiliations = affiliations;
    }  public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
