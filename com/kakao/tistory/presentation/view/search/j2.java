package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.MutableState;
import com.google.accompanist.pager.PagerState;
import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class j2 extends SuspendLambda implements Function2 {
    public final List a;
    public final PagerState b;
    public final SearchViewModel c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;

    public j2(List list0, PagerState pagerState0, SearchViewModel searchViewModel0, MutableState mutableState0, MutableState mutableState1, MutableState mutableState2, Continuation continuation0) {
        this.a = list0;
        this.b = pagerState0;
        this.c = searchViewModel0;
        this.d = mutableState0;
        this.e = mutableState1;
        this.f = mutableState2;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j2(this.a, this.b, this.c, this.d, this.e, this.f, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(SearchResultListFragmentKt.access$TrackSearchResultTiara$lambda$3(this.d)) {
            SearchResultListFragmentKt.access$TrackSearchResultTiara$lambda$4(this.d, false);
            return Unit.INSTANCE;
        }
        int v = this.b.getCurrentPage();
        String s = ((ResultViewType)this.a.get(v)).getTiaraCode();
        String s1 = SearchResultListFragmentKt.access$TrackSearchResultTiara$lambda$9(this.e);
        boolean z = SearchResultListFragmentKt.access$TrackSearchResultTiara$lambda$6(this.f);
        this.c.trackTiaraViewPager(s1, s, z);
        SearchResultListFragmentKt.access$TrackSearchResultTiara$lambda$10(this.e, s);
        SearchResultListFragmentKt.access$TrackSearchResultTiara$lambda$7(this.f, false);
        return Unit.INSTANCE;
    }
}

