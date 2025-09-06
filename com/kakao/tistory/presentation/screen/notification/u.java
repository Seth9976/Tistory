package com.kakao.tistory.presentation.screen.notification;

import androidx.compose.runtime.MutableState;
import androidx.paging.LoadState.Error;
import androidx.paging.LoadState.Loading;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.ErrorModelThrowable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final LazyPagingItems a;
    public final MutableState b;
    public final MutableState c;

    public u(LazyPagingItems lazyPagingItems0, MutableState mutableState0, MutableState mutableState1) {
        this.a = lazyPagingItems0;
        this.b = mutableState0;
        this.c = mutableState1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LoadState loadState0 = this.a.getLoadState().getSource().getRefresh();
        MutableState mutableState0 = this.b;
        ErrorModel errorModel0 = null;
        Error loadState$Error0 = loadState0 instanceof Error ? ((Error)loadState0) : null;
        Throwable throwable0 = loadState$Error0 == null ? null : loadState$Error0.getError();
        ErrorModelThrowable errorModelThrowable0 = throwable0 instanceof ErrorModelThrowable ? ((ErrorModelThrowable)throwable0) : null;
        if(errorModelThrowable0 != null) {
            errorModel0 = errorModelThrowable0.getErrorModel();
        }
        NotificationScreenKt.access$NotificationScreen$lambda$2(mutableState0, errorModel0);
        NotificationScreenKt.access$NotificationScreen$lambda$5(this.c, false);
        return Boolean.valueOf(loadState0 instanceof Loading);
    }
}

