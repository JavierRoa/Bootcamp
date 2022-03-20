
public class AppYoshi {

	public static void main(String[] args) {
		// Creación de objetos
		Botas boots = new Botas("cafe");
		Manzana m = new Manzana("roja");
		Luigi lu = new Luigi("luigi");
		Yoshi yoshiv = new Yoshi("verde", "yoshi", boots);
		// Metodos en aplicación
		lu.montarYoshi(yoshiv); 
		m.ingerida(yoshiv); 
	}
}