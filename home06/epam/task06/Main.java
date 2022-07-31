package home06.epam.task06;

//Создать класс Book, спецификация которого приведена ниже.
// Определить конструкторы, set- и get- методы и метод  equals. hashCode, toString().
// Создать второй класс, агрегирующий список типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.add(new Book(12, "Мёртвые души", "Гоголь", "Бумеранг", 1942, 400, 35, "твердый переплет"));
        bookLibrary.add(new Book(134, "Мастер и Маргарита", "Булгаков", "Первый", 1940, 434, 53, "твердый переплет"));
        bookLibrary.add(new Book(122, "Ревизор", "Гоголь", "Первый", 1836, 360, 23, "Мягкий переплет"));
        bookLibrary.add(new Book(11, "Собачье сердце", "Булгаков", "Бумеранг", 1925, 335, 65, "твердый переплет"));
        bookLibrary.add(new Book(138, "Дубровский", "Пушкин", "Бумеранг", 1833, 655, 73, "Мягкий переплет"));

        BookLogic bookLogic = new BookLogic();

        List<Book> resultAuthorBooks = bookLogic.getAuthorBooks(bookLibrary.getBooks());

        List<Book> resultPublishingHouse = bookLogic.getPublishingHouse(bookLibrary.getBooks());

        List<Book> result = bookLogic.listOfBooksReleasedAfterAGivenYear(bookLibrary.getBooks());

        BookPrint bookPrint = new BookPrint();

        System.out.println("список книг заданного автора");
        bookPrint.printTheBestBooks(resultAuthorBooks);
        System.out.println();

        System.out.println("список книг, выпущенных заданным издательством");
        bookPrint.printTheBestBooks(resultPublishingHouse);
        System.out.println();

        System.out.println("список книг, выпущенных после заданного года");
        bookPrint.printTheBestBooks(result);
        System.out.println();

    }
}
