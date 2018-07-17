package pt.voda.reportmanager.basemodel.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pt.voda.reportmanager.basemodel.model.FixedError;

@Repository
public interface FixedErrorDAO extends JpaRepository<FixedError, Long> {

}
