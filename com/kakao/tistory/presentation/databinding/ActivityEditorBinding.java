package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;

public abstract class ActivityEditorBinding extends ViewDataBinding {
    @NonNull
    public final ComposeView editorDraftDialog;
    @NonNull
    public final FrameLayout editorSettingFragmentContainer;
    @NonNull
    public final Toolbar editorToolbar;
    @NonNull
    public final AppCompatButton editorToolbarCompleteButton;
    @NonNull
    public final View editorToolbarDraftBar;
    @NonNull
    public final AppCompatButton editorToolbarDraftButton;
    @NonNull
    public final AppCompatButton editorToolbarDraftCountButton;
    @NonNull
    public final ConstraintLayout editorToolbarDraftLayout;
    @NonNull
    public final ImageButton editorToolbarHomeAsCloseButton;
    @NonNull
    public final TextView editorToolbarTitle;
    @Bindable
    protected DraftViewModel mDraftViewModel;
    @Bindable
    protected EditorViewModel mViewModel;

    public ActivityEditorBinding(Object object0, View view0, int v, ComposeView composeView0, FrameLayout frameLayout0, Toolbar toolbar0, AppCompatButton appCompatButton0, View view1, AppCompatButton appCompatButton1, AppCompatButton appCompatButton2, ConstraintLayout constraintLayout0, ImageButton imageButton0, TextView textView0) {
        super(object0, view0, v);
        this.editorDraftDialog = composeView0;
        this.editorSettingFragmentContainer = frameLayout0;
        this.editorToolbar = toolbar0;
        this.editorToolbarCompleteButton = appCompatButton0;
        this.editorToolbarDraftBar = view1;
        this.editorToolbarDraftButton = appCompatButton1;
        this.editorToolbarDraftCountButton = appCompatButton2;
        this.editorToolbarDraftLayout = constraintLayout0;
        this.editorToolbarHomeAsCloseButton = imageButton0;
        this.editorToolbarTitle = textView0;
    }

    public static ActivityEditorBinding bind(@NonNull View view0) {
        return ActivityEditorBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityEditorBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ActivityEditorBinding)ViewDataBinding.bind(object0, view0, layout.activity_editor);
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
    public static ActivityEditorBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ActivityEditorBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ActivityEditorBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ActivityEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_editor, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ActivityEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ActivityEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_editor, null, false, object0);
    }

    public abstract void setDraftViewModel(@Nullable DraftViewModel arg1);

    public abstract void setViewModel(@Nullable EditorViewModel arg1);
}

