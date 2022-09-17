public class Main {
    public static void main(String[] args) {
        org.junit.Assert.assertEquals(0, Library.totalBooks);
        // org.junit.Assert.assertEquals(0, Book.lastBookTitle());     // err
        // org.junit.Assert.assertEquals(0, Book.getTitle());          // err

        Book goneGirl = new Book("Gone Girl");
        Book fightClub = new Book("Fight Club");

        org.junit.Assert.assertEquals("Gone Girl", goneGirl.title);
        org.junit.Assert.assertEquals("Fight Club", Book.lastBookTitle());
        org.junit.Assert.assertEquals("Fight Club", fightClub.lastBookTitle());
        org.junit.Assert.assertEquals("Fight Club", goneGirl.last.title);

        Library libraryA = new Library(1);
        Library libraryB = new Library(2);
        libraryA.addBook(goneGirl);

        org.junit.Assert.assertEquals(1, libraryA.index);
        org.junit.Assert.assertEquals(1, libraryA.totalBooks);

        libraryA.totalBooks = 0;
        libraryB.addBook(fightClub);
        libraryB.addBook(goneGirl);

        org.junit.Assert.assertEquals(2, libraryB.index);
        org.junit.Assert.assertEquals(2, Library.totalBooks);
        org.junit.Assert.assertEquals("Fight Club", goneGirl.library.books[0].title);
    }
}
