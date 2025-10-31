package yoon.hyeon.sang.youtube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class YoutubeCon {

    @RequestMapping(value="", method = RequestMethod.GET)
    public ModelAndView goPage() {
        return new ModelAndView("youtube/search");
    }
}
