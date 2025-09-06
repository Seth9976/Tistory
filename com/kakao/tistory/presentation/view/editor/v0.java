package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.presentation.view.common.bottomsheet.AccessibilityBottomDialogFragment;
import com.kakao.tistory.presentation.view.common.bottomsheet.AccessibilitySwipeItemType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function1 {
    public final EditorActivity a;

    public v0(EditorActivity editorActivity0) {
        this.a = editorActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DraftItem)object0), "draftItem");
        AccessibilityBottomDialogFragment accessibilityBottomDialogFragment0 = AccessibilityBottomDialogFragment.Companion.newInstance();
        accessibilityBottomDialogFragment0.setItems(CollectionsKt__CollectionsKt.mutableListOf(new AccessibilitySwipeItemType[]{AccessibilitySwipeItemType.DELETE}));
        accessibilityBottomDialogFragment0.setOnSelectedItem(new u0(this.a, ((DraftItem)object0)));
        accessibilityBottomDialogFragment0.show(this.a.getSupportFragmentManager(), "AccessibilityBottomDialogFragment");
        return Unit.INSTANCE;
    }
}

