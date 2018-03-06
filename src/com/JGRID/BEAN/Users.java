package com.JGRID.BEAN;

public class Users {
    
    int userid;
    Type type;
    String members, name;
    int dni;

   

    public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getMembers() {
		return members;
	}

	public void setMembers(String members) {
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }       
}
