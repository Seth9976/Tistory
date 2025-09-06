package com.kakao.tistory;

import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;

public final class v implements ComponentSupplier {
    public final Hilt_TistoryApplication a;

    public v(Hilt_TistoryApplication hilt_TistoryApplication0) {
        this.a = hilt_TistoryApplication0;
    }

    @Override  // dagger.hilt.android.internal.managers.ComponentSupplier
    public final Object get() {
        return DaggerTistoryApplication_HiltComponents_SingletonC.builder().applicationContextModule(new ApplicationContextModule(this.a)).build();
    }
}

