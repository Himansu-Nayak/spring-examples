package com.org.core.callback;

import org.springframework.beans.factory.Aware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ehimnay on 06/03/2017.
 */
public class CallBackMain {

        public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
                BeanWithInterface bean = (BeanWithInterface) context.getBean("bean");
                Aware beanWithAware = (Aware) context.getBean("beanWithAware");
                BeanCustom beanCustom = (BeanCustom) context.getBean("beanCustom");
                BeanWithPrePost beanWithPrePost = (BeanWithPrePost) context.getBean("beanWithPrePost");
                ((ClassPathXmlApplicationContext) context).close();
        }
}
