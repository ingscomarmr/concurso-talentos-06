package concursantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("soleiRecitador")
public class MalabaristaRecitador extends Malabarista {
	private IPoema poema;

	public MalabaristaRecitador(IPoema poema) {
		super();
		this.poema = poema;
	}

	@Autowired
	public MalabaristaRecitador(@Value("15")int pelotas, IPoema poema) {
		super(pelotas);
		this.poema = poema;
	}

	public void ejecutar() throws EjecucionException {
		super.ejecutar();
		System.out.println("Mientras recita...");
		poema.recitar();
		System.out.println("Termina recitación...");
	}
}