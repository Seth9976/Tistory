package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function3 {
    public final boolean a;
    public final Function1 b;

    public f0(boolean z, Function1 function10) {
        this.a = z;
        this.b = function10;
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
            ComposerKt.traceEventStart(0x8A0A41D7, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotFollowButton.<anonymous> (SlotFollowButton.kt:102)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource((this.a ? drawable.ic_btn_check : drawable.ic_btn_plus), ((Composer)object1), 0), null, null, ((Color)this.b.invoke(Boolean.valueOf(this.a))).unbox-impl(), ((Composer)object1), 56, 4);
        String s = StringResources_androidKt.stringResource((this.a ? string.label_home_slot_following : string.label_home_slot_follow), ((Composer)object1), 0);
        TextStyle textStyle0 = new TextStyle(0L, 0x141500000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
        TextKt.Text--4IGK_g(s, PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 3.0f, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object1), 0x30, 0, 0xFFFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

