package day_3;
public class Table {
	public static void main(String[] args) {
		person[][]people =new person[2][3];
		
		//initalize the elements of the array
		people[0][0]=new person("ALICE",25);
		people[0][1]=new person("BOB",30);
		people[0][2]=new person("charlie",35);
		people[1][0]=new person("DAVID",40);
		people[1][1]=new person("EVE",45);
		people[1][2]=new person("FRANK",50);		
		for(int i=0;i<people.length;i++) {
			for(int j=0;j<people[i].length;j++){
				System.out.println(people[i][j].getname()+" -"+people[i][j].getage());
			}
		}
	}
}

class person{
	 private String name;
	 private int age;
	 public person(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
	 }
	 String getname()
	 {
		 return name;
	 }
	 
	 int getage()
	{
		 return age;
	}
}