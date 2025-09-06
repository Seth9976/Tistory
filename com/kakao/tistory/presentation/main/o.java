package com.kakao.tistory.presentation.main;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.main.navigation.MainNavHostKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function3 {
    public final MainAppState a;
    public final State b;

    public o(MainAppState mainAppState0, State state0) {
        this.a = mainAppState0;
        this.b = state0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "padding");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((PaddingValues)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x615EF8FF, v, -1, "com.kakao.tistory.presentation.main.MainApp.<anonymous>.<anonymous>.<anonymous> (MainApp.kt:93)");
        }
        Blog blog0 = MainAppKt.access$MainApp$lambda$0(this.b).getCurrentBlog();
        Blog blog1 = MainAppKt.access$MainApp$lambda$0(this.b).getCurrentBlog();
        MainNavHostKt.MainNavHost(this.a, (blog0 == null ? null : blog0.getName()), (blog1 == null ? null : blog1.getLogoImageUrl()), PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), ((PaddingValues)object0)), ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

