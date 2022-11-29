package com.service;

import java.text.ParseException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.model.Nguoidung;
import com.model.Taikhoan;
import com.model.TaikhoanId;
import com.dao.danhnhapDao;
@Path("/taikhoanid")
public class nguoidungService {
@GET
@Path("/dangnhap")
@Produces({MediaType.APPLICATION_JSON})
public boolean getId(@QueryParam("username")String user,@QueryParam("password")String password) {
	List<Taikhoan> tk = new danhnhapDao().getAll1();
	for (Taikhoan usr: tk) {
		if(usr.getId().getTentaikhoan().equals(user)&&usr.getId().getMatkhau().equals(password)) {
			return true;
	}
  }
	return false;
}
@POST
@Path("/dangky")
@Produces({MediaType.APPLICATION_JSON})
public Boolean addAcount(@QueryParam("tennguoidung")String tennguoidung,@QueryParam("soDT")String soDT
		,@QueryParam("tendangnhap")String tendangnhap,@QueryParam("matkhau")String matkhau) throws ParseException
{
	danhnhapDao dnd = new danhnhapDao();
	dnd.SignUp(tennguoidung, soDT, tendangnhap, matkhau);
	List<Taikhoan> tk = new danhnhapDao().getAll1();
	for (Taikhoan usr: tk) {
		if(usr.getId().getTentaikhoan().equals(tendangnhap)&&usr.getId().getMatkhau().equals(matkhau)) {
			return true;
		}
    }
	return false;
	}
}
