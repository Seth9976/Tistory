package com.google.android.gms.cloudmessaging;

import a5.b;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class d {
    public final int a;
    public final TaskCompletionSource b;
    public final int c;
    public final Bundle d;

    public d(int v, int v1, Bundle bundle0) {
        this.b = new TaskCompletionSource();
        this.a = v;
        this.c = v1;
        this.d = bundle0;
    }

    public abstract void a(Bundle arg1);

    public abstract boolean b();

    public final void c(zzq zzq0) {
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            String s = String.valueOf(this);
            String s1 = String.valueOf(zzq0);
            Log.d("MessengerIpcClient", b.r(new StringBuilder(s.length() + 14 + s1.length()), "Failing ", s, " with ", s1));
        }
        this.b.setException(zzq0);
    }

    public final void d(Bundle bundle0) {
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            String s = String.valueOf(this);
            String s1 = String.valueOf(bundle0);
            Log.d("MessengerIpcClient", b.r(new StringBuilder(s.length() + 16 + s1.length()), "Finishing ", s, " with ", s1));
        }
        this.b.setResult(bundle0);
    }

    @Override
    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + this.b() + "}";
    }
}

