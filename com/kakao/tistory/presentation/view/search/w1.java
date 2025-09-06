package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.google.accompanist.pager.PagerScope;
import com.kakao.tistory.data.datasource.BaseSearchDataSource.DataType;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w1 extends Lambda implements Function4 {
    public final List a;
    public final SearchViewModel b;
    public final TopViewModel c;
    public final SearchResultViewModel d;
    public final State e;

    public w1(List list0, SearchViewModel searchViewModel0, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0, State state0) {
        this.a = list0;
        this.b = searchViewModel0;
        this.c = topViewModel0;
        this.d = searchResultViewModel0;
        this.e = state0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        DataType baseSearchDataSource$DataType0;
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((PagerScope)object0), "$this$HorizontalPager");
        if((v1 & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA19F94ED, v1, -1, "com.kakao.tistory.presentation.view.search.SearchResultPager.<anonymous>.<anonymous> (SearchResultListFragment.kt:97)");
        }
        switch(((ResultViewType)this.a.get(v))) {
            case 1: {
                baseSearchDataSource$DataType0 = DataType.POST;
                break;
            }
            case 2: {
                baseSearchDataSource$DataType0 = DataType.TAG;
                break;
            }
            case 3: {
                baseSearchDataSource$DataType0 = DataType.BLOG;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        String s = SearchResultListFragmentKt.access$SearchResultPager$lambda$0(this.e);
        if(s == null) {
            s = "";
        }
        SearchResultListFragmentKt.access$SearchResultPage(s, this.b.getBlogName(), baseSearchDataSource$DataType0, this.c, this.d, ((Composer)object2), 0x9000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

