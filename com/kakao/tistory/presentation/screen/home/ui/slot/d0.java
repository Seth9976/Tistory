package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function2 {
    public static final d0 a;

    static {
        d0.a = new d0();
    }

    public d0() {
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
            ComposerKt.traceEventStart(-206770670, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.ComposableSingletons$CreatorKt.lambda-2.<anonymous> (Creator.kt:328)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_close, ((Composer)object0), 0), StringResources_androidKt.stringResource(string.content_desc_close, ((Composer)object0), 0), SizeKt.size-3ABfNKs(Modifier.Companion, 18.0f), 0L, ((Composer)object0), 0xD88, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

