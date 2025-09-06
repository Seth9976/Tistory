package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m3 extends Lambda implements Function2 {
    public final EditorSettingFragment a;
    public final Modifier b;
    public final EditorViewModel c;
    public final int d;
    public final int e;

    public m3(EditorSettingFragment editorSettingFragment0, Modifier modifier0, EditorViewModel editorViewModel0, int v, int v1) {
        this.a = editorSettingFragment0;
        this.b = modifier0;
        this.c = editorViewModel0;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.TitleAndTagContainer(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

