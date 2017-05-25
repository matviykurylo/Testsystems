package ua.lviv.m.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.m.entities.Answers;
import ua.lviv.m.entities.Questions;
import ua.lviv.m.entities.Test;
import ua.lviv.m.service.AnswerService;
import ua.lviv.m.service.QuestionService;
import ua.lviv.m.service.TestService;

import java.security.Principal;

/**
 * Created by home on 09.05.2017.
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "/tests/all", method = RequestMethod.GET)
    public String getAllTest(Model model){
        model.addAttribute("tests", testService.findAll());
        return "tests";
    }
    @RequestMapping(value = "/tests/add", method = RequestMethod.GET)
    public String addTest(Model model){
        model.addAttribute("tests", testService.findAll() );
                return "add-test";
    }
    @RequestMapping(value = "/tests/add", method = RequestMethod.POST)
    public String addTest(@RequestParam("title")String title) {
        testService.add(new Test(title));
        return "redirect:/tests/add";
    }
   @RequestMapping(value = "/tests/add/question", method = RequestMethod.GET)
public String addQuestionGet(Model model){
        model.addAttribute("question", new Questions());
 //       model.addAttribute("answer", new Answers());
        return "add-test";
   }

    @RequestMapping(value = "/tests/add/question", method = RequestMethod.POST)
    public String addQuestion(@RequestParam("text") String text, @RequestParam("price") String price, @RequestParam("answer") String answer, @RequestParam("isTrue") boolean isTrue /*, @RequestParam("test_id") int test_id*/){
        questionService.add(new Questions(text, price));
        answerService.add(new Answers(answer, isTrue));
return "redirect:/tests/add";
    }
}
