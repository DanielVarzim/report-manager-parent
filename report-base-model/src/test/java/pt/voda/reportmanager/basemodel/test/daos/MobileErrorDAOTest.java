package pt.voda.reportmanager.basemodel.test.daos;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pt.voda.reportmanager.basemodel.daos.MobileErrorDAO;
import pt.voda.reportmanager.basemodel.model.MobileError;
import pt.voda.reportmanager.basemodel.model.User;
import pt.voda.reportmanager.basemodel.test.utils.BaseModelTestObjects;
import pt.voda.reportmanager.basemodel.test.utils.TestHelper;
import pt.voda.reportmanager.basemodel.testconfigs.BaseModelTestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BaseModelTestConfiguration.class, BaseModelTestObjects.class})
public class MobileErrorDAOTest {
	
	@Autowired
	public User testUser;
	
	@Autowired
	public MobileErrorDAO mobileErrorDao;
	
	@Autowired
	public MobileError testMobileError;
	
	@Autowired
	public TestHelper testHelper;
	
	@Test
	public void insertMobileError() {
		MobileError me = testMobileError;
		me.setDescription("OSS");
		testHelper.insertMobileError(me, testUser);
		Assert.assertEquals("OSS", mobileErrorDao.findById(me.getId()).get().getDescription());
	}
}
