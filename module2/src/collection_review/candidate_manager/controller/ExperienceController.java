package collection_review.candidate_manager.controller;

import collection_review.candidate_manager.model.Candidate;
import collection_review.candidate_manager.model.Experience;
import collection_review.candidate_manager.service.IService;
import collection_review.candidate_manager.service.impl.ExperienceServiceImpl;

public class ExperienceController extends CandidateCommonInforController {
    private double expInYear;
    private String proSkill;
    static IService experienceService = new ExperienceServiceImpl();

    static {
        experienceService.add(new Experience("1","Khoa","Pham","1993","Quảng Nam","0123456789","khoa123@gmail.com",0,3,"SQL"));
        experienceService.add(new Experience("2","Trung","Tran","2002","Huế","0123456789","trung11@gmail.com",0,2,"java"));
    }
    public void addNewExperience() {
        String choice;
        while (true) {
            System.out.println("Add new experience candidate:");
            super.initCandidateCommonInfo();
            System.out.print("Year of experience: ");
            this.expInYear = Double.parseDouble(scanner.nextLine());
            System.out.print("Professional Skill: ");
            this.proSkill = scanner.nextLine();

            Experience experience = new Experience(super.candidateId, super.firstName, super.lastName, super.birthday,
                    super.address, super.phone, super.email, Candidate.EXPERIENCE, this.expInYear, this.proSkill);
            experienceService.add(experience);
            System.out.println("Cadidate's added.");
            System.out.println("Do you want to continue (Y/N)?");
            choice = scanner.nextLine();

            if ("N".equals(choice)) {
                break;
            }
        }
        System.out.println("Experience Candidate added:");
        experienceService.display();
    }
    public void searchExperience(String name){
        boolean isfound = experienceService.searchByName(name);
        if (!isfound){
            System.out.println("No candidate in list");
        }

    }
}
