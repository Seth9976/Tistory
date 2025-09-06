package com.kakao.tistory;

import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import javax.inject.Provider;

public final class d implements Provider {
    @Override  // javax.inject.Provider
    public final Object get() {
        return ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();
    }
}

