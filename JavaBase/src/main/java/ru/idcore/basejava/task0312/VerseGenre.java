package ru.idcore.basejava.task0312;

/*Стих*/
public class VerseGenre extends GenreByForm {
    @Override
    public String getGenreName() {
        return GenreType.GENRE_TYPE_VERSE.name();
    }
}
