package com.example.board_pedro.src.item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
@Controller
@RequestMapping("")
public class ItemController {
    protected static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;


    @RequestMapping("/list")
    public String getList(HttpServletResponse response, HttpSession session, Model model, RedirectAttributes redirectAttributes, @RequestParam Map<String, Object> param) throws Exception {

        model.addAttribute("param",param); //파라미터 전달
        model.addAttribute("columns",itemService.getList(param)); //select 요소 가져오기
        logger.error("List param"+ itemService.getList(param));
        return "index/index";
    }
}
