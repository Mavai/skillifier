package rage.skills;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {

    private final List<String> assignments;

    public AssignmentService() {
        this.assignments = new ArrayList<>();
        this.assignments.add("/path/to/exercise1.zip");
        this.assignments.add("/path/to/exercise2.zip");
        this.assignments.add("/path/to/exercise3.zip");
        this.assignments.add("/path/to/exercise4.zip");
        this.assignments.add("/path/to/exercise5.zip");
        this.assignments.add("/path/to/exercise6.zip");
        this.assignments.add("/path/to/exercise7.zip");
        this.assignments.add("/path/to/exercise8.zip");
        this.assignments.add("/path/to/exercise9.zip");
        this.assignments.add("/path/to/exercise10.zip");
    }

    public String getRandomAssignment(String user) {
        return this.assignments.get(new Random().nextInt(this.assignments.size()));
    }

}
