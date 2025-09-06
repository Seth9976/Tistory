package com.kakao.tistory.presentation.widget.bottomsheet;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final long a;
    public final State b;

    public j(long v, State state0) {
        this.a = v;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
        float f = BottomSheetModalKt.access$Scrim_sW7UJKQ$lambda$1(this.b);
        DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), this.a, 0L, 0L, f, null, null, 0, 0x76, null);
        return Unit.INSTANCE;
    }
}

