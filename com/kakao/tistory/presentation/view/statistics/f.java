package com.kakao.tistory.presentation.view.statistics;

import androidx.fragment.app.FragmentActivity;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.data.model.RefererEtcItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final RefererEtcListFragment a;
    public final RefererEtcItem b;

    public f(RefererEtcListFragment refererEtcListFragment0, RefererEtcItem refererEtcItem0) {
        this.a = refererEtcListFragment0;
        this.b = refererEtcItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.a.getSection();
        String s1 = this.a.getPage();
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, null, null, null, "", null, null, null, null, null, null, 0x3F7, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, s, s1, TiaraActionType.CLICK_REFERER_ETC_URL, null, click0, null, null, null, 0xE8, null);
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            Intrinsics.checkNotNull(fragmentActivity0);
            NavigatorExtensionKt.goToWebView$default(fragmentActivity0, "", false, false, false, false, 30, null);
        }
        return Unit.INSTANCE;
    }
}

