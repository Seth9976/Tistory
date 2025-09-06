package com.kakao.tistory.presentation.view.statistics;

import com.kakao.android.base.model.ErrorModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final StatisticsFragment a;

    public s(StatisticsFragment statisticsFragment0) {
        this.a = statisticsFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((ErrorModel)object0) != null) {
            this.a.showExceptionView(((ErrorModel)object0));
            return Unit.INSTANCE;
        }
        this.a.hideExceptionView();
        return Unit.INSTANCE;
    }
}

