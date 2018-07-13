package pt.voda.reportmanager.basemodel.model;

import java.util.Date;

import javax.persistence.MappedSuperclass;

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
	private Boolean isDeleted;
	
	private User userId;
	
	
	//public ProvisioningError()
}
