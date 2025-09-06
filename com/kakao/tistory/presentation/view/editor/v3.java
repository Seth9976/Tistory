package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import c;
import com.kakao.tistory.domain.blog.entity.EntryCategoryVisibilityType;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v3 extends Lambda implements Function3 {
    public final EditorSettingFragment a;
    public final EntryVisibilityType b;
    public final int c;
    public final EditorViewModel d;

    public v3(EditorSettingFragment editorSettingFragment0, EntryVisibilityType entryVisibilityType0, int v, EditorViewModel editorViewModel0) {
        this.a = editorSettingFragment0;
        this.b = entryVisibilityType0;
        this.c = v;
        this.d = editorViewModel0;
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
            ComposerKt.traceEventStart(0xB1F473AE, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.VisibilitySelector.<anonymous> (EditorSettingFragment.kt:329)");
        }
        EditorSettingFragment.access$TitleText(this.a, string.label_editor_setting_visibility, ((Composer)object1), 0x40);
        SpacerKt.Spacer(RowScope.weight$default(((RowScope)object0), Modifier.Companion, 1.0f, false, 2, null), ((Composer)object1), 0);
        EditorSettingFragment.access$VisibilityItem(this.a, string.label_entry_visibility_public, drawable.ic_list_public_on, drawable.ic_list_public, this.b == EntryVisibilityType.PUBLIC, this.c != EntryCategoryVisibilityType.PRIVATE.getValue(), new s3(this.d), ((Composer)object1), 0x200000);
        c.a(24.0f, Modifier.Companion, ((Composer)object1), 6);
        EditorSettingFragment.access$VisibilityItem(this.a, string.label_entry_visibility_protect, drawable.ic_list_private_on, drawable.ic_list_private, this.b == EntryVisibilityType.PROTECTED, this.c != EntryCategoryVisibilityType.PRIVATE.getValue(), new t3(this.d), ((Composer)object1), 0x200000);
        c.a(22.0f, Modifier.Companion, ((Composer)object1), 6);
        EditorSettingFragment.access$VisibilityItem(this.a, string.label_entry_visibility_private, drawable.ic_list_invisible_on, drawable.ic_list_invisible, this.b == EntryVisibilityType.PRIVATE, true, new u3(this.d), ((Composer)object1), 0x206000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

