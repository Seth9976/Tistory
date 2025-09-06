package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final boolean a;

    public z(boolean z) {
        this.a = z;
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
            ComposerKt.traceEventStart(0x4415124A, v, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentSecretButton.<anonymous> (CommentEditField.kt:396)");
        }
        Pair pair0 = this.a ? TuplesKt.to(drawable.ic_bar_secret_on, string.content_desc_secret_comment) : TuplesKt.to(drawable.ic_bar_secret_off, string.content_desc_public_comment);
        Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 24.0f);
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(((Number)pair0.component1()).intValue(), ((Composer)object0), 0), StringResources_androidKt.stringResource(((Number)pair0.component2()).intValue(), ((Composer)object0), 0), modifier0, ColorResources_androidKt.colorResource((this.a ? color.gray1 : color.gray7), ((Composer)object0), 0), ((Composer)object0), 392, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

