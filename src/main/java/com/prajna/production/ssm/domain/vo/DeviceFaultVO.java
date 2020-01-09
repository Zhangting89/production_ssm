package com.prajna.production.ssm.domain.vo;

import com.prajna.production.ssm.domain.DeviceFault;

public class DeviceFaultVO extends DeviceFault {
	
	private String deviceName;
	
	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
}