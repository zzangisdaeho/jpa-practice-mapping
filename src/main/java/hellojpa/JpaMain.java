package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import entity.manytoone.*;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            TeamMTO teamMTO1 = new TeamMTO();
            teamMTO1.setName("team1");

            MemberMTO memberMTO1 = new MemberMTO();
            memberMTO1.setUsername("member1");
            memberMTO1.setTeam(teamMTO1);

            System.out.println("======================");
            em.persist(teamMTO1);
            em.persist(memberMTO1);

            em.flush();
            em.clear();

            System.out.println("======================");

            MemberMTO readMemberMTO = em.find(MemberMTO.class, memberMTO1.getId());
            TeamMTO readTeamMTO = readMemberMTO.getTeam();
            System.out.println(readTeamMTO.getName());

//            Team readTeam = em.find(Team.class, team1.getId());
//
//            Member readMember = readTeam.getMember().get(0);
//
//            System.out.println(readMember.getUsername());

            tx.commit();
        }catch (Exception e){
            System.out.println("Exception 발생");
            tx.rollback();
        }finally {
            em.close();
        }


        emf.close();
    }
}
