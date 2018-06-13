package jp.co.axiz.web.dao;

import jp.co.axiz.entity.Admin;

public interface AdminDao {

	public Admin findByIdAndPassword();
}
