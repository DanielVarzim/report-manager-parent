package pt.voda.reportmanager.portal.apps;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableAutoConfiguration
@SpringBootApplication 
@EnableSwagger2
@EntityScan(
		{	"pt.voda.reportmanager.basemodel.model"
		})
@EnableJpaRepositories(
		{	"pt.voda.reportmanager.basemodel.daos"
		})	
@EnableScheduling
public class PublicWebApp {
	
	public static void main(String[] args){

		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		
		SpringApplication.run(PublicWebApp.class, args);
	}
}
