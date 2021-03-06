package sk.liskovci.pf2xxx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author pavol.liska
 * @date 12/29/2018
 */
@Controller
public class PFController {

    @GetMapping("/pf/{rok}")
    public String getPF2019(@RequestParam(name="komu", required=false, defaultValue="Vám") String komu,
                            @PathVariable(name="rok") String rok,
                            @RequestParam(name="kto", required=false, defaultValue="rodina Lišková") String kto,
                            @RequestParam(name="hard", required=false, defaultValue="false") String hard,
                            Model model) {
        model.addAttribute("hard", hard);
        model.addAttribute("rok", rok);
        model.addAttribute("komu", komu);
        model.addAttribute("kto", kto);
        return "pf2019";
    }
}
