package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.My;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.Others;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function3 {
    public final BlogMainInfo a;

    public s0(BlogMainInfo blogMainInfo0) {
        this.a = blogMainInfo0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$Actions");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(253309607, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainInfo.<anonymous>.<anonymous>.<anonymous> (BlogMainInfo.kt:142)");
        }
        BlogMainInfo blogMainInfo0 = this.a;
        if(blogMainInfo0 instanceof My) {
            ((Composer)object1).startReplaceGroup(0xE698E4E4);
            BlogMainInfoKt.access$BlogSettingButton(((My)this.a).getOnClickSetting(), ((Composer)object1), 0);
        }
        else if(blogMainInfo0 instanceof Others) {
            ((Composer)object1).startReplaceGroup(0xE698EF86);
            BlogMainInfoKt.access$FollowButton(((Others)this.a).isFollowing(), ((Others)this.a).getOnClickFollowing(), ((Composer)object1), 0);
        }
        else {
            ((Composer)object1).startReplaceGroup(0xEC8651FF);
        }
        ((Composer)object1).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

