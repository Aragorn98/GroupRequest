package kz.iitu.jd3.bookrequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/groupinfo/request")
public class GroupRequestController {

    private final Producer producer;
    private GroupInformationService groupInformationService;

    @Autowired
    public GroupRequestController(Producer producer, GroupInformationService groupInformationService) {
        this.producer = producer;
        this.groupInformationService = groupInformationService;
    }

    // TODO Ideally there should POST request
    @GetMapping
    public GroupRequest sendMessageToKafkaTopic2(@RequestParam("teacherId") Long teacherId,
                                           @RequestParam("groupId") Long groupId) {
        System.out.println("argyn inside controller");
        GroupRequest groupRequest = new GroupRequest(teacherId, groupInformationService.getGroupById(groupId));
        this.producer.groupRequestNotify(groupRequest);
//        return "Your request sent successful!";
        return groupRequest;
    }
}