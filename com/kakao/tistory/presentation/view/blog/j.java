package com.kakao.tistory.presentation.view.blog;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.widget.CommonTitleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function3 {
    public final BlogFollowerFragment a;

    public j(BlogFollowerFragment blogFollowerFragment0) {
        this.a = blogFollowerFragment0;
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
            ComposerKt.traceEventStart(0x1354A1C0, v, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowerFragment.FollowerList.<anonymous>.<anonymous> (BlogFollowerFragment.kt:121)");
        }
        CommonTitleKt.TitleWithCategoryView(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 22.5f, 7, null), BlogFollowerFragment.access$getTopViewModel(this.a), i.a, ((Composer)object1), 454, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

