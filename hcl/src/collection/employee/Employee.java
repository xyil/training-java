package collection.employee;

class Employee {
	int id;
	String name;
	String city;
		Employee(int id, String name, String city){
			this.id = id;
			this.name = name;
			this.city = city;
		}
		
		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public String getCity() {
			return city;
		}
}
