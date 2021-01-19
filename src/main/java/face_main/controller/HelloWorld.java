package face_main.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value = "HelloWorld")
public class HelloWorld {

    @ResponseBody
    @RequestMapping(value = "/helloWorld",method = {RequestMethod.GET,RequestMethod.POST})
    @ApiOperation(value = "just a test" , notes = "test")
    public String helloWorld(){
        return "Hello World!";
    }

    @ResponseBody
    @RequestMapping(value = "/sum",method = {RequestMethod.GET,RequestMethod.POST})
    public String sum(int a,int b){
        int sum =a+b;
        return (a+" + "+b+" = "+sum);
    }


}
