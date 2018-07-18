package pt.voda.reportmanager.basemodel.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@Table(name="mobile_error")
public class MobileError extends ProvisioningError{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private int msisdn;
	
	@NotEmpty
	private int imsi;
	
	public MobileError(int errorCode, String networkElement, String description, String requestId, int retries, int daysInError, Date startedAt, Date lastRetryAt, int workOrder, String status, Boolean isReported, Boolean isDeleted, User user, int msisdn, int imsi){
		super(errorCode, networkElement, description, requestId, retries, daysInError, startedAt, lastRetryAt, workOrder, status, isReported, isDeleted, user);
	
		this.msisdn = msisdn;
		this.imsi = imsi;
		
	}
}
