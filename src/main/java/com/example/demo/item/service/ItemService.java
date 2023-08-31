package com.example.demo.item.service;

import java.util.ArrayList;

import com.example.demo.command.BoardVO;
import com.example.demo.command.UserVO;

public interface ItemService {
	public ArrayList<UserVO> getList();
	public ArrayList<BoardVO> getBoardList();
}
