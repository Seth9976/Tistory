package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoBlogSetting;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.ShowToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v2 extends Lambda implements Function1 {
    public final BlogMainViewModel a;

    public v2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((BlogRoleType)object0), "role");
        if(((BlogRoleType)object0).getHasChangeBlogAuth()) {
            BlogMainTiara.INSTANCE.trackClickBlogSetting();
            this.a.sendEvent(GoBlogSetting.INSTANCE);
            return Unit.INSTANCE;
        }
        ShowToast blogMainEvent$ShowToast0 = new ShowToast(null, string.label_dialog_blog_setting, 1, null);
        this.a.sendEvent(blogMainEvent$ShowToast0);
        return Unit.INSTANCE;
    }
}

