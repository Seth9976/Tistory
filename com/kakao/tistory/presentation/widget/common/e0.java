package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import com.kakao.tistory.presentation.R.color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function2 {
    public final Modifier a;
    public final int b;
    public final TextFieldValue c;
    public final Function1 d;
    public final TextStyle e;
    public final KeyboardOptions f;
    public final KeyboardActions g;
    public final VisualTransformation h;
    public final MutableInteractionSource i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final State m;
    public final Integer n;
    public final Integer o;
    public final boolean p;
    public final Function0 q;
    public final String r;
    public final int s;

    public e0(Modifier modifier0, int v, TextFieldValue textFieldValue0, Function1 function10, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, VisualTransformation visualTransformation0, MutableInteractionSource mutableInteractionSource0, String s, boolean z, boolean z1, State state0, Integer integer0, Integer integer1, boolean z2, Function0 function00, String s1, int v1) {
        this.a = modifier0;
        this.b = v;
        this.c = textFieldValue0;
        this.d = function10;
        this.e = textStyle0;
        this.f = keyboardOptions0;
        this.g = keyboardActions0;
        this.h = visualTransformation0;
        this.i = mutableInteractionSource0;
        this.j = s;
        this.k = z;
        this.l = z1;
        this.m = state0;
        this.n = integer0;
        this.o = integer1;
        this.p = z2;
        this.q = function00;
        this.r = s1;
        this.s = v1;
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
            ComposerKt.traceEventStart(0xF9FFF5BE, v, -1, "com.kakao.tistory.presentation.widget.common.CommonTextField.<anonymous> (CommonTextField.kt:73)");
        }
        Modifier modifier0 = SizeKt.fillMaxWidth$default(this.a, 0.0f, 1, null);
        SolidColor solidColor0 = new SolidColor(ColorResources_androidKt.colorResource(color.gray1, ((Composer)object0), 0), null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(611045064, true, new d0(this.c, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s), ((Composer)object0), 54);
        BasicTextFieldKt.BasicTextField(this.c, this.d, modifier0, false, false, this.e, this.f, this.g, this.b == 1, this.b, 0, this.h, null, this.i, solidColor0, composableLambda0, ((Composer)object0), 0, 0x30000, 5144);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

