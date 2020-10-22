package com.example.testingrestdocs.controller;

import com.example.testingrestdocs.model.DataInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class MainController {

    @ApiOperation(value = "Inquiry Customer", notes = "Inquiry Customer by name")
    @GetMapping("/get")
    public Mono<DataInfo> getInfo(String name) {
        DataInfo data = new DataInfo();
        data.setName(name);
        return Mono.just(data);
    }

//    @GetMapping("/get")
//    @ApiOperation(value = "Fetch Story by ID", notes = "More notes about this method")
//    @ApiResponses(value = {
//            @ApiResponse(code = 400, message = "Invalid ID supplied"),
//            @ApiResponse(code = 200, message = "Invalid ID supplied"),
//    })
//    private Mono<String> getDataInfo(String name) {
//        return Mono.just("Hello world " + name + ".");
//    }

//    @GetMapping("/get/nickName")
//    private Mono<String> getDataNickName(String nickName) {
//        return Mono.just("My nick name is " + nickName + ".");
//    }

//    @PutMapping("/put")
//    @Validated
//    private Mono<DataInfo> putDataInfo(DataInfo data){
//        return Mono.just(data);
//    }
//
//    @PostMapping("/post")
//    @Validated
//    private Mono<DataInfo> postDataInfo(@RequestBody @Valid DataInfo data){
//        return Mono.just(data);
//    }
//
//    @DeleteMapping("/delete")
//    private Mono<DataInfo> deleteDataInfo(String name){
//        log.info("Delete user name : " + name + ".");
//        DataInfo data = new DataInfo();
//        data.setName(name);
//        return Mono.just(data);
//    }
}
