package com.kakao.tistory.presentation.view.editor;

import android.content.Context;
import android.view.View;
import com.google.android.material.datepicker.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v1 extends Lambda implements Function0 {
    public final EditorFragment a;

    public v1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(0);
    }

    public static final void a(EditorFragment editorFragment0, View view0) {
        Intrinsics.checkNotNullParameter(editorFragment0, "this$0");
        EditorFragment.access$getEditorViewModel(editorFragment0).cancelMediaUpload();
    }

    public final UploadProgressDialog a() {
        Context context0 = this.a.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        UploadProgressDialog uploadProgressDialog0 = new UploadProgressDialog(context0, new t(this.a, 17));
        uploadProgressDialog0.setCanceledOnTouchOutside(false);
        return uploadProgressDialog0;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a();
    }
}

