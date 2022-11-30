package com.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import com.model.Nguoidung;
import com.model.Taikhoan;
import com.model.TaikhoanId;
import com.util.SessionUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;


public class danhnhapDao {
public List<Nguoidung> getAll() {
	Session  ses = SessionUtil.createFac().openSession();
	  Query query=ses.createQuery("From Nguoidung");
	  List<Nguoidung> dsNguoidung=query.list();
	  ses.close();
	  return dsNguoidung;
}
public List<Taikhoan> getAll1() {
	  Session  ses = SessionUtil.createFac().openSession();
	  Query query=ses.createQuery("From Taikhoan");
	  List<Taikhoan> dsTaiKhoanID=query.list();
	  ses.close();
	  return dsTaiKhoanID;
}
public void SignUp(String tennguoidung, String soDT, String tenDangNhap, String matkhau) throws ParseException {
	Session ses = SessionUtil.createFac().openSession();
	ses.beginTransaction();
	Taikhoan tk = new Taikhoan();
	
//	Nguoidung nguoidung = tk.getNguoidung();
//	nguoidung.setTennguoidung(tennguoidung);
//	nguoidung.setSodienthoai(soDT);
//	nguoidung.setNgaysinh(new SimpleDateFormat("yyyy-MM-dd").parse("2022-11-29"));
	Nguoidung nguoidung =new Nguoidung(tennguoidung,soDT,new SimpleDateFormat("yyyy-MM-dd").parse("2022-11-29"));
	ses.save(nguoidung);
	Query query = ses.createQuery("From Nguoidung");
	List<Nguoidung> dsnd=query.list();
	TaikhoanId tkid =new TaikhoanId(tenDangNhap,matkhau,dsnd.get(dsnd.size()-1).getManguoidung());
//	tkid.setTentaikhoan(tenDangNhap);
//	tkid.setMatkhau(matkhau);
//	tkid.setManguoidung(2);
	tk.setId(tkid);
//	tk.setNguoidung(nguoidung);
	ses.save(tk);
	ses.getTransaction().commit();
	ses.close();
 }
}
