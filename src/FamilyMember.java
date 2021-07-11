

public class FamilyMember{
    public String name;
    public boolean gender;
    public String birthDay;


    public FamilyMember(String name){
        this.name = name;
        //this.lastName = lName;
        //this.gender = gender;

    }

    public void setFirstName(String name) {
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


    @Override
    public String toString() {
        return this.name;
    }
}