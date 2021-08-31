package com.home.jdk8;

import java.util.HashSet;
import java.util.Set;

public class Managers {
	
	private String Name;
	private Set<String> Devices;

	/*public Managers(String Name, Set<String> Devices ) {
		this.Name = Name;
		this.Devices = Devices;
	}
*/	
	public void addDevices(String DeviceName) {
		if(this.Devices == null) {
			this.Devices = new HashSet<String>();
		}
		this.Devices.add(DeviceName);
	}

	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public Set<String> getDevices(){
		return Devices;
	}

	public void setDevices(Set<String> devices) {
		Devices = devices;
	}
	
}
