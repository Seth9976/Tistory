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

public final class y0 extends Lambda implements Function2 {
    public final float a;

    public y0(float f) {
        this.a = f;
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
            ComposerKt.traceEventStart(1555163011, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CreatorTitle.<anonymous>.<anonymous> (Creator.kt:179)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_info, ((Composer)object0), 0), StringResources_androidKt.stringResource(string.content_desc_info, ((Composer)object0), 0), SizeKt.size-3ABfNKs(Modifier.Companion, this.a), 0L, ((Composer)object0), 392, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

