package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class DaggerCollections {
    public static boolean hasDuplicates(List list0) {
        return list0.size() >= 2 ? list0.size() != new HashSet(list0).size() : false;
    }

    public static LinkedHashMap newLinkedHashMapWithExpectedSize(int v) {
        if(v < 3) {
            return new LinkedHashMap(v + 1);
        }
        return v >= 0x40000000 ? new LinkedHashMap(0x7FFFFFFF) : new LinkedHashMap(((int)(((float)v) / 0.75f + 1.0f)));
    }

    public static List presizedList(int v) {
        return v == 0 ? Collections.emptyList() : new ArrayList(v);
    }
}

