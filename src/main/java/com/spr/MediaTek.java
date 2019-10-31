package com.spr;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor {

    public void process()
    {
        System.out.println("2nd");
    }}
