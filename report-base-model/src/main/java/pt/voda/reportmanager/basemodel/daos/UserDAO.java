package pt.voda.reportmanager.basemodel.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.voda.reportmanager.basemodel.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

}
