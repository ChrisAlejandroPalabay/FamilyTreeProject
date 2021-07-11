

public class FamilyMember{
    public String firstName;
    public String lastName;
    public boolean gender;
    public String birthDay;


    public FamilyMember(String fname){
        this.firstName = fname;
        //this.lastName = lName;
        //this.gender = gender;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getFullName(){
        return firstName +" "+ lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
        return firstName.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        FamilyMember fm = (FamilyMember) o;
        return firstName == fm.firstName;
    }


    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}