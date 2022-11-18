//package tdd;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class KataTest {
//    public static class AccountTest {
//
//        @Test
//        public void depositTest(){
//            // given there is an account
//            Account deborahAccount = new Account();
//
//            //when i deposit 5000
//            deborahAccount.deposit(5000);
//            // when i deposit 10000
//            deborahAccount.deposit(10000);
//
//            // check that balance is 5000
//            int deborahAccountBalance = deborahAccount.getBalance();
//
//            Assertions.assertEquals(15000, deborahAccountBalance);
//        }
//
//
//            @Test
//            public void depositTwiceTest(){
//                //given there is an account
//                Account deborahAccount = new Account();
//                //given that initial balance is 4000
//                deborahAccount.deposit(4000);
//                //when i deposit 2000
//                deborahAccount.deposit(2000);
//                //check that balance is 6000
//                int deborahAccountBalance = deborahAccount.getBalance();
//                Assertions.assertEquals(6000, deborahAccountBalance);
//        }
//
//           @Test
//           public void depositNegative(){
//            //given there is an account
//               Account deborahAccount = new Account();
//                //given that initial balance is 4000
//                deborahAccount.deposit(4000);
//                //when i deposit 2000
//                deborahAccount.deposit( -2000);
//                //check that balance is 4000
//                int deborahAccountBalance = deborahAccount.getBalance();
//                Assertions.assertEquals(4000, deborahAccountBalance);
//            }
//
//
//
//        @Test
//        public void withdrawNegative() {
//            //given there is an account
//            Account deborahAccount = new Account();
//            //given that initial balance is 4000
//            deborahAccount.deposit(4000);
//            //when I withdraw 6000
//            deborahAccount.withdraw(-6000);
//            //check that balance is 4000
//            int deborahAccountBalance = deborahAccount.getBalance();
//            Assertions.assertEquals(4000, deborahAccountBalance);
//
//        }
//
//        @Test
//        public void withdrawAmountTest() {
//            //given there is an account
//            Account deborahAccount = new Account();
//            //given that initial balance is 4000
//            deborahAccount.deposit(4000);
//            //when I withdraw 2000
//            deborahAccount.withdraw(2000);
//            //check that balance is 2000
//            int Balance = deborahAccount.getBalance();
//            Assertions.assertEquals(4000, Balance);
//
//        }
//
//
//        @Test
//        public void multiWithdrawalTest(){
//            //given there is an account
//            Account deborahAccount = new Account();
//            //given that initial balance is 1000
//            deborahAccount.deposit(1000);
//            //when i deposit 2000
//            deborahAccount.deposit(2000);
//            //when i withdraw 6000
//            deborahAccount.withdraw(6000);
//            //check that balance is 3000
//            int deborahAccountBalance = deborahAccount.getBalance();
//            Assertions.assertEquals(3000, deborahAccountBalance);
//        }
//
//
//    }
//}
