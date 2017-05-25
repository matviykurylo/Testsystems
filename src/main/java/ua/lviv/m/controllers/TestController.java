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
import ua.lviv.m.service.UserService;

import java.security.Principal;


@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @Autowired
    private TestService testService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "/tests/all", method = RequestMethod.GET)
    public String getAllTest(Model model) {
        model.addAttribute("tests", testService.findAll());
        return "tests";
    }

    @RequestMapping(value = "/tests/add", method = RequestMethod.GET)
    public String addTest(Model model, Principal principal) {
        if (principal == null) {
        } else {
            model.addAttribute("id_user", userService.findById(Integer.parseInt(principal.getName())));
        }
        model.addAttribute("tests", testService.findAll());
                return "add-test";
    }

    @RequestMapping(value = "/tests/add", method = RequestMethod.POST)
    public String addTest(@RequestParam("title") String title) {
        testService.add(new Test(title));
        return "redirect:/tests/add";
    }

    @RequestMapping(value = "/tests/add/question", method = RequestMethod.GET)
    public String addQuestionGet(Model model) {
        model.addAttribute("question", new Questions());
        return "add-test";
    }

    @RequestMapping(value = "/tests/add/question", method = RequestMethod.POST)
    public String addQuestion(@RequestParam("text") String text, @RequestParam("price") int price,
                              @RequestParam("answer") String answer, @RequestParam("isTrue") boolean isTrue,
                              @RequestParam("test_id") int test_id) {
        questionService.add(text, price, testService.findById(test_id));
        answerService.add(new Answers(answer, isTrue));
        return "redirect:/tests/add";
    }
}
