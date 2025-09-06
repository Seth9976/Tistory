package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GlideExperiments {
    interface Experiment {
    }

    public final Map a;

    public GlideExperiments(e e0) {
        this.a = Collections.unmodifiableMap(new HashMap(e0.a));
    }

    public boolean isEnabled(Class class0) {
        return this.a.containsKey(class0);
    }
}

