package com.example.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(){
    }

    public Belonging(Game game, GameList list,Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public Belonging setId(BelongingPK id) {
        this.id = id;
        return this;
    }

    public Integer getPosition() {
        return position;
    }

    public Belonging setPosition(Integer position) {
        this.position = position;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging other = (Belonging) o;
        return Objects.equals(id, other.id);
    }
}
