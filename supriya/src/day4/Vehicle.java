package day4;

abstract class Vehicle {
        abstract void speed();
        abstract void brand();
}
class Car extends Vehicle{
	void speed() {
		System.out.println("Speed of the car is 40km/hr");
	}
	void brand() {
		System.out.println("Brand of the car is Audi");
	}
}
class Bike extends Vehicle{
	void speed() {
		System.out.println("Speed of the bike is 4km/hr");
	}
	void brand() {
		System.out.println("Brand of the bike is Honda");
	}
}