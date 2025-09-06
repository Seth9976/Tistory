package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.DragState;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.KeditorImageGridLayout;

public abstract class KeActivityImageGridEditorBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keAddButton;
    @NonNull
    public final ImageView keClose;
    @NonNull
    public final ImageView keDeleteButton;
    @NonNull
    public final LinearLayout keImageGridEditorToolbar;
    @NonNull
    public final LinearLayout keImageGridEditorTop;
    @NonNull
    public final KeditorImageGridLayout keImageGridLayout;
    @NonNull
    public final ScrollView keImageGridScrollView;
    @NonNull
    public final TextView keOkButton;
    @NonNull
    public final ImageView keUpdateButton;
    @Bindable
    protected DragState mDragState;
    @Bindable
    protected EventFlow mFlow;
    @Bindable
    protected int mImageCount;
    @Bindable
    protected ImageGridItem mImageGridItem;
    @Bindable
    protected ImageGridViewModel mVm;

    public KeActivityImageGridEditorBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1, ImageView imageView2, LinearLayout linearLayout0, LinearLayout linearLayout1, KeditorImageGridLayout keditorImageGridLayout0, ScrollView scrollView0, TextView textView0, ImageView imageView3) {
        super(object0, view0, v);
        this.keAddButton = imageView0;
        this.keClose = imageView1;
        this.keDeleteButton = imageView2;
        this.keImageGridEditorToolbar = linearLayout0;
        this.keImageGridEditorTop = linearLayout1;
        this.keImageGridLayout = keditorImageGridLayout0;
        this.keImageGridScrollView = scrollView0;
        this.keOkButton = textView0;
        this.keUpdateButton = imageView3;
    }

    public static KeActivityImageGridEditorBinding bind(@NonNull View view0) {
        return KeActivityImageGridEditorBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeActivityImageGridEditorBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeActivityImageGridEditorBinding)ViewDataBinding.bind(object0, view0, layout.ke_activity_image_grid_editor);
    }

    @Nullable
    public DragState getDragState() {
        return this.mDragState;
    }

    @Nullable
    public EventFlow getFlow() {
        return this.mFlow;
    }

    public int getImageCount() {
        return this.mImageCount;
    }

    @Nullable
    public ImageGridItem getImageGridItem() {
        return this.mImageGridItem;
    }

    @Nullable
    public ImageGridViewModel getVm() {
        return this.mVm;
    }

    @NonNull
    public static KeActivityImageGridEditorBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeActivityImageGridEditorBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeActivityImageGridEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeActivityImageGridEditorBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeActivityImageGridEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeActivityImageGridEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_image_grid_editor, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeActivityImageGridEditorBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeActivityImageGridEditorBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_image_grid_editor, null, false, object0);
    }

    public abstract void setDragState(@Nullable DragState arg1);

    public abstract void setFlow(@Nullable EventFlow arg1);

    public abstract void setImageCount(int arg1);

    public abstract void setImageGridItem(@Nullable ImageGridItem arg1);

    public abstract void setVm(@Nullable ImageGridViewModel arg1);
}

