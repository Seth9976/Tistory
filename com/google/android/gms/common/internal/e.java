package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

public final class e implements StatusListener {
    public final PendingResult a;
    public final TaskCompletionSource b;
    public final ResultConverter c;

    public e(PendingResult pendingResult0, TaskCompletionSource taskCompletionSource0, ResultConverter pendingResultUtil$ResultConverter0) {
        this.a = pendingResult0;
        this.b = taskCompletionSource0;
        this.c = pendingResultUtil$ResultConverter0;
    }

    @Override  // com.google.android.gms.common.api.PendingResult$StatusListener
    public final void onComplete(Status status0) {
        TaskCompletionSource taskCompletionSource0 = this.b;
        if(status0.isSuccess()) {
            Result result0 = this.a.await(0L, TimeUnit.MILLISECONDS);
            taskCompletionSource0.setResult(this.c.convert(result0));
            return;
        }
        taskCompletionSource0.setException(ApiExceptionUtil.fromStatus(status0));
    }
}

