package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Saxofon implements IInstrumento{

	public void tocar() {
		System.out.println("Tuu tutuuu .....");
	}

}
