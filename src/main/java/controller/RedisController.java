package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.RedisService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Controller
public class RedisController {
    @Resource(name = "redisServiceImpl")
    private RedisService redisService;

    @RequestMapping(value = "/string", method = RequestMethod.GET)
    public ResponseEntity<String> testString(String key, String value) {
        return new ResponseEntity<String>(redisService.testString(key, value), HttpStatus.OK);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<String>> testList(String key, String value) {
        return new ResponseEntity<List<String>>(redisService.testList(key, value), HttpStatus.OK);
    }

    @RequestMapping(value = "/hash", method = RequestMethod.GET)
    public ResponseEntity<String> testHash(String key, String field, String value) {
        return new ResponseEntity<String>(redisService.testHash(key, field, value), HttpStatus.OK);
    }

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public ResponseEntity<Set<String>> testSet(String key, String value) {
        return new ResponseEntity<Set<String>>(redisService.testSet(key, value), HttpStatus.OK);
    }

    @RequestMapping(value = "/sortedset", method = RequestMethod.GET)
    public ResponseEntity<Set<String>> testSortedSet(String key, String value, Double score) {
        return new ResponseEntity<Set<String>>(redisService.testSortedSet(key, value, score), HttpStatus.OK);
    }
}
