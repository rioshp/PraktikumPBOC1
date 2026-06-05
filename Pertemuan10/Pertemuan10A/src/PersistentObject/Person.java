/*
 * File         : Person.java
 * Deskripsi    : Person database model
 * Pembuat      : Rio Setiawan Hastanu Putra/24060124130068
 * Tanggal      : 14 Mei 2026
 */
package PersistentObject;

public class Person{
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i,String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}