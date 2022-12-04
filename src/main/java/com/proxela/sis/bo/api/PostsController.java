package com.proxela.sis.bo.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.security.RolesAllowed;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@RolesAllowed("admin")
@RestController
@RequestMapping("/post")
public class PostsController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity getPost() throws IOException {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);
        String data = restTemplate.exchange("http://151.80.123.208:3010/api/v1/post/admin", HttpMethod.GET, entity, String.class).getBody();
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> map = mapper.readValue(data, Map.class);

        return new ResponseEntity(data , HttpStatus.ACCEPTED);
    }


    @PostMapping("/{id}")
    public ResponseEntity unPublishPost(@PathVariable String id){
        return new ResponseEntity(new ArrayList<>(),HttpStatus.ACCEPTED);
    }

}
