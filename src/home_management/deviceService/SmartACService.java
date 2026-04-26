package home_management.deviceService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmartACService implements DeviceService {
	@Override
	public void control(String command) {
		System.out.println("Controlling Smart AC with command: " + command);
	}

}
