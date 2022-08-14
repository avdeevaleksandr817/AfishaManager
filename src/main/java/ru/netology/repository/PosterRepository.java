package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Films;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class PosterRepository {
    private Films[] items = new Films[0];

    private int filmLimit = 10;

    public PosterRepository(int filmLimit) {
        this.filmLimit = filmLimit;
    }

    public void save(Films item){
        int lenght = items.length +1;
        Films[] tmp = new Films[lenght];

        System.arraycopy(items,0,tmp,0,items.length);
        int lastIndex = tmp.length -1;
        items = tmp;
    }

    public Films[] findAll(){return items;}

    public Films[] findById(int id) {
        Films[] tmp = new Films[1];
        int index = 0;
        for (Films film : items) {
            if (film.getId() == id) {
                tmp[index] = film;
                index++;
            }
        }
        items = tmp;
        return items;
    }

    public void removeById(int id){
        int length = items.length -1;
        Films[] tmp = new Films[length];
        int index = 0;
        for (Films item: items) {
            if (item.getId() != id){
                tmp[index] = item;
                index ++;
            }
        }
        items = tmp;
    }
    public void removeAll() {
        Films[] tmp = new Films[items.length];
        items = tmp;
    }


}

