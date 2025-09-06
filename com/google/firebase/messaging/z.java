package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.core.app.h;
import n.a;

public final class z extends Binder {
    public final f a;

    public z(f f0) {
        this.a = f0;
    }

    public final void a(a0 a00) {
        if(Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.a.handle(a00.a).addOnCompleteListener(new a(2), new h(a00, 10));
    }
}

