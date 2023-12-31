package com.example.demo.itassets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.command.ITAssetsVO;
import com.example.demo.command.SWSpecVO;

@Service("iTAssetsService")
public class ITAssetsServiceImp1 implements ITAssetsService{

	@Autowired
	private ITAssetsMapper iTAssetsMapper;

	@Override
	public List<ITAssetsVO> getITList() {
		// TODO Auto-generated method stub
		return iTAssetsMapper.getITList();
	}

	@Override
	public int specInsert(SWSpecVO vo) {
		// TODO Auto-generated method stub
		return iTAssetsMapper.specInsert(vo);
	}
}
