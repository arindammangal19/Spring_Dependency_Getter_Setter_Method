

	 package com.arindam;

	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	public class Testing_Method
	{
		public static void main(String[] args)
		{
		    Resource res = new ClassPathResource("applicationContext.xml");
		   
		    BeanFactory fac = new XmlBeanFactory(res);
		    
		    Employee emp = (Employee)fac.getBean("emp_Bean");
		    
		      emp.display_Info();
		}

	}
