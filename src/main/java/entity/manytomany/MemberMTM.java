package entity.manytomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MemberMTM {

    @Id @GeneratedValue
    private Long id;

    @ManyToMany
    @JoinTable(name = "MEMBER_PRODUCT",
            joinColumns = @JoinColumn(name = "MEMBER_ID"), // 관계주인의 조인컬럼
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID") //반대쪽 조인컬럼
    ) // joinColumn 아니다 관계테이블을 집어넣어야한다
    private List<ProductMTM> products = new ArrayList<>();

    //매핑정보만 들어가고 연관관계의 추가 정보는 입력 불가능하다!!!
}
