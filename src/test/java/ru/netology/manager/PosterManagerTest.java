package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.domain.Films;
import ru.netology.repository.PosterRepository;


import static org.mockito.Mockito.*;

class PosterManagerTest {

    private PosterRepository repository = Mockito.mock(PosterRepository.class);
    private PosterManager manager = new PosterManager(repository);



    private Films first = new Films(1, "Бладшот", "Боевик", false);
    private Films second = new Films(2, "Вперед", "Мультфильм", false);
    private Films third = new Films(3, "Отель Белград", "Комедия", false);
    private Films fourth = new Films(4, "Джентельмены", "Боевик", false);
    private Films fifth = new Films(5, "Человек-невидимка", "Ужасы", false);
    private Films sixth = new Films(6, "Тролли. Мировой тур", "Мультфильм", true);
    private Films seventh = new Films(7, "Номер Один", "Комедия", true);
    private Films eighth = new Films(8, "Наемник", "Боевик", false);
    private Films ninth = new Films(9, "Хочу замуж", "Комедия", false);
    private Films tenth = new Films(10, "Лулу и Бриггс", "Комедия", false);
    private Films eleventh = new Films(11, "Парни под прикрытием", "Боевик", false);
    private Films twelve = new Films(12, "Мистер Нокаут", "Спорт", false);

    @Test
    public void shouldShowAllFilms() {
        Films[] returned = {first, second, third, fourth, fifth, sixth,seventh, eighth};
        doReturn(returned).when(repository).findAll();

        manager.addon(first);
        manager.addon(second);
        manager.addon(third);
        manager.addon(fourth);
        manager.addon(fifth);
        manager.addon(sixth);
        manager.addon(seventh);
        manager.addon(eighth);
        manager.addon(ninth);
        manager.addon(tenth);
        manager.addon(eleventh);
        manager.addon(twelve);

        Films[] expected = { first, second, third, fourth, fifth, sixth,seventh, eighth };
        Films[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }

    @Test
    public void shouldShowEighthLastFilms() {
        Films[] returned = {first, second, third, fourth, fifth, sixth,seventh, eighth};
        doReturn(returned).when(repository).findAll();
        when(repository.getFilmLimit()).thenReturn(10);

        manager.addon(first);
        manager.addon(second);
        manager.addon(third);
        manager.addon(fourth);
        manager.addon(fifth);
        manager.addon(sixth);
        manager.addon(seventh);
        manager.addon(eighth);
        manager.addon(ninth);
        manager.addon(tenth);
        manager.addon(eleventh);
        manager.addon(twelve);

        Films[] expected = { eighth, seventh, sixth, fifth, fourth, third, second, first };
        Films[] actual = manager.getAll();

        Assertions.assertArrayEquals(expected, actual);

        verify(repository).findAll();
    }
}
