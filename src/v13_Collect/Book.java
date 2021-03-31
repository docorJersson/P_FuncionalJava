package v13_Collect;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private final String isbn;
    private final String tittle;
    private final int yearofPublication;
    private final Genre genre;

    public Book(String isbn, String tittle, int yearofPublication, Genre genre) {
        Objects.requireNonNull(isbn);
        Objects.requireNonNull(tittle);
        Objects.requireNonNull(yearofPublication);
        Objects.requireNonNull(genre);
        this.isbn = isbn;
        this.tittle = tittle;
        this.yearofPublication = yearofPublication;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTittle() {
        return tittle;
    }

    public int getYearofPublication() {
        return yearofPublication;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "{" + "isbn=" + isbn + ", tittle=" + tittle + ", yearofPublication=" + yearofPublication + ", genre=" + genre + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, tittle, yearofPublication, genre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.yearofPublication != other.yearofPublication) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.tittle, other.tittle)) {
            return false;
        }
        if (this.genre != other.genre) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Book t) {
        return this.getTittle().compareTo(t.getTittle());
    }

}
