package com.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.dao.taikhoanDao;
import com.model.Taikhoan;

@Path("/taikhoan")
public class taikhoanService {

	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Taikhoan getAllTaikhoan(){
		return new taikhoanDao().getDsTaikhoanDaos().get(0);
	}
	//localhost:8080/appdoan/rest/taikhoan?user=pessi&password=cocacola (day them khi su dung post)
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	public void getAllTaikhoan(@QueryParam("user")String user,@QueryParam("password")String pass){
		new taikhoanDao().addtaiKhoan(user, pass);
	}
}
