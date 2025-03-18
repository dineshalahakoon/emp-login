package edu.icet.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private long id;
    private String userName;
    private String password;
    private String role;
    private String enail;

}
