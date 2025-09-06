package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public final LazyPagingItems a;

    public a(LazyPagingItems lazyPagingItems0) {
        this.a = lazyPagingItems0;
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
            ComposerKt.traceEventStart(401353509, v, -1, "com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeContent.<anonymous>.<anonymous> (BlogNoticeListScreen.kt:149)");
        }
        String s = this.a == null ? null : this.a.getItemCount().toString();
        if(s == null) {
            s = "";
        }
        TistoryTopAppBarKt.TistoryTopAppBarTitleInfo(s, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

