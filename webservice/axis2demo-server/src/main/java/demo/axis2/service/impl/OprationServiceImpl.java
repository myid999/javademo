package demo.axis2.service.impl;

import demo.axis2.service.OprationService;

public class OprationServiceImpl implements OprationService {  
	  
    public String search(String message) {  
          
        return message+"  search finish!";  
    }  
  
    public String noSearch(String message) {  
        return message+" noSearch finish!";  
    }  
  
}  
