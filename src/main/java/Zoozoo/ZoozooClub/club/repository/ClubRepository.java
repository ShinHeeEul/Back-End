package Zoozoo.ZoozooClub.club.repository;


import Zoozoo.ZoozooClub.club.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club,Long> {
}
