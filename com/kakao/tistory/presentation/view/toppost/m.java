package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.viewmodel.TopEntriesSortType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final TopPostListActivity a;
    public final TopEntriesSortType b;
    public final Function1 c;
    public final Function0 d;
    public final int e;
    public final int f;

    public m(TopPostListActivity topPostListActivity0, TopEntriesSortType topEntriesSortType0, Function1 function10, Function0 function00, int v, int v1) {
        this.a = topPostListActivity0;
        this.b = topEntriesSortType0;
        this.c = function10;
        this.d = function00;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.SortBottomSheet(this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

