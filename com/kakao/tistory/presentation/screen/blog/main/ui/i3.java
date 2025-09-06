package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i3 extends Lambda implements Function2 {
    public final RowScope a;
    public final Data b;
    public final int c;

    public i3(RowScope rowScope0, Data statisticsItem$RefererLog$Data0, int v) {
        this.a = rowScope0;
        this.b = statisticsItem$RefererLog$Data0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainStatisticsRefererLogKt.a(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

