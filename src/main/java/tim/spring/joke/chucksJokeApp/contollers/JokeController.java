package tim.spring.joke.chucksJokeApp.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tim.spring.joke.chucksJokeApp.services.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", " "})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        System.out.println("Incoming!");
        return "chucknorris";
    }
}
