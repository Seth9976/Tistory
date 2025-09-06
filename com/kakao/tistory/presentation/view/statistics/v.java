package com.kakao.tistory.presentation.view.statistics;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final StatisticsFragment a;
    public final StatisticsViewModel b;

    public v(StatisticsFragment statisticsFragment0, StatisticsViewModel statisticsViewModel0) {
        this.a = statisticsFragment0;
        this.b = statisticsViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            NavigatorExtensionKt.goToTopPost$default(fragmentActivity0, ((String)object0), ((String)this.b.getSelectedDate().getValue()), ((String)this.b.getGranularity().getValue()), false, 8, null);
        }
        return Unit.INSTANCE;
    }
}

