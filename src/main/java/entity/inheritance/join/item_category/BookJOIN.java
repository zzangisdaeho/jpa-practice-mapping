package entity.inheritance.join.item_category;

import entity.inheritance.join.ItemJOIN;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class BookJOIN extends ItemJOIN {

    private String author;
    private String isbn;
}
