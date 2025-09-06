package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.toolbar.KeditorToolbar;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;

public class FragmentEditorBindingImpl extends FragmentEditorBinding {
    public long a;
    public static final SparseIntArray b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        FragmentEditorBindingImpl.b = sparseIntArray0;
        sparseIntArray0.put(id.editor_keditor_view, 2);
    }

    public FragmentEditorBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, null, FragmentEditorBindingImpl.b);
        super(dataBindingComponent0, view0, 1, ((KeditorToolbar)arr_object[1]), ((KeditorView)arr_object[2]));
        this.a = -1L;
        this.editorKeditorToolbar.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.a;
            this.a = 0L;
        }
        Boolean boolean0 = null;
        EditorViewModel editorViewModel0 = this.mViewModel;
        int v1 = 0;
        if(Long.compare(v & 13L, 0L) != 0) {
            MutableLiveData mutableLiveData0 = editorViewModel0 == null ? null : editorViewModel0.getTitleFocus();
            this.updateLiveDataRegistration(0, mutableLiveData0);
            if(mutableLiveData0 != null) {
                boolean0 = (Boolean)mutableLiveData0.getValue();
            }
            boolean z = ViewDataBinding.safeUnbox(boolean0);
            v |= (z ? 0x20L : 16L);
            if(z) {
                v1 = 8;
            }
        }
        if((v & 13L) != 0L) {
            this.editorKeditorToolbar.setVisibility(v1);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.a != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.a = 8L;
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
                this.a |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.FragmentEditorBinding
    public void setDraftViewModel(@Nullable DraftViewModel draftViewModel0) {
        this.mDraftViewModel = draftViewModel0;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.draftViewModel == v) {
            this.setDraftViewModel(((DraftViewModel)object0));
            return true;
        }
        if(BR.viewModel == v) {
            this.setViewModel(((EditorViewModel)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.FragmentEditorBinding
    public void setViewModel(@Nullable EditorViewModel editorViewModel0) {
        this.mViewModel = editorViewModel0;
        synchronized(this) {
            this.a |= 4L;
        }
        this.notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
}

