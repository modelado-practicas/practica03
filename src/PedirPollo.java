public class PedirPollo extends BaguettePreparado{
	

	public PedirPollo(Baguette nucleo){
		super(nucleo);
	}


	public String getDescripcion(){
		return nucleo.getDescripcion() + " \n Pollo: $20";
	}

	public int getPollo(){
		return nucleo.getPollo() +1;
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
		return nucleo.getPrecio() + 20;
	}
}