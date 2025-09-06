package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e3 extends Lambda implements Function3 {
    public final EditorSettingFragment a;
    public final EditorViewModel b;

    public e3(EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0) {
        this.a = editorSettingFragment0;
        this.b = editorViewModel0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$ItemContainer");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA240FDCC, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.SettingScreen.<anonymous>.<anonymous> (EditorSettingFragment.kt:141)");
        }
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(((RowScope)object0), Modifier.Companion, 1.0f, false, 2, null), 0.0f, 0.0f, 20.0f, 0.0f, 11, null);
        this.a.TitleAndTagContainer(modifier0, this.b, ((Composer)object1), 0x240, 0);
        EditorSettingFragment.access$ThumbnailImage(this.a, this.b, ((Composer)object1), 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

