package com.JGRID.DAO;

import com.JGRID.BEAN.*;
import com.JGRID.SERVICE.UserInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements UserInterface {

    @Override
    public List GettingStarted() throws Exception {
        
        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;
        List userlist = new ArrayList();
        
        try{
            con = Conn.getConnection();
            String sql = "CALL pa_userlist()";
            cstm = con.prepareCall(sql);
            rs = cstm.executeQuery();
            while(rs.next()){
                Users us = new Users();
                Type ti = new Type();
                us.setUserid(rs.getInt(1));
                ti.setDescripcion(rs.getString(2));
                us.setType(ti);
                us.setMembers(rs.getString(3));
                us.setName(rs.getString(4));
                us.setDni(rs.getInt(5));
                userlist.add(us);
            }
            
            System.out.println("Successful listing UserDAO");
            
        }catch(Exception e){
            System.out.println("Error UsuarioDAO"+e.getMessage());
            e.printStackTrace();
        }
        return userlist;   
    } 
}
