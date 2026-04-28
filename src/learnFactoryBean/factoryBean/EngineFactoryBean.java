package learnFactoryBean.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import learnFactoryBean.engine.Engine;

@Component("engine")
public class EngineFactoryBean implements FactoryBean<Engine>{

	@Override
	public Engine getObject() throws Exception {
		System.out.println("creating Engine Object");
		
		return new Engine();
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("getting engine's class name");
		return Engine.class;
	}
	
}
