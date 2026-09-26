package com.Spring.Security.Controller;

import com.Spring.Security.Model.RequestDTO;
import com.Spring.Security.Model.ResponseDTO;
import com.Spring.Security.Service.Securityservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("security")
public class SecurityController {
    @Autowired
    private Securityservice securityservice;

    @GetMapping("/data/{id}")

    public ResponseEntity<ResponseDTO> getData(@PathVariable int id) {
        ResponseDTO dto = securityservice.getdata(id);
        return ResponseEntity.ok(dto);

    }

    @PostMapping("/create")

    public ResponseEntity<String> createData(@RequestBody RequestDTO request) {
        securityservice.save(request);
        return ResponseEntity.ok("POST API Success");

    }

}

