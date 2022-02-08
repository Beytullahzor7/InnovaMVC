package com.patika.designpattern.creation.a3.prototype;

public class PrototyoeMainTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        MultipleDatabasePrototype mysql = new Mysql();
        System.out.println(mysql.hashCode());
        System.out.println(mysql.toString());

        try {
            MultipleDatabasePrototype postgresql = (MultipleDatabasePrototype) mysql.clone();
            postgresql.setUserName("root2");
            postgresql.setUserPassword("root2");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
