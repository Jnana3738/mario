package com.demo.json;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello World!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<Demo> ref = new TypeReference<Demo>() {};
            InputStream in = new FileInputStream("C:\Users\admin\IdeaProjects\JSON\src\main\resources\schema\demo.json");
            Demo demo = mapper.readValue(in, ref);
            System.out.println("Person name:"+demo.getPerson().getName() );
         }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}