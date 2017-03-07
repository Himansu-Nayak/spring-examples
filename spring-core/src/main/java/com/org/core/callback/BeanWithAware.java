package com.org.core.callback;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

/**
 * Created by ehimnay on 07/03/2017.
 */
public class BeanWithAware
        implements ApplicationContextAware, ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
        BeanNameAware, LoadTimeWeaverAware, MessageSourceAware, NotificationPublisherAware, ResourceLoaderAware {
        @Override
        public void setResourceLoader(ResourceLoader arg0) {
                System.out.println("inside setResourceLoader");
        }

        @Override
        public void setNotificationPublisher(NotificationPublisher arg0) {
                System.out.println("inside setNotificationPublisher");
        }

        @Override
        public void setMessageSource(MessageSource arg0) {
                System.out.println("inside setMessageSource");
        }

        @Override
        public void setLoadTimeWeaver(LoadTimeWeaver arg0) {
                System.out.println("inside setLoadTimeWeaver");
        }

        @Override
        public void setBeanName(String arg0) {
                System.out.println("inside setBeanName");
        }

        @Override
        public void setBeanFactory(BeanFactory arg0) throws BeansException {
                System.out.println("inside setBeanFactory");
        }

        @Override
        public void setBeanClassLoader(ClassLoader arg0) {
                System.out.println("inside setBeanClassLoader");
        }

        @Override
        public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
                System.out.println("inside setApplicationEventPublisher");
        }

        @Override
        public void setApplicationContext(ApplicationContext arg0) throws BeansException {
                System.out.println("inside setApplicationContext");
        }
}
