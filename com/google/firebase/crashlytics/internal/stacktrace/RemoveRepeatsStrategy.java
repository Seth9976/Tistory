package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.HashMap;

public class RemoveRepeatsStrategy implements StackTraceTrimmingStrategy {
    public final int a;

    public RemoveRepeatsStrategy() {
        this(1);
    }

    public RemoveRepeatsStrategy(int v) {
        this.a = v;
    }

    @Override  // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] arr_stackTraceElement) {
        int v7;
        HashMap hashMap0 = new HashMap();
        StackTraceElement[] arr_stackTraceElement1 = new StackTraceElement[arr_stackTraceElement.length];
        int v = 1;
        int v1 = 0;
        int v2 = 0;
        while(v1 < arr_stackTraceElement.length) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
            Integer integer0 = (Integer)hashMap0.get(stackTraceElement0);
            if(integer0 == null) {
            label_24:
                arr_stackTraceElement1[v2] = arr_stackTraceElement[v1];
                ++v2;
                v = 1;
                v7 = v1;
            }
            else {
                int v3 = (int)integer0;
                int v4 = v1 - v3;
                if(v1 + v4 <= arr_stackTraceElement.length) {
                    int v5 = 0;
                    while(v5 < v4) {
                        if(!arr_stackTraceElement[v3 + v5].equals(arr_stackTraceElement[v1 + v5])) {
                            goto label_24;
                        }
                        ++v5;
                    }
                    int v6 = v1 - ((int)integer0);
                    if(v < this.a) {
                        System.arraycopy(arr_stackTraceElement, v1, arr_stackTraceElement1, v2, v6);
                        v2 += v6;
                        ++v;
                    }
                    v7 = v6 - 1 + v1;
                }
            }
            hashMap0.put(stackTraceElement0, v1);
            v1 = v7 + 1;
        }
        StackTraceElement[] arr_stackTraceElement2 = new StackTraceElement[v2];
        System.arraycopy(arr_stackTraceElement1, 0, arr_stackTraceElement2, 0, v2);
        return v2 >= arr_stackTraceElement.length ? arr_stackTraceElement : arr_stackTraceElement2;
    }
}

