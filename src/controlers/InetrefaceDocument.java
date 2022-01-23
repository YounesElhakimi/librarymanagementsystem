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

public interface InetrefaceDocument<T> {
        public int add(T e);
	public int delete(int id);
	public int modifier(T e);
	public ResultSet getByID(int id);
	public ResultSet getAll();
	public ResultSet getCategorie(int id);
	public int nbrExemplaire(int id);

    
}
