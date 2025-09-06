package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarEditBottomView;

public class KeActivityGrammarCheckBindingImpl extends KeActivityGrammarCheckBinding {
    private long mDirtyFlags;
    @NonNull
    private final ConstraintLayout mboundView0;
    @NonNull
    private final TextView mboundView1;
    @NonNull
    private final TextView mboundView2;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeActivityGrammarCheckBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_grammar_checker_top, 3);
        sparseIntArray0.put(id.ke_close, 4);
        sparseIntArray0.put(id.ke_grammar_index, 5);
        sparseIntArray0.put(id.ke_grammar_editor_view, 6);
        sparseIntArray0.put(id.ke_grammar_edit_window, 7);
    }

    public KeActivityGrammarCheckBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 8, KeActivityGrammarCheckBindingImpl.sIncludes, KeActivityGrammarCheckBindingImpl.sViewsWithIds));
    }

    private KeActivityGrammarCheckBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[4]), ((FrameLayout)arr_object[3]), ((GrammarEditBottomView)arr_object[7]), ((KeditorView)arr_object[6]), ((LinearLayout)arr_object[5]));
        this.mDirtyFlags = -1L;
        this.mboundView0 = (ConstraintLayout)arr_object[0];
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.mboundView1 = (TextView)arr_object[1];
        ((TextView)arr_object[1]).setTag(null);
        this.mboundView2 = (TextView)arr_object[2];
        ((TextView)arr_object[2]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        int v1 = this.mCurrentIndex;
        int v2 = Long.compare(5L & v, 0L);
        String s = null;
        String s1 = v2 == 0 ? null : "/" + Integer.toString(this.mTotalCount);
        int v3 = Long.compare(v & 6L, 0L);
        if(v3 != 0) {
            s = Integer.toString(v1);
        }
        if(v3 != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, s);
        }
        if(v2 != 0) {
            TextViewBindingAdapter.setText(this.mboundView2, s1);
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
            this.mDirtyFlags = 4L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeActivityGrammarCheckBinding
    public void setCurrentIndex(int v) {
        this.mCurrentIndex = v;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.currentIndex);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeActivityGrammarCheckBinding
    public void setTotalCount(int v) {
        this.mTotalCount = v;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.totalCount);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.totalCount == v) {
            this.setTotalCount(((int)(((Integer)object0))));
            return true;
        }
        if(BR.currentIndex == v) {
            this.setCurrentIndex(((int)(((Integer)object0))));
            return true;
        }
        return false;
    }
}

