package org.example.builder;

public class Employee {
    private final String name;
    private final String company;
    private final boolean hasCar;
    private final boolean hasBike;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.company = builder.company;
        this.hasCar = builder.hasCar;
        this.hasBike = builder.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean hasCar() {
        return hasCar;
    }

    public boolean hasBike() {
        return hasBike;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hasCar=" + hasCar +
                ", hasBike=" + hasBike +
                '}';
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
        private boolean hasCar;
        private boolean hasBike;

        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public EmployeeBuilder withCar() {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder withBike() {
            this.hasBike = hasBike;
            return this;
        }

        public Employee build() {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            if (company == null || company.isEmpty()) {
                throw new IllegalArgumentException("Company cannot be null or empty");
            }

            return new Employee(this);
        }
    }
}
