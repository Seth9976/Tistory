package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.Clock;
import androidx.work.impl.constraints.WorkConstraintsTracker;

public final class d {
    public final Context a;
    public final Clock b;
    public final int c;
    public final WorkConstraintsTracker d;
    public static final String e;

    static {
        d.e = "WM-ConstraintsCmdHandle";
    }

    public d(Context context0, Clock clock0, int v, SystemAlarmDispatcher systemAlarmDispatcher0) {
        this.a = context0;
        this.b = clock0;
        this.c = v;
        this.d = new WorkConstraintsTracker(systemAlarmDispatcher0.e.getTrackers());
    }
}

