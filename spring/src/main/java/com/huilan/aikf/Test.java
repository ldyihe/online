package com.huilan.aikf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test implements FactoryBean<Object> {
	
	public static void main(String[] args) {
		Resource res = new ClassPathResource("bean.xml"); 
		BeanFactory factory = new XmlBeanFactory(res);  
		System.out.println(factory.getBean("factoryBeanOne").getClass());
		System.out.println(factory.getBean("factoryBeanTwo").getClass());
	}

	@Override
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
}
