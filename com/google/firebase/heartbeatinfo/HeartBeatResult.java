package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;
import java.util.List;
import v8.a;

@AutoValue
public abstract class HeartBeatResult {
    public static HeartBeatResult create(String s, List list0) {
        return new a(s, list0);
    }

    public abstract List getUsedDates();

    public abstract String getUserAgent();
}

