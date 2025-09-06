package com.kakao.tistory.presentation.view.editor;

import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.common.utils.PermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o4 extends Lambda implements Function1 {
    public final EditorSettingFragment a;

    public o4(EditorSettingFragment editorSettingFragment0) {
        this.a = editorSettingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        FragmentActivity fragmentActivity0 = this.a.getActivity();
        if(fragmentActivity0 != null) {
            EditorSettingFragment editorSettingFragment0 = this.a;
            PermissionUtils permissionUtils0 = PermissionUtils.INSTANCE;
            if(permissionUtils0.hasGalleryPermission(fragmentActivity0)) {
                EditorSettingFragment.access$goToPhotoPicker(editorSettingFragment0);
                return Unit.INSTANCE;
            }
            editorSettingFragment0.n.launch(PermissionUtils.getGalleryPermissions$default(permissionUtils0, false, 1, null));
        }
        return Unit.INSTANCE;
    }
}

