package com.example.demo.itassets.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.command.ITAssetsVO;
import com.example.demo.command.SWSpecVO;

@Mapper
public interface ITAssetsMapper {
	public List<ITAssetsVO> getITList();
	public int specInsert(SWSpecVO vo);
}
