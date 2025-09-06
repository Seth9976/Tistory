package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.paging.LoadState.Loading;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import com.kakao.tistory.presentation.widget.dialog.LoadingDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r1 extends Lambda implements Function2 {
    public final LazyPagingItems a;
    public final String b;
    public final TopViewModel c;
    public final SearchResultViewModel d;

    public r1(LazyPagingItems lazyPagingItems0, String s, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0) {
        this.a = lazyPagingItems0;
        this.b = s;
        this.c = topViewModel0;
        this.d = searchResultViewModel0;
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
            ComposerKt.traceEventStart(0x89C6860F, v, -1, "com.kakao.tistory.presentation.view.search.SearchResultPage.<anonymous>.<anonymous> (SearchResultListFragment.kt:212)");
        }
        if(this.a.getLoadState().getRefresh() instanceof Loading) {
            ((Composer)object0).startReplaceGroup(1406814028);
            LoadingDialogKt.LoadingDialog(((Composer)object0), 0);
        }
        else {
            ((Composer)object0).startReplaceGroup(1406815143);
            SearchResultListFragmentKt.access$SearchResultList(this.a, this.b, this.c, this.d, ((Composer)object0), LazyPagingItems.$stable | 0x1200);
        }
        ((Composer)object0).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

