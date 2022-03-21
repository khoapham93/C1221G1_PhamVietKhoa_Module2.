package services.impl;

import models.Contract;
import services.IContractService;
import utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ContractServiceImpl implements IContractService {
    private static List<Contract> contractList = new ArrayList<>();
    private static final String CONTRACT_SOURCE_FILE = "src\\data\\contract.csv";

    static {
        contractList = ReadAndWriteFile.readContractFromCSV(CONTRACT_SOURCE_FILE);
    }

    @Override
    public void add(Contract object) {
        contractList.add(object);
        ReadAndWriteFile.writeContractToCSV(CONTRACT_SOURCE_FILE,contractList);
    }

    @Override
    public void edit(int index, Contract contract) {
        contractList.set(index, contract);
        ReadAndWriteFile.writeContractToCSV(CONTRACT_SOURCE_FILE,contractList);
    }

    @Override
    public List<Contract> getList() {
        return contractList;
    }

}
