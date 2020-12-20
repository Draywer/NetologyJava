package ru.idcore.basejava.task0312;

/*Роман*/
public class NovelGenre extends GenreByNumberOfPages {
    @Override
    public String getGenreName() {
        return GenreType.GENRE_TYPE_NOVEL.name();
    }
}
