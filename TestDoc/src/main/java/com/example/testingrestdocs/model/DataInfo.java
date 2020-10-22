package com.example.testingrestdocs.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@Data
public class DataInfo implements Serializable {

    private String name;

    private String lastName;

    private int age;

    private String address;

}
