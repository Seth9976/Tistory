package com.kakao.tistory.presentation.databinding;

import androidx.databinding.InverseBindingListener;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.viewmodel.ProtectedEntryDialogViewModel;

public final class a implements InverseBindingListener {
    public final DialogEntryPasswordBindingImpl a;

    public a(DialogEntryPasswordBindingImpl dialogEntryPasswordBindingImpl0) {
        this.a = dialogEntryPasswordBindingImpl0;
        super();
    }

    @Override  // androidx.databinding.InverseBindingListener
    public final void onChange() {
        String s = TextViewBindingAdapter.getTextString(this.a.commonProtectedEntryDialogEditText);
        ProtectedEntryDialogViewModel protectedEntryDialogViewModel0 = this.a.mViewModel;
        if(protectedEntryDialogViewModel0 != null) {
            MutableLiveData mutableLiveData0 = protectedEntryDialogViewModel0.getPassword();
            if(mutableLiveData0 != null) {
                mutableLiveData0.setValue(s);
            }
        }
    }
}

