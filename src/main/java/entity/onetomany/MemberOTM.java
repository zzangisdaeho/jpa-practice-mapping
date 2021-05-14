package entity.onetomany;

import javax.persistence.*;

@Entity
public class MemberOTM {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID",insertable = false, updatable = false)
    // insertable, updateable false를 주어 인위적으로 연관관계를 참조만 할 수 있게 한다.
    // ManyToOne은 MappedBy가 없다. OneToMany의 양방향은 공식적으로 지원하지 않는다.
    private TeamOTM teamOTM;

}
