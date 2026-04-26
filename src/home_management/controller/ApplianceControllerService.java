package home_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import home_management.deviceService.DeviceService;

@Component
public class ApplianceControllerService {
	private final DeviceService deviceService;
	
	@Autowired
	public ApplianceControllerService(DeviceService deviceService) {
		this.deviceService = deviceService;
	}
	
	public void handleCommand(String command) {
		System.out.println("Received command: " + command);
		deviceService.control(command);
	}
}
