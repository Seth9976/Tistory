package com.kakao.tistory.presentation.view.blog;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.common.CommonEmptyViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function3 {
    public static final t0 a;

    static {
        t0.a = new t0();
    }

    public t0() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x83CFF885, v, -1, "com.kakao.tistory.presentation.view.blog.ComposableSingletons$BlogFollowerFragmentKt.lambda-1.<anonymous> (BlogFollowerFragment.kt:130)");
        }
        CommonEmptyViewKt.CommonEmptyView(string.label_blog_following_empty, null, ((Composer)object1), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

