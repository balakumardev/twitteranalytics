package in.socialyze.tweets;

/**
 * Created by balak on 14-Jun-17.
 */

public class Tweet {
    private int id;
    private String tweet;
    private String user;
    private int retweets, posFeedback, negFeedback, neutralFeedback;

    static int idCount = 0;

    public Tweet() { this.id = ++idCount; }

    public Tweet(String tweet, String user, int retweets, int posFeedback, int negFeedback, int neutralFeedback) {
        this.id = ++idCount;
        this.tweet = tweet;
        this.user = user;
        this.retweets = retweets;
        this.posFeedback = posFeedback;
        this.negFeedback = negFeedback;
        this.neutralFeedback = neutralFeedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosFeedback() {
        return posFeedback;
    }

    public void setPosFeedback(int posFeedback) {
        this.posFeedback = posFeedback;
    }

    public int getNegFeedback() {
        return negFeedback;
    }

    public void setNegFeedback(int negFeedback) {
        this.negFeedback = negFeedback;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRetweets() {
        return retweets;
    }

    public void setRetweets(int retweets) {
        this.retweets = retweets;
    }

    public int getNeutralFeedback() {
        return neutralFeedback;
    }

    public void setNeutralFeedback(int neutralFeedback) {
        this.neutralFeedback = neutralFeedback;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Tweet.idCount = idCount;
    }
}
