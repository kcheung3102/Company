import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static ArrayList<People> peoples = new ArrayList<>();
    public static ArrayList<Companies> companies = new ArrayList<>();
    public static ArrayList<Connection> connections = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        People john = new People(1, "john");
        People george = new People(2, "george");
        People paul = new People(3, "paul");
        People alex = new People(4, "alex");
        People michael = new People(5, "michael");
        Collections.addAll(peoples, john, george, paul, alex, michael);


        Companies company1 = new Companies(1, "IBM");
        Companies company2 = new Companies(2, "GrubHub");
        Companies company3 = new Companies(3, "Spotify");
        Companies company4 = new Companies(4, "Facebook");
        Collections.addAll(companies, company1, company2, company3, company4);

        Connection connection1 = new Connection(1, 1, 1, 2017, "Jr Developer");
        Connection connection2 = new Connection(2, 3, 2, 2004, "Audio Engineer");
        Connection connection3 = new Connection(3, 4, 3, 2014, "Software Engineer");
        Connection connection4 = new Connection(4, 1, 4, 2017, "Data Analyst");
        Connection connection5 = new Connection(5, 2, 5, 2015, "Senior Developer");
        Collections.addAll(connections, connection1, connection2, connection3, connection4, connection5);


        System.out.println("Welcome to the poor mans database ");
        System.out.println("Would you like to create a connection?(y/n) ");
        String str = input.nextLine();
        if (!str.equalsIgnoreCase("n")) {
            Connection userConnection = getUserConnection();
            System.out.println(userConnection.getdisplayText());
        }


    }

    private static Connection getUserConnection() {
        ArrayList<People> peopleList = getUserPerson();
        ArrayList<Companies> companyList = getUserCompany();
        System.out.println("Enter ID of Connection: ");
        long id = input.nextLong();
        input.nextLine();
        System.out.println("Enter Company ID: ");
        long companyID = input.nextLong();
        input.nextLine();
        System.out.println("Enter the Persons ID: ");
        long personID = input.nextLong();
        input.nextLine();
        System.out.println("Enter Year Joined: ");
        int yearJoined = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Persons Role: ");
        String role = input.nextLine();
        return new Connection(id, companyID, personID, yearJoined, role);
    }

    private static ArrayList<People> getUserPerson() {
        System.out.println("Enter Employer Number");
        long id = input.nextLong();
        input.nextLine();
        System.out.println("Enter Person Name: ");
        String person = input.nextLine();
        peoples.add(new People(id, person));
        return peoples;

    }

    private static ArrayList<Companies> getUserCompany() {
        System.out.println("Enter Company ID:");
        long id = input.nextLong();
        input.nextLine();
        System.out.println("Enter Company Name: ");
        String company = input.nextLine();

        companies.add(new Companies(id, company));
        return companies;
    }

    private static String getdisplayText() {
        String str = "";
        for (Connection con : connections) {
            for (People p : peoples) {
                if (con.getPeopleID() == p.getId()) {
                    str += p.getName() + " " + p.getId();
                    break;
                }
            }

            for (Companies c : companies) {
                if (con.getCompanyID() == c.getId()) {
                    str += c.getName() + " " + c.getId();
                    break;
                }
            }
            str += con.getRole() + " " + con.getYearJoined();

        }
        return str;
    }


}
    //Method to add company
    //Method to add person
    //Method to add link


}
