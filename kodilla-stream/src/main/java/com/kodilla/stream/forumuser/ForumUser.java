
package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int forumUserID;
    private final String username;
    private final char gender;
    private final LocalDate birthDate;
    private final int postsCount;

    public ForumUser(final int forumUserID, final String username, final char gender, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postsCount) {
        this.forumUserID = forumUserID;
        this.username = username;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsCount = postsCount;
    }

    public int getForumUserID() {
        return forumUserID;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "forumUserID=" + forumUserID +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postsCount=" + postsCount +
                '}';
    }
}

