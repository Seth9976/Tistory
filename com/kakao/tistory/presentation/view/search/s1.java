package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.compose.LazyPagingItems;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s1 extends Lambda implements Function2 {
    public final SwipeRefreshState a;
    public final LazyPagingItems b;
    public final String c;
    public final TopViewModel d;
    public final SearchResultViewModel e;

    public s1(SwipeRefreshState swipeRefreshState0, LazyPagingItems lazyPagingItems0, String s, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0) {
        this.a = swipeRefreshState0;
        this.b = lazyPagingItems0;
        this.c = s;
        this.d = topViewModel0;
        this.e = searchResultViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9388DCB8, v, -1, "com.kakao.tistory.presentation.view.search.SearchResultPage.<anonymous> (SearchResultListFragment.kt:211)");
        }
        q1 q10 = new q1(this.b);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x89C6860F, true, new r1(this.b, this.c, this.d, this.e), ((Composer)object0), 54);
        SwipeRefreshKt.SwipeRefresh-Fsagccs(this.a, q10, null, false, 0.0f, null, null, null, false, composableLambda0, ((Composer)object0), 0x30000000, 508);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

