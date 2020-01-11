package OOP.OOP_Encapcilation;

public class Encapsulation_DataStore {
     /*
        Name
        ID

              City
              Capitals

              Country


      */

    private String City="New Jersey";
    private String Capitals="Washington";
    private String Country="USA";
    private String Name = "Bahodur";
    private int ID = 126;


    //getters: Read private


          public String getName(){
                  return Name;
                                     }
               public int getID(){
                  return ID;
                             }

    public String getCity() {
        return City;
    }

    public String getCapitals() {
        return Capitals;
    }

    public String getCountry() {
        return Country;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public void setCapitals(String capitals) {
        this.Capitals = capitals;
    }

    public void setCountry(String country) {
        this.Country = country;



    }

    public void setID(int ID) {
                this.ID = ID;
                      }

           public void setName(String name) {
              this.Name = name;













                  }

}
