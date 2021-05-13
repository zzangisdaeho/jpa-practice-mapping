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
    private TeamOTM teamOTM;

}
