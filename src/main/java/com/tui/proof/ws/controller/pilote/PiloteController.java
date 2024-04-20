package com.tui.proof.ws.controller.pilote;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pilote")
public interface PiloteController {

    @GetMapping(value="/")
    boolean createPilote();
}
