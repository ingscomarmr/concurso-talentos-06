package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Piano implements IInstrumento {

	public void tocar() {
		System.out.println("Clin clin clin clin.....");		
	}

}
