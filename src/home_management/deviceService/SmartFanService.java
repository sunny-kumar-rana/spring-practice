package home_management.deviceService;

import org.springframework.stereotype.Component;

@Component
public class SmartFanService implements DeviceService {
	@Override
	public void control(String command) {
		System.out.println("Controlling Smart Fan with command: " + command);
	}

}
