package collection_review.candidate_manager.service.impl;

import collection_review.candidate_manager.model.Candidate;
import collection_review.candidate_manager.model.Fresher;
import collection_review.candidate_manager.service.IService;

import java.util.ArrayList;
import java.util.List;

public class FresherServiceImpl implements IService<Fresher> {
    private List<Candidate> fresherList = new ArrayList<>();

    public FresherServiceImpl(List<Candidate> fresherList) {
        this.fresherList = fresherList;
    }

    public FresherServiceImpl() {

    }

    public List<Candidate> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Candidate> fresherList) {
        this.fresherList = fresherList;
    }

    @Override
    public void add(Fresher object) {
        this.fresherList.add(object);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {
        for (Candidate fresher : fresherList) {
            System.out.println(fresher);
        }
    }

    @Override
    public boolean searchByName(String name) {
        boolean result = false;
        name = name.toLowerCase();
        for (Candidate fresher : fresherList) {
            boolean isContainFirstName = fresher.getFirstName().toLowerCase().contains(name);
            boolean isContainLastName = fresher.getLastName().toLowerCase().contains(name);
            if (isContainFirstName || isContainLastName) {
                System.out.println(fresher);
                result = true;
            }
        }
        return result;
    }
}
