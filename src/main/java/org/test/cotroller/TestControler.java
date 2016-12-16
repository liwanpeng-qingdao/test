package org.test.cotroller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.test.entity.Seckill;
import org.test.service.SeckillService;

import javax.annotation.Resource;

/**
 * Created by OUC on 2016/12/16
 */
@Controller
@RequestMapping("/testController")
public class TestControler {
    @Resource
    private  SeckillService seckillService;
@RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public String test(Model model){
    try {
           Seckill seckill=seckillService.getById(1000);
    model.addAttribute("seckll",seckill);

    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return "index";
}
}
