package OOP.Homework003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import OOP.Homework003.Student;
import OOP.Homework003.Iterator;
import OOP.Homework003.StudyGroup;

public class Potok {
    public List<StudyGroup> groups = new ArrayList<>();

    public void addGroup(StudyGroup studyGroup) {
        groups.add(studyGroup);
    }

    public List<StudyGroup> getGroups() {
        return groups;
    }
    public static class PotokComparator implements Comparator<Potok> {
        public int compare(Potok s1, Potok s2) {
            return s1.groups.size() - s2.groups.size();
        }
    }
    static class PotokService {
        public void sortPotoks(List<Potok> groups) {
            Collections.sort(groups, new PotokComparator());
        }
    }

}
