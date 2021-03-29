public class Person {
		
    int ID; 	//unique identifying number
    // for confidentiality, we will not collect the name 
    String status; // red - tested positive, yellow - identified as a contact, green - out of quarantine 
		
    Person(int ID, String status) {
			this.ID = ID;
      this.status = status;
		}

}