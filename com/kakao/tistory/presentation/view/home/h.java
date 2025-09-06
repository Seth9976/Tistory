package com.kakao.tistory.presentation.view.home;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function2 {
    public final RefererKeywordListActivity a;
    public final RefererKeywordItem b;
    public final int c;

    public h(RefererKeywordListActivity refererKeywordListActivity0, RefererKeywordItem statisticsItem$RefererKeywordItem0, int v) {
        this.a = refererKeywordListActivity0;
        this.b = statisticsItem$RefererKeywordItem0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RefererKeywordListActivity.access$KeywordItem(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

