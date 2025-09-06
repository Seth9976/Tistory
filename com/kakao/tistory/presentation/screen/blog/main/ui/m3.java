package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m3 extends Lambda implements Function2 {
    public final BlogMainInfo a;

    public m3(BlogMainInfo blogMainInfo0) {
        this.a = blogMainInfo0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5906611, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainAppBar.<anonymous>.<anonymous>.<anonymous> (BlogMainTopAppBar.kt:40)");
        }
        BlogMainInfo blogMainInfo0 = this.a;
        if(blogMainInfo0 != null) {
            TistoryTopAppBarButtonKt.MainActions(blogMainInfo0.getImage(), blogMainInfo0.isMine(), blogMainInfo0.getOnClickSearch(), blogMainInfo0.getOnClickBlog(), ((Composer)object0), 0, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

