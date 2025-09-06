package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

public final class PriorityMapping {
    public static final SparseArray a;
    public static final HashMap b;

    static {
        PriorityMapping.a = new SparseArray();
        HashMap hashMap0 = new HashMap();
        PriorityMapping.b = hashMap0;
        hashMap0.put(Priority.DEFAULT, 0);
        hashMap0.put(Priority.VERY_LOW, 1);
        hashMap0.put(Priority.HIGHEST, 2);
        for(Object object0: hashMap0.keySet()) {
            int v = (int)(((Integer)PriorityMapping.b.get(((Priority)object0))));
            PriorityMapping.a.append(v, ((Priority)object0));
        }
    }

    public static int toInt(@NonNull Priority priority0) {
        Integer integer0 = (Integer)PriorityMapping.b.get(priority0);
        if(integer0 == null) {
            throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority0);
        }
        return (int)integer0;
    }

    @NonNull
    public static Priority valueOf(int v) {
        Priority priority0 = (Priority)PriorityMapping.a.get(v);
        if(priority0 == null) {
            throw new IllegalArgumentException("Unknown Priority for value " + v);
        }
        return priority0;
    }
}

