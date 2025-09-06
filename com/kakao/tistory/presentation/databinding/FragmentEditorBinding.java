package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.toolbar.KeditorToolbar;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;

public abstract class FragmentEditorBinding extends ViewDataBinding {
    @NonNull
    public final KeditorToolbar editorKeditorToolbar;
    @NonNull
    public final KeditorView editorKeditorView;
    @Bindable
    protected DraftViewModel mDraftViewModel;
    @Bindable
    protected EditorViewModel mViewModel;

    public FragmentEditorBinding(Object object0, View view0, int v, KeditorToolbar keditorToolbar0, KeditorView keditorView0) {
        super(object0, view0, v);
        this.editorKeditorToolbar = keditorToolbar0;
        this.editorKeditorView = keditorView0;
    }

    public static FragmentEditorBinding bind(@NonNull View view0) {
        return FragmentEditorBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentEditorBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (FragmentEditorBinding)ViewDataBinding.bind(object0, view0, layout.fragment_editor);
    }

    @Nullable
    public DraftViewModel getDraftViewModel() {
        return this.mDraftViewModel;
    }

    @Nullable
    public EditorViewModel getViewModel() {
        return this.mViewModel;
    }

    @NonNull
    public static FragmentEditorBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return FragmentEditorBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return FragmentEditorBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (FragmentEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_editor, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static FragmentEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (FragmentEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_editor, null, false, object0);
    }

    public abstract void setDraftViewModel(@Nullable DraftViewModel arg1);

    public abstract void setViewModel(@Nullable EditorViewModel arg1);
}

