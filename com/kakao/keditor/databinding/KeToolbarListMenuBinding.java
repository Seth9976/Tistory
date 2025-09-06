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
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.plugin.itemspec.textlist.TextListItem;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextBackgroundColorMenuBtnView;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextColorMenuBtnView;

public abstract class KeToolbarListMenuBinding extends ViewDataBinding {
    @NonNull
    public final TextBackgroundColorMenuBtnView keBtnColorBackground;
    @NonNull
    public final TextColorMenuBtnView keBtnColorText;
    @NonNull
    public final ImageView keBtnFont;
    @NonNull
    public final ImageView keBtnItalic;
    @NonNull
    public final ImageView keBtnLink;
    @NonNull
    public final ImageView keBtnListDecimal;
    @NonNull
    public final ImageView keBtnListDisk;
    @NonNull
    public final ImageView keBtnListSquare;
    @NonNull
    public final ImageView keBtnStrike;
    @NonNull
    public final ImageView keBtnUnderline;
    @Bindable
    protected ToolbarCategory mActiveCategory;
    @Bindable
    protected OverlayCategory mActiveOverlayCategory;
    @Bindable
    protected boolean mDisplayMenu;
    @Bindable
    protected FontStyle mFontStyle;
    @Bindable
    protected boolean mIsActiveBold;
    @Bindable
    protected boolean mIsActiveItalic;
    @Bindable
    protected boolean mIsActiveLink;
    @Bindable
    protected boolean mIsActiveStrike;
    @Bindable
    protected boolean mIsActiveUnderLine;
    @Bindable
    protected TextListItem mListItem;
    @Bindable
    protected ColorType mTextBackgroundColor;
    @Bindable
    protected ColorType mTextColor;
    @Bindable
    protected TextMenuClickListener mTextMenuListener;

    public KeToolbarListMenuBinding(Object object0, View view0, int v, TextBackgroundColorMenuBtnView textBackgroundColorMenuBtnView0, TextColorMenuBtnView textColorMenuBtnView0, ImageView imageView0, ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7) {
        super(object0, view0, v);
        this.keBtnColorBackground = textBackgroundColorMenuBtnView0;
        this.keBtnColorText = textColorMenuBtnView0;
        this.keBtnFont = imageView0;
        this.keBtnItalic = imageView1;
        this.keBtnLink = imageView2;
        this.keBtnListDecimal = imageView3;
        this.keBtnListDisk = imageView4;
        this.keBtnListSquare = imageView5;
        this.keBtnStrike = imageView6;
        this.keBtnUnderline = imageView7;
    }

    public static KeToolbarListMenuBinding bind(@NonNull View view0) {
        return KeToolbarListMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarListMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarListMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_list_menu);
    }

    @Nullable
    public ToolbarCategory getActiveCategory() {
        return this.mActiveCategory;
    }

    @Nullable
    public OverlayCategory getActiveOverlayCategory() {
        return this.mActiveOverlayCategory;
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @Nullable
    public FontStyle getFontStyle() {
        return this.mFontStyle;
    }

    public boolean getIsActiveBold() {
        return this.mIsActiveBold;
    }

    public boolean getIsActiveItalic() {
        return this.mIsActiveItalic;
    }

    public boolean getIsActiveLink() {
        return this.mIsActiveLink;
    }

    public boolean getIsActiveStrike() {
        return this.mIsActiveStrike;
    }

    public boolean getIsActiveUnderLine() {
        return this.mIsActiveUnderLine;
    }

    @Nullable
    public TextListItem getListItem() {
        return this.mListItem;
    }

    @Nullable
    public ColorType getTextBackgroundColor() {
        return this.mTextBackgroundColor;
    }

    @Nullable
    public ColorType getTextColor() {
        return this.mTextColor;
    }

    @Nullable
    public TextMenuClickListener getTextMenuListener() {
        return this.mTextMenuListener;
    }

    @NonNull
    public static KeToolbarListMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarListMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarListMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarListMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarListMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarListMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_list_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarListMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarListMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_list_menu, null, false, object0);
    }

    public abstract void setActiveCategory(@Nullable ToolbarCategory arg1);

    public abstract void setActiveOverlayCategory(@Nullable OverlayCategory arg1);

    public abstract void setDisplayMenu(boolean arg1);

    public abstract void setFontStyle(@Nullable FontStyle arg1);

    public abstract void setIsActiveBold(boolean arg1);

    public abstract void setIsActiveItalic(boolean arg1);

    public abstract void setIsActiveLink(boolean arg1);

    public abstract void setIsActiveStrike(boolean arg1);

    public abstract void setIsActiveUnderLine(boolean arg1);

    public abstract void setListItem(@Nullable TextListItem arg1);

    public abstract void setTextBackgroundColor(@Nullable ColorType arg1);

    public abstract void setTextColor(@Nullable ColorType arg1);

    public abstract void setTextMenuListener(@Nullable TextMenuClickListener arg1);
}

