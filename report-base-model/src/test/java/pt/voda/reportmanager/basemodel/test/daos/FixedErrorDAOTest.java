package pt.voda.reportmanager.basemodel.test.daos;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pt.voda.reportmanager.basemodel.daos.FixedErrorDAO;
import pt.voda.reportmanager.basemodel.model.FixedError;
import pt.voda.reportmanager.basemodel.model.User;
import pt.voda.reportmanager.basemodel.test.utils.BaseModelTestObjects;
import pt.voda.reportmanager.basemodel.test.utils.TestHelper;
import pt.voda.reportmanager.basemodel.testconfigs.BaseModelTestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BaseModelTestConfiguration.class, BaseModelTestObjects.class})
public class FixedErrorDAOTest {
	
	@Autowired
	public User testUser;
	
	@Autowired
	public FixedErrorDAO fixedErrorDao;
	
	@Autowired
	public FixedError testFixedError;
	
	@Autowired
	public TestHelper testHelper;
	
	@Test
	public void insertFixedError() {
		FixedError fe = testFixedError;
		fe.setDescription("OSS");
		testHelper.insertFixedError(fe, testUser);
		Assert.assertEquals("OSS", fixedErrorDao.findById(fe.getId()).get().getDescription());
	}
}
