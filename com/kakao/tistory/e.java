package com.kakao.tistory;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

public final class e extends ActivityRetainedC {
    public final k a;
    public final e b;
    public final Provider c;

    public e(k k0) {
        this.b = this;
        this.a = k0;
        this.c = DoubleCheck.provider(new d());  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // dagger.hilt.android.internal.managers.ActivityComponentManager$ActivityComponentBuilderEntryPoint
    public final ActivityComponentBuilder activityComponentBuilder() {
        return new a(this.a, this.b);
    }

    @Override  // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager$ActivityRetainedLifecycleEntryPoint
    public final ActivityRetainedLifecycle getActivityRetainedLifecycle() {
        return (ActivityRetainedLifecycle)this.c.get();
    }
}

