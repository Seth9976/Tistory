package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowReportBottomSheet;
import com.kakao.tistory.presentation.viewmodel.BlogTopReportData;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r2 extends Lambda implements Function3 {
    public final BlogMainViewModel a;

    public r2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkNotNullParameter(((String)object0), "name");
        Intrinsics.checkNotNullParameter(((BlogTopReportData)object2), "reportData");
        BlogMainTiara.INSTANCE.trackClickReport();
        ShowReportBottomSheet blogMainEvent$ShowReportBottomSheet0 = new ShowReportBottomSheet(((String)object0), ((Number)object1).longValue(), ((BlogTopReportData)object2));
        this.a.sendEvent(blogMainEvent$ShowReportBottomSheet0);
        return Unit.INSTANCE;
    }
}

