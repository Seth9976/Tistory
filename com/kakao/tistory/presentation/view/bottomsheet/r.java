package com.kakao.tistory.presentation.view.bottomsheet;

import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public final DaumCategoryDialogFragment a;

    public r(DaumCategoryDialogFragment daumCategoryDialogFragment0) {
        this.a = daumCategoryDialogFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((DaumLikeItem)object0) == null || ((DaumLikeItem)object0).getId() != -3) {
            this.a.getOnSelectedItem().invoke(((DaumLikeItem)object0));
        }
        else {
            this.a.getOnSelectedItem().invoke(null);
        }
        this.a.dismiss();
        return Unit.INSTANCE;
    }
}

