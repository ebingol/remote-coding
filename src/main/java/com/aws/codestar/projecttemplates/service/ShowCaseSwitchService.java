package com.aws.codestar.projecttemplates.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ShowCaseSwitchService {
	
	public Optional<String> getValue(int key){
		
		Optional<java.lang.String> value;
		
		switch(key){
		case  1:  
			value = Optional.of("first");
			break;
		case 2:
			value = Optional.of("second");
			break;
		default :
			value = Optional.empty();
			
		}
		
		return value;
	}

}
