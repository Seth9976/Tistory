package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function3 {
    public final int a;
    public final int b;
    public final SlotMoreButtonColor c;

    public a1(int v, int v1, SlotMoreButtonColor slotMoreButtonColor0) {
        this.a = v;
        this.b = v1;
        this.c = slotMoreButtonColor0;
        super(3);
    }

    public final void a(RowScope rowScope0, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(rowScope0, "$this$RoundButton");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1412581041, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotMoreButton.<anonymous> (SlotMoreButton.kt:128)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_refresh, composer0, 0), null, null, 0L, composer0, 56, 12);
        TextStyle textStyle0 = TTextStyle.INSTANCE.getSize14Weight400();
        TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_home_slot_more, composer0, 0), PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 8.0f, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer0, 0x30, 0x180000, 0xFFFC);
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        annotatedString$Builder0.append(String.valueOf(this.b));
        int v1 = annotatedString$Builder0.pushStyle(new SpanStyle(this.c.getMaxTextColor-0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null));
        try {
            annotatedString$Builder0.append(" / " + this.a);
        }
        finally {
            annotatedString$Builder0.pop(v1);
        }
        TextKt.Text-IbK3jfQ(annotatedString$Builder0.toAnnotatedString(), SemanticKt.contentDescription(Modifier.Companion, new String[]{StringResources_androidKt.stringResource(string.content_desc_more_state, new Object[]{this.a, this.b}, composer0, 0x40)}, composer0, 6), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyle0, composer0, 0, 0xC00000, 0x1FFFC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        this.a(((RowScope)object0), ((Composer)object1), ((Number)object2).intValue());
        return Unit.INSTANCE;
    }
}

