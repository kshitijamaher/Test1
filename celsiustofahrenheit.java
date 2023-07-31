// Java Program to Convert Celsius into Fahrenheit, kelvin
public class celsiustofahrenheit {

	public static void main(String[] args) {
		
				double celsius = 0.0, fahrenheit = 0.0; float kelvin;
				
				// formula for conversion
				fahrenheit = (celsius * 1.8) + 32;
				
				
				kelvin = (float) (celsius + 273);


				System.out.println(" value of temperature in fahrenheit:" + fahrenheit);
				System.out.println(" value of temperature in kelvin:" + kelvin);
			}
		}


