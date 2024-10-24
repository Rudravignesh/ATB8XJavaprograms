package Oct.ex_23102024;

public class Lab008_customexp {

    public class bank {
        private String currancy;
        private Integer Balance;

        public bank(String currancy, Integer balance) {
            this.currancy = currancy;
            Balance = balance;
        }

        public String getCurrancy() {
            return currancy;
        }

        public void setCurrancy(String currancy) {
            this.currancy = currancy;
        }

        public Integer getBalance() {
            return Balance;
        }

        public void setBalance(Integer balance) {
            Balance = balance;
        }




    }
}

