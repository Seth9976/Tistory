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

public final class v0 extends Lambda implements Function3 {
    public static final v0 a;

    static {
        v0.a = new v0();
    }

    public v0() {
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
            ComposerKt.traceEventStart(0x73F1CF9A, v, -1, "com.kakao.tistory.presentation.view.blog.ComposableSingletons$BlogFollowingFragmentKt.lambda-1.<anonymous> (BlogFollowingFragment.kt:100)");
        }
        CommonEmptyViewKt.CommonEmptyView(string.label_feed_empty_follower, null, ((Composer)object1), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

