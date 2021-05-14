package entity.inheritance.join.item_category;

import entity.inheritance.join.ItemJOIN;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class MovieJOIN extends ItemJOIN {

    private String director;
    private String actor;
}
