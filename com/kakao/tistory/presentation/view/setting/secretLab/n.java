package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function3 {
    public final SecretLabActivity a;

    public n(SecretLabActivity secretLabActivity0) {
        this.a = secretLabActivity0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1104932473, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.MainContent.<anonymous>.<anonymous> (SecretLabActivity.kt:132)");
        }
        SecretLabActivity.access$SecretLabHeader(this.a, ((Composer)object1), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

