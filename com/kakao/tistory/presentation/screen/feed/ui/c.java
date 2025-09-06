package com.kakao.tistory.presentation.screen.feed.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.design.ui.list.BlogTitleKt;
import com.kakao.tistory.presentation.screen.feed.contract.FeedEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final FeedEntry a;

    public c(FeedEntry feedEntry0) {
        this.a = feedEntry0;
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
            ComposerKt.traceEventStart(0x8BDAF4A6, v, -1, "com.kakao.tistory.presentation.screen.feed.ui.FeedItem.<anonymous> (FeedList.kt:74)");
        }
        BlogTitleKt.BlogTitleWithThumbnail(this.a.getBlogImage(), this.a.getBlogTitle(), null, null, this.a.getOnClickBlog(), false, ((Composer)object0), 0, 44);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

