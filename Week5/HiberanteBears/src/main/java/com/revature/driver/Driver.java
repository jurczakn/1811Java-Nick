package com.revature.driver;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.domains.Cave;
import com.revature.domains.HoneyPot;
import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		Session sess = SessionUtil.getSession();
		System.out.println("WOrked!!!");
		Transaction tx = sess.beginTransaction();
		Integer newId = (Integer) sess.save(new HoneyPot(1, 4.4, 999999.9999));
		//HoneyPot newHp = sess.load(HoneyPot.class, 1 + newId);
		HoneyPot hp = sess.get(HoneyPot.class, 1 + newId);
		System.out.println(hp);
		System.out.println(sess.get(Cave.class, 1));
		tx.commit();
		sess.close();
		//System.out.println(newHp.getHoneyAmount());
	}

}
