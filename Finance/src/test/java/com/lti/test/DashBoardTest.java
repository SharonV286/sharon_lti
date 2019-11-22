package com.lti.test;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.DashBoardInt;
import com.lti.component.DashBoard;


public class DashBoardTest {

			public static void main(String args[]){
	
				ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
				DashBoardInt card = (DashBoardInt) ctx.getBean(DashBoard.class);
				      
				List<DashBoard> db = card.getCardDetails();
		        
		        for(DashBoard db1:db )
		        {
		        	System.out.println(db1.getCARD_NO()+ db1.getUS_NAME()+ db1.getVALID_TILL()
		        	+ db1.getCARD_TYPE() + db1.getCARD_STATUS());
		        }
				}
		}
			
		
	


