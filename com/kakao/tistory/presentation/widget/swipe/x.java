package com.kakao.tistory.presentation.widget.swipe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class x extends Lambda implements Function1 {
    public final CoroutineScope a;
    public final CommonSwipeState b;

    public x(CoroutineScope coroutineScope0, CommonSwipeState commonSwipeState0) {
        this.a = coroutineScope0;
        this.b = commonSwipeState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        w w0 = new w(this.b, ((Number)object0).floatValue(), null);
        BuildersKt.launch$default(this.a, null, null, w0, 3, null);
        return Unit.INSTANCE;
    }
}

