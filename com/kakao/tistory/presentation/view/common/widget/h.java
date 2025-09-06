package com.kakao.tistory.presentation.view.common.widget;

import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.view.common.base.TistoryActivity;
import com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final TistoryToolbar a;
    public final boolean b;
    public final Function0 c;

    public h(TistoryToolbar tistoryToolbar0, boolean z, Function0 function00) {
        this.a = tistoryToolbar0;
        this.b = z;
        this.c = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TiaraUtils tiaraUtils0 = TiaraUtils.INSTANCE;
        TistoryActivity tistoryActivity0 = this.a.a;
        TistoryActivity tistoryActivity1 = null;
        if(tistoryActivity0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            tistoryActivity0 = null;
        }
        String s = tistoryActivity0.getSection();
        TistoryActivity tistoryActivity2 = this.a.a;
        if(tistoryActivity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        }
        else {
            tistoryActivity1 = tistoryActivity2;
        }
        String s1 = tistoryActivity1.getPage();
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "GNB", "GNB프로필", null, null, null, null, null, null, null, null, 1020, null);
        TiaraUtils.trackClick$default(tiaraUtils0, s, s1, TiaraActionType.CLICK_APP_BAR_PROFILE_IMAGE, null, click0, null, w.mapOf(TuplesKt.to("type", (this.b ? "myProfile" : "othersProfile"))), null, 0xA8, null);
        if(this.b) {
            BlogSwitchViewModel blogSwitchViewModel0 = this.a.f;
            if(blogSwitchViewModel0 != null) {
                blogSwitchViewModel0.showBlogSwitchBottomSheet();
                return Unit.INSTANCE;
            }
        }
        else {
            Function0 function00 = this.c;
            if(function00 != null) {
                function00.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}

