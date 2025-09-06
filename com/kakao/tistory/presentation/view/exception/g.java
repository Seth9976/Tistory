package com.kakao.tistory.presentation.view.exception;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel.GuideNavigator.Back;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel.GuideNavigator.Link;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel.GuideNavigator.Main;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel.GuideNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final TistoryGuideActivity a;

    public g(TistoryGuideActivity tistoryGuideActivity0) {
        this.a = tistoryGuideActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GuideNavigator)object0), "it");
        if(((GuideNavigator)object0) instanceof Back) {
            this.a.finish();
            return Unit.INSTANCE;
        }
        if(((GuideNavigator)object0) instanceof Main) {
            String s = ((Main)(((GuideNavigator)object0))).getRedirectUrl();
            NavigatorExtensionKt.goToMain$default(this.a, s, null, null, 6, null);
            return Unit.INSTANCE;
        }
        if(((GuideNavigator)object0) instanceof Link) {
            String s1 = ((Link)(((GuideNavigator)object0))).getUrl();
            NavigatorExtensionKt.goToRedirect(this.a, s1, true);
        }
        return Unit.INSTANCE;
    }
}

