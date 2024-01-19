package com.fidaamahboob.app;

import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping(path = "/notes")
public class NotesController {

    @Autowired
    private NoteRepository noteRepository;

    @PostMapping("/add")
    public @ResponseBody Note AddNote(@RequestBody Map<String, String> body){
        Encyrypt encypt = new Encyrypt();
        String title = body.get("title");
        String message = body.get("message");
        int key = Integer.parseInt(body.get("key"));
        String encryptedMessage = encypt.encryptMessage(message, key);
        String encryptedTitle = encypt.encryptMessage(title, key);
        Note note = new Note(encryptedTitle, encryptedMessage);
        return noteRepository.save(note);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody ResponseEntity<String> deleteNote(@PathVariable("id") Integer id){
        Optional<Note> opt = noteRepository.findById(id);
        if(opt.isPresent()){
            noteRepository.deleteById(id); 
            return new ResponseEntity<>("note has been deleted", HttpStatus.OK);
        }

        return new ResponseEntity<>("note id not found", HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/decrypt/get/{id}")
    public @ResponseBody ResponseEntity<Object> getNote(@PathVariable("id") Integer id, @RequestParam("key") int key){
        Optional<Note> opt = noteRepository.findById(id);
        if(opt.isPresent()){
            Note note = opt.get();
            Decrypt decrypt = new Decrypt();
            int decryptionKey = key;
            String decryptedMessage = decrypt.decryptMessage(note.getMessage(), decryptionKey); 
            String decryptedTitle =  decrypt.decryptMessage(note.getTitle(), decryptionKey);
            note.setTitle(decryptedTitle);
            note.setMessage(decryptedMessage);
            return new ResponseEntity<>(note, HttpStatus.OK);
        }
        
        JSONObject obj = new JSONObject();

        String errMsg = "id " + id + " does not exit.";
        obj.put("status", "400");
        obj.put("error", errMsg);

        return new ResponseEntity<>(obj, HttpStatus.BAD_REQUEST);
    } 
    

}
