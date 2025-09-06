package com.kakao.keditor.plugin.pluginspec.imagegrid.editor;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;

public final class a implements ActivityResultCallback {
    public final int a;
    public final ImageGridEditorActivity b;

    public a(ImageGridEditorActivity imageGridEditorActivity0, int v) {
        this.a = v;
        this.b = imageGridEditorActivity0;
        super();
    }

    @Override  // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object object0) {
        switch(this.a) {
            case 0: {
                ImageGridEditorActivity.g(this.b, ((ActivityResult)object0));
                return;
            }
            case 1: {
                ImageGridEditorActivity.h(this.b, ((ActivityResult)object0));
                return;
            }
            case 2: {
                com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridEditorActivity.cellEditorOpener.1.cellEditorResultLauncher$lambda$1(this.b, ((ActivityResult)object0));
                return;
            }
            default: {
                com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridEditorActivity.cellPickerOpener.1.cellPickerResultLauncher$lambda$1(this.b, ((ActivityResult)object0));
            }
        }
    }
}

