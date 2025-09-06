package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class a0 {
    public final Intent a;
    public final TaskCompletionSource b;

    public a0(Intent intent0) {
        this.b = new TaskCompletionSource();
        this.a = intent0;
    }
}

