package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import t6.b;

@AutoValue
public abstract class CreationContext {
    public static CreationContext create(Context context0, Clock clock0, Clock clock1) {
        return new b(context0, clock0, clock1, "cct");
    }

    public static CreationContext create(Context context0, Clock clock0, Clock clock1, String s) {
        return new b(context0, clock0, clock1, s);
    }

    public abstract Context getApplicationContext();

    @NonNull
    public abstract String getBackendName();

    public abstract Clock getMonotonicClock();

    public abstract Clock getWallClock();
}

