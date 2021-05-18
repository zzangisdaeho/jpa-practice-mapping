package entity.manytoone;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MemberMTO {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private TeamMTO teamMTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public TeamMTO getTeam() {
        return teamMTO;
    }

    public void setTeam(TeamMTO teamMTO) {
        this.teamMTO = teamMTO;
    }

    //        연관관계 편의 메서드
    public void changeTeam(TeamMTO teamMTO) {
        this.teamMTO = teamMTO;
       teamMTO.getMembers().add(this);
    }

}
