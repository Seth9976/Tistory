package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n3 extends Lambda implements Function3 {
    public final BlogMainInfo a;
    public final float b;

    public n3(BlogMainInfo blogMainInfo0, float f) {
        this.a = blogMainInfo0;
        this.b = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryTopAppBarLayout");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6571D07A, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainAppBar.<anonymous>.<anonymous>.<anonymous> (BlogMainTopAppBar.kt:43)");
        }
        String s = this.a == null ? null : this.a.getTitle();
        if(s == null) {
            s = "";
        }
        TistoryTopAppBarKt.TistoryTopAppBarCenterTitle(s, GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, this.b, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFFB, null), ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

