package com.kakao.keditor.plugin.pluginspec.codeblock.editor;

import androidx.lifecycle.Observer;
import java.util.ArrayList;

public final class b implements Observer {
    public final int a;
    public final CodeBlockEditorActivity b;

    public b(CodeBlockEditorActivity codeBlockEditorActivity0, int v) {
        this.a = v;
        this.b = codeBlockEditorActivity0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(this.a != 0) {
            CodeBlockEditorActivity.initViewModel$lambda$7(this.b, ((String)object0));
            return;
        }
        CodeBlockEditorActivity.initViewModel$lambda$6(this.b, ((ArrayList)object0));
    }
}

