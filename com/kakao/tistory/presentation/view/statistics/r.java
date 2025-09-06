package com.kakao.tistory.presentation.view.statistics;

import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public final TopViewModel a;
    public final StatisticsFragment b;

    public r(TopViewModel topViewModel0, StatisticsFragment statisticsFragment0) {
        this.a = topViewModel0;
        this.b = statisticsFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            List list0 = (List)this.a.getMetricSortItem().getValue();
            if(list0 != null) {
                CommonBottomDialogFragment commonBottomDialogFragment0 = CommonBottomDialogFragment.Companion.newInstance();
                commonBottomDialogFragment0.setItems(list0);
                commonBottomDialogFragment0.setOnSelectedItem(new q(this.a));
                commonBottomDialogFragment0.show(this.b.getChildFragmentManager(), "CommonBottomDialogFragment");
            }
        }
        return Unit.INSTANCE;
    }
}

