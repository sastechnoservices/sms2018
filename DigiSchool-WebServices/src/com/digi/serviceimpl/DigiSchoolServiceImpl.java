package com.digi.serviceimpl;

import com.digi.service.IDigiSchoolService;

public class DigiSchoolServiceImpl implements IDigiSchoolService {

	@Override
	public String getStudent() {
		String a = "jayant"
				+ "+Lipsha";
		return a;
	}

}
