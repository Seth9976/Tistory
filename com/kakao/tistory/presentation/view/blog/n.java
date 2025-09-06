package com.kakao.tistory.presentation.view.blog;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.compose.LazyFoundationExtensionsKt;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final LazyPagingItems a;
    public final BlogFollowerFragment b;
    public final State c;

    public n(LazyPagingItems lazyPagingItems0, BlogFollowerFragment blogFollowerFragment0, State state0) {
        this.a = lazyPagingItems0;
        this.b = blogFollowerFragment0;
        this.c = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(0x1354A1C0, true, new j(this.b)), 3, null);
        if(BlogFollowerFragment.access$FollowerList$lambda$1(this.c)) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.BlogFollowerFragmentKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
            return Unit.INSTANCE;
        }
        LazyListScope.items$default(((LazyListScope)object0), this.a.getItemCount(), LazyFoundationExtensionsKt.itemKey(this.a, k.a), null, ComposableLambdaKt.composableLambdaInstance(0xB03E3EB3, true, new m(this.a, this.b)), 4, null);
        return Unit.INSTANCE;
    }
}

