package com.kakao.tistory.presentation.view.search;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.viewmodel.SearchResultViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o1 extends Lambda implements Function1 {
    public final LazyPagingItems a;
    public final TopViewModel b;
    public final SearchResultViewModel c;
    public final String d;
    public final State e;
    public final State f;

    public o1(LazyPagingItems lazyPagingItems0, TopViewModel topViewModel0, SearchResultViewModel searchResultViewModel0, String s, State state0, State state1) {
        this.a = lazyPagingItems0;
        this.b = topViewModel0;
        this.c = searchResultViewModel0;
        this.d = s;
        this.e = state0;
        this.f = state1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        if(this.a.getItemCount() == 0) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.SearchResultListFragmentKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
        }
        LazyListScope.items$default(((LazyListScope)object0), this.a.getItemCount(), null, null, ComposableLambdaKt.composableLambdaInstance(0xDF60475F, true, new n1(this.a, this.b, this.c, this.d, this.e, this.f)), 6, null);
        return Unit.INSTANCE;
    }
}

