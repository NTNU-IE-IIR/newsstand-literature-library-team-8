public class Book {

    // the title og the book
    private String title;

    //book's publisher
    private String publisher;

    //the book's author
    private String author;

    // release year of the book
    private int releaseYear;

    // the book's publisher
    private String genre;

    // Price for the book
    private int price;

    /**
     * Creates an instance of the class Book.
     * sets the title, publisher and genre.
     *
     * @param title The title of the book
     * @param author The author of the book
     * @param releaseYear The yeare the book was released
     */
    public Book(String title, String author, int releaseYear)
    {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    /**
     * Creates an instance of the class Book.
     * sets the title, publisher and genre.
     *
     * @param title The title of the book
     * @param author The author of the book
     * @param releaseYear The yeare the book was released
     * @param publisher The publisher of the book
     * @param genre The genre of the book
     * @param price The price of the book
     */
    private Book(String title, String author, int releaseYear, String publisher, String genre, int price)
    {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.publisher = publisher;
        this.genre = genre;
        this.price = price;
    }

    /**
     * Returns the title of the book
     * @return the title of the book
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * Returns the author of the book
     * @return the author of the book
     */
    public String getAuthor()
    {
        return this.title;
    }

    /**
     * Returns the release yeare of the book
     * @return the yeare of release of the book
     */
    public int getReleaseYear()
    {
        return this.releaseYear;
    }

    /**
     * Returns the publisher of the book
     * @return the publisher of release of the book
     */
    public String getPublisher()
    {
        return this.publisher;
    }

    /**
     * Returns the genre of the book
     * @return the genre of release of the book
     */
    public String getGenre()
    {
        return this.genre;
    }

    /**
     * Returns the price of the book
     * @return the price of release of the book
     */
    public int  getPrice()
    {
        return this.price;
    }

    /**
     * Set the publisher of the book.
     */
    private void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    /**
     * Set the genre of the book.
     */
    private void setgenre(String genre)
    {
        this.genre = genre;
    }

    /**
     * Set the price of the book.
     */
    private void setPrice(int price)
    {
        this.price = price;
    }
}