package com.dao;
import com.model.*;
import com.util.SessionUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class baivietDao {
	public List<Baiviet> getDsBaiviet(){
		Session ses = SessionUtil.createFac().openSession();
		Query query = ses.createQuery("From Baiviet");
		return query.list();
	}
}
