/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

/**
 *
 * @author Nicole
 */
import com.restfb.*;
import com.restfb.types.*;
import java.util.*;
import java.io.IOException;
public class Facebook {

    /**
     * @param args the command line arguments
     */
    ArrayList nodeName = new ArrayList();
    ArrayList nodeID =new ArrayList();
    
    private void getFriends(String token) {
        FacebookClient facebookClient = new DefaultFacebookClient(token);
        Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);
        for (User uservalue : myFriends.getData()) {
            nodeID.add(uservalue.getId());
            nodeName.add(uservalue.getName());
        }
        System.out.println("Count of all my friends: " + myFriends.getTotalCount());
        System.out.println("Count of my public friends: " + myFriends.getData().size());
        System.out.println(nodeID);
        System.out.println(nodeName);
    }
    
    private void getFeed(String token) {
        FacebookClient facebookClient = new DefaultFacebookClient(token);
        Connection<Post> myFeed = facebookClient.fetchConnection("me/feed", Post.class);
        int index = 1;
        for (Post postvalue : myFeed.getData())  {
            System.out.println(Integer.toString(index) + ". " + postvalue.getCreatedTime() + ": " + postvalue.getMessage());
            index++;
        }
    }

    public static void main() {
        // TODO code application logic here
        System.out.println("connecting fb...");
        Facebook tmp=new Facebook();
        
        //Replace with own token from developers.facebook.com
        String token = "Insert Token Here";
        
        //Friend Count:
        //tmp.getFriends(token);
        
        //Life Events:
        tmp.getFeed(token); 
    }
}
