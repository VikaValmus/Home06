package home06.epam.task06;

import java.util.List;

public class BookPrint {
    public void printTheBestBooks(List<Book> bks) {
        for (Book bk : bks) {
            System.out.println(bk.getId() + " \"" + bk.getTitle() + "\" " + bk.getAuthors() + " \"" + bk.getPublishingHouse() + "\" " + bk.getYearOfPublishing() + " " + bk.getNumberOfPages() + " " + bk.getPrice() + " " + bk.getBindingType());
        }
    }
}
