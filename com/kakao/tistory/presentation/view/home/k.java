package com.kakao.tistory.presentation.view.home;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.data.model.StatisticsItem.RefererLogItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final RefererLogListActivity a;
    public final Modifier b;
    public final RefererLogItem c;
    public final boolean d;
    public final Function1 e;
    public final int f;
    public final int g;

    public k(RefererLogListActivity refererLogListActivity0, Modifier modifier0, RefererLogItem statisticsItem$RefererLogItem0, boolean z, Function1 function10, int v, int v1) {
        this.a = refererLogListActivity0;
        this.b = modifier0;
        this.c = statisticsItem$RefererLogItem0;
        this.d = z;
        this.e = function10;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.RefererLogItem(this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

