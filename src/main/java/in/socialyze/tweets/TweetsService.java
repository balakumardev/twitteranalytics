package in.socialyze.tweets;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by balak on 14-Jun-17.
 */
@Service
public class TweetsService {
    private List<Tweet> tweets;

    TweetsService() {
        tweets = new LinkedList<>();
        this.addTweet(new Tweet( "This is a tweet", "bala", 1000000, 13000, 5000, 2000));
    }

    List<Tweet> getAllTweets() {
        return tweets;
    }

    boolean addTweet(Tweet tweet) {
        return tweets.add(tweet);
    }

    List<Tweet> getTweetsByUser(String user) {
        List<Tweet> userTweetList = new LinkedList<Tweet>();
        for (Tweet t : tweets) {
            if (t.getUser().equals(user)) {
                userTweetList.add(t);
            }
        }
        return userTweetList;
    }
	
	void deleteAll() {
		tweets.clear();
	}
	
	Tweet getTweetById(int id) {
		Tweet resTweet = null;
		for(Tweet t: tweets) {
			if (t.getId() == id) {
				resTweet = t;
			}
		}
		return resTweet;
	}
}
