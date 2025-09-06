package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.presentation.view.common.bottomsheet.AccessibilitySwipeItemType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function1 {
    public final EditorActivity a;
    public final DraftItem b;

    public u0(EditorActivity editorActivity0, DraftItem draftItem0) {
        this.a = editorActivity0;
        this.b = draftItem0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((AccessibilitySwipeItemType)object0), "it");
        EditorActivity.access$getDraftViewModel(this.a).onClickDelete(this.b);
        return Unit.INSTANCE;
    }
}

