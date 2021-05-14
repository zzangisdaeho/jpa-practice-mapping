package entity.selfjoin;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category parent;

    // 양방향 참조용
    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();
}
