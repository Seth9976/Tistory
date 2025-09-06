package com.kakao.tistory.presentation.view.statistics;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final StatisticsFragment a;
    public final EntryItem b;
    public final StatisticsViewModel c;

    public t(StatisticsFragment statisticsFragment0, EntryItem entryItem0, StatisticsViewModel statisticsViewModel0) {
        this.a = statisticsFragment0;
        this.b = entryItem0;
        this.c = statisticsViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            NavigatorExtensionKt.goToRefererEtc(fragmentActivity0, ((String)object0), (this.b == null ? null : this.b.getId()), ((String)this.c.getSelectedDate().getValue()), ((String)this.c.getGranularity().getValue()), ((String)this.c.getMetric().getValue()));
        }
        return Unit.INSTANCE;
    }
}

