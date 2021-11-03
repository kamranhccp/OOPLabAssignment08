package LabAssignment08Q01;
public class BookPageCount extends PublicationBook{
    protected int pageCount;

    public BookPageCount(String publicationTitle, long publicationPrice, int pageCount){
        super(publicationTitle, publicationPrice);

        this.pageCount = pageCount;
    }

    public void setPageCount(int pCount){
        pageCount = pCount;
    }

    public long getPageCount(){
        return pageCount;
    }

    public void countPDisplay(){
        System.out.println("<=== Page Count Details ===>" + "\n");
        super.publicationBDisplay();
        System.out.println("Page Count of Book: " + pageCount + "\n");
    }
}
