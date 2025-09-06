package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.view.bottomsheet.ImageSettingDialogFragment;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;
    public final EditorViewModel b;

    public n4(EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0) {
        this.a = editorSettingFragment0;
        this.b = editorViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        ImageSettingDialogFragment imageSettingDialogFragment0 = ImageSettingDialogFragment.Companion.newInstance();
        imageSettingDialogFragment0.setOnSelectedItem(new m4(this.b));
        imageSettingDialogFragment0.show(this.a.getChildFragmentManager(), "ImageSettingDialogFragment");
        return Unit.INSTANCE;
    }
}

