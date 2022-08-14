package ru.netology.manager;

import ru.netology.domain.Films;
import ru.netology.repository.PosterRepository;

public class PosterManager {
    private PosterRepository repository;
    public PosterManager(PosterRepository repository) {
        this.repository = repository;
    }
    public void addon(Films item) {
        repository.save(item);
    }

    public void removeAll() {
        repository.removeAll();
    }

    public Films[] findAll() {
        Films[] film = repository.findAll();
        return film;
    }

    public Films[] findById(int id) {
        Films[] film = repository.findById(id);
        return film;
    }

    public Films[] getAll() {
        Films[] items = repository.findAll();
        Films[] result = new Films[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

}

