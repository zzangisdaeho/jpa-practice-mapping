package entity.onetomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeamOTM {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    // ONE이 연관관계의 주인이 된다.
    // 하지만 DB상 FK는 Member에 있기 때문에 TEAM을 통해서 Member를 집어넣으면 Member쪽에 업데이트쿼리가 날라간다.
    @OneToMany
    @JoinColumn(name = "TEAM_ID")
    private List<MemberOTM> memberOTMS = new ArrayList<>();


}
