package cn.tedu.controller;

import cn.jt.common.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CartController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/query/{userId}")
    public SysResult myCart(@PathVariable Integer userId) {
        String url = "http://provider-cart/query/" + userId;        //VIP虚拟IP，提供者的application-name:provider-user
        return this.restTemplate.getForObject(url, SysResult.class);
    }

}
