package com.nadiamm.statistics.model;

import java.util.List;
import com.google.gson.annotations.*;

public class RequestList {

	@SerializedName("requests")
	@Expose
	private List<Request> requestList;
	
	public List<Request> getRequestList() {
		return requestList;
	}

	public void setRequestList(List<Request> requestList) {
		this.requestList = requestList;
	}
}
