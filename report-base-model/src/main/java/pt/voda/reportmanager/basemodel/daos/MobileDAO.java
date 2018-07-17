package pt.voda.reportmanager.basemodel.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.voda.reportmanager.basemodel.model.MobileError;

@Repository
public interface MobileDAO extends JpaRepository<MobileError, Long> {

}
