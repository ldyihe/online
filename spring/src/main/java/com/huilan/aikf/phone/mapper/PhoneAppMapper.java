package com.huilan.aikf.phone.mapper;

import org.mybatis.spring.annotation.MapperScan;

import com.huilan.aikf.phone.domain.PhoneApp;

@MapperScan
public interface PhoneAppMapper {
	
	PhoneApp get(String id);
}
