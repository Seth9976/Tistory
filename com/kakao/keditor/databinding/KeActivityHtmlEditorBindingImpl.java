package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.pluginspec.html.editor.HtmlViewModel;
import com.kakao.keditor.plugin.pluginspec.html.editor.view.HtmlEditScrollView;

public class KeActivityHtmlEditorBindingImpl extends KeActivityHtmlEditorBinding {
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private HtmlViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onConfirmClicked(view0);
        }

        public OnClickListenerImpl1 setValue(HtmlViewModel htmlViewModel0) {
            this.value = htmlViewModel0;
            return htmlViewModel0 == null ? null : this;
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private HtmlViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onCloseClicked(view0);
        }

        public OnClickListenerImpl setValue(HtmlViewModel htmlViewModel0) {
            this.value = htmlViewModel0;
            return htmlViewModel0 == null ? null : this;
        }
    }

    private long mDirtyFlags;
    private OnClickListenerImpl mVmOnCloseClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mVmOnConfirmClickedAndroidViewViewOnClickListener;
    @NonNull
    private final ConstraintLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeActivityHtmlEditorBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_code_block_editor_top, 3);
        sparseIntArray0.put(id.ke_html_code, 4);
    }

    public KeActivityHtmlEditorBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 5, KeActivityHtmlEditorBindingImpl.sIncludes, KeActivityHtmlEditorBindingImpl.sViewsWithIds));
    }

    private KeActivityHtmlEditorBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]), ((LinearLayout)arr_object[3]), ((HtmlEditScrollView)arr_object[4]), ((TextView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keClose.setTag(null);
        this.keOkButton.setTag(null);
        this.mboundView0 = (ConstraintLayout)arr_object[0];
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        View.OnClickListener view$OnClickListener0;
        OnClickListenerImpl keActivityHtmlEditorBindingImpl$OnClickListenerImpl1;
        float f;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mIsAttachable;
        HtmlViewModel htmlViewModel0 = this.mVm;
        if(Long.compare(v & 17L, 0L) == 0) {
            f = 0.0f;
        }
        else {
            v |= (z ? 0x40L : 0x20L);
            f = z ? 1.0f : 0.3f;
        }
        int v1 = Long.compare(18L & v, 0L);
        if(v1 == 0 || htmlViewModel0 == null) {
            keActivityHtmlEditorBindingImpl$OnClickListenerImpl1 = null;
            view$OnClickListener0 = null;
        }
        else {
            OnClickListenerImpl keActivityHtmlEditorBindingImpl$OnClickListenerImpl0 = this.mVmOnCloseClickedAndroidViewViewOnClickListener;
            if(keActivityHtmlEditorBindingImpl$OnClickListenerImpl0 == null) {
                keActivityHtmlEditorBindingImpl$OnClickListenerImpl0 = new OnClickListenerImpl();
                this.mVmOnCloseClickedAndroidViewViewOnClickListener = keActivityHtmlEditorBindingImpl$OnClickListenerImpl0;
            }
            keActivityHtmlEditorBindingImpl$OnClickListenerImpl1 = keActivityHtmlEditorBindingImpl$OnClickListenerImpl0.setValue(htmlViewModel0);
            OnClickListenerImpl1 keActivityHtmlEditorBindingImpl$OnClickListenerImpl10 = this.mVmOnConfirmClickedAndroidViewViewOnClickListener;
            if(keActivityHtmlEditorBindingImpl$OnClickListenerImpl10 == null) {
                keActivityHtmlEditorBindingImpl$OnClickListenerImpl10 = new OnClickListenerImpl1();
                this.mVmOnConfirmClickedAndroidViewViewOnClickListener = keActivityHtmlEditorBindingImpl$OnClickListenerImpl10;
            }
            view$OnClickListener0 = keActivityHtmlEditorBindingImpl$OnClickListenerImpl10.setValue(htmlViewModel0);
        }
        if(v1 != 0) {
            this.keClose.setOnClickListener(keActivityHtmlEditorBindingImpl$OnClickListenerImpl1);
            this.keOkButton.setOnClickListener(view$OnClickListener0);
        }
        if((v & 17L) != 0L) {
            this.keOkButton.setAlpha(f);
            this.keOkButton.setEnabled(z);
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
            this.mDirtyFlags = 16L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityHtmlEditorBinding
    public void setFlow(@Nullable EventFlow eventFlow0) {
        this.mFlow = eventFlow0;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityHtmlEditorBinding
    public void setIsAttachable(boolean z) {
        this.mIsAttachable = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.isAttachable);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeActivityHtmlEditorBinding
    public void setIsOverlayOpen(boolean z) {
        this.mIsOverlayOpen = z;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.isAttachable == v) {
            this.setIsAttachable(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.vm == v) {
            this.setVm(((HtmlViewModel)object0));
            return true;
        }
        if(BR.isOverlayOpen == v) {
            this.setIsOverlayOpen(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.flow == v) {
            this.setFlow(((EventFlow)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityHtmlEditorBinding
    public void setVm(@Nullable HtmlViewModel htmlViewModel0) {
        this.mVm = htmlViewModel0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
}

