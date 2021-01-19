package face_main.controller;



import face_main.vo.User;
import face_main.interfaceforall.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestBootController {

    @Autowired
    private TestInterFace testInterFace;


    @RequestMapping("/num")
    @ResponseBody
    int home() {
        int i = testInterFace.testInterFace();
        return i;

    }

    @RequestMapping("/get")
    @ResponseBody
    User getUser() {
        return testInterFace.testUser("a","b");
    }


}
