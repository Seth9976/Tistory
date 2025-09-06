package com.kakao.keditor.plugin.pluginspec.html.editor;

import androidx.lifecycle.Observer;
import com.kakao.keditor.plugin.itemspec.html.HtmlItem;
import com.kakao.keditor.plugin.pluginspec.html.editor.actions.Action;

public final class a implements Observer {
    public final int a;
    public final HtmlEditorActivity b;

    public a(HtmlEditorActivity htmlEditorActivity0, int v) {
        this.a = v;
        this.b = htmlEditorActivity0;
        super();
    }

    @Override  // androidx.lifecycle.Observer
    public final void onChanged(Object object0) {
        if(this.a != 0) {
            HtmlEditorActivity.initViewModel$lambda$5(this.b, ((Action)object0));
            return;
        }
        HtmlEditorActivity.initViewModel$lambda$3(this.b, ((HtmlItem)object0));
    }
}

