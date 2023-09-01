package com.example.demo.itassets.service;

import java.util.List;

import com.example.demo.command.ITAssetsVO;
import com.example.demo.command.SWSpecVO;

public interface ITAssetsService {

	public List<ITAssetsVO> getITList();
	public int specInsert(SWSpecVO vo);
}
