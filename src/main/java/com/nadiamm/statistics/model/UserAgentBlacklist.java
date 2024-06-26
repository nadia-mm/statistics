package com.nadiamm.statistics.model;

import javax.persistence.*;
import com.sun.istack.NotNull;

@Entity
@Table(name="USER_AGENT_BLACKLIST")
public class UserAgentBlacklist {
	@Id
	@NotNull
	@Column(name="userAgent")
	private String userAgent;

	public UserAgentBlacklist(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getUserAgent() {
		return userAgent;
	}
}
