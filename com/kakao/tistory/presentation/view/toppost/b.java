package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function4 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(4);
    }

    public static void a(LazyItemScope lazyItemScope0, int v, Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(lazyItemScope0, "$this$items");
        int v2 = (v1 & 0x70) == 0 ? v1 | (composer0.changed(v) ? 0x20 : 16) : v1;
        if((v2 & 721) == 0x90 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3F1269E, v2, -1, "com.kakao.tistory.presentation.view.toppost.ComposableSingletons$TopPostListActivityKt.lambda-2.<anonymous> (TopPostListActivity.kt:196)");
        }
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(("Item " + v), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer0, 0, 0, 0x3FFFE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        b.a(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }
}

