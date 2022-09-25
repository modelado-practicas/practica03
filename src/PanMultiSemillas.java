public class PanMultiSemillas implements Baguette{
	
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


	public PanMultiSemillas(){
		descripcion = "Pan Multi-semillas: $30";
		pollo = 0;
		pepperoni = 0;
		jamon = 0;
		lechuga = 0;
		jitomate = 0;
		cebolla = 0;
		mostaza = 0;
		catsup = 0;
		mayonesa = 0;
		precio = 30;
	}

	@Override
	public String getDescripcion(){
		return descripcion;
	}

	@Override
	public int getPollo(){
		return pollo;
	}

	@Override
	public int getPepperoni(){
		return pepperoni;
	}

	@Override
	public int getJamon(){
		return jamon;
	}

	@Override
	public int getLechuga(){
		return lechuga;
	}

	@Override
	public int getJitomate(){
		return jitomate;
	}

	@Override
	public int getCebolla(){
		return cebolla;
	}

	@Override
	public int getMostaza(){
		return mostaza;
	}

	@Override
	public int getCatsup(){
		return catsup;
	}

	@Override
	public int getMayonesa(){
		return mayonesa;
	}

	@Override
	public int getPrecio(){
		return precio;
	}
}