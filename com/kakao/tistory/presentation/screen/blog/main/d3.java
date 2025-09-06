package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEntry;
import com.kakao.tistory.presentation.screen.blog.common.ui.BlogEntryListItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d3 extends Lambda implements Function3 {
    public static final d3 a;

    static {
        d3.a = new d3();
    }

    public d3() {
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
            ComposerKt.traceEventStart(0x9CF2DE8E, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ComposableSingletons$BlogMainScreenKt.lambda-1.<anonymous> (BlogMainScreen.kt:267)");
        }
        BlogEntryListItemKt.BlogEntryListItem(((BlogEntry)object0), ((Composer)object1), v & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

