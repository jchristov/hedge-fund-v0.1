package com.onenow.aws;

import com.amazonaws.services.simpleworkflow.flow.annotations.Execute;
import com.amazonaws.services.simpleworkflow.flow.annotations.Workflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.WorkflowRegistrationOptions;
import com.onenow.constant.ConstantsWorkflow;

@Workflow
@WorkflowRegistrationOptions(	defaultTaskStartToCloseTimeoutSeconds = 3600, 
								defaultExecutionStartToCloseTimeoutSeconds = 3600, 
								defaultTaskList = ConstantsWorkflow.AWS_SWF_TASK_LIST_NAME)
public interface SummitWorkflow {

	@Execute(version = ConstantsWorkflow.AWS_SWF_VERSION_DEV)
	public void mainFlow();
}
