package com.example.back_board;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Board {
    @RequestMapping("api/board")
    public HashMap<String, Object> return_json() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id labore ex et quam laborum", "Eliseo@gardner.biz");
        map.put("quo vero reiciendis velit similique eadrum", "Jayne_Kuhic@sydney.com");
        map.put("odio adipisci rerum daut adndddddiddddmii", "Niddkita@g!!dddarfield.biz");
        return map;
    }
}
