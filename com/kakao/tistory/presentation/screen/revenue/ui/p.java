package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final MutableState a;
    public final MutableState b;

    public p(MutableState mutableState0, MutableState mutableState1) {
        this.a = mutableState0;
        this.b = mutableState1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextLayoutResult)object0), "textLayoutResult");
        if(((TextLayoutResult)object0).getDidOverflowWidth()) {
            TextStyle textStyle0 = RevenueViewKt.access$AutoSizeText$lambda$16(this.a);
            long v = RevenueViewKt.access$AutoSizeText$lambda$16(this.a).getFontSize-XSAIIZE();
            TextUnitKt.checkArithmetic--R2X_6o(v);
            TextStyle textStyle1 = TextStyle.copy-p1EtxEg$default(textStyle0, 0L, TextUnitKt.pack(v & 0xFF00000000L, ((float)(((double)TextUnit.getValue-impl(v)) * 0.9))), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFD, null);
            RevenueViewKt.access$AutoSizeText$lambda$17(this.a, textStyle1);
            return Unit.INSTANCE;
        }
        RevenueViewKt.access$AutoSizeText$lambda$20(this.b, true);
        return Unit.INSTANCE;
    }
}

