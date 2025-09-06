package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class zzx implements SuccessContinuation {
    public static final zzx zza;

    static {
        zzx.zza = new zzx();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        return ((Bundle)object0) == null || !((Bundle)object0).containsKey("google.messenger") ? Tasks.forResult(((Bundle)object0)) : Tasks.forResult(null);
    }
}

