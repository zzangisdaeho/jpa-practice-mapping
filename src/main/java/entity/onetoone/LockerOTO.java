package entity.onetoone;

import javax.persistence.*;
import java.lang.reflect.Member;

@Entity
public class LockerOTO {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberOTO memberOTO;

//    @OneToOne(mappedBy = "lockerOTO")
//    private MemberOTO member;
}
