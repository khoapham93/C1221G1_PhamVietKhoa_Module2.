package collection_review.candidate_manager.controller;

import collection_review.candidate_manager.model.Candidate;
import collection_review.candidate_manager.model.Experience;
import collection_review.candidate_manager.model.Intern;
import collection_review.candidate_manager.service.IService;
import collection_review.candidate_manager.service.impl.ExperienceServiceImpl;
import collection_review.candidate_manager.service.impl.InternServiceImpl;

public class InternController extends CandidateCommonInforController {
    private String majors;
    private int semester;
    private String university;
    static IService internService = new InternServiceImpl();
static {
    internService.add(new Intern("11", "aa", "bbb", "1993", "Quảng Nam", "0123456789", "khoa123@gmail.com", 0, "Công nghệ phần mềm", 6, "Bách khoa"));
}
    public void addNewIntern() {
        String choice;
        while (true) {
            System.out.println("Add new experience candidate:");
            super.initCandidateCommonInfo();
            System.out.print("Major: ");
            this.majors = scanner.nextLine();
            System.out.print("Semester: ");
            this.semester = Integer.parseInt(scanner.nextLine());
            System.out.print("University: ");
            this.university = scanner.nextLine();

            Intern intern = new Intern(super.candidateId, super.firstName, super.lastName, super.birthday,
                    super.address, super.phone, super.email, Candidate.INTERN, this.majors,this.semester,this.university);
            internService.add(intern);

            System.out.println("Cadidate's added.");
            System.out.println("Do you want to continue (Y/N)?");
            choice = scanner.nextLine();

            if ("N".equals(choice)) {
                break;
            }
        }
        System.out.println("Internship Candidate added:");
        internService.display();
    }
    public void searchIntern(String name){
        boolean isfound = internService.searchByName(name);
        if (!isfound){
            System.out.println("No candidate in list");
        }

    }
}
