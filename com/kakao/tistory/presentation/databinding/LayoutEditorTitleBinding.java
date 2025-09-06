package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;

public abstract class LayoutEditorTitleBinding extends ViewDataBinding {
    @NonNull
    public final EditText editorTitle;
    @Bindable
    protected EditorViewModel mViewModel;

    public LayoutEditorTitleBinding(Object object0, View view0, int v, EditText editText0) {
        super(object0, view0, v);
        this.editorTitle = editText0;
    }

    public static LayoutEditorTitleBinding bind(@NonNull View view0) {
        return LayoutEditorTitleBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutEditorTitleBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (LayoutEditorTitleBinding)ViewDataBinding.bind(object0, view0, layout.layout_editor_title);
    }

    @Nullable
    public EditorViewModel getViewModel() {
        return this.mViewModel;
    }

    @NonNull
    public static LayoutEditorTitleBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return LayoutEditorTitleBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutEditorTitleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return LayoutEditorTitleBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutEditorTitleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (LayoutEditorTitleBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.layout_editor_title, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static LayoutEditorTitleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (LayoutEditorTitleBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.layout_editor_title, null, false, object0);
    }

    public abstract void setViewModel(@Nullable EditorViewModel arg1);
}

