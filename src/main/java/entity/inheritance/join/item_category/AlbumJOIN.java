package entity.inheritance.join.item_category;

import entity.inheritance.join.ItemJOIN;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class AlbumJOIN extends ItemJOIN {
    private String artist;
}
