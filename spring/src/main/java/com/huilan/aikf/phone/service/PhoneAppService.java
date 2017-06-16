package com.huilan.aikf.phone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.huilan.aikf.phone.domain.PhoneApp;
import com.huilan.aikf.phone.mapper.PhoneAppMapper;
import org.springframework.web.servlet.DispatcherServlet;
@Service
public class PhoneAppService {

	@Autowired
	private PhoneAppMapper phoneAppMapper;
	
	public PhoneApp getPhoneApp(String id) {
		return phoneAppMapper.get(id);
	}
}
