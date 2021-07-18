

public class FamilyMember{
    public int id;
    public String name;
    public boolean gender;
    public String birthDay;


    public FamilyMember(int id,String name,boolean gender, String birthDay){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getFullName(){
        return name;
    }


    public String getGender() {
        String gender = "Male";
        if(this.gender == true){
            gender = "Male";
        }else {
            gender = "Female";
        }
        return gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public int getId(){
        return id;
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        FamilyMember fm = (FamilyMember) o;
        return name == fm.name;
    }


    public String getInfo(){
        return "ID: " + this.id + "\n"+"NAME: "+ this.name  + "\n"+"GENDER: "+ this.gender  + "\n"+"BIRTHDAY: "+ this.birthDay + "\n";
    }

    @Override
    public String toString() {
        return this.name;
    }
}