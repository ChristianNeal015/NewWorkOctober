package reuploadHw;

    public class CommissionedEmployee extends Employee {
        private double grossSales;
        private double commisionRate;

        public CommissionedEmployee(String firstName, String lastName, String employeeId, double grossSales, double commisionRate) {
            super(firstName, lastName, employeeId);
            this.grossSales = grossSales;
            this.commisionRate = commisionRate;
        }

        public double getGrossSales() {
            return grossSales;
        }

        public void setGrossSales(double grossSales) {
            this.grossSales = grossSales;
        }

        public double getCommisionRate() {
            return commisionRate;
        }

        public void setCommisionRate(double commisionRate) {
            this.commisionRate = commisionRate;
        }

        @Override
        public double paycheck() {
            return commisionRate * grossSales;
        }

        @Override
        public String toString() {
            return "CommissionedEmployee{" +
                    "grossSales=" + grossSales +
                    ", commisionRate=" + commisionRate +
                    '}';
        }
    }
