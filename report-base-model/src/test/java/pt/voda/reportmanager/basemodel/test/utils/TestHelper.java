package pt.voda.reportmanager.basemodel.test.utils;

import org.springframework.beans.factory.annotation.Autowired;

import pt.voda.reportmanager.basemodel.daos.FixedErrorDAO;
import pt.voda.reportmanager.basemodel.daos.MobileErrorDAO;
import pt.voda.reportmanager.basemodel.daos.TeamDAO;
import pt.voda.reportmanager.basemodel.daos.UserDAO;
import pt.voda.reportmanager.basemodel.model.FixedError;
import pt.voda.reportmanager.basemodel.model.MobileError;
import pt.voda.reportmanager.basemodel.model.Team;
import pt.voda.reportmanager.basemodel.model.User;

public class TestHelper {
	
	@Autowired
	private TeamDAO teamDao;
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private FixedErrorDAO fixedErrorDao;
	
	@Autowired
	private MobileErrorDAO mobileErrorDao;
	
	public void insertTeam(Team t) {
		this.teamDao.save(t);
	}
	
	public void insertUser(User u, Team t) {
		u.setTeam(t);
		this.userDao.save(u);
	}
	
	public void insertFixedError(FixedError fe, User u) {
		fe.setUser(u);
		this.fixedErrorDao.save(fe);
	}
	
	public void insertMobileError(MobileError me, User u) {
		me.setUser(u);
		this.mobileErrorDao.save(me);
	}
}
