package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value="com/nt/commons/Info.properties")
public class PersonInfo { 

	//inject the value of properties file to spring beans properties
	@Value("${per.id}")
	private Integer pid;
	
	@Value("${per.name}")
	private String pname;
	
	@Value("${per.addrs}")
	private String addrs;
	
	//Inject the direct value to the spring bean properties.
	@Value("9370152722")
	private Long mobileNo;
	
	//Inject the System property values
	@Value("${os.name}")
	private String os_name;
	
	@Value("${os.version}")
	private String os_ver;
	
	//Inject env.. Variable values
	@Value("${path}")
	private String pat_data;

	//toString()
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", mobileNo=" + mobileNo
				+ ", os_name=" + os_name + ", os_ver=" + os_ver + ", pat_data=" + pat_data + "]";
	}
	
	
	
	
}
