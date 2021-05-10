package hellojpa;

import entity.Member;
import entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Team team1 = new Team();
            team1.setName("team1");

            Member member1 = new Member();
            member1.setUsername("member1");
            member1.setTeam(team1);

            System.out.println("======================");
            em.persist(team1);
            em.persist(member1);

            em.flush();
            em.clear();

            System.out.println("======================");

            Member readMember = em.find(Member.class, member1.getId());
            Team readTeam = readMember.getTeam();
            System.out.println(readTeam.getName());

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
