package application.springboot.quartz.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UsersService {

    public void addUsers(){

        System.out.println("addUsers:" + new Date());
    }
}
