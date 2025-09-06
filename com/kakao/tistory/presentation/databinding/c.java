package com.kakao.tistory.presentation.databinding;

import androidx.databinding.InverseBindingListener;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;

public final class c implements InverseBindingListener {
    public final LayoutEditorTitleBindingImpl a;

    public c(LayoutEditorTitleBindingImpl layoutEditorTitleBindingImpl0) {
        this.a = layoutEditorTitleBindingImpl0;
        super();
    }

    @Override  // androidx.databinding.InverseBindingListener
    public final void onChange() {
        String s = TextViewBindingAdapter.getTextString(this.a.editorTitle);
        EditorViewModel editorViewModel0 = this.a.mViewModel;
        if(editorViewModel0 != null) {
            MutableLiveData mutableLiveData0 = editorViewModel0.getTitleString();
            if(mutableLiveData0 != null) {
                mutableLiveData0.setValue(s);
            }
        }
    }
}

