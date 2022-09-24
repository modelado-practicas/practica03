public class PanTradicional implements Baguette{
	
	private String descripcion;
	private int pollo;
	private int pepperoni;
	private int jamon;
	private int lechuga;
	private int jitomate;
	private int cebolla;
	private int mostaza;
	private int catsup;
	private int mayonesa;
	private int precio;


	public PanTradicional(){
		descripcion = "Pan Tradicional: 20";
		pollo = 0;
		pepperoni = 0;
		jamon = 0;
		lechuga = 0;
		jitomate = 0;
		cebolla = 0;
		mostaza = 0;
		catsup = 0;
		mayonesa = 0;
		precio = 20;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public int getPollo(){
		return pollo;
	}

	public int getPepperoni(){
		return pepperoni;
	}

	public int getJamon(){
		return jamon;
	}

	public int getLechuga(){
		return lechuga;
	}

	public int getJitomate(){
		return jitomate;
	}

	public int getCebolla(){
		return cebolla;
	}

	public int getMostaza(){
		return mostaza;
	}

	public int getCatsup(){
		return catsup;
	}

	public int getMayonesa(){
		return mayonesa;
	}

	public int getPrecio(){
		return precio;
	}
}