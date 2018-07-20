package pt.voda.reportmanager.basemodel.test.daos;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pt.voda.reportmanager.basemodel.daos.UserDAO;
import pt.voda.reportmanager.basemodel.model.Team;
import pt.voda.reportmanager.basemodel.model.User;
import pt.voda.reportmanager.basemodel.test.utils.BaseModelTestObjects;
import pt.voda.reportmanager.basemodel.test.utils.TestHelper;
import pt.voda.reportmanager.basemodel.testconfigs.BaseModelTestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {BaseModelTestConfiguration.class, BaseModelTestObjects.class})
public class UserDAOTest {
	
	@Autowired
	public User testUser;
	
	@Autowired
	public Team testTeam;
	
	@Autowired
	public UserDAO userDao;
	
	@Autowired
	public TestHelper testHelper;	
	
	@Test
	public void insertUser() {
		User u = testUser;
		u.setName("OSS");
		this.testHelper.insertUser(u, testTeam);
		Assert.assertEquals("OSS" , this.userDao.findById(u.getId()).get().getName());
	}

}
