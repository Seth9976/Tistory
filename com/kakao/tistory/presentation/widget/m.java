package com.kakao.tistory.presentation.widget;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function3 {
    public final String a;

    public m(String s) {
        this.a = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$CommonTitleView");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4FF6AD92, v, -1, "com.kakao.tistory.presentation.widget.TitleWithDescriptionView.<anonymous> (CommonTitle.kt:80)");
        }
        Modifier modifier0 = SemanticsModifierKt.semantics(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 2.0f, 7, null), true, l.a);
        TextStyle textStyle0 = TypeKt.getSubtext2(MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable));
        TextUnitKt.checkArithmetic--R2X_6o(0x13F000000L);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(this.a, modifier0, 0L, 0L, null, null, null, 0x1BF000000L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, ((Composer)object1), 0, 0xC00, 0x1DF7C);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

