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

    @CrossOrigin("https://twitteranalytics.ga")
    @RequestMapping("/tweets")
    public List<Tweet> getAllTweets() {
        return tweetRepos.getAllTweets();
    }

	@CrossOrigin("https://twitteranalytics.ga")
    @RequestMapping(method=RequestMethod.DELETE, value="/tweets/delete")
    public void deleteAll() {
        tweetRepos.deleteAll();
    }
	
	@CrossOrigin("https://twitteranalytics.ga")
    @RequestMapping("/tweets/{id}")
    public Tweet getTweetById(@PathVariable("id") int id) {
        return tweetRepos.getTweetById(id);
    }

    @CrossOrigin("https://twitteranalytics.ga")
    @RequestMapping("/tweets/user/{user}")
    public List<Tweet> getTweetsByUser(@PathVariable("user") String user) {
        return tweetRepos.getTweetsByUser(user);
    }

    @CrossOrigin("https://twitteranalytics.ga")
    @RequestMapping(method=RequestMethod.POST, value="/tweets/add")
    public boolean addTweet(@RequestBody Tweet tweet) {
        return tweetRepos.addTweet(tweet);
    }
	
	
}
