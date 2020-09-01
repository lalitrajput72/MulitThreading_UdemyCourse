package com.java.puzzle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AvizvaTest {
	
	public static void main(String[] args)  {
		
		
	}
	
	static String[] solve(String[] p, String r) throws ParseException{
        // Write your code here

        SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");

        Date mainDate=null;
        mainDate=format.parse(r);
        List<String> list = null;
        for(int i=0;i<p.length;i++){
            Date date=format.parse(p[i]);
            long diff=mainDate.getTime()-date.getTime();

            long diffInSeconds = diff / 1000 % 60;
            long diffInMin = diff / (60*1000) % 60;
            long diffInHour = diff / (60*60*1000) % 24;

            if(diffInMin ==0 & diffInHour ==0 & diffInSeconds ==0){
                list.add("now");
            }
            else if(diffInHour ==0 & diffInMin ==0 & diffInSeconds > 0){
                if(diffInSeconds > 1){
                    list.add(diffInSeconds+" seconds ago");
                }
                else if(diffInSeconds ==1){
                    list.add(diffInSeconds+" second ago");
                }
            }

            else if(diffInHour ==0 & diffInMin > 0){
                if(diffInMin > 1){
                    list.add(diffInMin+" minutes ago");
                }
                else if(diffInMin ==1){
                    list.add(diffInMin+" minute ago");
                }
            }
            else if(diffInHour > 0){
                if(diffInHour > 1){
                    list.add(diffInHour+" hours ago");
                }
                else if(diffInHour ==1){
                    list.add(diffInHour+" hour ago");
                }
            }

        }
        
        return (String[]) list.toArray();
    
    }


}
