package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEntry;
import com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryListItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function3 {
    public static final v0 a;

    static {
        v0.a = new v0();
    }

    public v0() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BlogEntry)object0), "entry");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((BlogEntry)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBB84EB12, v, -1, "com.kakao.tistory.presentation.screen.blog.noticeList.ComposableSingletons$BlogNoticeListScreenKt.lambda-2.<anonymous> (BlogNoticeListScreen.kt:162)");
        }
        BlogEntryListItemKt.BlogEntryListItem(((BlogEntry)object0), ((Composer)object1), v & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

