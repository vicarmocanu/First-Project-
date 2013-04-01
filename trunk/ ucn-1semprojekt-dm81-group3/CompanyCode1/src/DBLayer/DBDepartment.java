package DBLayer;
import java.sql.*;
import java.util.ArrayList;
import ModelLayer.Department;
import ModelLayer.Employee;



public class DBDepartment implements IFDBDepartment {
	     private  Connection con;
	    /** Creates a new instance of DBDepartment */
	    public DBDepartment() {
	       con = DbConnection1.getInstance().getDBcon();
	    }
	   
	    public Department findDepartment(int dno, boolean retriveAssociation)
	    {
	        Department deptObj = new Department();
	        deptObj = singleWhere("dnumber = " + dno, retriveAssociation);
	        return deptObj;
	    }
	    //singlewhere is used when only one department object is to be build
	    private Department singleWhere(String wClause, boolean retrieveAssociation)
	    {	
	        ResultSet results;
	        Department deptObj = new Department();
	        String query =  buildQuery(wClause);
	        System.out.println("DbDepartment -singelWhere " + query); 
	        try{ // read from department
		   Statement stmt = con.createStatement();
		   stmt.setQueryTimeout(5);
		   results = stmt.executeQuery(query);
		   int snr=0;
		   if( results.next() ){
		       deptObj = buildDepartment(results);
	               //missing the test on retriveassociation
	               
	           }//end if
		   stmt.close();
		}//slut try	
		catch(Exception e){
		   System.out.println("Query exception - select department : "+e);
		   e.printStackTrace();
	        }
		return deptObj;

	    
	    }
	    //miscWhere is used when more than one department is selected and build
	    private ArrayList<Department> miscWhere(String wClause, boolean retrieveAssociation)
		{
			ResultSet results;
			ArrayList<Department> list = new ArrayList<Department>();
			
			String query =  buildQuery(wClause);
	                System.out.println("DbDepartment " + query); 
	  		try{ // read from project
		 		Statement stmt = con.createStatement();
		 		stmt.setQueryTimeout(5);
		 		results = stmt.executeQuery(query);
		 		
				int snr=0;
				while( results.next() ){
			     	 Department deptObj = new Department();
				 deptObj = buildDepartment(results);	
	                         list.add(deptObj);
	                         //missing test on retriveAssociation
				}//end while
				stmt.close();
			}//slut try	
		 	catch(Exception e){
		 		System.out.println("Query exception - select department : "+e);
				e.printStackTrace();
		 	}
			return list;
		}
	    private Department buildDepartment(ResultSet results)
	    {
	       Department deptObj = new Department();
	       Employee empObj = new Employee();
	       deptObj.setManager(empObj);
	         try{
	               deptObj.setDname(results.getString(1));
	               deptObj.setDnumber(results.getInt(2));
	               empObj.setSsn(results.getString(3));
	               deptObj.setStartdato(results.getString(4));
	               System.out.println("build Department" + deptObj.getDname());
	          }
	         catch(Exception e)
	         {
	             System.out.println("building department object");
	         }
	        
	        return deptObj;
	        
	    }
	    //method to build the query
		private String buildQuery(String wClause)
		{
		    String query="SELECT * FROM department";
			
			if (wClause.length()>0)
				query=query+" WHERE "+ wClause;
				
			return query;
		}

	    public ArrayList getAllDepartment(boolean retriveAssociation) {
	        ArrayList list = new ArrayList();
	        return list;
	    }

	   

	    public Department searchDeparmentOnName(String dname, boolean retriveAssociation) {
	       return null;
	    }

	    public int insert(Department dept) {
	       return -1;
	    }

	    public int update(Department dept) {
	        return -1;
	    }

	    public int delete(Department dept) {
	        return -1;
	    }
	} 


