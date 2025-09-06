package com.kakao.tistory.presentation.common.tiara;

import com.kakao.android.base.model.AdInfo;
import com.kakao.tiara.TiaraTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public static final e a;

    static {
        e.a = new e();
    }

    public e() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TiaraTracker tiaraTracker0 = TistoryTiara.a;
        TiaraTracker tiaraTracker1 = null;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        tiaraTracker0.getSettings().setAdid((((AdInfo)object0) == null ? null : ((AdInfo)object0).getId()));
        TiaraTracker tiaraTracker2 = TistoryTiara.a;
        if(tiaraTracker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
        }
        else {
            tiaraTracker1 = tiaraTracker2;
        }
        tiaraTracker1.getSettings().setLimitAdTrackingEnabled((((AdInfo)object0) == null ? false : ((AdInfo)object0).isLimitAdTrackingEnabled()));
        return Unit.INSTANCE;
    }
}

