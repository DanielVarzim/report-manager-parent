package pt.voda.reportmanager.basemodel.test.daos;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pt.voda.reportmanager.basemodel.daos.TeamDAO;
import pt.voda.reportmanager.basemodel.model.Team;
import pt.voda.reportmanager.basemodel.test.utils.BaseModelTestObjects;
import pt.voda.reportmanager.basemodel.test.utils.TestHelper;
import pt.voda.reportmanager.basemodel.testconfigs.BaseModelTestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {BaseModelTestConfiguration.class, BaseModelTestObjects.class})
public class TeamDAOTest {
	
	@Autowired
	public Team testTeam;
	
	@Autowired
	public TeamDAO teamDao;
	
	@Autowired
	public TestHelper testHelper;
	
	@Test
	public void insertTeam() {
		Team t = testTeam;
		t.setName("OSS");
		this.testHelper.insertTeam(t);
		Assert.assertEquals("OSS" , this.teamDao.findById(t.getId()).get().getName());
		
	}
}
