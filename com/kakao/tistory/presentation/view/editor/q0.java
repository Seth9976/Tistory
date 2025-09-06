package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function1 {
    public final EditorActivity a;
    public final EditorViewModel b;

    public q0(EditorActivity editorActivity0, EditorViewModel editorViewModel0) {
        this.a = editorActivity0;
        this.b = editorViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Pair)object0), "it");
        EntryItem entryItem0 = (EntryItem)((Pair)object0).component1();
        this.a.setResult(-1);
        NavigatorExtensionKt.goToEntryView(this.a, this.b.getBlogName(), entryItem0.getId(), entryItem0.getPassword(), ((ChallengeResult)((Pair)object0).component2()), 0x20000);
        this.a.finish();
        return Unit.INSTANCE;
    }
}

