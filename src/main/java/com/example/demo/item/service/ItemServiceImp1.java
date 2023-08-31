package com.example.demo.item.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.command.BoardVO;
import com.example.demo.command.UserVO;

@Service("itemService")
public class ItemServiceImp1 implements ItemService{

	@Autowired
	private ItemMapper itemMapper;

	@Override
	public ArrayList<UserVO> getList() {
		
		return itemMapper.getList();
	}

	@Override
	public ArrayList<BoardVO> getBoardList() {
		// TODO Auto-generated method stub
		return itemMapper.getBoardList();
	}
}
