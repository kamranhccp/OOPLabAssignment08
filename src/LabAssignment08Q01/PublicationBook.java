package LabAssignment08Q01;

public class PublicationBook {
    protected String publicationTitle;
    protected long publicationPrice;

    public PublicationBook(String publicationTitle, long publicationPrice) {
        this.publicationTitle = publicationTitle;
        this.publicationPrice = publicationPrice;
    }

    public void setPublicationTitle(String pTitle){
        publicationTitle = pTitle;
    }

    public void setPublicationPrice(long pPrice){
        publicationPrice = pPrice;
    }

    public String getPublicationTitle(){
        return publicationTitle;
    }

    public long getPublicationPrice(){
        return publicationPrice;
    }

    public void publicationBDisplay(){
        System.out.println("=================================");
        System.out.println("    PUBLICATION/TAPE DETAILS     ");
        System.out.println("=================================");
        System.out.println(
                "Title of Publication: " + publicationTitle + "\n" +
                "Price of Publication: " + publicationPrice);
    }
}
