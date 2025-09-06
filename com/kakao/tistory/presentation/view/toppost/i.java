package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.foundation.lazy.LazyListScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public static final i a;

    static {
        i.a = new i();
    }

    public i() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.items$default(((LazyListScope)object0), 20, null, null, ComposableSingletons.TopPostListActivityKt.INSTANCE.getLambda-2$presentation_prodRelease(), 6, null);
        return Unit.INSTANCE;
    }
}

