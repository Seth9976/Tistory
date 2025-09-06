package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import c;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w4 extends Lambda implements Function3 {
    public final String a;

    public w4(String s) {
        this.a = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TextButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x686F6DDE, v, -1, "com.kakao.tistory.presentation.widget.common.SortSelectButton.<anonymous> (TistoryTopAppBarSort.kt:30)");
        }
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getH5();
        TextKt.Text--4IGK_g(this.a, null, 0L, 0L, null, null, null, 0x1BDCCCCCDL, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object1), 0xC00000, 0, 0xFF7E);
        c.a(6.0f, Modifier.Companion, ((Composer)object1), 6);
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_list_fold, ((Composer)object1), 0), null, null, null, null, 0.0f, null, ((Composer)object1), 56, 0x7C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

