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
@Table(name="fixed_error")
public class FixedError extends ProvisioningError{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private int accessId;
	
	
	public FixedError(int errorCode, String networkElement, String description, String requestId, int retries, int daysInError, Date startedAt, Date lastRetryAt, int workOrder, String status, Boolean isReported, Boolean isDeleted, int accessId){
		super(errorCode, networkElement, description, requestId, retries, daysInError, startedAt, lastRetryAt, workOrder, status, isReported, isDeleted);
	
		this.accessId = accessId;
		
	}
	
}
