/**
 * File         : DAOManager.java
 * Deskripsi    : pengelola DAO dalam program
 * Pembuat      : Rio Setiawan Hastanu Putra/24060124130068
 * Tanggal      : 14 Mei 2026
 */

package PersistentObject;

public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}