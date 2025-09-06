package androidx.work.impl.background.systemjob;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Clock;

public final class c {
    public final ComponentName a;
    public final Clock b;
    public static final String c;

    static {
        c.c = "WM-SystemJobInfoConvert";
    }

    public c(Context context0, Clock clock0) {
        this.b = clock0;
        this.a = new ComponentName(context0.getApplicationContext(), SystemJobService.class);
    }
}

