package com.example.springbasics.controller;

import com.example.springbasics.entity.Topics;
import com.example.springbasics.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicRest {
    private TopicService topicService;
    @Autowired
    public TopicRest(TopicService topicService)
    {
        this.topicService=topicService;
    }
    @GetMapping("/all")
    public List<Topics> getAlltopics()
    {
        return topicService.getAlltopics();

    }
    @GetMapping("/{id}")
    public Topics getbyid(@PathVariable int id)
    {
        return topicService.getByid(id);
    }
    @PostMapping("/add")
    public String add(@RequestBody Topics topics)
    {
        topicService.addvalue(topics);
        return "added"+topics.getId();
    }
    @PutMapping("/update/{id}")
    public String update(@RequestBody Topics topics,@PathVariable int id)
    {
        topicService.update(id,topics);
        return "updated"+topics.getId();
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id)
    {
        topicService.deletebyid(id);
        return "deleted "+id;
    }

}
