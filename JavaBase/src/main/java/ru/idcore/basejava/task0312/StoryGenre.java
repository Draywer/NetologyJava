package ru.idcore.basejava.task0312;

/*Повесть*/
public class StoryGenre extends GenreByNumberOfPages {
    @Override
    public String getGenreName() {
        return GenreType.GENRE_TYPE_STORY.name();
    }
}
