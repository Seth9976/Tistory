package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function2 {
    public final LazyListState a;
    public final LazyPagingItems b;
    public final Long c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public final int g;
    public final int h;

    public x(LazyListState lazyListState0, LazyPagingItems lazyPagingItems0, Long long0, Function1 function10, Function1 function11, Function1 function12, int v, int v1) {
        this.a = lazyListState0;
        this.b = lazyPagingItems0;
        this.c = long0;
        this.d = function10;
        this.e = function11;
        this.f = function12;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DraftBottomSheetKt.DraftList(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

