package com.pruva.webservices;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mevlana
 */
@RestController
public class MainController 
{
    @Autowired
    private UserService userService;
    
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers()
    {
        return userService.findAll();
    }
    
    @GetMapping("/findUser/{id}")
    public User findUser(@PathVariable int id)
    {
        return userService.findOne(id);
    }
    
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/createUser")
    public void createUser(@RequestBody User user) throws Exception
    {
        User savedUser=userService.save(user);
        
        if(savedUser==null)
        {
            throw new Exception("Could not saved");
        }
        
    }
    
   
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable int id) throws Exception
    {
        User user=userService.deleteOne(id);
        
        if(user==null)
        {
            throw new Exception("No such user");
        }
    }
    
    @PutMapping("/updateUser")
    public void updateUser(@RequestBody User user)
    {
        userService.updateUser(user);
    }
    
}
