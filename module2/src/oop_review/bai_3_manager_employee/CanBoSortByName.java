package oop_review.bai_3_manager_employee;

import java.util.Comparator;

public class CanBoSortByName implements Comparator<CanBo> {
    @Override
    public int compare(CanBo o1, CanBo o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
