package prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.IConcursante;

public class PruebaConcursoTalento {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContex.xml");
		try{
			IConcursante malabarista = (IConcursante)ctx.getBean("solei");
			malabarista.ejecutar();
		}catch(Exception e){
			System.err.println("Ocurrio un problema:" + e.getMessage());
		}finally {			
			((ClassPathXmlApplicationContext)ctx).close();
		}				
		
	}

}
