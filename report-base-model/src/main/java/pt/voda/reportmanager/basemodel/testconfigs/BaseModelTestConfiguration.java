package pt.voda.reportmanager.basemodel.testconfigs;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import pt.voda.reportmanager.basemodel.test.utils.TestHelper;


@EnableAutoConfiguration
@EntityScan(basePackages= {"pt.voda.reportmanager.basemodel.model"})
@EnableJpaRepositories(basePackages= {"pt.voda.reportmanager.basemodel.daos"})
@Configuration
@PropertySource("classpath:application.properties")
public class BaseModelTestConfiguration {
	
	Logger logger = LoggerFactory.getLogger(BaseModelTestConfiguration.class);
	
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		if (logger.isDebugEnabled()) {
			jpaVendorAdapter.setShowSql(true);
		}
		jpaVendorAdapter.setGenerateDdl(true);
		jpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		return jpaVendorAdapter;
	}
	
	@Bean
	public Validator entityValidator(){
		
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		return validatorFactory.getValidator();
	}
	
	@Bean
	public TestHelper testHelper(){
		return new TestHelper();
	}

}
