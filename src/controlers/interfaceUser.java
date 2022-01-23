/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlers;

/**
 *
 * @author PC
 */
import java.sql.ResultSet;
import models.Users;

public interface interfaceUser {
//        public int add(Users e);
//	public int delete(int id);
//	public int modifier(Users e);
//	public ResultSet getByID(int id);
//	public ResultSet getAll();
        
        public boolean isExist(String userN,String pass);
    
}
