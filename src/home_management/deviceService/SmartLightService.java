package home_management.deviceService;

import org.springframework.stereotype.Component;

@Component
public class SmartLightService implements DeviceService {
	@Override
	public void control(String command) {
		System.out.println("Controlling Smart Light with command: " + command);
	}

}
