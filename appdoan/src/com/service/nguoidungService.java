package com.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.model.TaikhoanId;
import com.dao.danhnhapDao;
@Path("/taikhoanid")
public class nguoidungService {
@GET
@Path("/dangnhap")
@Produces({MediaType.APPLICATION_JSON})
public boolean getId(@QueryParam("username")String user,@QueryParam("password")String password) {
	List<TaikhoanId> tk = new danhnhapDao().getAll1();
	for (TaikhoanId usr:tk) {
		if(usr.getTentaikhoan().equals(user)&&usr.getMatkhau().equals(password)) {
			return true;
	}
		
  }
	return false;
	
}
@POST
@Path("/dangky")
@Produces({MediaType.APPLICATION_JSON})
public Boolean addAcount(@QueryPa)

}
}
