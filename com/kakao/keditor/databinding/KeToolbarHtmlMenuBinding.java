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
import com.kakao.keditor.plugin.itemspec.html.HtmlItem;
import com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener;

public abstract class KeToolbarHtmlMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnDelete;
    @NonNull
    public final ImageView keBtnEditCodeBlock;
    @Bindable
    protected CodeMenuClickListener mCodeMenuListener;
    @Bindable
    protected boolean mDisplayMenu;
    @Bindable
    protected HtmlItem mHtml;

    public KeToolbarHtmlMenuBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1) {
        super(object0, view0, v);
        this.keBtnDelete = imageView0;
        this.keBtnEditCodeBlock = imageView1;
    }

    public static KeToolbarHtmlMenuBinding bind(@NonNull View view0) {
        return KeToolbarHtmlMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarHtmlMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarHtmlMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_html_menu);
    }

    @Nullable
    public CodeMenuClickListener getCodeMenuListener() {
        return this.mCodeMenuListener;
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @Nullable
    public HtmlItem getHtml() {
        return this.mHtml;
    }

    @NonNull
    public static KeToolbarHtmlMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarHtmlMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarHtmlMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarHtmlMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarHtmlMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarHtmlMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_html_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarHtmlMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarHtmlMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_html_menu, null, false, object0);
    }

    public abstract void setCodeMenuListener(@Nullable CodeMenuClickListener arg1);

    public abstract void setDisplayMenu(boolean arg1);

    public abstract void setHtml(@Nullable HtmlItem arg1);
}

