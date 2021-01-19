package face_main.controller;


import face_main.vo.User;
import face_main.interfaceforall.TestInterFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private TestInterFace testInterFace;


    @RequestMapping("/get")
    @ResponseBody
    User getUser(){
        return testInterFace.testUser("c","d");
    }




}
