package com.kakao.tistory.presentation.screen.home.item;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final Page a;

    public z(Page homeSlotUiState$Page0) {
        this.a = homeSlotUiState$Page0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt___CollectionsKt.chunked(this.a.getContents(), this.a.getContentsPerPage());
    }
}

