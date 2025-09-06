package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.codeblock.CodeBlockItem;
import com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener;

public abstract class KeToolbarCodeBlockMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnDelete;
    @NonNull
    public final ImageView keBtnEditCodeBlock;
    @Bindable
    protected CodeBlockItem mCodeBlock;
    @Bindable
    protected CodeMenuClickListener mCodeMenuListener;
    @Bindable
    protected boolean mDisplayMenu;

    public KeToolbarCodeBlockMenuBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1) {
        super(object0, view0, v);
        this.keBtnDelete = imageView0;
        this.keBtnEditCodeBlock = imageView1;
    }

    public static KeToolbarCodeBlockMenuBinding bind(@NonNull View view0) {
        return KeToolbarCodeBlockMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarCodeBlockMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarCodeBlockMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_code_block_menu);
    }

    @Nullable
    public CodeBlockItem getCodeBlock() {
        return this.mCodeBlock;
    }

    @Nullable
    public CodeMenuClickListener getCodeMenuListener() {
        return this.mCodeMenuListener;
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @NonNull
    public static KeToolbarCodeBlockMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarCodeBlockMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarCodeBlockMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarCodeBlockMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarCodeBlockMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarCodeBlockMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_code_block_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarCodeBlockMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarCodeBlockMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_code_block_menu, null, false, object0);
    }

    public abstract void setCodeBlock(@Nullable CodeBlockItem arg1);

    public abstract void setCodeMenuListener(@Nullable CodeMenuClickListener arg1);

    public abstract void setDisplayMenu(boolean arg1);
}

