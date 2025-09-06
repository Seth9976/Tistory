package com.kakao.tistory.presentation.view.editor;

import android.content.Context;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;

    public h4(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Context context0 = this.a.getContext();
        ToastUtils.show$default(ToastUtils.INSTANCE, context0, ((Number)object0).intValue(), 0, 0, 12, null);
        return Unit.INSTANCE;
    }
}

