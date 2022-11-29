package com.service;

import java.util.List;
import com.model.*;
import com.dao.*;

public class testconnect {
		public static void main(String[] args) {
			List<Taikhoan> dsBaiviet = new taikhoanDao().getDsTaikhoanDaos();
			System.out.print(dsBaiviet.get(0));
		}
}