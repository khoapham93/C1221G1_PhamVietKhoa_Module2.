package collection_review.candidate_manager.view;

import collection_review.candidate_manager.controller.CandidateController;

public class View {
    public static void main(String[] args) {
        CandidateController candidateController = new CandidateController();
        candidateController.mainMenu();
    }
}
