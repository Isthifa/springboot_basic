package com.example.springbasics.service;

import com.example.springbasics.entity.Topics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService {
    //load data
    private List<Topics> topicsList =new ArrayList<>(Arrays.asList(new Topics(1,"Java","java description"),
            new Topics(2,"Mysql","Mysql description"),
            new Topics(3,"Python","Python description")));
    //Return the list topic values
    public List<Topics> getAlltopics()
    {
      return topicsList;
    }

    //getbyid method takes the id and return the value if present in list
    public Topics getByid(int id)
    {
        return topicsList.stream().filter(t->t.getId()==(id)).findFirst().get();
    }

    //method to add values to list
    public void addvalue(Topics topics)
    {
        topicsList.add(topics);
    }

    //updating the values
    public void update(int id,Topics topics)
    {
        for(int i=0;i<topicsList.size();i++)
        {
            Topics t=topicsList.get(i);
            if(t.getId()==id)
            {
                topicsList.set(i,topics);
                return;
            }
        }
    }
    //Deleting from the list
    public void  deletebyid(int id)
    {
        topicsList.removeIf(t->t.getId()==id);
    }

}
