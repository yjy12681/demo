package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.command.BoardVO;
import com.example.demo.command.UserVO;
import com.example.demo.item.service.ItemService;



@RestController
@RequestMapping("/api/data")
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {
    @Autowired
    private ItemService itemService;
    
    @GetMapping("/user")
    public ResponseEntity<List<UserVO>> getList() {
    	ArrayList<UserVO> data = itemService.getList();
    	
    	return new ResponseEntity<>(data,HttpStatus.OK);
    }
    
    @GetMapping("/board")
    public ResponseEntity<List<BoardVO>> getBoardList() {
    	ArrayList<BoardVO> data = itemService.getBoardList();
    	return new ResponseEntity<>(data,HttpStatus.OK);
    }
}
