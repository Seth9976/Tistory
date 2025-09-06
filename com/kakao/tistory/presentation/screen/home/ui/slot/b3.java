package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import b;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Today;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.widget.common.PageIndicatorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b3 extends Lambda implements Function3 {
    public final PagerState a;
    public final int b;
    public final Today c;

    public b3(PagerState pagerState0, int v, Today homeSlotUiState$Today0) {
        this.a = pagerState0;
        this.b = v;
        this.c = homeSlotUiState$Today0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$SlotContainer");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4F7BB289, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Today.<anonymous> (Today.kt:187)");
        }
        Modifier modifier0 = ModifierKt.shape-8ww4TTg$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f), 0L, null, 0.0f, 14, null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x90E234A7, true, new a3(this.c, this.b), ((Composer)object1), 54);
        PagerKt.HorizontalPager-oI3XNZo(this.a, modifier0, null, null, 0, 0.0f, null, null, false, false, null, null, null, composableLambda0, ((Composer)object1), 0, 0xC00, 0x1FFC);
        b.a(10.0f, Modifier.Companion, ((Composer)object1), 6);
        PageIndicatorKt.PageIndicator(this.a, this.b, ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

