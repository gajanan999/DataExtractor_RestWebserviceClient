package com.dataExtractor;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dataExtractor.models.Data;

@Controller
@RequestMapping("/hello-world")
public class DataController {

	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Data sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    	
        return new Data(2, String.format(template, name));
    }
}
