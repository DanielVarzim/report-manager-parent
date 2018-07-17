package pt.voda.reportmanager.basemodel.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages={"pt.voda.reportmanager.basemodel.daos"})
@EntityScan(basePackages={"pt.voda.reportmanager.basemodel.model"})
@EnableJpaAuditing
public class BaseModelTestConfiguration {
	
	@Value("${report-mySQL-model.db")
	public static String dbScriptPath;
}
