package com.kakao.keditor.databinding;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.string;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.plugin.itemspec.textlist.ListType;
import com.kakao.keditor.plugin.itemspec.textlist.TextListItem;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextBackgroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextForegroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory;
import com.kakao.keditor.toolbar.toolbaroverlay.text.BindingAdapter;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextBackgroundColorMenuBtnView;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextColorMenuBtnView;

public class KeToolbarListMenuBindingImpl extends KeToolbarListMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback75;
    @Nullable
    private final View.OnClickListener mCallback76;
    @Nullable
    private final View.OnClickListener mCallback77;
    @Nullable
    private final View.OnClickListener mCallback78;
    @Nullable
    private final View.OnClickListener mCallback79;
    @Nullable
    private final View.OnClickListener mCallback80;
    @Nullable
    private final View.OnClickListener mCallback81;
    @Nullable
    private final View.OnClickListener mCallback82;
    @Nullable
    private final View.OnClickListener mCallback83;
    @Nullable
    private final View.OnClickListener mCallback84;
    @Nullable
    private final View.OnClickListener mCallback85;
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @NonNull
    private final ImageView mboundView4;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarListMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 12, KeToolbarListMenuBindingImpl.sIncludes, KeToolbarListMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarListMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextBackgroundColorMenuBtnView)arr_object[9]), ((TextColorMenuBtnView)arr_object[8]), ((ImageView)arr_object[11]), ((ImageView)arr_object[5]), ((ImageView)arr_object[10]), ((ImageView)arr_object[3]), ((ImageView)arr_object[1]), ((ImageView)arr_object[2]), ((ImageView)arr_object[7]), ((ImageView)arr_object[6]));
        this.mDirtyFlags = -1L;
        this.keBtnColorBackground.setTag(null);
        this.keBtnColorText.setTag(null);
        this.keBtnFont.setTag(null);
        this.keBtnItalic.setTag(null);
        this.keBtnLink.setTag(null);
        this.keBtnListDecimal.setTag(null);
        this.keBtnListDisk.setTag(null);
        this.keBtnListSquare.setTag(null);
        this.keBtnStrike.setTag(null);
        this.keBtnUnderline.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.mboundView4 = (ImageView)arr_object[4];
        ((ImageView)arr_object[4]).setTag(null);
        this.setRootTag(view0);
        this.mCallback79 = new OnClickListener(this, 5);
        this.mCallback82 = new OnClickListener(this, 8);
        this.mCallback83 = new OnClickListener(this, 9);
        this.mCallback77 = new OnClickListener(this, 3);
        this.mCallback80 = new OnClickListener(this, 6);
        this.mCallback78 = new OnClickListener(this, 4);
        this.mCallback81 = new OnClickListener(this, 7);
        this.mCallback76 = new OnClickListener(this, 2);
        this.mCallback75 = new OnClickListener(this, 1);
        this.mCallback84 = new OnClickListener(this, 10);
        this.mCallback85 = new OnClickListener(this, 11);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                TextMenuClickListener textMenuClickListener0 = this.mTextMenuListener;
                if(textMenuClickListener0 != null) {
                    textMenuClickListener0.onListTypeClicked("disc");
                    return;
                }
                break;
            }
            case 2: {
                TextMenuClickListener textMenuClickListener1 = this.mTextMenuListener;
                if(textMenuClickListener1 != null) {
                    textMenuClickListener1.onListTypeClicked("circle");
                    return;
                }
                break;
            }
            case 3: {
                TextMenuClickListener textMenuClickListener2 = this.mTextMenuListener;
                if(textMenuClickListener2 != null) {
                    textMenuClickListener2.onListTypeClicked("decimal");
                    return;
                }
                break;
            }
            case 4: {
                TextMenuClickListener textMenuClickListener3 = this.mTextMenuListener;
                if(textMenuClickListener3 != null) {
                    textMenuClickListener3.onBoldClicked();
                    return;
                }
                break;
            }
            case 5: {
                TextMenuClickListener textMenuClickListener4 = this.mTextMenuListener;
                if(textMenuClickListener4 != null) {
                    textMenuClickListener4.onItalicClicked();
                    return;
                }
                break;
            }
            case 6: {
                TextMenuClickListener textMenuClickListener5 = this.mTextMenuListener;
                if(textMenuClickListener5 != null) {
                    textMenuClickListener5.onUnderlineClicked();
                    return;
                }
                break;
            }
            case 7: {
                TextMenuClickListener textMenuClickListener6 = this.mTextMenuListener;
                if(textMenuClickListener6 != null) {
                    textMenuClickListener6.onStrikeClicked();
                    return;
                }
                break;
            }
            case 8: {
                ColorType colorType0 = this.mTextColor;
                TextMenuClickListener textMenuClickListener7 = this.mTextMenuListener;
                if(textMenuClickListener7 != null) {
                    textMenuClickListener7.onColorPickerClicked(colorType0, 0);
                    return;
                }
                break;
            }
            case 9: {
                TextMenuClickListener textMenuClickListener8 = this.mTextMenuListener;
                ColorType colorType1 = this.mTextBackgroundColor;
                if(textMenuClickListener8 != null) {
                    textMenuClickListener8.onColorPickerClicked(colorType1, 1);
                    return;
                }
                break;
            }
            case 10: {
                TextMenuClickListener textMenuClickListener9 = this.mTextMenuListener;
                if(textMenuClickListener9 != null) {
                    textMenuClickListener9.onLinkTextClicked();
                    return;
                }
                break;
            }
            case 11: {
                TextMenuClickListener textMenuClickListener10 = this.mTextMenuListener;
                FontStyle fontStyle0 = this.mFontStyle;
                if(textMenuClickListener10 != null) {
                    textMenuClickListener10.onFontStyleClicked(fontStyle0);
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s12;
        int v18;
        String s11;
        int v15;
        String s10;
        boolean z20;
        int v13;
        int v11;
        String s9;
        String s8;
        String s7;
        String s6;
        String s5;
        boolean z19;
        int v3;
        boolean z18;
        boolean z17;
        boolean z16;
        boolean z15;
        String s4;
        boolean z14;
        String s3;
        boolean z13;
        boolean z12;
        String s2;
        long v2;
        boolean z10;
        String s1;
        String s;
        boolean z9;
        boolean z8;
        boolean z7;
        boolean z6;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        TextListItem textListItem0 = this.mListItem;
        OverlayCategory overlayCategory0 = this.mActiveOverlayCategory;
        ColorType colorType0 = this.mTextColor;
        boolean z = this.mIsActiveBold;
        boolean z1 = this.mDisplayMenu;
        ColorType colorType1 = this.mTextBackgroundColor;
        FontStyle fontStyle0 = this.mFontStyle;
        boolean z2 = this.mIsActiveLink;
        boolean z3 = this.mIsActiveItalic;
        boolean z4 = this.mIsActiveUnderLine;
        boolean z5 = this.mIsActiveStrike;
        int v1 = 0;
        if(Long.compare(v & 0x2001L, 0L) == 0) {
            z7 = false;
            z8 = false;
            z6 = false;
        }
        else {
            ListType listType0 = textListItem0 == null ? null : textListItem0.getListType();
            z6 = listType0 == ListType.DECIMAL;
            z7 = listType0 == ListType.CIRCLE;
            z8 = listType0 == ListType.DISC;
        }
        if(Long.compare(v & 8230L, 0L) == 0) {
            z12 = false;
            z14 = false;
            z13 = false;
            s3 = null;
            s4 = null;
        }
        else {
            if(Long.compare(v & 0x2006L, 0L) == 0) {
                z9 = false;
                s = null;
            }
            else {
                v |= (overlayCategory0 == TextForegroundColor.INSTANCE ? 0x4000L : 0x8000L);
                z9 = overlayCategory0 == TextForegroundColor.INSTANCE;
                s = this.keBtnColorText.getResources().getString((overlayCategory0 == TextForegroundColor.INSTANCE ? string.cd_unfold : string.cd_fold));
            }
            if((v & 0x2002L) == 0L) {
                s1 = s;
                z10 = false;
            }
            else {
                s1 = s;
                z10 = overlayCategory0 == com.kakao.keditor.toolbar.category.OverlayCategory.FontStyle.INSTANCE;
            }
            if(Long.compare(v & 0x2022L, 0L) == 0) {
                z12 = false;
                z13 = z9;
                s3 = null;
                z14 = z10;
            }
            else {
                boolean z11 = overlayCategory0 == TextBackgroundColor.INSTANCE;
                v |= (z11 ? 0x800000L : 0x400000L);
                if(z11) {
                    v2 = v;
                    s2 = this.keBtnColorBackground.getResources().getString(string.cd_fold);
                }
                else {
                    v2 = v;
                    s2 = this.keBtnColorBackground.getResources().getString(string.cd_unfold);
                }
                z12 = z11;
                z13 = z9;
                s3 = s2;
                z14 = z10;
                v = v2;
            }
            s4 = s1;
        }
        if(Long.compare(v & 0x2006L, 0L) == 0) {
            z15 = false;
        }
        else {
            z15 = colorType0 == null;
            if((v & 0x2004L) != 0L) {
                v = z15 ? v | 0x200000L : v | 0x100000L;
            }
            if((v & 0x2006L) != 0L) {
                v |= (z15 ? 0x8000000L : 0x4000000L);
            }
        }
        if(Long.compare(v & 0x2022L, 0L) == 0) {
            z16 = false;
        }
        else {
            z16 = colorType1 == null;
            v = z16 ? v | 0x80000L : v | 0x40000L;
            if((v & 0x2020L) != 0L) {
                v |= (z16 ? 0x2000000L : 0x1000000L);
            }
        }
        if(Long.compare(v & 0x2040L, 0L) == 0) {
            z18 = z7;
            v3 = 0;
            z17 = false;
        }
        else {
            z17 = fontStyle0 == null;
            v = z17 ? v | 0x20000L : v | 0x10000L;
            z18 = z7;
            v3 = fontStyle0 == null ? 0 : fontStyle0.getToolbarResId();
        }
        int v4 = Long.compare(v & 0x2080L, 0L);
        int v5 = Long.compare(v & 0x2100L, 0L);
        int v6 = Long.compare(v & 0x2400L, 0L);
        int v7 = Long.compare(v & 0x2800L, 0L);
        if((v & 0x4000000L) == 0L || colorType0 == null) {
            z19 = z8;
            s5 = null;
        }
        else {
            z19 = z8;
            s5 = colorType0.getDescription(this.getRoot().getContext());
        }
        if((v & 0x40000L) == 0L || colorType1 == null) {
            s6 = s5;
            s7 = null;
        }
        else {
            s6 = s5;
            s7 = colorType1.getDescription(this.getRoot().getContext());
        }
        if((v & 0x10000L) == 0L || fontStyle0 == null) {
            s8 = s7;
            s9 = null;
        }
        else {
            s8 = s7;
            s9 = fontStyle0.getDescription(this.getRoot().getContext());
        }
        int v8 = (v & 0x1000000L) == 0L ? 0 : this.getRoot().getContext().getColor((colorType1 == null ? 0 : colorType1.getColorRes()));
        int v9 = (v & 0x100000L) == 0L ? 0 : this.getRoot().getContext().getColor((colorType0 == null ? 0 : colorType0.getColorRes()));
        int v10 = Long.compare(v & 0x2040L, 0L);
        if(v10 == 0) {
            v11 = v9;
            s9 = null;
        }
        else if(z17) {
            v11 = v9;
            s9 = this.keBtnFont.getResources().getString(string.cd_unknown);
        }
        else {
            v11 = v9;
        }
        int v12 = Long.compare(v & 0x2022L, 0L);
        if(v12 == 0) {
            z20 = z6;
            v13 = v8;
            s10 = null;
        }
        else if(z16) {
            v13 = v8;
            z20 = z6;
            Context context0 = this.getRoot().getContext();
            s10 = ColorType.CLEAR.getDescription(context0);
        }
        else {
            z20 = z6;
            v13 = v8;
            s10 = s8;
        }
        int v14 = Long.compare(v & 0x2004L, 0L);
        if(v14 == 0) {
            v15 = 0;
        }
        else {
            if(z15) {
                v11 = 0xFF000000;
            }
            v15 = v11;
        }
        int v16 = Long.compare(v & 0x2020L, 0L);
        if(v16 == 0) {
            s11 = s9;
        }
        else if(z16) {
            s11 = s9;
            v1 = ViewDataBinding.getColorFromResource(this.keBtnColorBackground, 0x106000D);
        }
        else {
            s11 = s9;
            v1 = v13;
        }
        int v17 = Long.compare(v & 0x2006L, 0L);
        if(v17 == 0) {
            v18 = v10;
            s12 = null;
        }
        else if(z15) {
            v18 = v10;
            Context context1 = this.getRoot().getContext();
            s12 = ColorType.BLACK.getDescription(context1);
        }
        else {
            v18 = v10;
            s12 = s6;
        }
        if((v & 0x2002L) != 0L) {
            BindingAdapters.setSelected(this.keBtnColorBackground, z12);
            BindingAdapters.setSelected(this.keBtnColorText, z13);
            BindingAdapters.setSelected(this.keBtnFont, z14);
        }
        if(v16 != 0) {
            BindingAdapter.setColor(this.keBtnColorBackground, v1);
        }
        if((0x2000L & v) != 0L) {
            this.keBtnColorBackground.setOnClickListener(this.mCallback83);
            BindingAdapters.applyAccessibilityInfo(this.keBtnColorBackground, true, null, Boolean.FALSE);
            this.keBtnColorText.setOnClickListener(this.mCallback82);
            BindingAdapters.applyAccessibilityInfo(this.keBtnColorText, true, null, Boolean.FALSE);
            this.keBtnFont.setOnClickListener(this.mCallback85);
            String s13 = this.keBtnFont.getResources().getString(string.cd_text_style_select_font_hint);
            BindingAdapters.applyAccessibilityInfo(this.keBtnFont, true, s13, Boolean.FALSE);
            this.keBtnItalic.setOnClickListener(this.mCallback79);
            this.keBtnLink.setOnClickListener(this.mCallback84);
            this.keBtnListDecimal.setOnClickListener(this.mCallback77);
            this.keBtnListDisk.setOnClickListener(this.mCallback75);
            this.keBtnListSquare.setOnClickListener(this.mCallback76);
            this.keBtnStrike.setOnClickListener(this.mCallback81);
            this.keBtnUnderline.setOnClickListener(this.mCallback80);
            this.mboundView4.setOnClickListener(this.mCallback78);
        }
        if(v12 != 0) {
            String s14 = this.keBtnColorBackground.getResources().getString(string.cd_text_style_select_background);
            BindingAdapters.setContentDescriptionWith(this.keBtnColorBackground, s14, s10, s3);
        }
        if(v14 != 0) {
            BindingAdapter.setColor(this.keBtnColorText, v15);
        }
        if(v17 != 0) {
            String s15 = this.keBtnColorText.getResources().getString(string.cd_text_style_select_color);
            BindingAdapters.setContentDescriptionWith(this.keBtnColorText, s15, s12, s4);
        }
        if(v18 != 0) {
            BindingAdapters.setSrc(this.keBtnFont, v3);
            this.keBtnFont.setContentDescription(s11);
        }
        if(v5 != 0) {
            BindingAdapters.setSelected(this.keBtnItalic, z3);
        }
        if(v4 != 0) {
            BindingAdapters.setSelected(this.keBtnLink, z2);
        }
        if((v & 0x2001L) != 0L) {
            BindingAdapters.setSelected(this.keBtnListDecimal, z20);
            BindingAdapters.setSelected(this.keBtnListDisk, z19);
            BindingAdapters.setSelected(this.keBtnListSquare, z18);
        }
        if(v7 != 0) {
            BindingAdapters.setSelected(this.keBtnStrike, z5);
        }
        if(v6 != 0) {
            BindingAdapters.setSelected(this.keBtnUnderline, z4);
        }
        if((0x2010L & v) != 0L) {
            BindingAdapters.goneUnless(this.mboundView0, Boolean.valueOf(z1));
        }
        if((v & 8200L) != 0L) {
            BindingAdapters.setSelected(this.mboundView4, z);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.mDirtyFlags != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.mDirtyFlags = 0x2000L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setActiveCategory(@Nullable ToolbarCategory toolbarCategory0) {
        this.mActiveCategory = toolbarCategory0;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setActiveOverlayCategory(@Nullable OverlayCategory overlayCategory0) {
        this.mActiveOverlayCategory = overlayCategory0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.activeOverlayCategory);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 16L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setFontStyle(@Nullable FontStyle fontStyle0) {
        this.mFontStyle = fontStyle0;
        synchronized(this) {
            this.mDirtyFlags |= 0x40L;
        }
        this.notifyPropertyChanged(BR.fontStyle);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setIsActiveBold(boolean z) {
        this.mIsActiveBold = z;
        synchronized(this) {
            this.mDirtyFlags |= 8L;
        }
        this.notifyPropertyChanged(BR.isActiveBold);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setIsActiveItalic(boolean z) {
        this.mIsActiveItalic = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x100L;
        }
        this.notifyPropertyChanged(BR.isActiveItalic);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setIsActiveLink(boolean z) {
        this.mIsActiveLink = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x80L;
        }
        this.notifyPropertyChanged(BR.isActiveLink);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setIsActiveStrike(boolean z) {
        this.mIsActiveStrike = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x800L;
        }
        this.notifyPropertyChanged(BR.isActiveStrike);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setIsActiveUnderLine(boolean z) {
        this.mIsActiveUnderLine = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x400L;
        }
        this.notifyPropertyChanged(BR.isActiveUnderLine);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setListItem(@Nullable TextListItem textListItem0) {
        this.mListItem = textListItem0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.listItem);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setTextBackgroundColor(@Nullable ColorType colorType0) {
        this.mTextBackgroundColor = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 0x20L;
        }
        this.notifyPropertyChanged(BR.textBackgroundColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setTextColor(@Nullable ColorType colorType0) {
        this.mTextColor = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.textColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarListMenuBinding
    public void setTextMenuListener(@Nullable TextMenuClickListener textMenuClickListener0) {
        this.mTextMenuListener = textMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 0x200L;
        }
        this.notifyPropertyChanged(BR.textMenuListener);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.listItem == v) {
            this.setListItem(((TextListItem)object0));
            return true;
        }
        if(BR.activeOverlayCategory == v) {
            this.setActiveOverlayCategory(((OverlayCategory)object0));
            return true;
        }
        if(BR.textColor == v) {
            this.setTextColor(((ColorType)object0));
            return true;
        }
        if(BR.isActiveBold == v) {
            this.setIsActiveBold(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.textBackgroundColor == v) {
            this.setTextBackgroundColor(((ColorType)object0));
            return true;
        }
        if(BR.fontStyle == v) {
            this.setFontStyle(((FontStyle)object0));
            return true;
        }
        if(BR.isActiveLink == v) {
            this.setIsActiveLink(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.isActiveItalic == v) {
            this.setIsActiveItalic(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.textMenuListener == v) {
            this.setTextMenuListener(((TextMenuClickListener)object0));
            return true;
        }
        if(BR.isActiveUnderLine == v) {
            this.setIsActiveUnderLine(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.isActiveStrike == v) {
            this.setIsActiveStrike(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.activeCategory == v) {
            this.setActiveCategory(((ToolbarCategory)object0));
            return true;
        }
        return false;
    }
}

