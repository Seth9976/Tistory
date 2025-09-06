package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.BaseKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a7 extends Lambda implements Function0 {
    public final GuideType a;
    public final TistoryGuideViewModel b;

    public a7(GuideType tistoryGuideViewModel$GuideType0, TistoryGuideViewModel tistoryGuideViewModel0) {
        this.a = tistoryGuideViewModel$GuideType0;
        this.b = tistoryGuideViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer integer0 = this.a.getLinkedTextUrlStringId();
        if(integer0 != null) {
            TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.b.getSection(), this.b.getPage(), TiaraActionType.CLICK_SEE_DETAIL, null, null, null, null, null, 0xF8, null);
            String s = BaseKt.getAppContext().getString(integer0.intValue());
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            TistoryGuideViewModel.access$goToDestination(this.b, new Link(s, this.a == GuideType.UNREGISTERED_KAKAO_ACCOUNT));
        }
        return Unit.INSTANCE;
    }
}

