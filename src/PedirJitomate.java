public class PedirJitomate extends BaguettePreparado{
	
	/**
	 * Constructor para pedir jitomate
	 */
	public PedirJitomate(Baguette nucleo){
		super(nucleo);
	}


	@Override
	public String getDescripcion(){
		return nucleo.getDescripcion() + "\nJitomate: $7";
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
		return nucleo.getLechuga();
	}

	@Override
	public int getJitomate(){
		return nucleo.getJitomate() +1;
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