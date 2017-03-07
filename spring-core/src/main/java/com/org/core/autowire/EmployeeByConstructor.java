package com.org.core.autowire;

/**
 * Created by ehimnay on 07/03/2017.
 */
public class EmployeeByConstructor {
        private String name = "Himansu";

        private Employer employer;

        public EmployeeByConstructor(final Employer employer){
                this.employer = employer;
        }

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
