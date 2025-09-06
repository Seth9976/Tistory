package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class d implements OnCompleteListener {
    public final TaskCompletionSource a;
    public final zaad b;

    public d(zaad zaad0, TaskCompletionSource taskCompletionSource0) {
        this.b = zaad0;
        this.a = taskCompletionSource0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        this.b.b.remove(this.a);
    }
}

