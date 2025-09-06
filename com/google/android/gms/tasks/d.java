package com.google.android.gms.tasks;

public final class d extends CancellationToken {
    public final k a;

    public d() {
        this.a = new k();
    }

    @Override  // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.a.isComplete();
    }

    @Override  // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener0) {
        b b0 = new b(onTokenCanceledListener0, 1);
        this.a.addOnSuccessListener(TaskExecutors.MAIN_THREAD, b0);
        return this;
    }
}

