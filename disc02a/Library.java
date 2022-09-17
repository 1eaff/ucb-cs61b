public class Library {

    public Book[] books;
    public int index;
    public static int totalBooks = 0;

    public Library(int size) {
        books = new Book[size];
        index = 0;
    }

    public void addBook(Book book) {
        books[index] = book;
        index++;
        totalBooks++;
        book.library = this;
    }

    /**
     * 1. Change the `totalBooks` variable to non static: O
     * 2. Change the `lastBookTitle` method to non static: O
     * 3. Change the `addBook` method to static: X
     * 4. Change the last variable to non static: O
     * 5. Change the `library` variable to static: O
     */
}
