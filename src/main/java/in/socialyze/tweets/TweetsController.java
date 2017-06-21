package in.socialyze.tweets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by balak on 14-Jun-17.
 */
@RestController
public class TweetsController {

    @Autowired
    TweetsService tweetRepos;

    @CrossOrigin("http://localhost:4200")
    @RequestMapping("/tweets")
    public List<Tweet> getAllTweets() {
        return tweetRepos.getAllTweets();
    }

	@CrossOrigin("http://localhost:4200")
    @RequestMapping("/tweets/{id}")
    public Tweet getTweetById(@PathVariable("id") int id) {
        return tweetRepos.getTweetById(id);
    }

    @CrossOrigin("http://localhost:4200")
    @RequestMapping("/tweets/user/{user}")
    public List<Tweet> getTweetsByUser(@PathVariable("user") String user) {
        return tweetRepos.getTweetsByUser(user);
    }

    @CrossOrigin("http://localhost:4200")
    @RequestMapping(method=RequestMethod.POST, value="/tweets/add")
    public boolean addTweet(@RequestBody Tweet tweet) {
        return tweetRepos.addTweet(tweet);
    }
}
