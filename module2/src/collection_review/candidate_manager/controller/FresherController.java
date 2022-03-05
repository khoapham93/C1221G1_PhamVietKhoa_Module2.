package collection_review.candidate_manager.controller;

import collection_review.candidate_manager.model.Candidate;
import collection_review.candidate_manager.model.Experience;
import collection_review.candidate_manager.model.Fresher;
import collection_review.candidate_manager.service.IService;
import collection_review.candidate_manager.service.impl.ExperienceServiceImpl;
import collection_review.candidate_manager.service.impl.FresherServiceImpl;

public class FresherController extends CandidateCommonInforController {
    private int yearGraduate;
    private String rankOfGraduation;
    private String university;

    static IService fresherService = new FresherServiceImpl();

    static {
        fresherService.add(new Fresher("11", "aa", "bbb", "1993", "Quảng Nam", "0123456789", "khoa123@gmail.com", 1, 2022, "Khá", "Bách khoa"));
    }

    public void addNewFresher() {
        String choice;
        while (true) {
            System.out.println("Add new fresher candidate:");
            super.initCandidateCommonInfo();
            System.out.print("Year of graduate: ");
            this.yearGraduate = Integer.parseInt(scanner.nextLine());
            System.out.print("Rank of graduate: ");
            this.rankOfGraduation = scanner.nextLine();
            System.out.print("University: ");
            this.university = scanner.nextLine();
            Fresher fresher = new Fresher(super.candidateId, super.firstName, super.lastName, super.birthday,
                    super.address, super.phone, super.email, Candidate.FRESHER, this.yearGraduate, this.rankOfGraduation, this.university);
            fresherService.add(fresher);
            System.out.println("Cadidate's added.");
            System.out.println("Do you want to continue (Y/N)?");
            choice = scanner.nextLine();

            if ("N".equals(choice)) {
                break;
            }
        }

        System.out.println("Fresher Candidate added:");
        fresherService.display();
    }

    public void searchFresher(String name) {
        boolean isfound = fresherService.searchByName(name);
        if (!isfound) {
            System.out.println("No candidate in list");
        }

    }
}
