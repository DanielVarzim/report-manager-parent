package pt.voda.reportmanager.basemodel.model;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public class ProvisioningError {
	
	private int errorCode;
	
	private String networkElement;
	
	private String description;
	
	private String requestId;
	
	private int retries;
	
	private int daysInError;
	
	private Date start;
	
	private Date lastRetryAt;
	
	private int workOrder;
	
	private String status;
	
	private Boolean isReported;
	
	@NotEmpty
	private Boolean isDeleted;
	
	@NotEmpty
	@ManyToOne
	private User userId;
	
	public ProvisioningError(int errorCode, String networkElement, String description, String requestId, int retries, int daysInError, Date start, Date lastRetryAt, int workOrder, String status, Boolean isReported, Boolean isDeleted) {
		this.errorCode = errorCode;
		this.networkElement = networkElement;
		this.description = description;
		this.requestId = requestId;
		this.retries = retries;
		this.daysInError = daysInError;
		this.start = start;
		this.lastRetryAt = lastRetryAt;
		this.workOrder = workOrder;
		this.status = status;
	}
}
