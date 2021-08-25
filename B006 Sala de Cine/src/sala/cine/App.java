package sala.cine;

public class App {

	public static void main(String[] args) {
		SalaDeCine s1 = new SalaDeCine(40, 4);
		s1.ocuparButaca(0, 7);
		s1.ocuparButaca(1, 3);
		s1.ocuparButaca(2, 3);
		s1.ocuparButaca(3, 4);
		System.out.println(s1.hayEspacioFilaGente(7));
		//System.out.println(s1.acomodarGrupo(20));
	}

}
