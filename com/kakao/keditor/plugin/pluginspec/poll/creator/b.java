package com.kakao.keditor.plugin.pluginspec.poll.creator;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;

public final class b implements ActivityResultCallback {
    public final int a;
    public final Object b;

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object object0) {
        if(this.a != 0) {
            ((Function1)((State)this.b).getValue()).invoke(object0);
            return;
        }
        PollCreatorActivity.onCreate$lambda$5(((PollCreatorActivity)this.b), ((ActivityResult)object0));
    }
}

