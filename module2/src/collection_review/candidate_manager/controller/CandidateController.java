package collection_review.candidate_manager.controller;

import collection_review.candidate_manager.model.Candidate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateController {
    Scanner scanner = new Scanner(System.in);
    ExperienceController experienceController = new ExperienceController();
    FresherController fresherController = new FresherController();
    InternController internController = new InternController();

    public void mainMenu() {

        int choice = -1;
        while (choice != 0) {
            System.out.println("-------------------------------------\n" +
                    "CANDIDATE MANAGEMENT SYSTEM\n" +
                    "1. Experience\n" +
                    "2. Fresher\n" +
                    "3. Internship\n" +
                    "4. Searching\n" +
                    "5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1:
                    experienceController.addNewExperience();
                    break;
                case 2:
                    fresherController.addNewFresher();
                    break;
                case 3:
                    internController.addNewIntern();
                    break;
                case 4:
                    searchCandidate();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }
    }

    public void searchCandidate() {
        System.out.println("Searching candidate");
        int candidateType = -1;
        System.out.print("Enter candidate name:");
        String candidateName = scanner.nextLine();
        do {
            System.out.print("Enter type of candidate:");
            candidateType = Integer.parseInt(scanner.nextLine());
            if (candidateType < 0 || candidateType > 2) {
                System.out.println("Candidate type is invalid");
            }
        } while (candidateType < 0 || candidateType > 2);

        switch (candidateType) {
            case 0:
                experienceController.searchExperience(candidateName);
                break;
            case 1:
                fresherController.searchFresher(candidateName);
                break;
            case 2:
                internController.searchIntern(candidateName);
                break;
            default:
                System.out.println("No choice");
        }
    }
}
