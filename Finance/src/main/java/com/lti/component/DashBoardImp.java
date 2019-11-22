package com.lti.component;
import javax.persistence.EntityManager;
import org.springframework.jdbc.core.RowMapper;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.component.DashBoard;

/**
 * Database connection using Hibernate
 * @author Sharon
 *
 */

@Component("Dashboard")
public class DashBoardImp implements DashBoardInt {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional

	public List<DashBoard> getCardDetails()
	{
		Query q =entityManager.createQuery("select d from DashBoard d");
		List<DashBoard> list = q.getResultList();
		return q.getResultList();
	}

}
