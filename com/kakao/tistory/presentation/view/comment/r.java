package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.widget.CommonTitleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function3 {
    public final int a;
    public final long b;

    public r(int v, long v1) {
        this.a = v;
        this.b = v1;
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
            ComposerKt.traceEventStart(2016960137, v, -1, "com.kakao.tistory.presentation.view.comment.CommentFragment.CommentList.<anonymous>.<anonymous> (CommentFragment.kt:386)");
        }
        CommonTitleKt.CommonTitleView(null, StringResources_androidKt.stringResource(this.a, ((Composer)object1), 0), (this.b <= 0L ? null : String.valueOf(this.b)), null, null, ((Composer)object1), 0, 25);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

