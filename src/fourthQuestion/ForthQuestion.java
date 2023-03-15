package fourthQuestion;

public class ForthQuestion {
	
	public static void main(String[] args) {
		double spdCar = 110;
		double spdTruck = 80;
		double citDistance = 100;
		double timeTruckWihoutTime = citDistance / spdTruck;
		double avgSpeedTruck = citDistance/( timeTruckWihoutTime + 0.16);
		
			
	
		double point = (spdCar * citDistance) / (spdCar + avgSpeedTruck);
		
		System.out.println("Ponto de encontro: " + point);
		//Resposta ambos estarao a mesmo distancia e o ponto de encontro sera de 60.79 KM

		
		

	}
	
}
