package org.example.simplenetwork2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final Messages messages = new Messages();

    @GetMapping("/yes")
    public String getMessage() {
        String m;
        m = messages.getRandomMessage();
        return m;
    }
    @GetMapping("/no")
    public String getNoMessage() {
        String m;
        m = messages.getNextNoMessage();
        return m;
    }


}
