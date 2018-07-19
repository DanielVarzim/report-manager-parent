package pt.voda.reportmanager.basemodel.test.utils;

import java.util.Date;

import pt.voda.reportmanager.basemodel.model.FixedError;
import pt.voda.reportmanager.basemodel.model.MobileError;
import pt.voda.reportmanager.basemodel.model.Team;
import pt.voda.reportmanager.basemodel.model.User;

public class BaseModelTestObjectFactory {
	
	public static Team getDefaultTeam () {
		Team t = new Team();
		t.setCreatedAt(new Date());
		t.setIsDeleted(false);
		t.setName("Default");
		return t;
	}
	
	public static User getDefaultUser (Team t) {
		User u = new User();
		u.setColor("Default");
		u.setCreatedAt(new Date());
		u.setEmail("Default");
		u.setIsAdmin(false);
		u.setIsDeleted(false);
		u.setName("Default");
		u.setPassword("Default");
		u.setTeam(t);
		return u;
	}
	
	public static FixedError getDefaultFixedError(User u) {
		FixedError fe = new FixedError();
		fe.setAccessId(11111111);
		fe.setDaysInError(1);
		fe.setDescription("Default");
		fe.setErrorCode(1111111);
		fe.setIsDeleted(false);
		fe.setIsReported(false);
		fe.setLastRetryAt(new Date());
		fe.setNetworkElement("Default");
		fe.setRequestId("Default");
		fe.setRetries(1);
		fe.setStartedAt(new Date());
		fe.setStatus("Default");
		fe.setUser(u);
		fe.setWorkOrder(11111);
		return fe;
	}
	
	public static MobileError getDefaultMobileError(User u) {
		MobileError me = new MobileError();
		me.setImsi(11111);
		me.setMsisdn(11111);
		me.setDaysInError(1);
		me.setDescription("Default");
		me.setErrorCode(1111111);
		me.setIsDeleted(false);
		me.setIsReported(false);
		me.setLastRetryAt(new Date());
		me.setNetworkElement("Default");
		me.setRequestId("Default");
		me.setRetries(1);
		me.setStartedAt(new Date());
		me.setStatus("Default");
		me.setUser(u);
		me.setWorkOrder(11111);
		return me;
	}

}
