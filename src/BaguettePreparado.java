public abstract class BaguettePreparado implements Baguette{
	protected Baguette nucleo;

	public BaguettePreparado(Baguette nucleo){
		this.nucleo = nucleo;
	}


	public String getDescripcion(){
		return nucleo.getDescripcion();
	}

	public int getPollo(){
		return nucleo.getPollo();
	}

	public int getPepperoni(){
		return nucleo.getPepperoni();
	}

	public int getJamon(){
		return nucleo.getJamon();
	}

	public int getLechuga(){
		return nucleo.getLechuga();
	}

	public int getJitomate(){
		return nucleo.getJitomate();
	}

	public int getCebolla(){
		return nucleo.getCebolla();
	}

	public int getMostaza(){
		return nucleo.getMostaza();
	}

	public int getCatsup(){
		return nucleo.getCatsup();
	}

	public int getMayonesa(){
		return nucleo.getMayonesa();
	}

	public int getPrecio(){
		return nucleo.getPrecio();
	}
}