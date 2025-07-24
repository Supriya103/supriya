package day4;


	public interface WiproSystems{
		void deviceType();
		void compilespeed();
		
	}
	class Desktop implements WiproSystems{
		public void deviceType() {
			System.out.println("wipro provides device:Desktop");
		}
		
		@Override
		public void compilespeed() {
			System.out.println("Code is compiled faster in Desktop");
			
		}
	}
	class Laptop implements WiproSystems{
		public void deviceType() {
			System.out.println("wipro provides device:Laptop");
		}
		
		@Override
		public void compilespeed() {
			System.out.println("Code is compiled slower in Laptop");
			
		}
	}

