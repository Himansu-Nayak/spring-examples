package com.org.core.callback;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ehimnay on 07/03/2017.
 */
public class BeanWithPrePost {
        @PostConstruct
        public void init() {
                System.out.println("Method @postConstruct() invoked...");
        }

        @PreDestroy
        public void destroy() {
                System.out.println("Method @preDestroy() invoked...");
        }
}
