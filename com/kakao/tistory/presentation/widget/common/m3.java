package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m3 extends Lambda implements Function2 {
    public final String a;
    public final String b;

    public m3(String s, String s1) {
        this.a = s;
        this.b = s1;
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
            ComposerKt.traceEventStart(0x67B3E62B, v, -1, "com.kakao.tistory.presentation.widget.common.BlogImageButton.<anonymous> (TistoryTopAppBarButton.kt:72)");
        }
        BlogThumbnailKt.BlogThumbnail-EUb7tLY((this.a == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(this.a)), 28.0f, null, false, this.b, ((Composer)object0), 0x30, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

