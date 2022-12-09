//package chapterFour.AssignmentsAndExercises;
//
//import java.util.Scanner;
//
//public class Nokia3310MenuSwitchCase {
//
//
//    public static void main(String[] args) {
//        startProgram();
//    }
//
//    public static void startProgram() {
//        Scanner menu = new Scanner(System.in);
//
//        System.out.println("Enter a number to access each menu: ");
//        System.out.println("Add please further enter a number to access any other sub-menu(s): ");
//        System.out.println();
//
//        System.out.println("""
//                Main Nokia 3310 Phone Menu:
//
//                1. Phone book
//                2. Messages
//                3. Chat
//                4. Call register
//                5. Tones
//                6. Settings
//                7. Call divert
//                8. Games
//                9. Calculator
//                10. Reminders
//                11. Clock
//                12. Profiles
//                13. Sim services
//                14. Return to this Main Menu
//                """);
//
//        int userInput = menu.nextInt();
//
//        switch (userInput) {
//
//            case 1 ->
//
//
//                System.out.println("""
//                        Phone book Menu:
//
//                        1. Search
//                        2.Search Nos.
//                        3. Add name
//                        4. Erase
//                        5. Edit
//                        6. Assign tone
//                        7. Send b'card
//                        8. Options
//                        9.Speed dials
//                        10.Voice tags
//
//                        """);
//                System.out.println("Enter a number");
//                int phoneBook = menu.nextInt();
//                switch (phoneBook) {
//
//                    case 1 ->
////                        System.out.println("Search");
//                        System.out.println("Searching for contact...");
//                        break;
//                    case 2 ->
//                        System.out.println(" Search NOS...");
//                        break;
//                    case 3 ->
//                        System.out.println(" Add name...");
//                        break;
//                    case 4 ->
//                        System.out.println("Erase...");
//                        break;
//                    case 5 ->
//                        System.out.println("Edit...");
//                        break;
//                    case 6 ->
//                        System.out.println("Assign...");
//                        break;
//                    case 7 ->
//                        System.out.println("b'card...");
//                        System.out.println("Sending b'card...");
//                        break;
//
//                    case 8 ->
//                        System.out.println("""
//                                Options
//
//                                1. Type of view
//                                2.Memory Status
//
//                                """);
//
//                        System.out.println("Enter a number");
//                        int options = menu.nextInt();
//                        switch (options) {
//
//                            case 1 ->
//                                System.out.println("Type of view");
//                                break;
//                            case 2 ->
//                                System.out.println("Memory Status");
//                                break;
//                            default:
//                                System.out.println("loading... ");
//                                break;
//                        }
//                        break;
//
//                    case 9 ->
//                        System.out.println(" Speed dail...");
//                        break;
//
//                    case 10 ->
//                        System.out.println("Voice tag...");
//
//
//                }
//                System.out.println();
//                startProgram();
//            }
//        }
//
//
//        userInput = menu.nextInt();
//        switch (userInput) {
//
//            case 2 -> System.out.println("""
//                    Messages Menu:
//
//                    1. Write messages
//                    2.Inbox
//                    3. Outbox
//                    4. Picture messages
//                    5. Templates
//                    6. Smileys
//                    7. Messages settings
//                    8. Info service
//                    9. Voice mailbox number
//                    10.Service command editor1`
//                    """);
//
//            System.out.println("Enter a number");
//            userInput = menu.nextInt();
//            switch (userInput) {
//
//                case 1->
//                    System.out.println("Write messages");
//                    break;
//                case 2 ->
//                    System.out.println(" Inbox");
//                    break;
//                case 3 ->
//                    System.out.println(" Outbox");
//                    break;
//                case 4 ->
//                    System.out.println(" Picture messages");
//                    break;
//                case 5:
//                    System.out.println(" Templates");
//                    break;
//                case 6:
//                    System.out.println("Smileys");
//                    break;
//                case 7:
//                    System.out.println("""
//                                                           Messages settings
//                                              1.    Set 1
//                                              2.    Common
//                            """);
//
//
//                    System.out.println("Enter number 1 or 2 to access the sub-menus");
//                    int messageSetting = menu.nextInt();
//                    switch (messageSetting) {
//
//                        case 1 ->
//
//                            System.out.println("""
//                                    Messages settings
//                                    Set 1
//
//                                    1. Message centre number
//                                    2. Messages sent as
//                                    3. Message validity
//
//
//                                    """);
//
//
//                            System.out.println("Enter a number");
//                            int set1 = menu.nextInt();
//                            switch (set1) {
//
//                                case 1 -> System.out.println("Message centre number");
//
//                                case 2 -> System.out.println("Message sent as");
//
//                                case 3 -> System.out.println("Message validity");
//
//                            }
//                            break;
//
//
//                        case 2->
//                            System.out.println("""
//
//                                         Common
//
//                                    1. Delivery reports
//                                    2. Reply via same centre
//                                    3. Character support
//                                     """);
//
//
//                            System.out.println("Enter a number");
//                            int common = menu.nextInt();
//                            switch (common) {
//
//                                case 1 -> System.out.println("Delivery reports");
//
//                                case 2 -> System.out.println("Reply via same centre");
//
//                                case 3 -> System.out.println("Character support");
//
//                            }
//                            break;
//
//                        default -> {
//                            System.out.println("loading... ");
//                            break;
//                        }
//                        break;
//
//
//                        System.out.println();
//                        startProgram();
//                    }
//
//
//                case 3 ->
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//                    System.out.println("""
//                            1. Chat
//
//                             """);
////            System.out.println("chill, no need for extra input, Please continue to chat as no other sub-menu for chat: ");
//
//
//                    break;
//
//
//                case 4 ->
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//                    System.out.println("""
//                            1. Missed calls
//                            2. Received calls
//                            3. Dialled numbers
//                            4. Erase recent call lists
//                            5.Show call duration
//                                1. Last call duration
//                                2. All calls duration
//                                3. Received calls' duration
//                                5. Clear timers
//
//                            6. Show call costs
//                                1. Last call  cost
//                                2. All calls' cost
//                                3. Clear counters
//
//                            7. Call cost settings
//                                1. Call cost limits
//                                2. Show cost in
//                            8. Prepaid credit
//
//                            """);
//
//
//
//
//                case 5 -> {
//
//
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//
//                    System.out.println("""
//                            1. Ringing tone
//                            2. Ringing volume
//                            3. incoming call alert
//                            4. Composer
//                            5. Message alert tone
//                            6. Keypad tones
//                            7. Warning and game tones
//                            8. Viberating alert
//                            9. Screen saver
//
//                            """);
//
//                }
//
//
//                case 6 -> {
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//
//
//                    System.out.println("""
//                            1. Call settings
//                                 1. Automatic redial
//                                 2. Speed dialling
//                                 3. Call waiting options
//                                 4. Own number sending
//                                 5. Phone line in use
//                                 6. Automatic answer
//
//                            2. Phone settings
//                                 1. Language
//                                 2. Cell info display
//                                 3. Welcome note
//                                 4. Network selection
//                                 5. Lights
//                                 6. Confirm SIM service actions
//
//                            3. Security settings
//                                 1. PIN code request
//                                 2. Call barring service
//                                 3. Fixed dialling
//                                 4. Closing user group
//                                 5. Phone security
//                                 6. Change access codes
//
//                            4. Restore factory settings
//
//
//                            """);
//
//                }
//
//
//                case 7 -> {
//
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//
//
//                    System.out.println("""
//
//                            Call divert
//
//                            """);
//
//                }
//
//
//                case 8 -> {
//                    System.out.println("""
//
//                            Games
//
//                            1. Tetris
//                            2. Snakes
//
//
//                            """);
//
//
//                    System.out.println("Enter a number to access each menu: ");
//                    int games = menu.nextInt();
//                    switch (games) {
//
//                        case 1 -> System.out.println("Tetris");
//                        case 2 -> System.out.println("Snakes");
//
//
//                    }
//                    startProgram();
//
//                }
//
//
//                case 9 -> {
//
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//
//                    System.out.println("""
//
//                            Calculator
//
//                            """);
//
//                }
//
//                case 10 -> {
//
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//
//
//                    System.out.println("""
//
//                            Reminders
//
//                            """);
//
//                }
//
//
//                case 11 -> {
//
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//
//                    System.out.println("""
//                            1. Alarm clock
//                            2. Clock settings
//                            3. Date settings
//                            4. Stopwatch
//                            5. Countdown timer
//                            6. Auto update of date and time
//
//                            """);
//                }
//
//
//                case 12 -> {
//
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//
//
//                    System.out.println("""
//                            Chat
//
//                            Profiles
//
//                            """);
//
//                }
//
//
//                case 13 -> {
//
//                    System.out.println("Enter a number to access each menu: ");
//                    userInput = menu.nextInt();
//
//
//                    System.out.println("""
//
//                            SIM services
//
//                            """);
//
//                }
//
//
//                case 14 -> {
//
//
//                    System.out.println("""
//                            Menu:
//
//                            1. Phone book
//                            2. Messages
//                            3. Chat
//                            4. Call register
//                            5. Tones
//                            6. Settings
//                            7. Call divert
//                            8. Games
//                            9. Calculator
//                            10. Reminders
//                            11. Clock
//                            12. Profiles
//                            13. Sim services
//
//                            """);
//
//
//                    System.out.println("Enter a number to access each menu: ");
//                    System.out.println("Add please further enter a number to access any other sub-menu(s): ");
//                    System.out.println();
//
//                    userInput = menu.nextInt();
//
//                }
//
//
//                default -> {
//                    handleOtherUserInput();
//                    startProgram();
//                }
//
//            }
//
//
//
//
//    }
//
//    private static void handleOtherUserInput() {
//        System.out.println(" you Entered a wrong number to access a menu: ");
//        System.out.println("Please Enter a correct menu number to get to the menu: ");
//        startProgram();
//
//    }
//
//}
//
