package com.kakao.tistory.presentation.view.search;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function2 {
    public final LazyListState a;
    public final SearchViewModel b;

    public y0(LazyListState lazyListState0, SearchViewModel searchViewModel0) {
        this.a = lazyListState0;
        this.b = searchViewModel0;
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
            ComposerKt.traceEventStart(-286992950, v, -1, "com.kakao.tistory.presentation.view.search.SearchKeywordPage.<anonymous>.<anonymous> (SearchKeywordFragment.kt:50)");
        }
        SearchKeywordFragmentKt.access$SearchKeywordList(this.a, this.b, ((Composer)object0), 0x40);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

