package home06.epam.task06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookLogic {
    Scanner scanner = new Scanner(System.in);

    public List<Book> getAuthorBooks(List<Book> bks) {
        List<Book> resultAuthorBooks = new ArrayList<Book>();

        System.out.println("Enter the author you are interested in: ");
        String author = scanner.nextLine();

        for (Book bk : bks) {
            if (bk.getAuthors().equals(author)) {
                resultAuthorBooks.add(bk);
            }
        }
        return resultAuthorBooks;
    }

    public List<Book> getPublishingHouse(List<Book> bks) {
        List<Book> resultPublishingHouse = new ArrayList<Book>();

        System.out.println("Enter the publisher you are interested in");
        String publishingHouse = scanner.nextLine();

        for (Book bk : bks) {
            if (bk.getPublishingHouse().equals(publishingHouse)) {
                resultPublishingHouse.add(bk);
            }
        }
        return resultPublishingHouse;
    }

    public List<Book> listOfBooksReleasedAfterAGivenYear(List<Book> bks) {
        List<Book> result = new ArrayList<Book>();

        System.out.println("Enter the year you are interested in: ");
        int year = scanner.nextInt();

        for (Book bk : bks) {
            if (bk.getYearOfPublishing() >= year) {
                result.add(bk);
            }
        }
        return result;
    }
}
