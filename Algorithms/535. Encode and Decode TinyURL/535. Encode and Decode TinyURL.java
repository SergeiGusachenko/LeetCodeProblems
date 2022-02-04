package com.sgusache;

import java.util.Base64;
import java.util.HashMap;

public class Codec {
    private HashMap<String,String> map;
    public Codec(){
        map = new HashMap<>();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String encodedString = Base64.getEncoder().encodeToString(longUrl.getBytes());
        String s = encodedString;
        s = s.substring(s.length() - 6);
        String url = new String("http://tinyurl.com/");
        url = url.concat(s);
        map.put(url,longUrl);
        System.out.println(s);
        return url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        return map.get(shortUrl);
    }
}