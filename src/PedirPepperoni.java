public class PedirPepperoni extends BaguettePreparado{
	

	public PedirPepperoni(Baguette nucleo){
		super(nucleo);
	}


	public String getDescripcion(){
		return nucleo.getDescripcion() + " \n Pepperoni: $17";
	}

	public int getPollo(){
		return nucleo.getPollo();
	}

	public int getPepperoni(){
		return nucleo.getPepperoni() +1;
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
		return nucleo.getPrecio() + 17;
	}
}