package com.example.helloworldjsp.controllers;

import com.example.helloworldjsp.model.Book;
import com.example.helloworldjsp.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/addStudent")
    public String addStudent(@RequestParam("firstname") String firstname,
                             @RequestParam("lastname") String lastname,
                             @RequestParam("contact") String contact) {
        // Construct the desired URL
        String desiredUrl = "http://localhost:8080/student";

        // Create headers with JSON content type
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create the request body
        String requestBody = "{\"firstname\":\"" + firstname + "\", \"secondname\":\"" + lastname + "\", \"ContactNo\":\"" + contact + "\"}";
        System.out.println(requestBody);
        // Create an HTTP entity with headers and body
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // Make the HTTP POST request
        String response = restTemplate.exchange(desiredUrl, HttpMethod.POST, requestEntity, String.class).getBody();

        // Return the response
        System.out.println(response);
        return "addSuccess";
    }
    @PostMapping("/updateStudentDetails")
    public String updateStudentDetails(@RequestParam("studentID") int studentID,
                                @RequestParam("firstname") String firstname,
                                @RequestParam("lastname") String lastname,
                                @RequestParam("contact") String contact) {
        // Construct the desired URL
        String desiredUrl = "http://localhost:8080/student/" + studentID;
        System.out.println(desiredUrl);
        // Create headers with JSON content type
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create the request body
        String requestBody = "{\"firstname\":\"" + firstname + "\", \"secondname\":\"" + lastname + "\", \"ContactNo\":\"" + contact + "\"}";

        // Create an HTTP entity with headers and body
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // Make the HTTP PUT request
        //restTemplate.exchange(desiredUrl, HttpMethod.PUT, requestEntity, String.class);
        restTemplate.put(desiredUrl, requestEntity);
        return "updateSuccess"; // Return the name of the JSP page to display after the update
    }
//    @GetMapping("/displayStudents")
//    public String showStudentTable(Model model) {
//        // Fetch data from the Spring Boot server running on port 8080
//        String url = "http://localhost:8080/student";
//        RestTemplate restTemplate = new RestTemplate();
//        Student[] students = restTemplate.getForObject(url, Student[].class);
//        for(Student student : students) {
//            System.out.println(student.getFirstName());
//        }
//        // Add the student data to the model
//        model.addAttribute("students", students);
//
//        // Forward to the JSP page
//        return "displayStudents";
//    }

    @GetMapping("/displayAllStudents")
    public ModelAndView showStudentTable() {
        // Fetch data from the Spring Boot server running on port 8080
        String url = "http://localhost:8080/student";
        RestTemplate restTemplate = new RestTemplate();
        Student[] students = restTemplate.getForObject(url, Student[].class);
        for (Student student : students) {
            System.out.println(student.getFirstName());
        }

        // Create a ModelAndView object and set the view name (JSP file name)
        ModelAndView modelAndView = new ModelAndView("displayStudents");
        System.out.println("model success");
        // Add the student data to the model
        modelAndView.addObject("students", students);

        // Return the ModelAndView object
        return modelAndView;
    }
    @PostMapping("/deleteStudent")
    public String deleteStudent(@RequestParam int studentID) {
        // Construct the desired URL with the studentID as a path variable
        String desiredUrl = "http://localhost:8080/student/" + studentID;
        System.out.println("hello");

        // Make the HTTP DELETE request
        ResponseEntity<Void> response = restTemplate.exchange(desiredUrl, HttpMethod.DELETE, null, Void.class);


        // Check the response status to determine if the deletion was successful
        if (response.getStatusCode().is2xxSuccessful()) {
            return "deleteSuccess";
        } else {
            return "Failed to delete student with ID " + studentID + ".";
        }
    }
    @GetMapping("/deleteStudent")
    public String showDeleteStudentPage() {
        return "deleteStudent";
    }
    @GetMapping("/updateStudent")
    public String showUpdateStudentPage() {
        return "updateStudent";
    }
    @GetMapping("/addStudent")
    public String showAddStudentPage() {
        return "addStudent";
    }
    @GetMapping("/home")
    public String landingPage(){
        return "home";
    }
    @PostMapping("/addBook")
    public String addBook(@RequestParam("bookname") String bookname,
                             @RequestParam("BookCategory") String BookCategory)
                            {
        // Construct the desired URL
        String desiredUrl = "http://localhost:8080/book";

        // Create headers with JSON content type
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create the request body
        String requestBody = "{\"bookname\":\"" + bookname + "\", \"BookCategory\":\"" + BookCategory + "\"}";
        System.out.println(requestBody);
        // Create an HTTP entity with headers and body
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // Make the HTTP POST request
        String response = restTemplate.exchange(desiredUrl, HttpMethod.POST, requestEntity, String.class).getBody();

        // Return the response
        System.out.println(response);
        return "addSuccess";
    }

    @PostMapping("/deleteBook")
    public String deleteBook(@RequestParam int bookId) {
        // Construct the desired URL with the studentID as a path variable
        String desiredUrl = "http://localhost:8080/book/" + bookId;
        System.out.println("hello");

        // Make the HTTP DELETE request
        ResponseEntity<Void> response = restTemplate.exchange(desiredUrl, HttpMethod.DELETE, null, Void.class);


        // Check the response status to determine if the deletion was successful
        if (response.getStatusCode().is2xxSuccessful()) {
            return "deleteSuccess";
        } else {
            return "Failed to delete book with ID " + bookId + ".";
        }
    }

    @PostMapping("/updateBook")
    public String updateBook(@RequestParam("bookId") int bookId,
                                       @RequestParam("bookname") String bookname,
                                       @RequestParam("BookCategory") String BookCategory) {
        // Construct the desired URL
        String desiredUrl = "http://localhost:8080/student/" + bookId;
        System.out.println(desiredUrl);
        // Create headers with JSON content type
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create the request body
        String requestBody = "{\"bookname\":\"" + bookname + "\", \"BookCategory\":\"" + BookCategory + "\"}";

        // Create an HTTP entity with headers and body
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // Make the HTTP PUT request
        //restTemplate.exchange(desiredUrl, HttpMethod.PUT, requestEntity, String.class);
        restTemplate.put(desiredUrl, requestEntity);
        return "updateSuccess"; // Return the name of the JSP page to display after the update
    }
    @GetMapping("/displayAllBooks")
    public ModelAndView displayBooks() {
        // Fetch data from the Spring Boot server running on port 8080
        String url = "http://localhost:8080/book";
        RestTemplate restTemplate = new RestTemplate();
        Book[] books = restTemplate.getForObject(url, Book[].class);
        for(Book book : books) {
            System.out.println(book.getBookname());
        }

        ModelAndView model= new ModelAndView("displayBooks");
        // Add the student data to the model
        model.addObject("books", books);

        // Forward to the JSP page
        return model;

    }


    @GetMapping("/addBook")
    public String addbookpage(){
        return "addBook";
    }
    @GetMapping("/deleteBook")
    public String showDeleteBookPage(){
        return "deleteBook";
    }
    @GetMapping("/updateBook")
    public String showUpdateBookPage(){
        return "updateBook";
    }

//    @GetMapping("/displayBooks")
//    public String showBookTable(){
//        return "displayBooks";
//    }
}
