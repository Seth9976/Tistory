package com.kakao.tistory.presentation.widget.bottomsheet;

import androidx.compose.material.SwipeableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class b extends Lambda implements Function0 {
    public final CoroutineScope a;
    public final SwipeableState b;
    public final Function0 c;

    public b(CoroutineScope coroutineScope0, SwipeableState swipeableState0, Function0 function00) {
        this.a = coroutineScope0;
        this.b = swipeableState0;
        this.c = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a a0 = new a(this.b, this.c, null);
        BuildersKt.launch$default(this.a, null, null, a0, 3, null);
        return Unit.INSTANCE;
    }
}

