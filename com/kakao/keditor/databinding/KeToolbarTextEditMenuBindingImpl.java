package com.kakao.keditor.databinding;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextBackgroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextForegroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory;
import com.kakao.keditor.toolbar.toolbaroverlay.text.BindingAdapter;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextBackgroundColorMenuBtnView;
import com.kakao.keditor.toolbar.toolbaroverlay.text.TextColorMenuBtnView;

public class KeToolbarTextEditMenuBindingImpl extends KeToolbarTextEditMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback35;
    @Nullable
    private final View.OnClickListener mCallback36;
    @Nullable
    private final View.OnClickListener mCallback37;
    @Nullable
    private final View.OnClickListener mCallback38;
    @Nullable
    private final View.OnClickListener mCallback39;
    @Nullable
    private final View.OnClickListener mCallback40;
    @Nullable
    private final View.OnClickListener mCallback41;
    @Nullable
    private final View.OnClickListener mCallback42;
    @Nullable
    private final View.OnClickListener mCallback43;
    @Nullable
    private final View.OnClickListener mCallback44;
    @Nullable
    private final View.OnClickListener mCallback45;
    @Nullable
    private final View.OnClickListener mCallback46;
    @Nullable
    private final View.OnClickListener mCallback47;
    @Nullable
    private final View.OnClickListener mCallback48;
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeToolbarTextEditMenuBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_btn_scroll_area, 15);
    }

    public KeToolbarTextEditMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 16, KeToolbarTextEditMenuBindingImpl.sIncludes, KeToolbarTextEditMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarTextEditMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]), ((ImageView)arr_object[5]), ((ImageView)arr_object[3]), ((TextBackgroundColorMenuBtnView)arr_object[10]), ((TextColorMenuBtnView)arr_object[9]), ((ImageView)arr_object[4]), ((ImageView)arr_object[6]), ((ImageView)arr_object[12]), ((ImageView)arr_object[13]), ((ImageView)arr_object[14]), ((HorizontalScrollView)arr_object[15]), ((ImageView)arr_object[11]), ((ImageView)arr_object[8]), ((ImageView)arr_object[2]), ((ImageView)arr_object[7]));
        this.mDirtyFlags = -1L;
        this.keBtnBack.setTag(null);
        this.keBtnBold.setTag(null);
        this.keBtnCharacterSize.setTag(null);
        this.keBtnColorBackground.setTag(null);
        this.keBtnColorText.setTag(null);
        this.keBtnFont.setTag(null);
        this.keBtnItalic.setTag(null);
        this.keBtnLink.setTag(null);
        this.keBtnList.setTag(null);
        this.keBtnQuote.setTag(null);
        this.keBtnSort.setTag(null);
        this.keBtnStrike.setTag(null);
        this.keBtnType.setTag(null);
        this.keBtnUnderline.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback39 = new OnClickListener(this, 5);
        this.mCallback43 = new OnClickListener(this, 9);
        this.mCallback42 = new OnClickListener(this, 8);
        this.mCallback44 = new OnClickListener(this, 10);
        this.mCallback37 = new OnClickListener(this, 3);
        this.mCallback40 = new OnClickListener(this, 6);
        this.mCallback38 = new OnClickListener(this, 4);
        this.mCallback41 = new OnClickListener(this, 7);
        this.mCallback47 = new OnClickListener(this, 13);
        this.mCallback35 = new OnClickListener(this, 1);
        this.mCallback36 = new OnClickListener(this, 2);
        this.mCallback48 = new OnClickListener(this, 14);
        this.mCallback45 = new OnClickListener(this, 11);
        this.mCallback46 = new OnClickListener(this, 12);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                TextMenuClickListener textMenuClickListener0 = this.mTextMenuListener;
                if(textMenuClickListener0 != null) {
                    textMenuClickListener0.onBackMenuClicked();
                    return;
                }
                break;
            }
            case 2: {
                ParagraphStyle paragraphStyle0 = this.mParagraphStyle;
                TextMenuClickListener textMenuClickListener1 = this.mTextMenuListener;
                if(textMenuClickListener1 != null) {
                    textMenuClickListener1.onParagraphSizeClicked(paragraphStyle0);
                    return;
                }
                break;
            }
            case 3: {
                CharacterSize characterSize0 = this.mTextSize;
                TextMenuClickListener textMenuClickListener2 = this.mTextMenuListener;
                if(textMenuClickListener2 != null) {
                    textMenuClickListener2.onTextSizeClicked(characterSize0);
                    return;
                }
                break;
            }
            case 4: {
                TextMenuClickListener textMenuClickListener3 = this.mTextMenuListener;
                FontStyle fontStyle0 = this.mFontStyle;
                if(textMenuClickListener3 != null) {
                    textMenuClickListener3.onFontStyleClicked(fontStyle0);
                    return;
                }
                break;
            }
            case 5: {
                TextMenuClickListener textMenuClickListener4 = this.mTextMenuListener;
                if(textMenuClickListener4 != null) {
                    textMenuClickListener4.onBoldClicked();
                    return;
                }
                break;
            }
            case 6: {
                TextMenuClickListener textMenuClickListener5 = this.mTextMenuListener;
                if(textMenuClickListener5 != null) {
                    textMenuClickListener5.onItalicClicked();
                    return;
                }
                break;
            }
            case 7: {
                TextMenuClickListener textMenuClickListener6 = this.mTextMenuListener;
                if(textMenuClickListener6 != null) {
                    textMenuClickListener6.onUnderlineClicked();
                    return;
                }
                break;
            }
            case 8: {
                TextMenuClickListener textMenuClickListener7 = this.mTextMenuListener;
                if(textMenuClickListener7 != null) {
                    textMenuClickListener7.onStrikeClicked();
                    return;
                }
                break;
            }
            case 9: {
                ColorType colorType0 = this.mTextColor;
                TextMenuClickListener textMenuClickListener8 = this.mTextMenuListener;
                if(textMenuClickListener8 != null) {
                    textMenuClickListener8.onColorPickerClicked(colorType0, 0);
                    return;
                }
                break;
            }
            case 10: {
                TextMenuClickListener textMenuClickListener9 = this.mTextMenuListener;
                ColorType colorType1 = this.mTextBackgroundColor;
                if(textMenuClickListener9 != null) {
                    textMenuClickListener9.onColorPickerClicked(colorType1, 1);
                    return;
                }
                break;
            }
            case 11: {
                Alignment alignment0 = this.mAlignment;
                TextMenuClickListener textMenuClickListener10 = this.mTextMenuListener;
                if(textMenuClickListener10 != null) {
                    textMenuClickListener10.onAlignmentClicked(alignment0);
                    return;
                }
                break;
            }
            case 12: {
                TextMenuClickListener textMenuClickListener11 = this.mTextMenuListener;
                if(textMenuClickListener11 != null) {
                    textMenuClickListener11.onLinkTextClicked();
                    return;
                }
                break;
            }
            case 13: {
                TextMenuClickListener textMenuClickListener12 = this.mTextMenuListener;
                if(textMenuClickListener12 != null) {
                    textMenuClickListener12.onListClicked();
                    return;
                }
                break;
            }
            case 14: {
                TextMenuClickListener textMenuClickListener13 = this.mTextMenuListener;
                if(textMenuClickListener13 != null) {
                    textMenuClickListener13.onBlockQuoteClicked();
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v31;
        int v30;
        int v29;
        String s23;
        String s22;
        String s21;
        int v28;
        int v26;
        String s20;
        int v24;
        String s19;
        int v21;
        int v20;
        String s18;
        String s17;
        boolean z25;
        String s16;
        int v17;
        String s15;
        String s14;
        String s13;
        String s12;
        String s11;
        String s10;
        boolean z24;
        String s9;
        String s8;
        String s6;
        String s5;
        int v6;
        int v5;
        boolean z23;
        int v4;
        boolean z22;
        boolean z21;
        boolean z20;
        boolean z19;
        boolean z18;
        boolean z17;
        boolean z16;
        String s4;
        String s3;
        boolean z15;
        String s2;
        long v3;
        boolean z13;
        boolean z12;
        boolean z11;
        String s1;
        String s;
        boolean z10;
        int v2;
        boolean z9;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CharacterSize characterSize0 = this.mTextSize;
        OverlayCategory overlayCategory0 = this.mActiveOverlayCategory;
        ColorType colorType0 = this.mTextColor;
        boolean z = this.mIsActiveBold;
        ColorType colorType1 = this.mTextBackgroundColor;
        FontStyle fontStyle0 = this.mFontStyle;
        ParagraphStyle paragraphStyle0 = this.mParagraphStyle;
        boolean z1 = this.mIsTextSizeParagraphMode;
        boolean z2 = this.mIsActiveLink;
        boolean z3 = this.mIsActiveItalic;
        boolean z4 = this.mDisplayMenu;
        boolean z5 = this.mHasTextListItemSpec;
        boolean z6 = this.mIsActiveUnderLine;
        boolean z7 = this.mIsActiveStrike;
        boolean z8 = this.mHasBlockQuoteItemSpec;
        Alignment alignment0 = this.mAlignment;
        int v1 = 0;
        if(Long.compare(v & 0x40001L, 0L) == 0) {
            z9 = false;
            v2 = 0;
        }
        else {
            z9 = characterSize0 == null;
            v = z9 ? v | 0x100000000L : v | 0x80000000L;
            v2 = characterSize0 == null ? 0 : characterSize0.getToolbarResId();
        }
        if(Long.compare(v & 0x40046L, 0L) == 0) {
            z17 = false;
            z19 = false;
            z15 = false;
            z16 = false;
            z18 = false;
            s4 = null;
            s3 = null;
        }
        else {
            if(Long.compare(v & 0x40006L, 0L) == 0) {
                z10 = false;
                s = null;
            }
            else {
                v |= (overlayCategory0 == TextForegroundColor.INSTANCE ? 0x80000L : 0x100000L);
                z10 = overlayCategory0 == TextForegroundColor.INSTANCE;
                s = this.keBtnColorText.getResources().getString((overlayCategory0 == TextForegroundColor.INSTANCE ? string.cd_unfold : string.cd_fold));
            }
            if((v & 0x40002L) == 0L) {
                s1 = s;
                z13 = false;
                z12 = false;
                z11 = false;
            }
            else {
                s1 = s;
                z11 = overlayCategory0 == com.kakao.keditor.toolbar.category.OverlayCategory.CharacterSize.INSTANCE;
                z12 = overlayCategory0 == com.kakao.keditor.toolbar.category.OverlayCategory.ParagraphStyle.INSTANCE;
                z13 = overlayCategory0 == com.kakao.keditor.toolbar.category.OverlayCategory.FontStyle.INSTANCE;
            }
            if(Long.compare(v & 0x40042L, 0L) == 0) {
                z15 = false;
                s3 = s1;
                s4 = null;
                z16 = z11;
            }
            else {
                boolean z14 = overlayCategory0 == TextBackgroundColor.INSTANCE;
                v |= (z14 ? 0x400000000L : 0x200000000L);
                if(z14) {
                    v3 = v;
                    s2 = this.keBtnColorBackground.getResources().getString(string.cd_fold);
                }
                else {
                    v3 = v;
                    s2 = this.keBtnColorBackground.getResources().getString(string.cd_unfold);
                }
                z15 = z14;
                s3 = s1;
                s4 = s2;
                z16 = z11;
                v = v3;
            }
            z17 = z12;
            z18 = z10;
            z19 = z13;
        }
        if(Long.compare(v & 0x40006L, 0L) == 0) {
            z20 = false;
        }
        else {
            z20 = colorType0 == null;
            if((v & 0x40004L) != 0L) {
                v = z20 ? v | 0x10000000L : v | 0x8000000L;
            }
            if((v & 0x40006L) != 0L) {
                v |= (z20 ? 0x4000000000L : 0x2000000000L);
            }
        }
        if(Long.compare(v & 0x40042L, 0L) == 0) {
            z21 = false;
        }
        else {
            z21 = colorType1 == null;
            v = z21 ? v | 0x4000000L : v | 0x2000000L;
            if((v & 0x40040L) != 0L) {
                v |= (z21 ? 0x1000000000L : 0x800000000L);
            }
        }
        if(Long.compare(v & 0x40080L, 0L) == 0) {
            z22 = false;
            v4 = 0;
        }
        else {
            z22 = fontStyle0 == null;
            v = z22 ? v | 0x1000000L : v | 0x800000L;
            v4 = fontStyle0 == null ? 0 : fontStyle0.getToolbarResId();
        }
        if(Long.compare(v & 0x40100L, 0L) == 0) {
            z23 = false;
            v5 = 0;
        }
        else {
            z23 = paragraphStyle0 == null;
            v = z23 ? v | 0x400000L : v | 0x200000L;
            v5 = paragraphStyle0 == null ? 0 : paragraphStyle0.getToolbarResId();
        }
        if(Long.compare(v & 0x40300L, 0L) == 0) {
            v6 = 0;
        }
        else {
            v = z1 ? v | 0x40000000L : v | 0x20000000L;
            v6 = (v & 0x40200L) == 0L ? 0 : !z1;
        }
        int v7 = Long.compare(v & 0x40400L, 0L);
        int v8 = Long.compare(v & 0x40800L, 0L);
        int v9 = Long.compare(v & 0x42000L, 0L);
        int v10 = Long.compare(v & 0x44000L, 0L);
        int v11 = Long.compare(v & 0x48000L, 0L);
        int v12 = Long.compare(v & 0x50000L, 0L);
        if((v & 0x80000000L) == 0L || characterSize0 == null) {
            s5 = s4;
            s6 = null;
        }
        else {
            s5 = s4;
            s6 = characterSize0.getDescription(this.getRoot().getContext());
        }
        String s7 = (v & 0x2000000000L) == 0L || colorType0 == null ? null : colorType0.getDescription(this.getRoot().getContext());
        if((v & 0x40200000L) == 0L) {
            s8 = s6;
            z24 = false;
            s9 = null;
        }
        else {
            if((v & 0x200000L) == 0L || paragraphStyle0 == null) {
                s8 = s6;
                s9 = null;
            }
            else {
                s8 = s6;
                s9 = paragraphStyle0.getDescription(this.getRoot().getContext());
            }
            z24 = (v & 0x40000000L) == 0L || paragraphStyle0 == null ? false : true;
        }
        if((v & 0x2000000L) == 0L || colorType1 == null) {
            s10 = s9;
            s11 = null;
        }
        else {
            s10 = s9;
            s11 = colorType1.getDescription(this.getRoot().getContext());
        }
        if((v & 0x800000L) == 0L || fontStyle0 == null) {
            s12 = s11;
            s13 = null;
        }
        else {
            s12 = s11;
            s13 = fontStyle0.getDescription(this.getRoot().getContext());
        }
        int v13 = (v & 0x800000000L) == 0L ? 0 : this.getRoot().getContext().getColor((colorType1 == null ? 0 : colorType1.getColorRes()));
        int v14 = (v & 0x8000000L) == 0L ? 0 : this.getRoot().getContext().getColor((colorType0 == null ? 0 : colorType0.getColorRes()));
        int v15 = Long.compare(v & 0x40100L, 0L);
        if(v15 == 0) {
            s14 = s7;
            s15 = null;
        }
        else if(z23) {
            s14 = s7;
            s15 = this.keBtnType.getResources().getString(string.cd_unknown);
        }
        else {
            s14 = s7;
            s15 = s10;
        }
        int v16 = Long.compare(v & 0x40080L, 0L);
        if(v16 == 0) {
            v17 = v13;
            s16 = null;
        }
        else if(z22) {
            v17 = v13;
            s16 = this.keBtnFont.getResources().getString(string.cd_unknown);
        }
        else {
            v17 = v13;
            s16 = s13;
        }
        int v18 = Long.compare(v & 0x40042L, 0L);
        if(v18 == 0) {
            s17 = s15;
            z25 = z24;
            s18 = null;
        }
        else if(z21) {
            z25 = z24;
            s17 = s15;
            Context context0 = this.getRoot().getContext();
            s18 = ColorType.CLEAR.getDescription(context0);
        }
        else {
            s17 = s15;
            z25 = z24;
            s18 = s12;
        }
        int v19 = Long.compare(v & 0x40004L, 0L);
        if(v19 == 0) {
            v20 = v15;
            v21 = 0;
        }
        else {
            v20 = v15;
            v21 = z20 ? 0xFF000000 : v14;
        }
        int v22 = Long.compare(v & 0x40300L, 0L);
        if(v22 == 0 || !z1) {
            z25 = false;
        }
        int v23 = Long.compare(v & 0x40001L, 0L);
        if(v23 == 0) {
            v24 = v16;
            s19 = s16;
            s20 = null;
        }
        else if(z9) {
            s19 = s16;
            v24 = v16;
            s20 = this.keBtnCharacterSize.getResources().getString(string.cd_unknown);
        }
        else {
            v24 = v16;
            s19 = s16;
            s20 = s8;
        }
        int v25 = Long.compare(v & 0x40040L, 0L);
        if(v25 == 0) {
            v26 = v19;
        }
        else if(z21) {
            v26 = v19;
            v1 = ViewDataBinding.getColorFromResource(this.keBtnColorBackground, 0x106000D);
        }
        else {
            v26 = v19;
            v1 = v17;
        }
        int v27 = Long.compare(v & 0x40006L, 0L);
        if(v27 == 0) {
            s21 = s18;
            v28 = 0;
            s22 = null;
        }
        else if(z20) {
            v28 = v27;
            s21 = s18;
            Context context1 = this.getRoot().getContext();
            s22 = ColorType.BLACK.getDescription(context1);
        }
        else {
            s21 = s18;
            v28 = v27;
            s22 = s14;
        }
        if((v & 0x40000L) == 0L) {
            s23 = s22;
            v31 = v25;
            v29 = v18;
            v30 = v1;
        }
        else {
            s23 = s22;
            this.keBtnBack.setOnClickListener(this.mCallback35);
            this.keBtnBold.setOnClickListener(this.mCallback39);
            this.keBtnCharacterSize.setOnClickListener(this.mCallback37);
            v29 = v18;
            String s24 = this.keBtnCharacterSize.getResources().getString(string.cd_text_style_character_size_hint);
            v30 = v1;
            BindingAdapters.applyAccessibilityInfo(this.keBtnCharacterSize, true, s24, Boolean.FALSE);
            this.keBtnColorBackground.setOnClickListener(this.mCallback44);
            BindingAdapters.applyAccessibilityInfo(this.keBtnColorBackground, true, null, null);
            this.keBtnColorText.setOnClickListener(this.mCallback43);
            BindingAdapters.applyAccessibilityInfo(this.keBtnColorText, true, null, Boolean.FALSE);
            this.keBtnFont.setOnClickListener(this.mCallback38);
            v31 = v25;
            String s25 = this.keBtnFont.getResources().getString(string.cd_text_style_select_font_hint);
            BindingAdapters.applyAccessibilityInfo(this.keBtnFont, true, s25, Boolean.FALSE);
            this.keBtnItalic.setOnClickListener(this.mCallback40);
            this.keBtnLink.setOnClickListener(this.mCallback46);
            this.keBtnList.setOnClickListener(this.mCallback47);
            this.keBtnQuote.setOnClickListener(this.mCallback48);
            this.keBtnSort.setOnClickListener(this.mCallback45);
            this.keBtnStrike.setOnClickListener(this.mCallback42);
            this.keBtnType.setOnClickListener(this.mCallback36);
            String s26 = this.keBtnType.getResources().getString(string.cd_text_style_paragraph_size_hint);
            BindingAdapters.applyAccessibilityInfo(this.keBtnType, true, s26, Boolean.FALSE);
            this.keBtnUnderline.setOnClickListener(this.mCallback41);
        }
        if((0x40010L & v) != 0L) {
            BindingAdapters.setSelected(this.keBtnBold, z);
        }
        if((0x40200L & v) != 0L) {
            BindingAdapters.goneUnless(this.keBtnCharacterSize, Boolean.valueOf(((boolean)v6)));
        }
        if(v23 != 0) {
            BindingAdapters.setSrc(this.keBtnCharacterSize, v2);
            this.keBtnCharacterSize.setContentDescription(s20);
        }
        if((v & 0x40002L) != 0L) {
            BindingAdapters.setSelected(this.keBtnCharacterSize, z16);
            BindingAdapters.setSelected(this.keBtnColorBackground, z15);
            BindingAdapters.setSelected(this.keBtnColorText, z18);
            BindingAdapters.setSelected(this.keBtnFont, z19);
            BindingAdapters.setSelected(this.keBtnType, z17);
        }
        if(v31 != 0) {
            BindingAdapter.setColor(this.keBtnColorBackground, v30);
        }
        if(v29 != 0) {
            String s27 = this.keBtnColorBackground.getResources().getString(string.cd_text_style_select_background);
            BindingAdapters.setContentDescriptionWith(this.keBtnColorBackground, s27, s21, s5);
        }
        if(v26 != 0) {
            BindingAdapter.setColor(this.keBtnColorText, v21);
        }
        if(v28 != 0) {
            String s28 = this.keBtnColorText.getResources().getString(string.cd_text_style_select_color);
            BindingAdapters.setContentDescriptionWith(this.keBtnColorText, s28, s23, s3);
        }
        if(v24 != 0) {
            BindingAdapters.setSrc(this.keBtnFont, v4);
            this.keBtnFont.setContentDescription(s19);
        }
        if(v8 != 0) {
            BindingAdapters.setSelected(this.keBtnItalic, z3);
        }
        if(v7 != 0) {
            BindingAdapters.setSelected(this.keBtnLink, z2);
        }
        if(v10 != 0) {
            BindingAdapters.goneUnless(this.keBtnList, Boolean.valueOf(z5));
        }
        if(v12 != 0) {
            BindingAdapters.goneUnless(this.keBtnQuote, Boolean.valueOf(z8));
        }
        if((0x40008L & v) != 0L) {
            BindingAdapters.alignment(this.keBtnSort, alignment0);
        }
        if(v11 != 0) {
            BindingAdapters.setSelected(this.keBtnStrike, z7);
        }
        if(v22 != 0) {
            BindingAdapters.goneUnless(this.keBtnType, Boolean.valueOf(z25));
        }
        if(v20 != 0) {
            BindingAdapters.setSrc(this.keBtnType, v5);
            this.keBtnType.setContentDescription(s17);
        }
        if(v9 != 0) {
            BindingAdapters.setSelected(this.keBtnUnderline, z6);
        }
        if((v & 0x40020L) != 0L) {
            BindingAdapters.goneUnless(this.mboundView0, Boolean.valueOf(z4));
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
            this.mDirtyFlags = 0x40000L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setActiveCategory(@Nullable ToolbarCategory toolbarCategory0) {
        this.mActiveCategory = toolbarCategory0;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setActiveOverlayCategory(@Nullable OverlayCategory overlayCategory0) {
        this.mActiveOverlayCategory = overlayCategory0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.activeOverlayCategory);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setAlignment(@Nullable Alignment alignment0) {
        this.mAlignment = alignment0;
        synchronized(this) {
            this.mDirtyFlags |= 8L;
        }
        this.notifyPropertyChanged(BR.alignment);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x20L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setFontStyle(@Nullable FontStyle fontStyle0) {
        this.mFontStyle = fontStyle0;
        synchronized(this) {
            this.mDirtyFlags |= 0x80L;
        }
        this.notifyPropertyChanged(BR.fontStyle);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setHasBlockQuoteItemSpec(boolean z) {
        this.mHasBlockQuoteItemSpec = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x10000L;
        }
        this.notifyPropertyChanged(BR.hasBlockQuoteItemSpec);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setHasTextListItemSpec(boolean z) {
        this.mHasTextListItemSpec = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x4000L;
        }
        this.notifyPropertyChanged(BR.hasTextListItemSpec);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setIsActiveBold(boolean z) {
        this.mIsActiveBold = z;
        synchronized(this) {
            this.mDirtyFlags |= 16L;
        }
        this.notifyPropertyChanged(BR.isActiveBold);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setIsActiveItalic(boolean z) {
        this.mIsActiveItalic = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x800L;
        }
        this.notifyPropertyChanged(BR.isActiveItalic);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setIsActiveLink(boolean z) {
        this.mIsActiveLink = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x400L;
        }
        this.notifyPropertyChanged(BR.isActiveLink);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setIsActiveStrike(boolean z) {
        this.mIsActiveStrike = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x8000L;
        }
        this.notifyPropertyChanged(BR.isActiveStrike);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setIsActiveUnderLine(boolean z) {
        this.mIsActiveUnderLine = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x2000L;
        }
        this.notifyPropertyChanged(BR.isActiveUnderLine);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setIsTextSizeParagraphMode(boolean z) {
        this.mIsTextSizeParagraphMode = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x200L;
        }
        this.notifyPropertyChanged(BR.isTextSizeParagraphMode);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setParagraphStyle(@Nullable ParagraphStyle paragraphStyle0) {
        this.mParagraphStyle = paragraphStyle0;
        synchronized(this) {
            this.mDirtyFlags |= 0x100L;
        }
        this.notifyPropertyChanged(BR.paragraphStyle);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setTextBackgroundColor(@Nullable ColorType colorType0) {
        this.mTextBackgroundColor = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 0x40L;
        }
        this.notifyPropertyChanged(BR.textBackgroundColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setTextColor(@Nullable ColorType colorType0) {
        this.mTextColor = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.textColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setTextMenuListener(@Nullable TextMenuClickListener textMenuClickListener0) {
        this.mTextMenuListener = textMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 0x1000L;
        }
        this.notifyPropertyChanged(BR.textMenuListener);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding
    public void setTextSize(@Nullable CharacterSize characterSize0) {
        this.mTextSize = characterSize0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.textSize);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.textSize == v) {
            this.setTextSize(((CharacterSize)object0));
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
        if(BR.alignment == v) {
            this.setAlignment(((Alignment)object0));
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
        if(BR.paragraphStyle == v) {
            this.setParagraphStyle(((ParagraphStyle)object0));
            return true;
        }
        if(BR.isTextSizeParagraphMode == v) {
            this.setIsTextSizeParagraphMode(((Boolean)object0).booleanValue());
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
        if(BR.hasTextListItemSpec == v) {
            this.setHasTextListItemSpec(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.isActiveStrike == v) {
            this.setIsActiveStrike(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.hasBlockQuoteItemSpec == v) {
            this.setHasBlockQuoteItemSpec(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.activeCategory == v) {
            this.setActiveCategory(((ToolbarCategory)object0));
            return true;
        }
        return false;
    }
}

