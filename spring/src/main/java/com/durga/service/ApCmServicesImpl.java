package com.durga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durga.dao.ApCmDao;
import com.durga.viewobjects.ApCm;

@Service
public class ApCmServicesImpl implements ApCmServices{
	
	@Autowired
	ApCmDao apcmDao;
	public List<ApCm> getApCmList() {
		return apcmDao.getApCmList();
	}
}
