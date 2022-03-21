package services;

import models.Contract;

import java.util.List;

public interface IContractService extends IService<Contract> {

    void edit(int index, Contract contract);

    List<Contract> getList();
}
