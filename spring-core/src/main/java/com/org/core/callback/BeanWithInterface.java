package com.org.core.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanWithInterface implements InitializingBean, DisposableBean {

        @Override
        public void afterPropertiesSet() throws Exception {
                System.out.println("This is from Initializing BeanWithInterface");
        }

        @Override
        public void destroy() throws Exception {
                System.out.println("This is from Disposable BeanWithInterface");
        }
}
