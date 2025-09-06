package com.kakao.keditor.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.CodeBlockViewModel;
import com.kakao.keditor.plugin.pluginspec.codeblock.editor.view.CodeEditScrollView;

public class KeActivityCodeBlockEditorBindingImpl extends KeActivityCodeBlockEditorBinding {
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private CodeBlockViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onChangeLanguageClicked(view0);
        }

        public OnClickListenerImpl1 setValue(CodeBlockViewModel codeBlockViewModel0) {
            this.value = codeBlockViewModel0;
            return codeBlockViewModel0 == null ? null : this;
        }
    }

    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private CodeBlockViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onConfirmClicked(view0);
        }

        public OnClickListenerImpl2 setValue(CodeBlockViewModel codeBlockViewModel0) {
            this.value = codeBlockViewModel0;
            return codeBlockViewModel0 == null ? null : this;
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private CodeBlockViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onCloseClicked(view0);
        }

        public OnClickListenerImpl setValue(CodeBlockViewModel codeBlockViewModel0) {
            this.value = codeBlockViewModel0;
            return codeBlockViewModel0 == null ? null : this;
        }
    }

    private long mDirtyFlags;
    private OnClickListenerImpl1 mVmOnChangeLanguageClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl mVmOnCloseClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mVmOnConfirmClickedAndroidViewViewOnClickListener;
    @NonNull
    private final ConstraintLayout mboundView0;
    @NonNull
    private final TextView mboundView4;
    @NonNull
    private final ImageView mboundView5;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeActivityCodeBlockEditorBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_code_block_editor_top, 6);
        sparseIntArray0.put(id.ke_code_block_code, 7);
        sparseIntArray0.put(id.overlay, 8);
    }

    public KeActivityCodeBlockEditorBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 9, KeActivityCodeBlockEditorBindingImpl.sIncludes, KeActivityCodeBlockEditorBindingImpl.sViewsWithIds));
    }

    private KeActivityCodeBlockEditorBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]), ((CodeEditScrollView)arr_object[7]), ((LinearLayout)arr_object[3]), ((LinearLayout)arr_object[6]), ((TextView)arr_object[2]), ((FrameLayout)arr_object[8]));
        this.mDirtyFlags = -1L;
        this.keClose.setTag(null);
        this.keCodeBlockEditorToolbar.setTag(null);
        this.keOkButton.setTag(null);
        this.mboundView0 = (ConstraintLayout)arr_object[0];
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.mboundView4 = (TextView)arr_object[4];
        ((TextView)arr_object[4]).setTag(null);
        this.mboundView5 = (ImageView)arr_object[5];
        ((ImageView)arr_object[5]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        float f;
        long v1;
        OnClickListenerImpl2 keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl21;
        OnClickListenerImpl1 keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl11;
        OnClickListenerImpl keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl1;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        CodeBlockViewModel codeBlockViewModel0 = this.mVm;
        boolean z = this.mIsOverlayOpen;
        String s = this.mLanguage;
        boolean z1 = this.mIsAttachable;
        Drawable drawable0 = null;
        if(Long.compare(v & 33L, 0L) == 0 || codeBlockViewModel0 == null) {
            keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl21 = null;
            keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl1 = null;
            keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl11 = null;
        }
        else {
            OnClickListenerImpl keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl0 = this.mVmOnCloseClickedAndroidViewViewOnClickListener;
            if(keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl0 == null) {
                keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl0 = new OnClickListenerImpl();
                this.mVmOnCloseClickedAndroidViewViewOnClickListener = keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl0;
            }
            keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl1 = keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl0.setValue(codeBlockViewModel0);
            OnClickListenerImpl1 keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl10 = this.mVmOnChangeLanguageClickedAndroidViewViewOnClickListener;
            if(keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl10 == null) {
                keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl10 = new OnClickListenerImpl1();
                this.mVmOnChangeLanguageClickedAndroidViewViewOnClickListener = keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl10;
            }
            keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl11 = keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl10.setValue(codeBlockViewModel0);
            OnClickListenerImpl2 keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl20 = this.mVmOnConfirmClickedAndroidViewViewOnClickListener;
            if(keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl20 == null) {
                keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl20 = new OnClickListenerImpl2();
                this.mVmOnConfirmClickedAndroidViewViewOnClickListener = keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl20;
            }
            keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl21 = keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl20.setValue(codeBlockViewModel0);
        }
        boolean z2 = true;
        if(Long.compare(v & 34L, 0L) != 0) {
            if(z) {
                v1 = 0x80L;
            }
            else {
                z2 = false;
                v1 = 0x40L;
            }
            v |= v1;
            drawable0 = AppCompatResources.getDrawable(this.mboundView5.getContext(), (z2 ? drawable.ke_category_up : drawable.ke_category_down));
        }
        if(Long.compare(v & 40L, 0L) == 0) {
            f = 0.0f;
        }
        else {
            v |= (z1 ? 0x200L : 0x100L);
            f = z1 ? 1.0f : 0.3f;
        }
        if((33L & v) != 0L) {
            this.keClose.setOnClickListener(keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl1);
            this.keCodeBlockEditorToolbar.setOnClickListener(keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl11);
            this.keOkButton.setOnClickListener(keActivityCodeBlockEditorBindingImpl$OnClickListenerImpl21);
        }
        if((v & 40L) != 0L) {
            this.keOkButton.setAlpha(f);
            this.keOkButton.setEnabled(z1);
        }
        if((36L & v) != 0L) {
            TextViewBindingAdapter.setText(this.mboundView4, s);
        }
        if((v & 34L) != 0L) {
            ImageViewBindingAdapter.setImageDrawable(this.mboundView5, drawable0);
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
            this.mDirtyFlags = 0x20L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityCodeBlockEditorBinding
    public void setFlow(@Nullable EventFlow eventFlow0) {
        this.mFlow = eventFlow0;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityCodeBlockEditorBinding
    public void setIsAttachable(boolean z) {
        this.mIsAttachable = z;
        synchronized(this) {
            this.mDirtyFlags |= 8L;
        }
        this.notifyPropertyChanged(BR.isAttachable);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeActivityCodeBlockEditorBinding
    public void setIsOverlayOpen(boolean z) {
        this.mIsOverlayOpen = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.isOverlayOpen);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeActivityCodeBlockEditorBinding
    public void setLanguage(@Nullable String s) {
        this.mLanguage = s;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.language);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.vm == v) {
            this.setVm(((CodeBlockViewModel)object0));
            return true;
        }
        if(BR.isOverlayOpen == v) {
            this.setIsOverlayOpen(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.language == v) {
            this.setLanguage(((String)object0));
            return true;
        }
        if(BR.isAttachable == v) {
            this.setIsAttachable(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.flow == v) {
            this.setFlow(((EventFlow)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityCodeBlockEditorBinding
    public void setVm(@Nullable CodeBlockViewModel codeBlockViewModel0) {
        this.mVm = codeBlockViewModel0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
}

