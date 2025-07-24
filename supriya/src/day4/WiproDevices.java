package day4;
 
public class WiproDevices {
          public static void main(String[] args) {
			WiproSystems desktop=new Desktop();
			desktop.deviceType();
			desktop.compilespeed();
			
			WiproSystems laptop=new Laptop();
			laptop.deviceType();
			laptop.compilespeed();
			
		}
}
