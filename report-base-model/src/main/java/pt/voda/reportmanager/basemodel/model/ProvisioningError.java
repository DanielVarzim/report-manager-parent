package pt.voda.reportmanager.basemodel.model;

import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public class ProvisioningError {
	
	private int errorCode;
	
	@NotEmpty
	@Size(max = 255)
	private String networkElement;
	
	@NotEmpty
	@Size(max = 255)
	private String description;

	@NotEmpty
	@Size(max = 255)
	private String requestId;
	
	private int retries;
	
	private int daysInError;
	
	@NotEmpty
	private Date startedAt;
	
	@NotEmpty
	private Date lastRetryAt;
	
	private int workOrder;
	
	@Size(max = 45)
	private String status;
	
	@NotEmpty
	private Boolean isReported;
	
	@NotEmpty
	private Boolean isDeleted;
	
	@NotEmpty
	@ManyToOne
	private User user;
	
	public ProvisioningError(int errorCode, String networkElement, String description, String requestId, int retries, int daysInError, Date startedAt, Date lastRetryAt, int workOrder, String status, Boolean isReported, Boolean isDeleted, User user) {
		this.errorCode = errorCode;
		this.networkElement = networkElement;
		this.description = description;
		this.requestId = requestId;
		this.retries = retries;
		this.daysInError = daysInError;
		this.startedAt = startedAt;
		this.lastRetryAt = lastRetryAt;
		this.workOrder = workOrder;
		this.status = status;
		this.user = user;
	}
}
