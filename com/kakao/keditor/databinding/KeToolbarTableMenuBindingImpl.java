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
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.plugin.itemspec.table.TableCellItem;
import com.kakao.keditor.plugin.itemspec.table.TableItem;
import com.kakao.keditor.plugin.itemspec.table.TableStyle;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextBackgroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextForegroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.toolbaroverlay.text.BindingAdapter;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextBackgroundColorMenuBtnView;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextColorMenuBtnView;

public class KeToolbarTableMenuBindingImpl extends KeToolbarTableMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback1;
    @Nullable
    private final View.OnClickListener mCallback10;
    @Nullable
    private final View.OnClickListener mCallback11;
    @Nullable
    private final View.OnClickListener mCallback2;
    @Nullable
    private final View.OnClickListener mCallback3;
    @Nullable
    private final View.OnClickListener mCallback4;
    @Nullable
    private final View.OnClickListener mCallback5;
    @Nullable
    private final View.OnClickListener mCallback6;
    @Nullable
    private final View.OnClickListener mCallback7;
    @Nullable
    private final View.OnClickListener mCallback8;
    @Nullable
    private final View.OnClickListener mCallback9;
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @NonNull
    private final ImageView mboundView1;
    @NonNull
    private final ImageView mboundView11;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarTableMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 13, KeToolbarTableMenuBindingImpl.sIncludes, KeToolbarTableMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarTableMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextBackgroundColorMenuBtnView)arr_object[6]), ((TextColorMenuBtnView)arr_object[5]), ((ImageView)arr_object[12]), ((LinearLayout)arr_object[10]), ((ImageView)arr_object[2]), ((ImageView)arr_object[9]), ((ImageView)arr_object[7]), ((ImageView)arr_object[4]), ((ImageView)arr_object[8]), ((ImageView)arr_object[3]));
        this.mDirtyFlags = -1L;
        this.keBtnColorBackground.setTag(null);
        this.keBtnColorText.setTag(null);
        this.keBtnDelete.setTag(null);
        this.keBtnFont.setTag(null);
        this.keBtnItalic.setTag(null);
        this.keBtnLink.setTag(null);
        this.keBtnSort.setTag(null);
        this.keBtnStrike.setTag(null);
        this.keBtnTableStyle.setTag(null);
        this.keBtnUnderline.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.mboundView1 = (ImageView)arr_object[1];
        ((ImageView)arr_object[1]).setTag(null);
        this.mboundView11 = (ImageView)arr_object[11];
        ((ImageView)arr_object[11]).setTag(null);
        this.setRootTag(view0);
        this.mCallback11 = new OnClickListener(this, 11);
        this.mCallback6 = new OnClickListener(this, 6);
        this.mCallback2 = new OnClickListener(this, 2);
        this.mCallback9 = new OnClickListener(this, 9);
        this.mCallback5 = new OnClickListener(this, 5);
        this.mCallback1 = new OnClickListener(this, 1);
        this.mCallback8 = new OnClickListener(this, 8);
        this.mCallback4 = new OnClickListener(this, 4);
        this.mCallback10 = new OnClickListener(this, 10);
        this.mCallback7 = new OnClickListener(this, 7);
        this.mCallback3 = new OnClickListener(this, 3);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                TextMenuClickListener textMenuClickListener0 = this.mTextMenuListener;
                if(textMenuClickListener0 != null) {
                    textMenuClickListener0.onBoldClicked();
                    return;
                }
                break;
            }
            case 2: {
                TextMenuClickListener textMenuClickListener1 = this.mTextMenuListener;
                if(textMenuClickListener1 != null) {
                    textMenuClickListener1.onItalicClicked();
                    return;
                }
                break;
            }
            case 3: {
                TextMenuClickListener textMenuClickListener2 = this.mTextMenuListener;
                if(textMenuClickListener2 != null) {
                    textMenuClickListener2.onUnderlineClicked();
                    return;
                }
                break;
            }
            case 4: {
                TextMenuClickListener textMenuClickListener3 = this.mTextMenuListener;
                if(textMenuClickListener3 != null) {
                    textMenuClickListener3.onStrikeClicked();
                    return;
                }
                break;
            }
            case 5: {
                ColorType colorType0 = this.mTextColor;
                TextMenuClickListener textMenuClickListener4 = this.mTextMenuListener;
                if(textMenuClickListener4 != null) {
                    textMenuClickListener4.onColorPickerClicked(colorType0, 0);
                    return;
                }
                break;
            }
            case 6: {
                TextMenuClickListener textMenuClickListener5 = this.mTextMenuListener;
                ColorType colorType1 = this.mTextBackgroundColor;
                if(textMenuClickListener5 != null) {
                    textMenuClickListener5.onColorPickerClicked(colorType1, 1);
                    return;
                }
                break;
            }
            case 7: {
                Alignment alignment0 = this.mAlignment;
                TextMenuClickListener textMenuClickListener6 = this.mTextMenuListener;
                if(textMenuClickListener6 != null) {
                    textMenuClickListener6.onAlignmentClicked(alignment0);
                    return;
                }
                break;
            }
            case 8: {
                TableItem tableItem0 = this.mTableItem;
                TextMenuClickListener textMenuClickListener7 = this.mTextMenuListener;
                if(textMenuClickListener7 != null && tableItem0 != null) {
                    TableStyle tableStyle0 = tableItem0.getStyle();
                    if(tableStyle0 != null) {
                        textMenuClickListener7.onTableStylePickerClicked(tableStyle0.getStyleName());
                        return;
                    }
                }
                break;
            }
            case 9: {
                TextMenuClickListener textMenuClickListener8 = this.mTextMenuListener;
                if(textMenuClickListener8 != null) {
                    textMenuClickListener8.onLinkTextClicked();
                    return;
                }
                break;
            }
            case 10: {
                TextMenuClickListener textMenuClickListener9 = this.mTextMenuListener;
                FontStyle fontStyle0 = this.mFontStyle;
                if(textMenuClickListener9 != null) {
                    textMenuClickListener9.onFontStyleClicked(fontStyle0);
                    return;
                }
                break;
            }
            case 11: {
                TextMenuClickListener textMenuClickListener10 = this.mTextMenuListener;
                if(textMenuClickListener10 != null) {
                    textMenuClickListener10.onRemoveMenuClicked();
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s14;
        String s13;
        int v13;
        String s12;
        String s11;
        int v11;
        String s10;
        String s9;
        int v6;
        int v5;
        int v4;
        String s5;
        int v3;
        boolean z17;
        boolean z16;
        boolean z15;
        boolean z14;
        boolean z13;
        boolean z12;
        String s3;
        boolean z11;
        String s2;
        long v2;
        String s1;
        boolean z10;
        String s;
        boolean z8;
        boolean z7;
        boolean z6;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        OverlayCategory overlayCategory0 = this.mActiveOverlayCategory;
        boolean z = this.mIsActiveLink;
        boolean z1 = this.mIsActiveItalic;
        ColorType colorType0 = this.mTextColor;
        boolean z2 = this.mIsActiveUnderLine;
        Alignment alignment0 = this.mAlignment;
        boolean z3 = this.mIsActiveBold;
        boolean z4 = this.mIsActiveStrike;
        boolean z5 = this.mDisplayMenu;
        ColorType colorType1 = this.mTextBackgroundColor;
        FontStyle fontStyle0 = this.mFontStyle;
        int v1 = 0;
        if(Long.compare(v & 0x5011L, 0L) == 0) {
            v2 = v;
            z11 = false;
            z14 = false;
            z12 = false;
            z13 = false;
            s2 = null;
            s3 = null;
        }
        else {
            if((v & 0x4001L) == 0L) {
                z6 = false;
                z7 = false;
            }
            else {
                z6 = overlayCategory0 == com.kakao.keditor.toolbar.category.OverlayCategory.FontStyle.INSTANCE;
                z7 = overlayCategory0 == com.kakao.keditor.toolbar.category.OverlayCategory.TableStyle.INSTANCE;
            }
            if(Long.compare(v & 0x5001L, 0L) == 0) {
                z8 = false;
                s = null;
            }
            else {
                z8 = overlayCategory0 == TextBackgroundColor.INSTANCE;
                v |= (z8 ? 0x100000L : 0x80000L);
                s = this.keBtnColorBackground.getResources().getString((z8 ? string.cd_fold : string.cd_unfold));
            }
            if(Long.compare(v & 0x4011L, 0L) == 0) {
                v2 = v;
                z11 = false;
                s3 = s;
                s2 = null;
            }
            else {
                boolean z9 = overlayCategory0 == TextForegroundColor.INSTANCE;
                if(z9) {
                    z10 = true;
                    s1 = this.keBtnColorText.getResources().getString(string.cd_fold);
                }
                else {
                    z10 = false;
                    s1 = this.keBtnColorText.getResources().getString(string.cd_unfold);
                }
                v2 = v | (z9 ? 0x40000L : 0x20000L);
                s2 = s1;
                z11 = z10;
                s3 = s;
            }
            z12 = z6;
            z13 = z7;
            z14 = z8;
        }
        if(Long.compare(v2 & 0x4011L, 0L) == 0) {
            z15 = false;
        }
        else {
            z15 = colorType0 == null;
            if((v2 & 0x4010L) != 0L) {
                v2 = z15 ? v2 | 0x10000L : v2 | 0x8000L;
            }
            if((v2 & 0x4011L) != 0L) {
                v2 |= (z15 ? 0x4000000L : 0x2000000L);
            }
        }
        if(Long.compare(v2 & 0x5001L, 0L) == 0) {
            z16 = false;
        }
        else {
            z16 = colorType1 == null;
            if((v2 & 0x5000L) != 0L) {
                v2 = z16 ? v2 | 0x400000L : v2 | 0x200000L;
            }
            if((v2 & 0x5001L) != 0L) {
                v2 |= (z16 ? 0x10000000L : 0x8000000L);
            }
        }
        if(Long.compare(v2 & 0x6000L, 0L) == 0) {
            v3 = 0;
            z17 = false;
        }
        else {
            z17 = fontStyle0 == null;
            v2 = z17 ? v2 | 0x1000000L : v2 | 0x800000L;
            v3 = fontStyle0 == null ? 0 : fontStyle0.getToolbarResId();
        }
        String s4 = (v2 & 0x800000L) == 0L || fontStyle0 == null ? null : fontStyle0.getDescription(this.getRoot().getContext());
        if((v2 & 0x200000L) == 0L) {
            s5 = s4;
            v4 = 0;
        }
        else {
            s5 = s4;
            v4 = this.getRoot().getContext().getColor((colorType1 == null ? 0 : colorType1.getColorRes()));
        }
        if((v2 & 0x8000L) == 0L) {
            v5 = v4;
            v6 = 0;
        }
        else {
            v5 = v4;
            v6 = this.getRoot().getContext().getColor((colorType0 == null ? 0 : colorType0.getColorRes()));
        }
        String s6 = (v2 & 0x2000000L) == 0L || colorType0 == null ? null : colorType0.getDescription(this.getRoot().getContext());
        String s7 = (v2 & 0x8000000L) == 0L || colorType1 == null ? null : colorType1.getDescription(this.getRoot().getContext());
        int v7 = Long.compare(v2 & 0x4010L, 0L);
        if(v7 == 0) {
            v6 = 0;
        }
        else if(z15) {
            v6 = 0xFF000000;
        }
        int v8 = Long.compare(v2 & 0x5000L, 0L);
        String s8 = s6;
        if(v8 == 0) {
            s9 = s7;
        }
        else if(z16) {
            s9 = s7;
            v1 = ViewDataBinding.getColorFromResource(this.keBtnColorBackground, 0x106000D);
        }
        else {
            s9 = s7;
            v1 = v5;
        }
        int v9 = Long.compare(v2 & 0x6000L, 0L);
        if(v9 == 0) {
            s10 = null;
        }
        else if(z17) {
            s10 = this.keBtnFont.getResources().getString(string.cd_unknown);
        }
        else {
            s10 = s5;
        }
        int v10 = Long.compare(v2 & 0x4011L, 0L);
        if(v10 == 0) {
            s11 = s10;
            v11 = v3;
            s12 = null;
        }
        else {
            if(z15) {
                v11 = v3;
                s11 = s10;
                Context context0 = this.getRoot().getContext();
                s8 = ColorType.BLACK.getDescription(context0);
            }
            else {
                s11 = s10;
                v11 = v3;
            }
            s12 = s8;
        }
        int v12 = Long.compare(v2 & 0x5001L, 0L);
        if(v12 == 0) {
            s13 = s2;
            v13 = v9;
            s14 = null;
        }
        else {
            if(z16) {
                v13 = v9;
                s13 = s2;
                Context context1 = this.getRoot().getContext();
                s9 = ColorType.CLEAR.getDescription(context1);
            }
            else {
                s13 = s2;
                v13 = v9;
            }
            s14 = s9;
        }
        if((v2 & 0x4001L) != 0L) {
            BindingAdapters.setSelected(this.keBtnColorBackground, z14);
            BindingAdapters.setSelected(this.keBtnColorText, z11);
            BindingAdapters.setSelected(this.keBtnTableStyle, z13);
            BindingAdapters.setSelected(this.mboundView11, z12);
        }
        if(v8 != 0) {
            BindingAdapter.setColor(this.keBtnColorBackground, v1);
        }
        if((0x4000L & v2) != 0L) {
            this.keBtnColorBackground.setOnClickListener(this.mCallback6);
            BindingAdapters.applyAccessibilityInfo(this.keBtnColorBackground, true, null, Boolean.FALSE);
            this.keBtnColorText.setOnClickListener(this.mCallback5);
            BindingAdapters.applyAccessibilityInfo(this.keBtnColorText, true, null, Boolean.FALSE);
            this.keBtnDelete.setOnClickListener(this.mCallback11);
            this.keBtnFont.setOnClickListener(this.mCallback10);
            String s15 = this.keBtnFont.getResources().getString(string.cd_text_style_select_font_hint);
            BindingAdapters.applyAccessibilityInfo(this.keBtnFont, true, s15, null);
            this.keBtnItalic.setOnClickListener(this.mCallback2);
            this.keBtnLink.setOnClickListener(this.mCallback9);
            this.keBtnSort.setOnClickListener(this.mCallback7);
            this.keBtnStrike.setOnClickListener(this.mCallback4);
            this.keBtnTableStyle.setOnClickListener(this.mCallback8);
            BindingAdapters.applyAccessibilityInfo(this.keBtnTableStyle, true, null, Boolean.FALSE);
            this.keBtnUnderline.setOnClickListener(this.mCallback3);
            this.mboundView1.setOnClickListener(this.mCallback1);
        }
        if(v12 != 0) {
            String s16 = this.keBtnColorBackground.getResources().getString(string.cd_text_style_select_background);
            BindingAdapters.setContentDescriptionWith(this.keBtnColorBackground, s16, s14, s3);
        }
        if(v7 != 0) {
            BindingAdapter.setColor(this.keBtnColorText, v6);
        }
        if(v10 != 0) {
            String s17 = this.keBtnColorText.getResources().getString(string.cd_text_style_select_color);
            BindingAdapters.setContentDescriptionWith(this.keBtnColorText, s17, s12, s13);
        }
        if(v13 != 0) {
            this.keBtnFont.setContentDescription(s11);
            BindingAdapters.setSrc(this.mboundView11, v11);
        }
        if((0x4004L & v2) != 0L) {
            BindingAdapters.setSelected(this.keBtnItalic, z1);
        }
        if((0x4002L & v2) != 0L) {
            BindingAdapters.setSelected(this.keBtnLink, z);
        }
        if((0x4080L & v2) != 0L) {
            BindingAdapters.alignment(this.keBtnSort, alignment0);
        }
        if((0x4200L & v2) != 0L) {
            BindingAdapters.setSelected(this.keBtnStrike, z4);
        }
        if((0x4040L & v2) != 0L) {
            BindingAdapters.setSelected(this.keBtnUnderline, z2);
        }
        if((0x4400L & v2) != 0L) {
            BindingAdapters.goneUnless(this.mboundView0, Boolean.valueOf(z5));
        }
        if((v2 & 0x4100L) != 0L) {
            BindingAdapters.setSelected(this.mboundView1, z3);
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
            this.mDirtyFlags = 0x4000L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setActiveOverlayCategory(@Nullable OverlayCategory overlayCategory0) {
        this.mActiveOverlayCategory = overlayCategory0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.activeOverlayCategory);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setAlignment(@Nullable Alignment alignment0) {
        this.mAlignment = alignment0;
        synchronized(this) {
            this.mDirtyFlags |= 0x80L;
        }
        this.notifyPropertyChanged(BR.alignment);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setCell(@Nullable TableCellItem tableCellItem0) {
        this.mCell = tableCellItem0;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x400L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setFontStyle(@Nullable FontStyle fontStyle0) {
        this.mFontStyle = fontStyle0;
        synchronized(this) {
            this.mDirtyFlags |= 0x2000L;
        }
        this.notifyPropertyChanged(BR.fontStyle);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setIsActiveBold(boolean z) {
        this.mIsActiveBold = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x100L;
        }
        this.notifyPropertyChanged(BR.isActiveBold);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setIsActiveItalic(boolean z) {
        this.mIsActiveItalic = z;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.isActiveItalic);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setIsActiveLink(boolean z) {
        this.mIsActiveLink = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.isActiveLink);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setIsActiveStrike(boolean z) {
        this.mIsActiveStrike = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x200L;
        }
        this.notifyPropertyChanged(BR.isActiveStrike);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setIsActiveUnderLine(boolean z) {
        this.mIsActiveUnderLine = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x40L;
        }
        this.notifyPropertyChanged(BR.isActiveUnderLine);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setTableItem(@Nullable TableItem tableItem0) {
        this.mTableItem = tableItem0;
        synchronized(this) {
            this.mDirtyFlags |= 0x800L;
        }
        this.notifyPropertyChanged(BR.tableItem);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setTextBackgroundColor(@Nullable ColorType colorType0) {
        this.mTextBackgroundColor = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 0x1000L;
        }
        this.notifyPropertyChanged(BR.textBackgroundColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setTextColor(@Nullable ColorType colorType0) {
        this.mTextColor = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 16L;
        }
        this.notifyPropertyChanged(BR.textColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTableMenuBinding
    public void setTextMenuListener(@Nullable TextMenuClickListener textMenuClickListener0) {
        this.mTextMenuListener = textMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 0x20L;
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
        if(BR.isActiveLink == v) {
            this.setIsActiveLink(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.isActiveItalic == v) {
            this.setIsActiveItalic(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.cell == v) {
            this.setCell(((TableCellItem)object0));
            return true;
        }
        if(BR.textColor == v) {
            this.setTextColor(((ColorType)object0));
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
        if(BR.alignment == v) {
            this.setAlignment(((Alignment)object0));
            return true;
        }
        if(BR.isActiveBold == v) {
            this.setIsActiveBold(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.isActiveStrike == v) {
            this.setIsActiveStrike(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.tableItem == v) {
            this.setTableItem(((TableItem)object0));
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
        return false;
    }
}

