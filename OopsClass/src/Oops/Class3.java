package Oops;

class Class3 {
	static class person {
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		private String name;

		public static void main(String[] args) {

			person MyName = new person();
			MyName.setName("hey Hi ");

			System.out.println(MyName.getName());

		}
	}
}
