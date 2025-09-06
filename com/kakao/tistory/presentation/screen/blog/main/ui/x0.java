package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.MutableState;
import com.kakao.tistory.presentation.screen.blog.main.BlogMainTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function0 {
    public final MutableState a;

    public x0(MutableState mutableState0) {
        this.a = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickDescriptionReadMore();
        BlogMainInfoKt.access$Description$lambda$11(this.a, false);
        return Unit.INSTANCE;
    }
}

