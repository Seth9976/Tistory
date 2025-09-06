package com.kakao.tiara;

import android.os.SystemClock;

public final class h {
    public SessionIds a;
    public g b;
    public long c;
    public long d;
    public boolean e;
    public boolean f;

    public final void a() {
        synchronized(this) {
            if(!this.e && !this.f) {
                if(SystemClock.elapsedRealtime() - this.d > this.c) {
                    SessionIds sessionIds0 = SessionIds.generateNewIds();
                    this.a = sessionIds0;
                    this.b.onStartNewSession(sessionIds0);
                }
                this.d = SystemClock.elapsedRealtime();
            }
        }
    }
}

