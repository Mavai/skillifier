package rage.skills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@RestController
public class SkillController {

    final AssignmentService assignmentService;
    final Map<String, Integer> responseCounts = new HashMap<>();

    @Autowired
    public SkillController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @RequestMapping("/next.json")
    public Map<String, Serializable> getNextAssignment() {
        Map<String, Serializable> assignmentContent = new TreeMap<>();
            assignmentContent.put("available", true);
            assignmentContent.put("zip_url", "/zip");
        return assignmentContent;
    }

    @RequestMapping(value = "/*zip", produces = "application/zip")
    public void downloadContent(HttpServletResponse response) throws Throwable {
        response.setHeader("Content-Disposition", "attachment; filename=file.zip");
        Files.copy(Paths.get("src/main/resources/01.AdaLovelace.zip"), response.getOutputStream());
    }
}
