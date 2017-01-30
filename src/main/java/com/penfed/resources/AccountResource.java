package com.penfed.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 500, message = "Failure")})
public class AccountResource {
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	@ResponseBody
	public String getAccounts() {
		System.out.println("in helo");
		return "{'name: 'Hello'}"; 
	}
}  
