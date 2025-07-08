package com.skillyheads.jetmail.models;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

public class Post {

    private int postId;
    private String postContent;
    private int noOfLikes;
    private int noOfShares;

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public String getPostContent() {
        return postContent;
    }


    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "noOfLikes=" + noOfLikes +
                ", postId=" + postId +
                ", postContent='" + postContent + '\'' +
                ", noOfShares=" + noOfShares +
                '}';
    }


}
