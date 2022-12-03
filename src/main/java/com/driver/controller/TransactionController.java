package com.driver.controller;

import com.driver.services.TransactionService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Add required annotations
@RestController
@RequestMapping("/transaction")

public class TransactionController {

    @Autowired
    TransactionService transactionService;
    //Add required annotations

    public ResponseEntity issueBook(@RequestParam("cardId") int cardId, @RequestParam("bookId") int bookId) throws Exception{

        transactionService.issueBook(cardId,bookId);
       return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }

    //Add required annotations
    public ResponseEntity returnBook(@RequestParam("cardId") int cardId, @RequestParam("bookId") int bookId) throws Exception{

        transactionService.returnBook(cardId,bookId);
        return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }
}
