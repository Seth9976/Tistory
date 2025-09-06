package com.kakao.tistory;

import android.app.Activity;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.internal.Preconditions;

public final class a implements Builder {
    public final k a;
    public final e b;
    public Activity c;

    public a(k k0, e e0) {
        this.a = k0;
        this.b = e0;
    }

    @Override  // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public final ActivityComponentBuilder activity(Activity activity0) {
        this.c = (Activity)Preconditions.checkNotNull(activity0);
        return this;
    }

    @Override  // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public final ActivityComponent build() {
        Preconditions.checkBuilderRequirement(this.c, Activity.class);
        return new b(this.a, this.b);
    }
}

