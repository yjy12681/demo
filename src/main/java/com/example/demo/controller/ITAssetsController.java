package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.command.ITAssetsVO;
import com.example.demo.command.SWSpecVO;
import com.example.demo.itassets.service.ITAssetsService;

@RestController
@RequestMapping("/assets")
@CrossOrigin(origins = "http://localhost:3000")
public class ITAssetsController {

	@Autowired
	private ITAssetsService iTAssetsService;
	
	
	@GetMapping("/getITList")
	public ResponseEntity<List<ITAssetsVO>> getITList() {
		List<ITAssetsVO> data = iTAssetsService.getITList();
		
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	@PostMapping("/specInsert")
	public ResponseEntity<Integer> specInsert(@RequestBody SWSpecVO vo) {
	    System.out.println("Received: " + vo);
	    int data = iTAssetsService.specInsert(vo);
	    return new ResponseEntity<>(data, HttpStatus.OK);
	}
	
}
