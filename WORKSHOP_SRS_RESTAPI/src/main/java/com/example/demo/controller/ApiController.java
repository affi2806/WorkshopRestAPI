package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.AdminModel;
import com.example.demo.model.LoanApplicationModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
    ApiService lser;

//AdminModel
@PostMapping("/post1")
public AdminModel postD( @RequestBody AdminModel amodel)
{
return lser.post1(amodel);
}
@GetMapping("/get1")
public List<AdminModel> getD()
{
return lser.get1();
}
@PutMapping("/put1")
public AdminModel putD(@RequestBody AdminModel amodel1)
{
return lser.put1(amodel1);
}


//LoanApplicationModel

@PostMapping("/postloans")
public LoanApplicationModel postD1(@RequestBody LoanApplicationModel amodel3)
{
return lser.post2(amodel3);
}
@GetMapping("/getloans")
public List<LoanApplicationModel> getD1()
{
return lser.get2();
}
@PutMapping("/putloans")
public LoanApplicationModel putD1(@RequestBody LoanApplicationModel amodel4)
{
return lser.put2(amodel4);
}
@DeleteMapping("/delloans/{cid}")
public String deleteD1(@PathVariable("cid") int loanid)
{
lser.delete2(loanid);
return "Deleted";
}

//LoginModel
@PostMapping("/login")
public String login(@RequestBody Map<String,String> loginDataMap)
{
String email= loginDataMap.get("email");
String password = loginDataMap.get("password");
return lser.loginCheckData(email, password);
}


//UserModel
@PostMapping("/postuser")
public UserModel postD3(@RequestBody UserModel amodel7)
{
return lser.post4(amodel7);
}
@GetMapping("/getuser")
public List<UserModel> getD3()
{
return lser.get4();
}
@PutMapping("/putuser")
public UserModel putD3(@RequestBody UserModel amodel8)
{
return lser.put4(amodel8);
}
@DeleteMapping("/deluser/{aid}")
public String deleteD3(@PathVariable("aid") int id)
{
lser.delete4(id);
return "Deleted";
}
}
