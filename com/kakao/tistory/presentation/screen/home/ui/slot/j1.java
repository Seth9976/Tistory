package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.kakao.tistory.presentation.theme.TColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j1 extends Lambda implements Function1 {
    public final MutableState a;

    public j1(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$drawBehind");
        float f = ((DrawScope)object0).toPx-0680j_4(2.0f);
        float f1 = FocusKt.access$FocusMark$lambda$1(this.a);
        float f2 = ((DrawScope)object0).toPx-0680j_4(1.0f);
        long v = SizeKt.Size(Size.getWidth-impl(((DrawScope)object0).getSize-NH-jbRc()), f);
        DrawScope.drawRect-n-J9OG0$default(((DrawScope)object0), TColor.INSTANCE.getBlack-0d7_KjU(), OffsetKt.Offset(0.0f, f2 + f1), v, 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }
}

