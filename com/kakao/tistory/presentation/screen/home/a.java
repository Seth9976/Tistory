package com.kakao.tistory.presentation.screen.home;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public static final a a;

    static {
        a.a = new a();
    }

    public a() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$RoundButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDBC81971, v, -1, "com.kakao.tistory.presentation.screen.home.ComposableSingletons$HomeScreenKt.lambda-1.<anonymous> (HomeScreen.kt:167)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_img_wordmark_l, ((Composer)object1), 0), StringResources_androidKt.stringResource(string.content_desc_scroll_to_top, ((Composer)object1), 0), SizeKt.height-3ABfNKs(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 5.0f, 0.0f, 0.0f, 13, null), 24.0f), null, null, 0.0f, null, ((Composer)object1), 392, 120);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

