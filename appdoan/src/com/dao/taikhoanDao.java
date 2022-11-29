package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Taikhoan;
import com.model.TaikhoanId;
import com.util.SessionUtil;

public class taikhoanDao {
	public List<Taikhoan> getDsTaikhoanDaos(){
		Session ses = SessionUtil.createFac().openSession();
		Query query = ses.createQuery("From Taikhoan");
		return query.list();
	}
	public void addtaiKhoan(String user,String password) {
		Session ses = SessionUtil.createFac().openSession();
		ses.beginTransaction();
		Taikhoan tk = new Taikhoan();
		TaikhoanId tkid = new TaikhoanId();
		tkid.setTentaikhoan(user);
		tkid.setMatkhau(password);
		tkid.setManguoidung(2);
		
		tk.setId(tkid);
		ses.save(tk);
		ses.getTransaction().commit();
		ses.close();
	}
}
