package com.example.demo.itassets.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.command.ITAssetsVO;

@Mapper
public interface ITAssetsMapper {
	public List<ITAssetsVO> getITList();
}
