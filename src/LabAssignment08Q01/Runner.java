package LabAssignment08Q01;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("<== Enter your Details ==>");

        System.out.print("Enter Publication Title: ");
        String publicationTitle = input.nextLine();

        System.out.print("Enter Publication Price: ");
        long publicationPrice = input.nextLong();

        System.out.print("Enter Page Count: ");
        int pageCount = input.nextInt();

        BookPageCount bpc1 = new BookPageCount(publicationTitle, publicationPrice, pageCount);

        bpc1.countPDisplay();
    }
}
