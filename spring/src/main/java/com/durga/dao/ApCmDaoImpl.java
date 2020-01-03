package com.durga.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.durga.viewobjects.ApCm;

@Repository
public class ApCmDaoImpl implements ApCmDao{
public List<ApCm> getApCmList() {
	
	ApCm cm1=new ApCm(1,"PAVAN","Janasena");
	ApCm cm2=new ApCm(2,"CBN","TDP");
	ApCm cm3=new ApCm(3,"YSR","YCP");
	
	List<ApCm> cmlist=new LinkedList<ApCm>();
	cmlist.add(cm1);
	cmlist.add(cm2);
	cmlist.add(cm3);
	
	return cmlist;
}
}
