package com.kakao.tistory.presentation.view.setting;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function3 {
    public final boolean a;
    public final String b;

    public i(boolean z, String s) {
        this.a = z;
        this.b = s;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$Button");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9C54E0FF, v, -1, "com.kakao.tistory.presentation.view.setting.SettingAppInfoActivity.AppUpdateButton.<anonymous> (SettingAppInfoActivity.kt:182)");
        }
        Modifier modifier0 = ((RowScope)object0).align(Modifier.Companion, Alignment.Companion.getCenterVertically());
        FontWeight fontWeight0 = FontWeight.Companion.getNormal();
        TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
        ((Composer)object1).startReplaceGroup(0x4EE01002);
        long v1 = this.a ? ColorResources_androidKt.colorResource(color.color_9d9d9d, ((Composer)object1), 0) : 0xFFFFFFFF00000000L;
        ((Composer)object1).endReplaceGroup();
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(this.b, modifier0, v1, 0x141600000L, null, fontWeight0, TypeKt.getTFont(), 0x1BDCCCCCDL, null, null, 0L, 0, false, false, 0, 0, null, null, ((Composer)object1), 0x1B0C00, 0, 0x3FF10);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

