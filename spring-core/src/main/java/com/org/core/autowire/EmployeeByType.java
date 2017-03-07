package com.org.core.autowire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ehimnay on 07/03/2017.
 */
public class EmployeeByType {
        private String name = "Himansu";

        @Autowired
        private Employer employer;

        public String getName() {
                return name;
        }

        public Employer getEmployer() {
                return employer;
        }

        public void setEmployer(Employer employer) {
                this.employer = employer;
        }
}
