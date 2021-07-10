import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class Family {

    private HashMap<String, Multimap<String, String>> map;
    public ArrayList<FamilyMember> familyMembers;

    public Family() {
        map = new HashMap<>();
        familyMembers = new ArrayList<>();
    }


    public void addFamilyMember(FamilyMember person){
        Multimap<String,String> temp = ArrayListMultimap.create();
        String name = person.firstName + " " + person.lastName;
        map.put(name,temp);
        familyMembers.add(person);
    }

    public void addSibling(String person1, String person2) {
        map.get(person1).put("Sibling/s",person2);
        map.get(person2).put("Sibling/s",person1);
    }

    public void addMother(String person1, String person2){
        map.get(person1).put("Mother",person2);
        map.get(person2).put("Child",person2);
    }

    public void addFather(String person1,String person2){
        map.get(person1).put("Father",person2);
        map.get(person2).put("Child",person2);
    }

    public void addChild(String person1, String person2){
        map.get(person1).put("Child",person2);
        if(familyMembers.get(indexOf(person2)).gender == true){
            map.get(person2).put("Father",person1);
        }else {
            map.get(person2).put("Mother",person1);
        }
    }

    public void addPartner(String person1,String person2){
        if(familyMembers.get(indexOf(person1)).gender != familyMembers.get(indexOf(person2)).gender){
            if(familyMembers.get(indexOf(person1)).gender == true){
                map.get(person1).put("Wife",person2);
                map.get(person2).put("Husband",person1);
            }else{
                map.get(person1).put("Husband",person2);
                map.get(person2).put("Wife",person1);
            }
        }
    }
    


    private int indexOf(String person){
        int res = 0;
        for (int i=0;i < familyMembers.size();i++){
            if(familyMembers.get(i).getFullName().equals(person)){
                res = i;
                break;
            }
        }
        return res;
    }


    public String printTree(){
        StringBuilder builder = new StringBuilder();
        for(String person: map.keySet()){
            builder.append(person + "\n");
            for(String value: map.get(person).keySet()){
                builder.append("        " + value + ":\n");
                for(String v: map.get(person).get(value)){
                    builder.append("         * " + v + "\n");
                }
            }
            builder.append("\n");
        }


        return builder.toString();
    }

    public String printFamily(String person){
        StringBuilder builder = new StringBuilder();
        if(map.containsKey(person)){
            builder.append(person +"'s Family"+ "\n");
            for(String v:map.get(person).keySet()){
                builder.append("       "+ v + "\n");
                for (String p1: map.get(person).get(v)){
                    builder.append("          * " + p1 + "\n");
                }
                builder.append("\n");
            }
        }else {
            System.out.println("Person does not exist!");
        }

        return builder.toString();
    }

    private Collection checkRelatives(String person){
        Collection values = map.get(person).values();
        return values;
    }

    public String displayFamilyMembers(){
        StringBuilder builder = new StringBuilder();
        for(FamilyMember mem : familyMembers){
            builder.append("* " + mem + "\n");
        }
        return builder.toString();
    }

    public String getFullname(String name){
        return familyMembers.get(indexOf(name)).getFullName();
    }

    public void connectToDatabase(){
        DbConnection connect = new DbConnection();
        connect.getData();
    }











}