package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.domain.ErrorModelThrowable;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import com.kakao.tistory.presentation.view.common.PagingItemListKt;
import com.kakao.tistory.presentation.widget.common.CommonExceptionViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function3 {
    public final LazyPagingItems a;
    public final NavActions b;
    public final State c;

    public g(LazyPagingItems lazyPagingItems0, NavActions navActions0, State state0) {
        this.a = lazyPagingItems0;
        this.b = navActions0;
        this.c = state0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$PullToRefreshBox");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-324891420, v, -1, "com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeScreen.<anonymous> (BlogNoticeListScreen.kt:66)");
        }
        ErrorModelThrowable errorModelThrowable0 = this.a == null ? null : PagingItemListKt.getRefreshError(this.a);
        if(errorModelThrowable0 == null) {
            ((Composer)object1).startReplaceGroup(31057692);
            Function0 function00 = this.b.getFinish();
            BlogNoticeListScreenKt.access$BlogNoticeContent(this.a, function00, ((Composer)object1), LazyPagingItems.$stable);
        }
        else {
            ((Composer)object1).startReplaceGroup(0x1DB8467);
            Function0 function01 = BlogNoticeListScreenKt.access$BlogNoticeScreen$lambda$1(this.c).getRefresh();
            CommonExceptionViewKt.CommonExceptionViewWithBackAppBar(errorModelThrowable0.getErrorModel(), this.b.getFinish(), function01, ((Composer)object1), 8, 0);
        }
        ((Composer)object1).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

