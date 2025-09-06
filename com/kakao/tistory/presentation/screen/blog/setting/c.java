package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.compose.runtime.State;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final State a;

    public c(State state0) {
        this.a = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((BlogInfo)object0), "it");
        BlogSettingScreenKt.access$BlogSettingScreen$lambda$0(this.a).getRefresh().invoke();
        return Unit.INSTANCE;
    }
}

