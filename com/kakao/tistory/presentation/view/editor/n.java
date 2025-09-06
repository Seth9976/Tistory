package com.kakao.tistory.presentation.view.editor;

import android.view.Window;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final Window a;
    public final DraftViewModel b;
    public final int c;
    public final int d;

    public n(Window window0, DraftViewModel draftViewModel0, int v, int v1) {
        this.a = window0;
        this.b = draftViewModel0;
        this.c = v;
        this.d = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        DraftBottomSheetKt.DraftBottomSheet(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

