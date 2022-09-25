public class PedirLechuga extends BaguettePreparado{
	

	public PedirLechuga(Baguette nucleo){
		super(nucleo);
	}


	@Override
	public String getDescripcion(){
		return nucleo.getDescripcion() + "\nLechuga: $7";
	}

	@Override
	public int getPollo(){
		return nucleo.getPollo();
	}

	@Override
	public int getPepperoni(){
		return nucleo.getPepperoni();
	}

	@Override
	public int getJamon(){
		return nucleo.getJamon();
	}

	@Override
	public int getLechuga(){
		return nucleo.getLechuga() +1;
	}

	@Override
	public int getJitomate(){
		return nucleo.getJitomate();
	}

	@Override
	public int getCebolla(){
		return nucleo.getCebolla();
	}

	@Override
	public int getMostaza(){
		return nucleo.getMostaza();
	}

	@Override
	public int getCatsup(){
		return nucleo.getCatsup();
	}

	@Override
	public int getMayonesa(){
		return nucleo.getMayonesa();
	}

	@Override
	public int getPrecio(){
		return nucleo.getPrecio() +7 ;
	}
}