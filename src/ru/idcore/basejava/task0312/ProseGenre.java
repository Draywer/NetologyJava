package ru.idcore.basejava.task0312;

/*Проза*/
public class ProseGenre extends GenreByForm {
    @Override
    public String getGenreName() {
        return GenreType.GENRE_TYPE_PROSE.name();
    }
}
