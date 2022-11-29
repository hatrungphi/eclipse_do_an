package com.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import com.model.Nguoidung;
import com.model.TaikhoanId;
import com.util.SessionUtil;
import java.util.List;


public class danhnhapDao {
public List<Nguoidung> getAll() {
	Session  ses = SessionUtil.createFac().openSession();
	  Query query=ses.createQuery("From Nguoidung");
	  List<Nguoidung> dsNguoidung=query.list();
	  ses.close();
	  return dsNguoidung;
}
public List<TaikhoanId> getAll1() {
	Session  ses = SessionUtil.createFac().openSession();
	  Query query=ses.createQuery("From TaikhoanId");
	  List<TaikhoanId> dsTaiKhoanID=query.list();
	  ses.close();
	  return dsTaiKhoanID;
}
private void SignUp(String tennguoidung, String soDT, String tenDangNhap, String matkhau) {
	

}
}
