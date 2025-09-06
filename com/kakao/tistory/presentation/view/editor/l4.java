package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogFragment;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;
    public final EditorViewModel b;

    public l4(EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0) {
        this.a = editorSettingFragment0;
        this.b = editorViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DaumCategoryDialogFragment daumCategoryDialogFragment0 = DaumCategoryDialogFragment.Companion.newInstance((((DaumLikeItem)object0) == null ? -3 : ((DaumLikeItem)object0).getId()));
        daumCategoryDialogFragment0.setOnSelectedItem(new k4(this.b));
        daumCategoryDialogFragment0.show(this.a.requireActivity().getSupportFragmentManager(), "BlogCategoryDialogFragment");
        return Unit.INSTANCE;
    }
}

