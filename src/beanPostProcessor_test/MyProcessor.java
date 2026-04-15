package beanPostProcessor_test;

import org.springframework.beans.factory.config.BeanPostProcessor;


public class MyProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String name) {
		System.out.println("Before : " + name);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String name) {
		System.out.println("After : " + name);
		return bean;
	}
}
