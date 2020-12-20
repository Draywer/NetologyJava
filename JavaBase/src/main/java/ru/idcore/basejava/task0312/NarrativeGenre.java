package ru.idcore.basejava.task0312;

/*Рассказ*/
public class NarrativeGenre extends GenreByNumberOfPages {
    @Override
    public String getGenreName() {
        return GenreType.GENRE_TYPE_NARRATIVE.name();
    }
}
