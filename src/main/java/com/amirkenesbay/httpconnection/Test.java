package com.amirkenesbay.httpconnection;

public class Test {
    public static void main(String[] args) {
        String s = "<span class=\\\"searchmatch\\\">Java</span> — строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems (в последующем";
        System.out.println(s.replaceAll("<.*?>", ""));
    }
}
