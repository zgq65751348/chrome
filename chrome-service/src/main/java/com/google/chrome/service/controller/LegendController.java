package com.google.chrome.service.controller;

import com.google.chrome.service.service.LegendService;
import com.google.chrome.tools.utils.RestBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/legends")
@Api(value = "英雄操作")
public class LegendController {

    @Autowired
    private LegendService legendService;

    @GetMapping(value = "/sends")
    public void sendMessage(){
        legendService.sendMessage();
        legendService.sendTTLMessage();
    }
}
