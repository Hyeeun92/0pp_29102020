package com.company;

public class Person {

    private String name;

    private Integer age;

    public Person(String _name){
        name = _name;
        System.out.println("Person is created");
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer _age){

        if (_age < 0 || _age > 100)
        {
            age = 0;
        } else { age = _age;
        }
        //Alternative method to simple if/else (know as Ternary operator)
        age = _age < 0 || _age > 100 ? 0 : age;
    }
}
