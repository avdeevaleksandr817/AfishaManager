package ru.netology;

import ru.netology.domain.Films;
import ru.netology.repository.PosterRepository;

public class Main {

    public static void main(String[] args) {

        Films first = new Films(1, "Бладшот", "Боевик", false);
        Films second = new Films(2, "Вперед", "Мультфильм", false);
        Films third = new Films(3, "Отель Белград", "Комедия", false);
        Films fourth = new Films(4, "Джентельмены", "Боевик", false);
        Films fifth = new Films(5, "Человек-невидимка", "Ужасы", false);
        Films sixth = new Films(6, "Тролли. Мировой тур", "Мультфильм", true);
        Films seventh = new Films(7, "Номер Один", "Комедия", true);
        Films eighth = new Films(8, "Наемник", "Боевик", false);
        Films ninth = new Films(9, "Хочу замуж", "Комедия", false);
        Films tenth = new Films(10, "Лулу и Бриггс", "Комедия", false);
        Films eleventh = new Films(11, "Парни под прикрытием", "Боевик", false);
        Films twelve = new Films(12, "Мистер Нокаут", "Спорт", false);

        PosterRepository repo = new PosterRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);
        repo.save(fourth);
        repo.save(fifth);
        repo.save(sixth);
        repo.save(seventh);
        repo.save(eighth);
        repo.save(ninth);
        repo.save(tenth);
        repo.save(eleventh);
        repo.save(twelve);

    }
}

