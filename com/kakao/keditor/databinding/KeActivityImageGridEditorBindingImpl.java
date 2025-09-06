package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.DragState;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridViewModel;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.KeditorImageGridLayout;
import com.kakao.keditor.standard.BindingAdapters;

public class KeActivityImageGridEditorBindingImpl extends KeActivityImageGridEditorBinding {
    public static class OnClickListenerImpl1 implements View.OnClickListener {
        private ImageGridViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onCloseClicked(view0);
        }

        public OnClickListenerImpl1 setValue(ImageGridViewModel imageGridViewModel0) {
            this.value = imageGridViewModel0;
            return imageGridViewModel0 == null ? null : this;
        }
    }

    public static class OnClickListenerImpl2 implements View.OnClickListener {
        private ImageGridViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onAddClicked(view0);
        }

        public OnClickListenerImpl2 setValue(ImageGridViewModel imageGridViewModel0) {
            this.value = imageGridViewModel0;
            return imageGridViewModel0 == null ? null : this;
        }
    }

    public static class OnClickListenerImpl3 implements View.OnClickListener {
        private ImageGridViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onConfirmClicked(view0);
        }

        public OnClickListenerImpl3 setValue(ImageGridViewModel imageGridViewModel0) {
            this.value = imageGridViewModel0;
            return imageGridViewModel0 == null ? null : this;
        }
    }

    public static class OnClickListenerImpl4 implements View.OnClickListener {
        private ImageGridViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onDeleteClicked(view0);
        }

        public OnClickListenerImpl4 setValue(ImageGridViewModel imageGridViewModel0) {
            this.value = imageGridViewModel0;
            return imageGridViewModel0 == null ? null : this;
        }
    }

    public static class OnClickListenerImpl implements View.OnClickListener {
        private ImageGridViewModel value;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            this.value.onEditClicked(view0);
        }

        public OnClickListenerImpl setValue(ImageGridViewModel imageGridViewModel0) {
            this.value = imageGridViewModel0;
            return imageGridViewModel0 == null ? null : this;
        }
    }

    private long mDirtyFlags;
    private OnClickListenerImpl2 mVmOnAddClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mVmOnCloseClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mVmOnConfirmClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mVmOnDeleteClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl mVmOnEditClickedAndroidViewViewOnClickListener;
    @NonNull
    private final ConstraintLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeActivityImageGridEditorBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_image_grid_editor_top, 7);
        sparseIntArray0.put(id.ke_image_grid_scroll_view, 8);
        sparseIntArray0.put(id.ke_image_grid_layout, 9);
    }

    public KeActivityImageGridEditorBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 10, KeActivityImageGridEditorBindingImpl.sIncludes, KeActivityImageGridEditorBindingImpl.sViewsWithIds));
    }

    private KeActivityImageGridEditorBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[4]), ((ImageView)arr_object[1]), ((ImageView)arr_object[6]), ((LinearLayout)arr_object[3]), ((LinearLayout)arr_object[7]), ((KeditorImageGridLayout)arr_object[9]), ((ScrollView)arr_object[8]), ((TextView)arr_object[2]), ((ImageView)arr_object[5]));
        this.mDirtyFlags = -1L;
        this.keAddButton.setTag(null);
        this.keClose.setTag(null);
        this.keDeleteButton.setTag(null);
        this.keImageGridEditorToolbar.setTag(null);
        this.keOkButton.setTag(null);
        this.keUpdateButton.setTag(null);
        this.mboundView0 = (ConstraintLayout)arr_object[0];
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        View.OnClickListener view$OnClickListener0;
        OnClickListenerImpl3 keActivityImageGridEditorBindingImpl$OnClickListenerImpl31;
        OnClickListenerImpl2 keActivityImageGridEditorBindingImpl$OnClickListenerImpl21;
        OnClickListenerImpl1 keActivityImageGridEditorBindingImpl$OnClickListenerImpl11;
        OnClickListenerImpl keActivityImageGridEditorBindingImpl$OnClickListenerImpl1;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ImageGridViewModel imageGridViewModel0 = this.mVm;
        int v1 = this.mImageCount;
        DragState dragState0 = this.mDragState;
        int v2 = Long.compare(33L & v, 0L);
        if(v2 == 0 || imageGridViewModel0 == null) {
            keActivityImageGridEditorBindingImpl$OnClickListenerImpl1 = null;
            view$OnClickListener0 = null;
            keActivityImageGridEditorBindingImpl$OnClickListenerImpl11 = null;
            keActivityImageGridEditorBindingImpl$OnClickListenerImpl21 = null;
            keActivityImageGridEditorBindingImpl$OnClickListenerImpl31 = null;
        }
        else {
            OnClickListenerImpl keActivityImageGridEditorBindingImpl$OnClickListenerImpl0 = this.mVmOnEditClickedAndroidViewViewOnClickListener;
            if(keActivityImageGridEditorBindingImpl$OnClickListenerImpl0 == null) {
                keActivityImageGridEditorBindingImpl$OnClickListenerImpl0 = new OnClickListenerImpl();
                this.mVmOnEditClickedAndroidViewViewOnClickListener = keActivityImageGridEditorBindingImpl$OnClickListenerImpl0;
            }
            keActivityImageGridEditorBindingImpl$OnClickListenerImpl1 = keActivityImageGridEditorBindingImpl$OnClickListenerImpl0.setValue(imageGridViewModel0);
            OnClickListenerImpl1 keActivityImageGridEditorBindingImpl$OnClickListenerImpl10 = this.mVmOnCloseClickedAndroidViewViewOnClickListener;
            if(keActivityImageGridEditorBindingImpl$OnClickListenerImpl10 == null) {
                keActivityImageGridEditorBindingImpl$OnClickListenerImpl10 = new OnClickListenerImpl1();
                this.mVmOnCloseClickedAndroidViewViewOnClickListener = keActivityImageGridEditorBindingImpl$OnClickListenerImpl10;
            }
            keActivityImageGridEditorBindingImpl$OnClickListenerImpl11 = keActivityImageGridEditorBindingImpl$OnClickListenerImpl10.setValue(imageGridViewModel0);
            OnClickListenerImpl2 keActivityImageGridEditorBindingImpl$OnClickListenerImpl20 = this.mVmOnAddClickedAndroidViewViewOnClickListener;
            if(keActivityImageGridEditorBindingImpl$OnClickListenerImpl20 == null) {
                keActivityImageGridEditorBindingImpl$OnClickListenerImpl20 = new OnClickListenerImpl2();
                this.mVmOnAddClickedAndroidViewViewOnClickListener = keActivityImageGridEditorBindingImpl$OnClickListenerImpl20;
            }
            keActivityImageGridEditorBindingImpl$OnClickListenerImpl21 = keActivityImageGridEditorBindingImpl$OnClickListenerImpl20.setValue(imageGridViewModel0);
            OnClickListenerImpl3 keActivityImageGridEditorBindingImpl$OnClickListenerImpl30 = this.mVmOnConfirmClickedAndroidViewViewOnClickListener;
            if(keActivityImageGridEditorBindingImpl$OnClickListenerImpl30 == null) {
                keActivityImageGridEditorBindingImpl$OnClickListenerImpl30 = new OnClickListenerImpl3();
                this.mVmOnConfirmClickedAndroidViewViewOnClickListener = keActivityImageGridEditorBindingImpl$OnClickListenerImpl30;
            }
            keActivityImageGridEditorBindingImpl$OnClickListenerImpl31 = keActivityImageGridEditorBindingImpl$OnClickListenerImpl30.setValue(imageGridViewModel0);
            OnClickListenerImpl4 keActivityImageGridEditorBindingImpl$OnClickListenerImpl40 = this.mVmOnDeleteClickedAndroidViewViewOnClickListener;
            if(keActivityImageGridEditorBindingImpl$OnClickListenerImpl40 == null) {
                keActivityImageGridEditorBindingImpl$OnClickListenerImpl40 = new OnClickListenerImpl4();
                this.mVmOnDeleteClickedAndroidViewViewOnClickListener = keActivityImageGridEditorBindingImpl$OnClickListenerImpl40;
            }
            view$OnClickListener0 = keActivityImageGridEditorBindingImpl$OnClickListenerImpl40.setValue(imageGridViewModel0);
        }
        int v3 = Long.compare(36L & v, 0L);
        boolean z = false;
        int v4 = Long.compare(v & 0x30L, 0L);
        if(v4 != 0) {
            z = dragState0 == DragState.Idle;
        }
        if(v2 != 0) {
            this.keAddButton.setOnClickListener(keActivityImageGridEditorBindingImpl$OnClickListenerImpl21);
            this.keClose.setOnClickListener(keActivityImageGridEditorBindingImpl$OnClickListenerImpl11);
            this.keDeleteButton.setOnClickListener(view$OnClickListener0);
            this.keOkButton.setOnClickListener(keActivityImageGridEditorBindingImpl$OnClickListenerImpl31);
            this.keUpdateButton.setOnClickListener(keActivityImageGridEditorBindingImpl$OnClickListenerImpl1);
        }
        if(v3 != 0) {
            this.keDeleteButton.setEnabled(v3 != 0 && v1 > 2);
        }
        if(v4 != 0) {
            BindingAdapters.goneUnless(this.keImageGridEditorToolbar, Boolean.valueOf(z));
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

    @Override  // com.kakao.keditor.databinding.KeActivityImageGridEditorBinding
    public void setDragState(@Nullable DragState dragState0) {
        this.mDragState = dragState0;
        synchronized(this) {
            this.mDirtyFlags |= 16L;
        }
        this.notifyPropertyChanged(BR.dragState);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeActivityImageGridEditorBinding
    public void setFlow(@Nullable EventFlow eventFlow0) {
        this.mFlow = eventFlow0;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityImageGridEditorBinding
    public void setImageCount(int v) {
        this.mImageCount = v;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.imageCount);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeActivityImageGridEditorBinding
    public void setImageGridItem(@Nullable ImageGridItem imageGridItem0) {
        this.mImageGridItem = imageGridItem0;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.vm == v) {
            this.setVm(((ImageGridViewModel)object0));
            return true;
        }
        if(BR.imageGridItem == v) {
            this.setImageGridItem(((ImageGridItem)object0));
            return true;
        }
        if(BR.imageCount == v) {
            this.setImageCount(((int)(((Integer)object0))));
            return true;
        }
        if(BR.flow == v) {
            this.setFlow(((EventFlow)object0));
            return true;
        }
        if(BR.dragState == v) {
            this.setDragState(((DragState)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityImageGridEditorBinding
    public void setVm(@Nullable ImageGridViewModel imageGridViewModel0) {
        this.mVm = imageGridViewModel0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
}

