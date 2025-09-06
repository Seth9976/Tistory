package com.kakao.tistory.presentation.view.editor;

import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r1 extends Lambda implements Function1 {
    public final EditorFragment a;

    public r1(EditorFragment editorFragment0) {
        this.a = editorFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        Object object1 = this.a.requireContext().getSystemService("input_method");
        InputMethodManager inputMethodManager0 = object1 instanceof InputMethodManager ? ((InputMethodManager)object1) : null;
        if(inputMethodManager0 != null) {
            inputMethodManager0.hideSoftInputFromWindow(EditorFragment.access$getDataBinding(this.a).editorKeditorView.getWindowToken(), 0);
        }
        EditorFragment.access$getDataBinding(this.a).editorKeditorView.clearFocus();
        return Unit.INSTANCE;
    }
}

