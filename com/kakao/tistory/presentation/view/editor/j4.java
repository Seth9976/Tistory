package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogFragment;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j4 extends Lambda implements Function1 {
    public final EditorViewModel a;
    public final EditorSettingFragment b;

    public j4(EditorViewModel editorViewModel0, EditorSettingFragment editorSettingFragment0) {
        this.a = editorViewModel0;
        this.b = editorSettingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        BlogCategoryDialogFragment blogCategoryDialogFragment0 = BlogCategoryDialogFragment.Companion.newInstance(this.a.getSection(), this.a.getPage(), this.a.getBlogName(), ((Number)object0).intValue(), true);
        blogCategoryDialogFragment0.setOnSelectedItem(new i4(this.a));
        blogCategoryDialogFragment0.show(this.b.requireActivity().getSupportFragmentManager(), "BlogCategoryDialogFragment");
        return Unit.INSTANCE;
    }
}

