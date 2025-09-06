package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.viewmodel.TopEntriesSortType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final TopPostListActivity a;
    public final TopAppBarScrollBehavior b;
    public final String c;
    public final TopEntriesSortType d;
    public final Function0 e;
    public final int f;
    public final int g;

    public s(TopPostListActivity topPostListActivity0, TopAppBarScrollBehavior topAppBarScrollBehavior0, String s, TopEntriesSortType topEntriesSortType0, Function0 function00, int v, int v1) {
        this.a = topPostListActivity0;
        this.b = topAppBarScrollBehavior0;
        this.c = s;
        this.d = topEntriesSortType0;
        this.e = function00;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

