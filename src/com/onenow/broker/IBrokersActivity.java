package com.onenow.broker;

import java.util.Date;
import java.util.List;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.Activity;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;
import com.onenow.finance.Investment;
import com.onenow.finance.Underlying;
import com.onenow.summit.Constants;

@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 3600, defaultTaskStartToCloseTimeoutSeconds = 3600, defaultTaskList = Constants.AWS_SWF_TASK_LIST_NAME)
@Activities(version = Constants.AWS_SWF_VERSION)
public interface IBrokersActivity {
	@Activity
	public List<Underlying> getUnderlying();
	public Double getPriceAsk(Investment inv);
	public Double getPriceBid(Investment inv);
	public Investment getBest(Underlying under, Enum invType);
	public Investment getBest(Underlying under, Enum invType, Date expiration, Double strike);
}