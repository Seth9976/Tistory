package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e6 extends Lambda implements Function1 {
    public final EditorViewModel a;
    public final EditorTagFragment b;

    public e6(EditorViewModel editorViewModel0, EditorTagFragment editorTagFragment0) {
        this.a = editorViewModel0;
        this.b = editorTagFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        List list0 = EditorTagFragment.access$getEditorTagViewModel(this.b).getCompleteTagList();
        this.a.updateTagList(list0);
        return Unit.INSTANCE;
    }
}

