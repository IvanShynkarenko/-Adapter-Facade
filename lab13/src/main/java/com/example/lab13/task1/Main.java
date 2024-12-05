package com.example.lab13.task1;

import java.util.Date;
import java.util.Calendar;

public class Main
{
    public static void main(String[] args)
    {
        Date currentTime = new Date();
        TwitterUser twitterUser = new TwitterUser("Shynkarenko.pn@ucu.edu.ua", "Ukraine", currentTime);
        FacebookUser facebookUser = new FacebookUser("ivansinkarenko1@gmai.com", "Ukraine", currentTime);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.HOUR_OF_DAY, -2);
        Date twoHoursAgo = calendar.getTime();

        User Shynkarenko = new TwitterUserAdapter(twitterUser);
        User John = new FacebookUserAdapter(facebookUser);

        MessageSender messageSender = new MessageSender();
        messageSender.send("Hello!", Shynkarenko, "Ukraine");
        messageSender.send("Hi!", John, "Ukraine");
    }
}
