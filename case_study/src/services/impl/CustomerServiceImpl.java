package services.impl;

import enums.CustomerType;
import enums.Gender;
import models.person.Customer;
import models.person.Person;
import services.IPersonService;
import utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements IPersonService {
    private static List<Person> customerList = new LinkedList<>();
    private static final String CUSTOMER_SOURCE_FILE = "src\\data\\customer.csv";


    static {
        customerList = ReadAndWriteFile.readCustomerListFromCSV(CUSTOMER_SOURCE_FILE);
//        customerList.add(new Customer("01","Khoa","22/12/2022", Gender.Male,"212222222","0999999999","aaaaac@gmail.com", CustomerType.Diamond,"DN"));
//        customerList.add(new Customer("02","Pham","10/12/2022", Gender.Female,"212222333","0999988888","abbbbbbb@gmail.com", CustomerType.Member,"QN"));
//        customerList.add(new Customer("03","Uyen","09/11/2022", Gender.Female,"222111111","09999977777","acccccccc@gmail.com", CustomerType.Gold,"Qng"));
    }

    public CustomerServiceImpl() {
    }

    @Override
    public void add(Person customer) {
        customerList.add(customer);
        ReadAndWriteFile.writeAllPersonTypeToCSV(CUSTOMER_SOURCE_FILE,customerList);
    }

    @Override
    public void edit(int index, Person object) {
        customerList.set(index, object);
        ReadAndWriteFile.writeAllPersonTypeToCSV(CUSTOMER_SOURCE_FILE,customerList);
    }

    @Override
    public List<Person> getList() {
        return customerList;
    }
}
