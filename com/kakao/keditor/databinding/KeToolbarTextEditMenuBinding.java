package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextBackgroundColorMenuBtnView;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextColorMenuBtnView;

public abstract class KeToolbarTextEditMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnBack;
    @NonNull
    public final ImageView keBtnBold;
    @NonNull
    public final ImageView keBtnCharacterSize;
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
    public final ImageView keBtnList;
    @NonNull
    public final ImageView keBtnQuote;
    @NonNull
    public final HorizontalScrollView keBtnScrollArea;
    @NonNull
    public final ImageView keBtnSort;
    @NonNull
    public final ImageView keBtnStrike;
    @NonNull
    public final ImageView keBtnType;
    @NonNull
    public final ImageView keBtnUnderline;
    @Bindable
    protected ToolbarCategory mActiveCategory;
    @Bindable
    protected OverlayCategory mActiveOverlayCategory;
    @Bindable
    protected Alignment mAlignment;
    @Bindable
    protected boolean mDisplayMenu;
    @Bindable
    protected FontStyle mFontStyle;
    @Bindable
    protected boolean mHasBlockQuoteItemSpec;
    @Bindable
    protected boolean mHasTextListItemSpec;
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
    protected boolean mIsTextSizeParagraphMode;
    @Bindable
    protected ParagraphStyle mParagraphStyle;
    @Bindable
    protected ColorType mTextBackgroundColor;
    @Bindable
    protected ColorType mTextColor;
    @Bindable
    protected TextMenuClickListener mTextMenuListener;
    @Bindable
    protected CharacterSize mTextSize;

    public KeToolbarTextEditMenuBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1, ImageView imageView2, TextBackgroundColorMenuBtnView textBackgroundColorMenuBtnView0, TextColorMenuBtnView textColorMenuBtnView0, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, HorizontalScrollView horizontalScrollView0, ImageView imageView8, ImageView imageView9, ImageView imageView10, ImageView imageView11) {
        super(object0, view0, v);
        this.keBtnBack = imageView0;
        this.keBtnBold = imageView1;
        this.keBtnCharacterSize = imageView2;
        this.keBtnColorBackground = textBackgroundColorMenuBtnView0;
        this.keBtnColorText = textColorMenuBtnView0;
        this.keBtnFont = imageView3;
        this.keBtnItalic = imageView4;
        this.keBtnLink = imageView5;
        this.keBtnList = imageView6;
        this.keBtnQuote = imageView7;
        this.keBtnScrollArea = horizontalScrollView0;
        this.keBtnSort = imageView8;
        this.keBtnStrike = imageView9;
        this.keBtnType = imageView10;
        this.keBtnUnderline = imageView11;
    }

    public static KeToolbarTextEditMenuBinding bind(@NonNull View view0) {
        return KeToolbarTextEditMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarTextEditMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarTextEditMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_text_edit_menu);
    }

    @Nullable
    public ToolbarCategory getActiveCategory() {
        return this.mActiveCategory;
    }

    @Nullable
    public OverlayCategory getActiveOverlayCategory() {
        return this.mActiveOverlayCategory;
    }

    @Nullable
    public Alignment getAlignment() {
        return this.mAlignment;
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @Nullable
    public FontStyle getFontStyle() {
        return this.mFontStyle;
    }

    public boolean getHasBlockQuoteItemSpec() {
        return this.mHasBlockQuoteItemSpec;
    }

    public boolean getHasTextListItemSpec() {
        return this.mHasTextListItemSpec;
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

    public boolean getIsTextSizeParagraphMode() {
        return this.mIsTextSizeParagraphMode;
    }

    @Nullable
    public ParagraphStyle getParagraphStyle() {
        return this.mParagraphStyle;
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

    @Nullable
    public CharacterSize getTextSize() {
        return this.mTextSize;
    }

    @NonNull
    public static KeToolbarTextEditMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarTextEditMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarTextEditMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarTextEditMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarTextEditMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarTextEditMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_text_edit_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarTextEditMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarTextEditMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_text_edit_menu, null, false, object0);
    }

    public abstract void setActiveCategory(@Nullable ToolbarCategory arg1);

    public abstract void setActiveOverlayCategory(@Nullable OverlayCategory arg1);

    public abstract void setAlignment(@Nullable Alignment arg1);

    public abstract void setDisplayMenu(boolean arg1);

    public abstract void setFontStyle(@Nullable FontStyle arg1);

    public abstract void setHasBlockQuoteItemSpec(boolean arg1);

    public abstract void setHasTextListItemSpec(boolean arg1);

    public abstract void setIsActiveBold(boolean arg1);

    public abstract void setIsActiveItalic(boolean arg1);

    public abstract void setIsActiveLink(boolean arg1);

    public abstract void setIsActiveStrike(boolean arg1);

    public abstract void setIsActiveUnderLine(boolean arg1);

    public abstract void setIsTextSizeParagraphMode(boolean arg1);

    public abstract void setParagraphStyle(@Nullable ParagraphStyle arg1);

    public abstract void setTextBackgroundColor(@Nullable ColorType arg1);

    public abstract void setTextColor(@Nullable ColorType arg1);

    public abstract void setTextMenuListener(@Nullable TextMenuClickListener arg1);

    public abstract void setTextSize(@Nullable CharacterSize arg1);
}

