package com.kakao.keditor.plugin.pluginspec.codeblock.editor;

import android.view.View.OnClickListener;
import android.view.View;

public final class a implements View.OnClickListener {
    public final CodeBlockEditorActivity a;

    public a(CodeBlockEditorActivity codeBlockEditorActivity0) {
        this.a = codeBlockEditorActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CodeBlockEditorActivity.i(this.a, view0);
    }
}

