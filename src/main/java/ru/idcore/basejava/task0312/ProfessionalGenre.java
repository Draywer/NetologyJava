package ru.idcore.basejava.task0312;

/*Профессиональная литература*/
public class ProfessionalGenre extends GenreByContent {
    @Override
    public String getGenreName() {
        return GenreType.GENRE_TYPE_PROFESSIONAL.name();
    }
}
