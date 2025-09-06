package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
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
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.itemspec.grammarcheck.SingleGrammarCheck;
import com.kakao.keditor.standard.BindingAdapters;

public class KeViewGrammarEditBottomAreaBindingImpl extends KeViewGrammarEditBottomAreaBinding {
    private long mDirtyFlags;
    @NonNull
    private final ConstraintLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeViewGrammarEditBottomAreaBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_grammar_iterate_buttons, 5);
    }

    public KeViewGrammarEditBottomAreaBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 6, KeViewGrammarEditBottomAreaBindingImpl.sIncludes, KeViewGrammarEditBottomAreaBindingImpl.sViewsWithIds));
    }

    private KeViewGrammarEditBottomAreaBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[4]), ((TextView)arr_object[3]), ((EditText)arr_object[1]), ((TextView)arr_object[2]), ((LinearLayout)arr_object[5]));
        this.mDirtyFlags = -1L;
        this.keGrammarBtnEdit.setTag(null);
        this.keGrammarBtnPass.setTag(null);
        this.keGrammarEditText.setTag(null);
        this.keGrammarErrorMessage.setTag(null);
        this.mboundView0 = (ConstraintLayout)arr_object[0];
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s1;
        String s;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        SingleGrammarCheck singleGrammarCheck0 = this.mCurrentGrammarError;
        int v1 = Long.compare(3L & v, 0L);
        if(v1 == 0 || singleGrammarCheck0 == null) {
            s1 = null;
            s = null;
        }
        else {
            s = singleGrammarCheck0.getOutput();
            s1 = singleGrammarCheck0.getErrorMessage(this.getRoot().getContext());
        }
        if((v & 2L) != 0L) {
            BindingAdapters.applyAccessibilityInfo(this.keGrammarBtnEdit, true, null, null);
            BindingAdapters.applyAccessibilityInfo(this.keGrammarBtnPass, true, null, null);
        }
        if(v1 != 0) {
            TextViewBindingAdapter.setText(this.keGrammarEditText, s);
            TextViewBindingAdapter.setText(this.keGrammarErrorMessage, s1);
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
            this.mDirtyFlags = 2L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeViewGrammarEditBottomAreaBinding
    public void setCurrentGrammarError(@Nullable SingleGrammarCheck singleGrammarCheck0) {
        this.mCurrentGrammarError = singleGrammarCheck0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.currentGrammarError);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.currentGrammarError == v) {
            this.setCurrentGrammarError(((SingleGrammarCheck)object0));
            return true;
        }
        return false;
    }
}

