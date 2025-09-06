package g9;

import com.kakao.android.base.model.AdInfo;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.TiaraTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a w;

    static {
        a.w = new a(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TiaraTracker tiaraTracker0 = TiaraUtils.a;
        TiaraTracker tiaraTracker1 = null;
        if(tiaraTracker0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tiaraTracker");
            tiaraTracker0 = null;
        }
        tiaraTracker0.getSettings().setAdid((((AdInfo)object0) == null ? null : ((AdInfo)object0).getId()));
        TiaraTracker tiaraTracker2 = TiaraUtils.a;
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

