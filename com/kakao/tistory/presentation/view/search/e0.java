package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function1 {
    public final TopViewModel a;
    public final SearchActivity b;

    public e0(TopViewModel topViewModel0, SearchActivity searchActivity0) {
        this.a = topViewModel0;
        this.b = searchActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        List list0 = (List)this.a.getSortItems().getValue();
        if(list0 != null) {
            CommonBottomDialogFragment commonBottomDialogFragment0 = CommonBottomDialogFragment.Companion.newInstance();
            commonBottomDialogFragment0.setItems(list0);
            commonBottomDialogFragment0.setOnSelectedItem(new d0(this.a));
            commonBottomDialogFragment0.show(this.b.getSupportFragmentManager(), "CommonBottomDialogFragment");
        }
        return Unit.INSTANCE;
    }
}

