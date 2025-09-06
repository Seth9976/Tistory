package com.kakao.tistory;

import android.app.Service;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.internal.Preconditions;

public final class h implements Builder {
    public final k a;
    public Service b;

    public h(k k0) {
        this.a = k0;
    }

    @Override  // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    public final ServiceComponent build() {
        Preconditions.checkBuilderRequirement(this.b, Service.class);
        return new i(this.a);
    }

    @Override  // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    public final ServiceComponentBuilder service(Service service0) {
        this.b = (Service)Preconditions.checkNotNull(service0);
        return this;
    }
}

