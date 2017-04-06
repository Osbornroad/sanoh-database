package com.osbornroad.repository;


import com.osbornroad.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcRepository {

    private static final BeanPropertyRowMapper<Note> ROW_MAPPER = BeanPropertyRowMapper.newInstance(Note.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Note> getAll() {
        List<Note> allNotes = jdbcTemplate.query("SELECT * FROM  main", ROW_MAPPER);

        return allNotes;
    }
}
