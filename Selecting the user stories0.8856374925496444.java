
Generated Spring Boot Application with Controller, Service and Repository Classes:

Controller:

@RestController
public class SelectUserStoriesController {
 
    @Autowired
    private SelectUserStoriesService selectUserStoriesService;
 
    @GetMapping("/selectUserStories")
    public List<Project> getProjectsForOrganization(String organizationName) {
        return selectUserStoriesService.getProjectsForOrganization(organizationName);
    }
}

Service:

@Service
public class SelectUserStoriesService {
 
    @Autowired
    private SelectUserStoriesRepository selectUserStoriesRepository;
 
    public List<Project> getProjectsForOrganization(String organizationName) {
        return selectUserStoriesRepository.getProjectsForOrganization(organizationName);
    }
}

Repository:

@Repository
public class SelectUserStoriesRepository {
 
    public List<Project> getProjectsForOrganization(String organizationName) {
        // code to hit JIRA endpoint and get projects, backlogs, and sprints info based on the selected organization
        return projects;
    }
}