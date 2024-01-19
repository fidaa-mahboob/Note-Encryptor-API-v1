package com.fidaamahboob.app;

import org.springframework.data.repository.CrudRepository;
import com.fidaamahboob.app.Note;
public interface NoteRepository extends CrudRepository<Note, Integer> {

    
} 