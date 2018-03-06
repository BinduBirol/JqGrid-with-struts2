package com.JGRID.ACTION;

import com.JGRID.BEAN.*;
import com.JGRID.DAO.UserDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class UserAction extends ActionSupport {
    
    private Integer rowa=0, page=0, total=0, records=0;
    private String sord, sidx, searchField, searchString, searchOper;
    private List<Users> gridModel;

    public Integer getRowa() {
        return rowa;
    }

    public void setRowa(Integer rowa) {
        this.rowa = rowa;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchOper() {
        return searchOper;
    }

    public void setSearchOper(String searchOper) {
        this.searchOper = searchOper;
    }

    public List<Users> getGridModel() {
        return gridModel;
    }

    public void setGridModel(List<Users> gridModel) {
        this.gridModel = gridModel;
    }
  
    public String execute() throws Exception {
        
        UserDAO userDAO = new UserDAO();
        gridModel = userDAO.GettingStarted();
        System.out.println("size: "+gridModel.size());
        for(Users u : gridModel){
            System.out.println("UserID: "+u.getUserid());
            System.out.println("Description: "+u.getType().getDescripcion());
            System.out.println("Members: "+u.getMembers());
            System.out.println("Name: "+u.getName());
            System.out.println("DNI: "+u.getDni());
        }
        return SUCCESS;    
    }
    
    public String getJSON() throws Exception{
        return execute();
    }
            
 }
