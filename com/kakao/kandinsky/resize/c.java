package com.kakao.kandinsky.resize;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function5 {
    public final Function0 w;
    public final Function0 x;

    public c(Function0 function00, Function0 function01) {
        this.w = function00;
        this.x = function01;
        super(5);
    }

    @Override  // kotlin.jvm.functions.Function5
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        long v = ((IntSize)object1).unbox-impl();
        int v1 = ((Number)object2).intValue();
        int v2 = ((Number)object4).intValue();
        Intrinsics.checkNotNullParameter(((Modifier)object0), "modifier");
        int v3 = (v2 & 14) == 0 ? (((Composer)object3).changed(((Modifier)object0)) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (((Composer)object3).changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (((Composer)object3).changed(v1) ? 0x100 : 0x80);
        }
        if((v3 & 5851) == 1170 && ((Composer)object3).getSkipping()) {
            ((Composer)object3).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x10004C4C, v3, -1, "com.kakao.kandinsky.resize.ResizeController.<anonymous>.<anonymous> (ReSizeScreen.kt:346)");
        }
        int v4 = IntSize.getWidth-impl(v) < v1 || v1 <= 0 ? 1 : 0;
        ReSizeScreenKt.access$ResizeTypeButton(((Modifier)object0), StringResources_androidKt.stringResource(string.resize_original_size, new Object[]{IntSize.getWidth-impl(v), IntSize.getHeight-impl(v)}, ((Composer)object3), 0x40), v4, true, this.w, ((Composer)object3), v3 & 14 | 0xC00, 0);
        Integer integer0 = v1;
        String s = null;
        if(v4 != 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            s = integer0.toString();
        }
        ((Composer)object3).startReplaceGroup(0x8F02037F);
        if(s == null) {
            s = StringResources_androidKt.stringResource(string.resize_change_size, ((Composer)object3), 0);
        }
        ((Composer)object3).endReplaceGroup();
        ReSizeScreenKt.access$ResizeTypeButton(((Modifier)object0), s, ((boolean)(v4 ^ 1)), IntSize.getWidth-impl(v) >= 10, this.x, ((Composer)object3), v3 & 14, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

