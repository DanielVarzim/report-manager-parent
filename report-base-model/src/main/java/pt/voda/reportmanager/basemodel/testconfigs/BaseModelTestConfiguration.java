package pt.voda.reportmanager.basemodel.testconfigs;

import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import pt.voda.reportmanager.basemodel.model.Team;


@EnableAutoConfiguration
@EntityScan(basePackages= {"pt.voda.reportmanager.basemodel.model"})
@EnableJpaRepositories(basePackages= {"pt.voda.reportmanager.basemodel.daos"})
@Configuration
@PropertySource("classpath:application.properties")
public class BaseModelTestConfiguration {
	
	@Bean
	public Team team() {
		Team t = new Team();
		t.setCreatedAt(new Date());
		t.setIsDeleted(false);
		t.setName("Default");
		return t;
		
		
	}

}
