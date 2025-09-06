package com.google.firebase.platforminfo;

import java.util.HashSet;
import y8.a;

public class GlobalLibraryVersionRegistrar {
    public final HashSet a;
    public static volatile GlobalLibraryVersionRegistrar b;

    public GlobalLibraryVersionRegistrar() {
        this.a = new HashSet();
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar0 = GlobalLibraryVersionRegistrar.b;
        if(globalLibraryVersionRegistrar0 == null) {
            synchronized(GlobalLibraryVersionRegistrar.class) {
                globalLibraryVersionRegistrar0 = GlobalLibraryVersionRegistrar.b;
                if(globalLibraryVersionRegistrar0 == null) {
                    globalLibraryVersionRegistrar0 = new GlobalLibraryVersionRegistrar();
                    GlobalLibraryVersionRegistrar.b = globalLibraryVersionRegistrar0;
                }
            }
        }
        return globalLibraryVersionRegistrar0;
    }

    public void registerVersion(String s, String s1) {
        synchronized(this.a) {
            a a0 = new a(s, s1);
            this.a.add(a0);
        }
    }
}

