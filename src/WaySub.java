import java.util.Scanner;

public class WaySub {
	public static void main(String[] args){
		
		System.out.println("//Bienvenido a WaySub//"
				+ "\nAhora en nuestro menú tenemos baguettes y pizzas.");
		Scanner sc = new Scanner(System.in);
		int opcion;
		Baguette pedido = null;
		
		
		do{
			System.out.println("Escoja la comida que desea ordenar:"
					+ "\n1. Baguette"
					+ "\n2. Pizza");
			while (true){
				try {
					String eleccion = sc.nextLine();
					opcion = Integer.parseInt(eleccion);
					break;
				}catch (NumberFormatException ex){
					System.out.println("Por favor ingresa una opcion valida.\n"
							+ "Escoja la comida que desea ordenar: "
							+ "\n1. Baguette"
							+ "\n2. Pizza");
				}
			}
			switch(opcion){
			case 1:
				System.out.println("Escoja el tipo de pan de su baguette:"
						+ "\n1. Pan tradicional"
						+ "\n2. Pan integral"
						+ "\n3. Pan multisemilla");
				while (true){
					try {
						String eleccion = sc.nextLine();
						opcion = Integer.parseInt(eleccion);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor ingresa una opcion valida.\n"
								+ "Escoja el tipo de pan de su baguette:"
								+ "\n1. Pan tradicional"
								+ "\n2. Pan integral"
								+ "\n3. Pan multisemilla");
					}
				}
				
				switch(opcion) {
				case 1:
					pedido = new PanTradicional();
					break;
				case 2:
					pedido = new PanIntegral();
					break;
				case 3:
					pedido = new PanMultiSemillas();
					break;
				default:
					System.out.println("\nPor favor elige la opcion que deseas ordenar.");
					break;
				}
				
				do {
					System.out.println("Escoja algun ingrediente que quiera que "
							+ " le pongamos a su baguette:"
							+ "\n1. Mayonesa"
							+ "\n2. Mostaza"
							+ "\n3. Catsup"
							+ "\n4. Lechuga"
							+ "\n5. Jitomate"
							+ "\n6. Cebolla"
							+ "\n7. Jamon"
							+ "\n8. Pepperoni"
							+ "\n9. Pollo"
							+ "\n0. Entregar baguette.");
					while (true){
						try {
							String eleccion = sc.nextLine();
							opcion = Integer.parseInt(eleccion);
							break;
						}catch (NumberFormatException ex){
							System.out.println("Por favor ingresa una opcion valida.\n"
									+ "Escoja algun ingrediente que quiera que "
									+ " le pongamos a su baguette:"
									+ "\n1. Mayonesa"
									+ "\n2. Mostaza"
									+ "\n3. Catsup"
									+ "\n4. Lechuga"
									+ "\n5. Jitomate"
									+ "\n6. Cebolla"
									+ "\n7. Jamon"
									+ "\n8. Pepperoni"
									+ "\n9. Pollo"
									+ "\n0. Entregar baguette.");
						}
					}
					switch(opcion) {
					case 1:
						pedido = new PedirMayonesa(pedido);
						break;
					case 2:
						pedido = new PedirMostaza(pedido);
						break;
					case 3:
						pedido = new PedirCatsup(pedido);
						break;
					case 4:
						pedido = new PedirLechuga(pedido);
						break;
					case 5:
						pedido = new PedirJitomate(pedido);
						break;
					case 6:
						pedido = new PedirCebolla(pedido);
						break;
					case 7:
						pedido = new PedirJamon(pedido);
						break;
					case 8:
						pedido = new PedirPepperoni(pedido);
						break;
					case 9:
						pedido = new PedirPollo(pedido);
						break;
					case 0:
						break;
						
					default:
						System.out.println("\nPor favor elige la opcion que deseas ordenar.");
						break;
					
					}
				}while(opcion != 0);
				System.out.println("Su pedido fue: \n"
						+ pedido.getDescripcion()
						+ "\nTotal a pagar: " + pedido.getPrecio());
				break;

			case 2:
				System.out.println("Escoja la pizza que desea:"
						+ "\n1. Pizza de queso"
						+ "\n2. Pizza de salchicha"
						+ "\n3. Pizza de jamon"
						+ "\n4. Pizza de pollo y queso"
						+ "\n5. Pizza de salchicha, jamon y pollo");
				while (true){
					try {
						String eleccion = sc.nextLine();
						opcion = Integer.parseInt(eleccion);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor ingresa una opcion valida.\n"
								+ "Escoja la pizza que desea:"
								+ "\n1. Pizza de queso"
								+ "\n2. Pizza de salchicha"
								+ "\n3. Pizza de jamon"
								+ "\n4. Pizza de pollo y queso"
								+ "\n5. Pizza de salchicha, jamon y pollo");
					}
				}
				switch(opcion) {
				case 1:
					PizzaQueso pizzaQueso = new PizzaQueso();
					AdaptadorQueso queso = new AdaptadorQueso(pizzaQueso);
					System.out.println("Su pedido fue: \n"
							+ queso.getDescripcion()
							+ "\nTotal a pagar: " + queso.getPrecio());
					opcion = 0;
					break;
				case 2:
					PizzaSalchicha pizzaSalchicha = new PizzaSalchicha();
					AdaptadorSalchicha salchicha = new AdaptadorSalchicha(pizzaSalchicha);
					System.out.println("Su pedido fue: \n"
							+ salchicha.getDescripcion()
							+ "\nTotal a pagar: " + salchicha.getPrecio());
					opcion = 0;
					break;
				case 3:
					PizzaJamon pizzaJamon = new PizzaJamon();
					AdaptadorJamon jamon = new AdaptadorJamon(pizzaJamon);
					System.out.println("Su pedido fue: \n"
							+ jamon.getDescripcion()
							+ "\nTotal a pagar: " + jamon.getPrecio());
					opcion = 0;
					break;
				case 4:
					PizzaPolloQueso pizzaPQ = new PizzaPolloQueso();
					AdaptadorPolloQueso pQ = new AdaptadorPolloQueso(pizzaPQ);
					System.out.println("Su pedido fue: \n"
							+ pQ.getDescripcion()
							+ "\nTotal a pagar: " + pQ.getPrecio());
					opcion = 0;
					break;
				case 5:
					PizzaSJP pizzaSJP = new PizzaSJP();
					AdaptadorSJP sJP = new AdaptadorSJP(pizzaSJP);
					System.out.println("Su pedido fue: \n"
							+ sJP.getDescripcion()
							+ "\nTotal a pagar: " + sJP.getPrecio());
					opcion = 0;
					break;
				default:
					System.out.println("\nPor favor elige la opcion que deseas ordenar.");
					break;
				}
				break;

			default:
				System.out.println("\nPor favor elige la opcion que deseas ordenar.");
				break;
			}
		
		
		}while(opcion != 0);
	}
}


