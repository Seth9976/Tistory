package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function3 {
    public final TextFieldValue a;
    public final String b;
    public final TextStyle c;
    public final String d;

    public f0(TextFieldValue textFieldValue0, String s, TextStyle textStyle0, String s1) {
        this.a = textFieldValue0;
        this.b = s;
        this.c = textStyle0;
        this.d = s1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((Function2)object0), "innerTextField");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9C62C15A, v, -1, "com.kakao.tistory.presentation.view.entry.widget.TextFieldWithMention.<anonymous> (CommentEditField.kt:381)");
        }
        ((Composer)object1).startReplaceGroup(0x130F3F20);
        if(this.a.getText().length() == 0 && (this.b == null || this.b.length() == 0)) {
            long v2 = ColorResources_androidKt.colorResource(color.gray7, ((Composer)object1), 0);
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(this.c, v2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
            v1 = v;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(this.d, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, ((Composer)object1), 0, 0xC00, 0x1DFFE);
        }
        else {
            v1 = v;
        }
        ((Composer)object1).endReplaceGroup();
        ((Function2)object0).invoke(((Composer)object1), ((int)(v1 & 14)));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

