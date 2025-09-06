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
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItem;
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteType.Style1;
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteType.Style2;
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteType.Style3;
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteType;
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteTypeKt;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextBackgroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextForegroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory;
import com.kakao.keditor.toolbar.toolbaroverlay.text.BindingAdapter;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextBackgroundColorMenuBtnView;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextColorMenuBtnView;

public class KeToolbarBlockquoteMenuBindingImpl extends KeToolbarBlockquoteMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback17;
    @Nullable
    private final View.OnClickListener mCallback18;
    @Nullable
    private final View.OnClickListener mCallback19;
    @Nullable
    private final View.OnClickListener mCallback20;
    @Nullable
    private final View.OnClickListener mCallback21;
    @Nullable
    private final View.OnClickListener mCallback22;
    @Nullable
    private final View.OnClickListener mCallback23;
    @Nullable
    private final View.OnClickListener mCallback24;
    @Nullable
    private final View.OnClickListener mCallback25;
    @Nullable
    private final View.OnClickListener mCallback26;
    @Nullable
    private final View.OnClickListener mCallback27;
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @NonNull
    private final ImageView mboundView4;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarBlockquoteMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 12, KeToolbarBlockquoteMenuBindingImpl.sIncludes, KeToolbarBlockquoteMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarBlockquoteMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
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
        this.mCallback27 = new OnClickListener(this, 11);
        this.mCallback25 = new OnClickListener(this, 9);
        this.mCallback26 = new OnClickListener(this, 10);
        this.mCallback23 = new OnClickListener(this, 7);
        this.mCallback19 = new OnClickListener(this, 3);
        this.mCallback24 = new OnClickListener(this, 8);
        this.mCallback17 = new OnClickListener(this, 1);
        this.mCallback21 = new OnClickListener(this, 5);
        this.mCallback20 = new OnClickListener(this, 4);
        this.mCallback22 = new OnClickListener(this, 6);
        this.mCallback18 = new OnClickListener(this, 2);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                TextMenuClickListener textMenuClickListener0 = this.mTextMenuListener;
                if(textMenuClickListener0 != null) {
                    textMenuClickListener0.onBlockQuoteTypeClicked("style1");
                    return;
                }
                break;
            }
            case 2: {
                TextMenuClickListener textMenuClickListener1 = this.mTextMenuListener;
                if(textMenuClickListener1 != null) {
                    textMenuClickListener1.onBlockQuoteTypeClicked("style2");
                    return;
                }
                break;
            }
            case 3: {
                TextMenuClickListener textMenuClickListener2 = this.mTextMenuListener;
                if(textMenuClickListener2 != null) {
                    textMenuClickListener2.onBlockQuoteTypeClicked("style3");
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
        String s13;
        int v19;
        String s12;
        int v16;
        String s11;
        boolean z21;
        int v13;
        String s10;
        String s9;
        String s8;
        String s7;
        String s6;
        boolean z20;
        boolean z19;
        boolean z18;
        boolean z17;
        int v4;
        boolean z16;
        boolean z15;
        boolean z14;
        String s5;
        boolean z13;
        boolean z12;
        boolean z11;
        String s4;
        long v3;
        String s3;
        boolean z10;
        boolean z8;
        String s2;
        String s1;
        boolean z7;
        String s;
        long v2;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
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
        BlockQuoteItem blockQuoteItem0 = this.mBlockquote;
        int v1 = 0;
        if(Long.compare(v & 0x2013L, 0L) == 0) {
            v3 = v;
            z11 = false;
            z13 = false;
            z12 = false;
            s4 = null;
            s5 = null;
        }
        else {
            if(Long.compare(v & 0x2003L, 0L) == 0) {
                z7 = false;
                s1 = null;
            }
            else {
                boolean z6 = overlayCategory0 == TextForegroundColor.INSTANCE;
                v |= (z6 ? 0x8000L : 0x4000L);
                if(z6) {
                    v2 = v;
                    s = this.keBtnColorText.getResources().getString(string.cd_fold);
                }
                else {
                    v2 = v;
                    s = this.keBtnColorText.getResources().getString(string.cd_unfold);
                }
                z7 = z6;
                s1 = s;
                v = v2;
            }
            if((v & 0x2001L) == 0L) {
                s2 = s1;
                z8 = false;
            }
            else {
                s2 = s1;
                z8 = overlayCategory0 == com.kakao.keditor.toolbar.category.OverlayCategory.FontStyle.INSTANCE;
            }
            if(Long.compare(v & 8209L, 0L) == 0) {
                v3 = v;
                z11 = false;
                s4 = null;
            }
            else {
                boolean z9 = overlayCategory0 == TextBackgroundColor.INSTANCE;
                if(z9) {
                    z10 = true;
                    s3 = this.keBtnColorBackground.getResources().getString(string.cd_fold);
                }
                else {
                    z10 = false;
                    s3 = this.keBtnColorBackground.getResources().getString(string.cd_unfold);
                }
                v3 = v | (z9 ? 0x800000L : 0x400000L);
                s4 = s3;
                z11 = z10;
            }
            z12 = z7;
            z13 = z8;
            s5 = s2;
        }
        if(Long.compare(v3 & 0x2003L, 0L) == 0) {
            z14 = false;
        }
        else {
            z14 = colorType0 == null;
            if((v3 & 0x2002L) != 0L) {
                v3 = z14 ? v3 | 0x200000L : v3 | 0x100000L;
            }
            if((v3 & 0x2003L) != 0L) {
                v3 |= (z14 ? 0x8000000L : 0x4000000L);
            }
        }
        if(Long.compare(v3 & 8209L, 0L) == 0) {
            z15 = false;
        }
        else {
            z15 = colorType1 == null;
            v3 = z15 ? v3 | 0x80000L : v3 | 0x40000L;
            if((v3 & 0x2010L) != 0L) {
                v3 |= (z15 ? 0x2000000L : 0x1000000L);
            }
        }
        if(Long.compare(v3 & 0x2020L, 0L) == 0) {
            v4 = 0;
            z16 = false;
        }
        else {
            z16 = fontStyle0 == null;
            v3 = z16 ? v3 | 0x20000L : v3 | 0x10000L;
            v4 = fontStyle0 == null ? 0 : fontStyle0.getToolbarResId();
        }
        int v5 = Long.compare(v3 & 0x2040L, 0L);
        int v6 = Long.compare(v3 & 0x2080L, 0L);
        int v7 = Long.compare(v3 & 0x2200L, 0L);
        int v8 = Long.compare(v3 & 0x2400L, 0L);
        int v9 = Long.compare(v3 & 0x2800L, 0L);
        if(v9 == 0) {
            z18 = false;
            z19 = false;
            z17 = false;
        }
        else {
            BlockQuoteType blockQuoteType0 = BlockQuoteTypeKt.toBlockQuoteType((blockQuoteItem0 == null ? null : blockQuoteItem0.getStyle()));
            z17 = Style2.INSTANCE == blockQuoteType0;
            z18 = Style3.INSTANCE == blockQuoteType0;
            z19 = Style1.INSTANCE == blockQuoteType0;
        }
        if((v3 & 0x4000000L) == 0L || colorType0 == null) {
            z20 = z19;
            s6 = null;
        }
        else {
            z20 = z19;
            s6 = colorType0.getDescription(this.getRoot().getContext());
        }
        if((v3 & 0x40000L) == 0L || colorType1 == null) {
            s7 = s6;
            s8 = null;
        }
        else {
            s7 = s6;
            s8 = colorType1.getDescription(this.getRoot().getContext());
        }
        if((v3 & 0x10000L) == 0L || fontStyle0 == null) {
            s9 = s8;
            s10 = null;
        }
        else {
            s9 = s8;
            s10 = fontStyle0.getDescription(this.getRoot().getContext());
        }
        int v10 = (v3 & 0x1000000L) == 0L ? 0 : this.getRoot().getContext().getColor((colorType1 == null ? 0 : colorType1.getColorRes()));
        int v11 = (v3 & 0x100000L) == 0L ? 0 : this.getRoot().getContext().getColor((colorType0 == null ? 0 : colorType0.getColorRes()));
        int v12 = Long.compare(v3 & 0x2020L, 0L);
        if(v12 == 0) {
            v13 = v11;
            s10 = null;
        }
        else if(z16) {
            v13 = v11;
            s10 = this.keBtnFont.getResources().getString(string.cd_unknown);
        }
        else {
            v13 = v11;
        }
        int v14 = Long.compare(v3 & 8209L, 0L);
        if(v14 == 0) {
            z21 = z18;
            s11 = null;
        }
        else if(z15) {
            z21 = z18;
            Context context0 = this.getRoot().getContext();
            s11 = ColorType.CLEAR.getDescription(context0);
        }
        else {
            z21 = z18;
            s11 = s9;
        }
        int v15 = Long.compare(v3 & 0x2002L, 0L);
        if(v15 == 0) {
            v16 = 0;
        }
        else {
            v16 = z14 ? 0xFF000000 : v13;
        }
        int v17 = Long.compare(v3 & 0x2010L, 0L);
        if(v17 == 0) {
            s12 = s10;
        }
        else if(z15) {
            s12 = s10;
            v1 = ViewDataBinding.getColorFromResource(this.keBtnColorBackground, 0x106000D);
        }
        else {
            s12 = s10;
            v1 = v10;
        }
        int v18 = Long.compare(v3 & 0x2003L, 0L);
        if(v18 == 0) {
            v19 = v12;
            s13 = null;
        }
        else if(z14) {
            v19 = v12;
            Context context1 = this.getRoot().getContext();
            s13 = ColorType.BLACK.getDescription(context1);
        }
        else {
            v19 = v12;
            s13 = s7;
        }
        if((v3 & 0x2001L) != 0L) {
            BindingAdapters.setSelected(this.keBtnColorBackground, z11);
            BindingAdapters.setSelected(this.keBtnColorText, z12);
            BindingAdapters.setSelected(this.keBtnFont, z13);
        }
        if(v17 != 0) {
            BindingAdapter.setColor(this.keBtnColorBackground, v1);
        }
        if((v3 & 0x2000L) != 0L) {
            this.keBtnColorBackground.setOnClickListener(this.mCallback25);
            BindingAdapters.applyAccessibilityInfo(this.keBtnColorBackground, true, null, Boolean.FALSE);
            this.keBtnColorText.setOnClickListener(this.mCallback24);
            BindingAdapters.applyAccessibilityInfo(this.keBtnColorText, true, null, Boolean.FALSE);
            this.keBtnFont.setOnClickListener(this.mCallback27);
            String s14 = this.keBtnFont.getResources().getString(string.cd_text_style_select_font_hint);
            BindingAdapters.applyAccessibilityInfo(this.keBtnFont, true, s14, Boolean.FALSE);
            this.keBtnItalic.setOnClickListener(this.mCallback21);
            this.keBtnLink.setOnClickListener(this.mCallback26);
            this.keBtnListDecimal.setOnClickListener(this.mCallback19);
            this.keBtnListDisk.setOnClickListener(this.mCallback17);
            this.keBtnListSquare.setOnClickListener(this.mCallback18);
            this.keBtnStrike.setOnClickListener(this.mCallback23);
            this.keBtnUnderline.setOnClickListener(this.mCallback22);
            this.mboundView4.setOnClickListener(this.mCallback20);
        }
        if(v14 != 0) {
            String s15 = this.keBtnColorBackground.getResources().getString(string.cd_text_style_select_background);
            BindingAdapters.setContentDescriptionWith(this.keBtnColorBackground, s15, s11, s4);
        }
        if(v15 != 0) {
            BindingAdapter.setColor(this.keBtnColorText, v16);
        }
        if(v18 != 0) {
            String s16 = this.keBtnColorText.getResources().getString(string.cd_text_style_select_color);
            BindingAdapters.setContentDescriptionWith(this.keBtnColorText, s16, s13, s5);
        }
        if(v19 != 0) {
            BindingAdapters.setSrc(this.keBtnFont, v4);
            this.keBtnFont.setContentDescription(s12);
        }
        if(v6 != 0) {
            BindingAdapters.setSelected(this.keBtnItalic, z3);
        }
        if(v5 != 0) {
            BindingAdapters.setSelected(this.keBtnLink, z2);
        }
        if(v9 != 0) {
            BindingAdapters.setSelected(this.keBtnListDecimal, z21);
            BindingAdapters.setSelected(this.keBtnListDisk, z20);
            BindingAdapters.setSelected(this.keBtnListSquare, z17);
        }
        if(v8 != 0) {
            BindingAdapters.setSelected(this.keBtnStrike, z5);
        }
        if(v7 != 0) {
            BindingAdapters.setSelected(this.keBtnUnderline, z4);
        }
        if((8200L & v3) != 0L) {
            BindingAdapters.goneUnless(this.mboundView0, Boolean.valueOf(z1));
        }
        if((v3 & 0x2004L) != 0L) {
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

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setActiveCategory(@Nullable ToolbarCategory toolbarCategory0) {
        this.mActiveCategory = toolbarCategory0;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setActiveOverlayCategory(@Nullable OverlayCategory overlayCategory0) {
        this.mActiveOverlayCategory = overlayCategory0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.activeOverlayCategory);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setBlockquote(@Nullable BlockQuoteItem blockQuoteItem0) {
        this.mBlockquote = blockQuoteItem0;
        synchronized(this) {
            this.mDirtyFlags |= 0x800L;
        }
        this.notifyPropertyChanged(BR.blockquote);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 8L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setFontStyle(@Nullable FontStyle fontStyle0) {
        this.mFontStyle = fontStyle0;
        synchronized(this) {
            this.mDirtyFlags |= 0x20L;
        }
        this.notifyPropertyChanged(BR.fontStyle);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setIsActiveBold(boolean z) {
        this.mIsActiveBold = z;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.isActiveBold);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setIsActiveItalic(boolean z) {
        this.mIsActiveItalic = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x80L;
        }
        this.notifyPropertyChanged(BR.isActiveItalic);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setIsActiveLink(boolean z) {
        this.mIsActiveLink = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x40L;
        }
        this.notifyPropertyChanged(BR.isActiveLink);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setIsActiveStrike(boolean z) {
        this.mIsActiveStrike = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x400L;
        }
        this.notifyPropertyChanged(BR.isActiveStrike);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setIsActiveUnderLine(boolean z) {
        this.mIsActiveUnderLine = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x200L;
        }
        this.notifyPropertyChanged(BR.isActiveUnderLine);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setTextBackgroundColor(@Nullable ColorType colorType0) {
        this.mTextBackgroundColor = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 16L;
        }
        this.notifyPropertyChanged(BR.textBackgroundColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setTextColor(@Nullable ColorType colorType0) {
        this.mTextColor = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.textColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding
    public void setTextMenuListener(@Nullable TextMenuClickListener textMenuClickListener0) {
        this.mTextMenuListener = textMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 0x100L;
        }
        this.notifyPropertyChanged(BR.textMenuListener);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
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
        if(BR.blockquote == v) {
            this.setBlockquote(((BlockQuoteItem)object0));
            return true;
        }
        if(BR.activeCategory == v) {
            this.setActiveCategory(((ToolbarCategory)object0));
            return true;
        }
        return false;
    }
}

