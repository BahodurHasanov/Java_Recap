package OOP.OOP_Encapcilation;

public class EmployeeInfo {



/*
		 Name
		 SSN
		 Age
		 Salary
		 */




            private String name;

            private long SSN;

            private byte Age;

            private   double Salary;



            //name:


    public void setName(String name) {
        this.name = name;
    }
       //SSN
    public void setSSN(long snn) {
        this.SSN = SSN;
    }
       // age
    public void setAge(byte age) {
        Age = age;
    }
        // Salary
    public void setSalary(double salary) {
        Salary = salary;
    }



    //setInfo

    public  void SetInfo(String name, long SSN,byte age, double salary){
        setName(name);
        setAge(age);
        setSalary(salary);


    }



}

