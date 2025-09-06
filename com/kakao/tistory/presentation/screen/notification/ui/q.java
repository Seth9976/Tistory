package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.compose.LazyFoundationExtensionsKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.screen.notification.NotificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final LazyPagingItems a;
    public final int b;
    public final NotificationViewModel c;

    public q(LazyPagingItems lazyPagingItems0, int v, NotificationViewModel notificationViewModel0) {
        this.a = lazyPagingItems0;
        this.b = v;
        this.c = notificationViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.items$default(((LazyListScope)object0), this.a.getItemCount(), LazyFoundationExtensionsKt.itemKey(this.a, m.a), null, ComposableLambdaKt.composableLambdaInstance(0x34A240B, true, new p(this.a, this.b, this.c)), 4, null);
        return Unit.INSTANCE;
    }
}

