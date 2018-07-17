package pt.voda.reportmanager.basemodel.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.voda.reportmanager.basemodel.model.Team;

@Repository
public interface TeamDAO extends JpaRepository<Team, Long> {

}
