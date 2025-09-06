package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.plugin.itemspec.table.TableCellItem;
import com.kakao.keditor.plugin.itemspec.table.TableItem;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextBackgroundColorMenuBtnView;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextColorMenuBtnView;

public abstract class KeToolbarTableMenuBinding extends ViewDataBinding {
    @NonNull
    public final TextBackgroundColorMenuBtnView keBtnColorBackground;
    @NonNull
    public final TextColorMenuBtnView keBtnColorText;
    @NonNull
    public final ImageView keBtnDelete;
    @NonNull
    public final LinearLayout keBtnFont;
    @NonNull
    public final ImageView keBtnItalic;
    @NonNull
    public final ImageView keBtnLink;
    @NonNull
    public final ImageView keBtnSort;
    @NonNull
    public final ImageView keBtnStrike;
    @NonNull
    public final ImageView keBtnTableStyle;
    @NonNull
    public final ImageView keBtnUnderline;
    @Bindable
    protected OverlayCategory mActiveOverlayCategory;
    @Bindable
    protected Alignment mAlignment;
    @Bindable
    protected TableCellItem mCell;
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
    protected TableItem mTableItem;
    @Bindable
    protected ColorType mTextBackgroundColor;
    @Bindable
    protected ColorType mTextColor;
    @Bindable
    protected TextMenuClickListener mTextMenuListener;

    public KeToolbarTableMenuBinding(Object object0, View view0, int v, TextBackgroundColorMenuBtnView textBackgroundColorMenuBtnView0, TextColorMenuBtnView textColorMenuBtnView0, ImageView imageView0, LinearLayout linearLayout0, ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6) {
        super(object0, view0, v);
        this.keBtnColorBackground = textBackgroundColorMenuBtnView0;
        this.keBtnColorText = textColorMenuBtnView0;
        this.keBtnDelete = imageView0;
        this.keBtnFont = linearLayout0;
        this.keBtnItalic = imageView1;
        this.keBtnLink = imageView2;
        this.keBtnSort = imageView3;
        this.keBtnStrike = imageView4;
        this.keBtnTableStyle = imageView5;
        this.keBtnUnderline = imageView6;
    }

    public static KeToolbarTableMenuBinding bind(@NonNull View view0) {
        return KeToolbarTableMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarTableMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarTableMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_table_menu);
    }

    @Nullable
    public OverlayCategory getActiveOverlayCategory() {
        return this.mActiveOverlayCategory;
    }

    @Nullable
    public Alignment getAlignment() {
        return this.mAlignment;
    }

    @Nullable
    public TableCellItem getCell() {
        return this.mCell;
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
    public TableItem getTableItem() {
        return this.mTableItem;
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
    public static KeToolbarTableMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarTableMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarTableMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarTableMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarTableMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarTableMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_table_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarTableMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarTableMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_table_menu, null, false, object0);
    }

    public abstract void setActiveOverlayCategory(@Nullable OverlayCategory arg1);

    public abstract void setAlignment(@Nullable Alignment arg1);

    public abstract void setCell(@Nullable TableCellItem arg1);

    public abstract void setDisplayMenu(boolean arg1);

    public abstract void setFontStyle(@Nullable FontStyle arg1);

    public abstract void setIsActiveBold(boolean arg1);

    public abstract void setIsActiveItalic(boolean arg1);

    public abstract void setIsActiveLink(boolean arg1);

    public abstract void setIsActiveStrike(boolean arg1);

    public abstract void setIsActiveUnderLine(boolean arg1);

    public abstract void setTableItem(@Nullable TableItem arg1);

    public abstract void setTextBackgroundColor(@Nullable ColorType arg1);

    public abstract void setTextColor(@Nullable ColorType arg1);

    public abstract void setTextMenuListener(@Nullable TextMenuClickListener arg1);
}

