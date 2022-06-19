// public class Person {
//     private String name;
//     public Person(String n) {
       
//     }
//     public   void person (String n){
//         this.name =name;
        
//     }
//     // public void setName(String n ){
//     //     name = n;

    

//     public String getName(){
//         return name;
//     }
//     @Override
// 	public String toString() {
// 		return "Person [name=" + name + "]";
// 	}
// }
public class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}





    
    

