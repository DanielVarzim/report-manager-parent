package pt.voda.reportmanager.basemodel.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pt.voda.reportmanager.basemodel.daos.TeamDAO;
import pt.voda.reportmanager.basemodel.model.Team;
import pt.voda.reportmanager.basemodel.testconfigs.BaseModelTestConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (classes = {BaseModelTestConfiguration.class})
public class DAOTest {

	@Autowired
	public TeamDAO teamDao;
	
	@Autowired
	public Team team;
	
//	@Test
//	public void getTeamDetails() {
//	}
}
