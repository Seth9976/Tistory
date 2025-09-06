package com.kakao.tistory.presentation.screen.feed.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.screen.feed.FeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final LazyPagingItems a;
    public final boolean b;
    public final FeedViewModel c;
    public final State d;
    public final State e;

    public g(LazyPagingItems lazyPagingItems0, boolean z, FeedViewModel feedViewModel0, State state0, State state1) {
        this.a = lazyPagingItems0;
        this.b = z;
        this.c = feedViewModel0;
        this.d = state0;
        this.e = state1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        if(this.a.getItemCount() == 0 && this.b) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(0xD67BD455, true, new e(this.c)), 3, null);
            return Unit.INSTANCE;
        }
        LazyListScope.items$default(((LazyListScope)object0), this.a.getItemCount(), null, null, ComposableLambdaKt.composableLambdaInstance(0x80F77F03, true, new f(this.a, this.d, this.e)), 6, null);
        return Unit.INSTANCE;
    }
}

