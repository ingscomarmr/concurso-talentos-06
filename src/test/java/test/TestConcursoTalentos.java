package test;

import static org.junit.Assert.assertEquals;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import concursantes.IConcursante;
import concursantes.Malabarista;
import concursantes.Musico;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContex.xml" })
public class TestConcursoTalentos {
	private static Log logger = LogFactory.getLog("TestConcursoTalentos");
	@Autowired
	@Qualifier("solei")
	private IConcursante malabarista1;
	@Autowired
	@Qualifier("soleiRecitador")
	private IConcursante malabarista2;
	@Autowired
	@Qualifier("jasonPiano")
	private IConcursante musico1;
	@Autowired
	@Qualifier("jasonSax")
	private IConcursante musico2;

	@Test
	public void testMalabarista() {
		logger.info("Inicio de ejecutar Malabarista");
		int noPelotas = 10;
		malabarista1.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista1).getPelotas());
		logger.info("Fin de Ejecutar Malabarista");
		logger.info("Inicio de ejecutar MalabaristaRecitador");
		noPelotas = 15;
		malabarista2.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista2).getPelotas());
		logger.info("Fin de Ejecutar MalabaristaRecitador");
		logger.info("Inicio de ejecutar Pianista");
		String cancion = "Noche de Paz";
		musico1.ejecutar();
		assertEquals(cancion, ((Musico) musico1).getCancion());
		logger.info("Fin de Ejecutar Pianista");
		logger.info("Inicio de ejecutar Saxofonista");
		cancion = "Equinox";
		musico2.ejecutar();
		assertEquals(cancion, ((Musico) musico2).getCancion());
		logger.info("Fin de Ejecutar Saxofonista");
	}
}