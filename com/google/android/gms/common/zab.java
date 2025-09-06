package com.google.android.gms.common;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;

public final class zab implements SuccessContinuation {
    public static final zab zaa;

    static {
        zab.zaa = new zab();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object object0) {
        Map map0 = (Map)object0;
        return Tasks.forResult(null);
    }
}

