package collection_review.candidate_manager.service.impl;

import collection_review.candidate_manager.model.Candidate;
import collection_review.candidate_manager.model.Experience;
import collection_review.candidate_manager.service.IService;

import java.util.ArrayList;
import java.util.List;

public class ExperienceServiceImpl implements IService<Experience> {
    private List<Candidate> experienceList = new ArrayList<>();

    public ExperienceServiceImpl() {
    }

    public ExperienceServiceImpl(List<Candidate> experienceList) {
        this.experienceList = experienceList;
    }

    public List<Candidate> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Candidate> experienceList) {
        this.experienceList = experienceList;
    }

    @Override
    public void add(Experience experience) {
        this.experienceList.add(experience);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {
        for (Candidate experience : experienceList) {
            System.out.println(experience);
        }
    }

    @Override
    public boolean searchByName(String name) {
        boolean result = false;
        name = name.toLowerCase();
        for (Candidate experience : experienceList) {
            boolean isContainFirstName = experience.getFirstName().toLowerCase().contains(name);
            boolean isContainLastName = experience.getLastName().toLowerCase().contains(name);
            if (isContainFirstName || isContainLastName) {
                System.out.println(experience);
                result = true;
            }
        }
        return result;
    }
}
