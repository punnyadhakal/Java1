
public class Bike extends Vehicle {
	final int speed;
 //   or final int speed =90;
     
     //we cannot override final method.
//     @Override
//     void getSpeed() {
// 		System.out.println("speedlimit is" +speed);
     
     
     Bike(int speed){
    	 this.speed = speed;
     }
}
