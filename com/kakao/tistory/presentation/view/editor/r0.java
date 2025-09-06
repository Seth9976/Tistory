package com.kakao.tistory.presentation.view.editor;

import com.kakao.android.base.utils.UiUtils;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel.EditorMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public r0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch((((EditorMode)object0) == null ? -1 : EditorActivity.initViewModel.1.8.WhenMappings.$EnumSwitchMapping$0[((EditorMode)object0).ordinal()])) {
            case 1: {
                UiUtils.INSTANCE.hideSoftInput(this.a);
                EditorActivity.access$removeFragment(this.a, this.a.o);
                EditorSettingFragment editorSettingFragment0 = EditorSettingFragment.Companion.newInstance();
                EditorActivity.access$addFragment(this.a, editorSettingFragment0, this.a.n);
                return Unit.INSTANCE;
            }
            case 2: {
                EditorActivity.access$removeFragment(this.a, this.a.n);
                return Unit.INSTANCE;
            }
            case 3: {
                EditorTagFragment editorTagFragment0 = EditorTagFragment.Companion.newInstance();
                EditorActivity.access$addFragment(this.a, editorTagFragment0, this.a.o);
                return Unit.INSTANCE;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
    }
}

