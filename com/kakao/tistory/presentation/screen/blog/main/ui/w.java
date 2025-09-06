package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final LazyListState a;
    public final int b;
    public final float c;

    public w(LazyListState lazyListState0, int v, float f) {
        this.a = lazyListState0;
        this.b = v;
        this.c = f;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)CollectionsKt___CollectionsKt.firstOrNull(this.a.getLayoutInfo().getVisibleItemsInfo());
        if(lazyListItemInfo0 == null) {
            return false;
        }
        int v = this.a.getFirstVisibleItemIndex();
        int v1 = this.b;
        boolean z = true;
        if(v1 > v || v > 0x7FFFFFFF) {
            if(v == v1 - 1) {
                int v2 = lazyListItemInfo0.getSize();
                int v3 = lazyListItemInfo0.getOffset();
                return this.c - ((float)(v3 + v2)) > 0.0f;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

