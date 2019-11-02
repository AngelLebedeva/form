package springboot.form;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CheckinController {

    @RequestMapping(value="/checkin", method = RequestMethod.GET)
    public String checkinForm(Model model) {
       model.addAttribute("checkin", new Checkin());
       return "checkin";
    }

    @RequestMapping(value="/checkin", method = RequestMethod.POST)
    public String checkinSubmit(@ModelAttribute Checkin checkin, Model model) {
        model.addAttribute("checkin", checkin);
        return "result";
    }
}
