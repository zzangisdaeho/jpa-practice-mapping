package entity.onetoone;

import javax.persistence.*;

@Entity
public class MemberOTO {

    @Id @GeneratedValue
    private Long id;

    private String username;

    @OneToOne(mappedBy = "memberOTO")
    private LockerOTO lockerOTO;

//    @OneToOne
//    @JoinColumn(name = "LOCKER_ID")
//    private LockerOTO lockerOTO;
}
