package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w3 extends Lambda implements Function2 {
    public final EditorSettingFragment a;
    public final EditorViewModel b;
    public final EntryVisibilityType c;
    public final int d;
    public final int e;

    public w3(EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0, EntryVisibilityType entryVisibilityType0, int v, int v1) {
        this.a = editorSettingFragment0;
        this.b = editorViewModel0;
        this.c = entryVisibilityType0;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.a(this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

