package demo.axis2.service;

/** 
 * @deprecated(操作接口) 
 * @author Administrator 
 * 
 */  
public interface OprationService {  
    /** 
     * @deprecated(查询操作) 
     * @param message 
     * @return 
     */  
    public String search(String message);  
      
    /** 
     * @deprecated(非查询操作) 
     * @param message 
     * @return 
     */  
    public String noSearch(String message);  
}  
