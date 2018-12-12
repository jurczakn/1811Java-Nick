package com.revature.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component(value="lifeCycle")
public class LifeCycleBean  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, DisposableBean, 
	BeanPostProcessor, InitializingBean{
	
	private String beanName;
	
	private String secret;

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
		System.out.println("Populating properties of secret: " + secret);
	}

	public String getBeanName() {
		return beanName;
	}

	public LifeCycleBean() {
		super();
		System.out.println("Instantiate: LifeCycleBean");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("After properties set in: " + beanName);
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before Initializtion of Bean: " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After Initializtion of Bean: " + beanName);
		return bean;
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy of " + beanName);
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("Application Context being set to: " + arg0);
		System.out.println("Inside bean " + beanName);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory being set to: " + beanFactory);
		System.out.println("Inside bean " + beanName);
	}

	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("Bean name being set to " + name);
	}
	
	public void myCustomInit(){
		System.out.println("Inside my custom init method of " + beanName);
	}
	
	public void myCustomDestroy(){
		System.out.println("Inside my custom destroy method of " + beanName);
	}

}
