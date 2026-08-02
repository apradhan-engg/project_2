package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
@GetMapping("calculator/{operation}/{a}/{b}")
int calculation(@PathVariable String operation,@PathVariable int a,@PathVariable int b)
{
	if(operation.equals("add"))
	{
	    return a+b;
	}
	
	if(operation.equals("sub"))
	{
		return a-b;
	}
	
	if(operation.equals("mul"))
	{
		return a*b;
	}
	
	if(operation.equals("div"))
	{
		return a/b;
	}
	

	return 0;
   

}
	//.............OR.............//
/*@GetMapping("calc/add/{a}/{b}")
int	add(@PathVariable int a,@PathVariable int b)
	{
		return a+b;
	}
	
@GetMapping("calc/sub/{a}/{b}")
int sub(@PathVariable int a,@PathVariable int b)	
{
   return a-b;	
}
	
@GetMapping("calc/mul/{a}/{b}")
int mul(@PathVariable int a,@PathVariable int b)
{
   return a*b;	
}
	
@GetMapping("calc/div/{a}/{b}")
int div(@PathVariable int a,@PathVariable int b)	
{
	return a/b;
}*/
	

}
