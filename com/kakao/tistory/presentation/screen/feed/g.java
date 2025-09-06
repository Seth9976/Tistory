package com.kakao.tistory.presentation.screen.feed;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.feed.ui.TopAppBarFollowInfoKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function3 {
    public final FeedViewModel a;
    public final State b;
    public final State c;

    public g(FeedViewModel feedViewModel0, State state0, State state1) {
        this.a = feedViewModel0;
        this.b = state0;
        this.c = state1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryCollapsingTopAppBar");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1937404561, v, -1, "com.kakao.tistory.presentation.screen.feed.FeedScreen.<anonymous>.<anonymous>.<anonymous> (FeedScreen.kt:114)");
        }
        Long long0 = FeedScreenKt.access$FeedScreen$lambda$8(this.b);
        Intrinsics.checkNotNullExpressionValue(long0, "access$FeedScreen$lambda$8(...)");
        Long long1 = FeedScreenKt.access$FeedScreen$lambda$9(this.c);
        Intrinsics.checkNotNullExpressionValue(long1, "access$FeedScreen$lambda$9(...)");
        TopAppBarFollowInfoKt.TopAppBarFollowInfo(long0.longValue(), long1.longValue(), new e(this.a), new f(this.a), ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

