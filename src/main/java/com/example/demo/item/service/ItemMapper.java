package com.example.demo.item.service;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.command.BoardVO;
import com.example.demo.command.UserVO;

@Mapper
public interface ItemMapper {
	public ArrayList<UserVO> getList();
	public ArrayList<BoardVO> getBoardList();
}
