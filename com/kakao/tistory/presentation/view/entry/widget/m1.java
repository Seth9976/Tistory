package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m1 extends Lambda implements Function2 {
    public static final m1 a;

    static {
        m1.a = new m1();
    }

    public m1() {
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
            ComposerKt.traceEventStart(-1014804277, v, -1, "com.kakao.tistory.presentation.view.entry.widget.ComposableSingletons$CommentKt.lambda-1.<anonymous> (Comment.kt:219)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_btn_more, ((Composer)object0), 0), null, null, 0L, ((Composer)object0), 56, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

