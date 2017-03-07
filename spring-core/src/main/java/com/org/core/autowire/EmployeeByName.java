package com.org.core.autowire;

/**
 * Created by ehimnay on 07/03/2017.
 */
public class EmployeeByName {
        private String name = "Himansu";

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
