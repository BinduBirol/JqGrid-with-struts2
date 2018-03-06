
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjq" uri="/struts-jquery-grid-tags" %>
<%@taglib prefix='sx' uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <sj:head jqueryui="true" jquerytheme="ui-lightness"></sj:head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JQGRID</title>
    </head>
    <body>
        <h1>Struts2 & JGRID</h1>
    <s:url id="remoteurl" action="userlist"></s:url>
    <sjq:grid
        id="gridtable" 
        caption="Users" 
        dataType="json" 
        href="%{remoteurl}"
        pager="true" 
        gridModel="gridModel" 
        rowList="10,15,20" 
        rowNum="10"
        navigator="true" 
        navigatorAddOptions="{height:280,reloadAfterSubmit:true}"
        rownumbers="true" 
        autowidth="true">
        
        <sjq:gridColumn name="userid" index="userid" title="ID"
                        sortable="false" align="center" editable="false" edittype="text" />
        <sjq:gridColumn name="type.descripcion" index="Type" title="TYPE"
                        sortable="false" align="center" editable="true" edittype="select"
                        editoptions="{value:'ADMINISTRADOR:ADMINISTRADOR;USER:USER'}"/>
        <sjq:gridColumn name="members" index="members" title="MEMBERS"
                        sortable="false" align="center" editable="true" edittype="text" />
        <sjq:gridColumn name="name" index="names" title="NAMES"
                        sortable="false" align="center" editable="true" edittype="text" />
        <sjq:gridColumn name="dni" index="dni" title="DNI"
                        sortable="false" align="center" editable="true" edittype="text" />
    </sjq:grid>
    
    </body>
</html>
