
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HelloGit {

	public static void main(String[] args) {
		
		
		Random random = new Random(System.currentTimeMillis());
		
		int numGrupos = 10;
		
		List<Integer> citaGrupos = new ArrayList<Integer>();
		int grupo = 0;
		String diaCita="";
		for(int cita=0; cita<numGrupos; cita++) {
			grupo = random.nextInt(10)+1;
			while(citaGrupos.contains(grupo)) {
				grupo = random.nextInt(10)+1;
			}
			citaGrupos.add(grupo);
			if(cita <4) {
				diaCita="Miércoles 5 de Mayo ";
			}
			else if(cita < 8) {
				diaCita="Miércoles 12 de Mayo";
			}
			else {
				diaCita="Jueves 13 de Mayo   ";
			}
			System.out.println(diaCita+" grupo: " + grupo);
		}

	


	}

}
