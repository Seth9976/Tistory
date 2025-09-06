package com.kakao.tistory.presentation.widget.common;

import android.content.Context;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.kakao.tistory.presentation.R.font;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final String a;
    public final Integer b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final Function1 g;

    public a(String s, Integer integer0, int v, int v1, float f, int v2, Function1 function10) {
        this.a = s;
        this.b = integer0;
        this.c = v;
        this.d = v1;
        this.e = f;
        this.f = v2;
        this.g = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Context)object0), "it");
        EditText editText0 = new EditText(((Context)object0));
        Integer integer0 = this.b;
        int v = this.c;
        int v1 = this.d;
        float f = this.e;
        int v2 = this.f;
        Function1 function10 = this.g;
        editText0.setFocusableInTouchMode(true);
        editText0.setPadding(0, 0, 0, 0);
        editText0.setIncludeFontPadding(false);
        editText0.setBackground(null);
        editText0.setText(this.a);
        if(integer0 != null) {
            editText0.setHint(integer0.intValue());
        }
        editText0.setTextColor(ContextCompat.getColor(((Context)object0), v));
        editText0.setHintTextColor(ContextCompat.getColor(((Context)object0), v1));
        editText0.setTextSize(1, f);
        editText0.setImeOptions(v2);
        editText0.setTypeface(ResourcesCompat.getFont(((Context)object0), font.font_pretendard_light));
        editText0.setSingleLine();
        function10.invoke(editText0);
        return editText0;
    }
}

