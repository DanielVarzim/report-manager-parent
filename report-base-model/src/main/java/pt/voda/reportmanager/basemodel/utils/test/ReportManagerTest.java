package pt.voda.reportmanager.basemodel.utils.test;



import java.io.File;
import java.sql.SQLException;

import javax.script.ScriptException;
import javax.sql.DataSource;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

public class ReportManagerTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Before
	public void initScripts() throws ScriptException, SQLException {
		File dbScript = new File("../report-mySQL-model/db-schema.sql");
		ScriptUtils.executeSqlScript(this.dataSource.getConnection(), new EncodedResource(  new FileSystemResource(dbScript) , "UTF-8" ));
	}
}
