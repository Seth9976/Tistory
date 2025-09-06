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

public final class g0 extends Lambda implements Function1 {
    public final LazyPagingItems a;
    public final BlogFollowingFragment b;
    public final State c;
    public final State d;

    public g0(LazyPagingItems lazyPagingItems0, BlogFollowingFragment blogFollowingFragment0, State state0, State state1) {
        this.a = lazyPagingItems0;
        this.b = blogFollowingFragment0;
        this.c = state0;
        this.d = state1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(0xD2DB587F, true, new a0(this.b)), 3, null);
        if(BlogFollowingFragment.access$FollowingList$lambda$2(this.c)) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.BlogFollowingFragmentKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
            return Unit.INSTANCE;
        }
        LazyListScope.items$default(((LazyListScope)object0), this.a.getItemCount(), LazyFoundationExtensionsKt.itemKey(this.a, b0.a), null, ComposableLambdaKt.composableLambdaInstance(0xE8AAB2AC, true, new f0(this.a, this.d, this.b)), 4, null);
        return Unit.INSTANCE;
    }
}

