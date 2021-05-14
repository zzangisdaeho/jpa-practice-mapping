package entity.inheritance.join;

import javax.persistence.*;

@Entity
//참고로 Inheritance의 기본전략은 Single Table이다
@Inheritance(strategy = InheritanceType.JOINED) // 조인 전략
@DiscriminatorColumn
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 단일 테이블 전략. DiscriminatorColumn어노테이션 없어도 Dtype이 자동 생성된다(필수이기 때문)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // 클래스마다 테이블 전략. 부모 테이블 없이 각 클래스가 모든 컬럼 보유
// TABLE_PER_CLASS 전략은 부모테이블을 abstract로 만들어줘야 한다. 당연히 DiscriminatorColumn은 있어도 적용이 안된다.
public class ItemJOIN {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;

}
