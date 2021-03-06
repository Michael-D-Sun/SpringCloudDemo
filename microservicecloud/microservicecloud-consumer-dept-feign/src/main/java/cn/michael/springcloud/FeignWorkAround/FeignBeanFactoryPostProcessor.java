//package cn.michael.springcloud.FeignWorkAround;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FeignBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
//        BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition("feignContext");
//        bd.setDependsOn("eurekaServiceRegistry", "inetUtils");
//    }
//}
