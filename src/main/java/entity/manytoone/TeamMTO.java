package entity.manytoone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeamMTO {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "teamMTO")
    private List<MemberMTO> memberMTOS = new ArrayList<>();

////    연관관계 편의 메서드
//    public void addMember(Member member){
//        member.setTeam(this);
//        members.add(member);
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MemberMTO> getMembers() {
        return memberMTOS;
    }

    public void setMembers(List<MemberMTO> memberMTOS) {
        this.memberMTOS = memberMTOS;
    }
}
