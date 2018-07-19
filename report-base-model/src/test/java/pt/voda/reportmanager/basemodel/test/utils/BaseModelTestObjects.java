package pt.voda.reportmanager.basemodel.test.utils;

import org.springframework.context.annotation.Bean;

import pt.voda.reportmanager.basemodel.model.FixedError;
import pt.voda.reportmanager.basemodel.model.MobileError;
import pt.voda.reportmanager.basemodel.model.Team;
import pt.voda.reportmanager.basemodel.model.User;

public class BaseModelTestObjects {
	
	@Bean
	public Team testTeam() {
		Team t = BaseModelTestObjectFactory.getDefaultTeam();
		return t;
	}
	
	@Bean
	public User testUser() {
		User u = BaseModelTestObjectFactory.getDefaultUser(this.testTeam());
		return u;
	}
	
	@Bean
	public FixedError testFixedError() {
		FixedError fe = BaseModelTestObjectFactory.getDefaultFixedError(this.testUser());
		return fe;
	}
	
	@Bean
	public MobileError testMobileError() {
		MobileError me = BaseModelTestObjectFactory.getDefaultMobileError(this.testUser());
		return me;
	}
}
