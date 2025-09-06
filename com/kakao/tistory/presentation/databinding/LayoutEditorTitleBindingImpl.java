package com.kakao.tistory.presentation.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.generated.callback.OnFocusChangeListener.Listener;
import com.kakao.tistory.presentation.generated.callback.OnFocusChangeListener;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;

public class LayoutEditorTitleBindingImpl extends LayoutEditorTitleBinding implements Listener {
    public final OnFocusChangeListener a;
    public final c b;
    public long c;

    public LayoutEditorTitleBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 2, null, null);
        super(dataBindingComponent0, view0, 1, ((EditText)arr_object[1]));
        this.b = new c(this);
        this.c = -1L;
        this.editorTitle.setTag(null);
        ((LinearLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.a = new OnFocusChangeListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.tistory.presentation.generated.callback.OnFocusChangeListener$Listener
    public final void _internalCallbackOnFocusChange(int v, View view0, boolean z) {
        EditorViewModel editorViewModel0 = this.mViewModel;
        if(editorViewModel0 != null) {
            editorViewModel0.onFocusChangeTitle(view0, z);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s;
        synchronized(this) {
            v = this.c;
            this.c = 0L;
        }
        EditorViewModel editorViewModel0 = this.mViewModel;
        int v1 = Long.compare(7L & v, 0L);
        if(v1 == 0) {
            s = null;
        }
        else {
            MutableLiveData mutableLiveData0 = editorViewModel0 == null ? null : editorViewModel0.getTitleString();
            this.updateLiveDataRegistration(0, mutableLiveData0);
            s = mutableLiveData0 == null ? null : ((String)mutableLiveData0.getValue());
        }
        if((v & 4L) != 0L) {
            this.editorTitle.setOnFocusChangeListener(this.a);
            TextViewBindingAdapter.setTextWatcher(this.editorTitle, null, null, null, this.b);
        }
        if(v1 != 0) {
            TextViewBindingAdapter.setText(this.editorTitle, s);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.c != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.c = 4L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        if(v != 0) {
            return false;
        }
        MutableLiveData mutableLiveData0 = (MutableLiveData)object0;
        if(v1 == BR._all) {
            synchronized(this) {
                this.c |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.viewModel == v) {
            this.setViewModel(((EditorViewModel)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.LayoutEditorTitleBinding
    public void setViewModel(@Nullable EditorViewModel editorViewModel0) {
        this.mViewModel = editorViewModel0;
        synchronized(this) {
            this.c |= 2L;
        }
        this.notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
}

