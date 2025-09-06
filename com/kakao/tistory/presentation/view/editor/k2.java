package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k2 extends Lambda implements Function2 {
    public final EditorSettingFragment a;
    public final Modifier b;
    public final Date c;
    public final DateTimeFormat d;
    public final Function0 e;
    public final int f;
    public final int g;

    public k2(EditorSettingFragment editorSettingFragment0, Modifier modifier0, Date date0, DateTimeFormat dateUtils$DateTimeFormat0, Function0 function00, int v, int v1) {
        this.a = editorSettingFragment0;
        this.b = modifier0;
        this.c = date0;
        this.d = dateUtils$DateTimeFormat0;
        this.e = function00;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

