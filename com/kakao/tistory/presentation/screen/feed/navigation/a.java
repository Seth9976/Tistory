package com.kakao.tistory.presentation.screen.feed.navigation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import com.kakao.tistory.presentation.screen.feed.FeedScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function4 {
    public final String a;
    public final Function0 b;
    public final Function0 c;

    public a(String s, Function0 function00, Function0 function01) {
        this.a = s;
        this.b = function00;
        this.c = function01;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((AnimatedContentScope)object0), "$this$composable");
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object1), "it");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBEDF1729, v, -1, "com.kakao.tistory.presentation.screen.feed.navigation.feedScreen.<anonymous> (FeedNavigation.kt:21)");
        }
        FeedScreenKt.FeedScreen(this.a, this.b, this.c, null, ((Composer)object2), 0, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

