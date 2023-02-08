package com.techelevator.dao;

import com.techelevator.model.Request;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcRequestDao implements RequestDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcRequestDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;}




    private Request mapRowToUser(SqlRowSet rs) {
        Request request = new Request();
        request.setId(rs.getLong("request_id"));
        request.setRequestType(rs.getInt("request_type"));
        request.setRequestApproval(rs.getInt("request_approval"));
//        request.setUserId(rs.getLong("user_id"));
        return request;
    }
}
