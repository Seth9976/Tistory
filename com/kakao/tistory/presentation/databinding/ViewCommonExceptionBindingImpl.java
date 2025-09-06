package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;

public class ViewCommonExceptionBindingImpl extends ViewCommonExceptionBinding {
    public long a;
    public static final SparseIntArray b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        ViewCommonExceptionBindingImpl.b = sparseIntArray0;
        sparseIntArray0.put(id.common_exception_padding_top, 3);
        sparseIntArray0.put(id.common_exception_refresh_button, 4);
        sparseIntArray0.put(id.common_exception_emoji_text, 5);
    }

    public ViewCommonExceptionBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 6, null, ViewCommonExceptionBindingImpl.b);
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[5]), ((TextView)arr_object[2]), ((View)arr_object[3]), ((AppCompatButton)arr_object[4]), ((TextView)arr_object[1]));
        this.a = -1L;
        this.commonExceptionMessageText.setTag(null);
        this.commonExceptionTitleText.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            long v = this.a;
            this.a = 0L;
        }
        String s = this.mTitle;
        CharSequence charSequence0 = this.mMessage;
        if((v & 6L) != 0L) {
            CommonBindingAdapter.bindText(this.commonExceptionMessageText, charSequence0);
        }
        if((5L & v) != 0L) {
            CommonBindingAdapter.bindText(this.commonExceptionTitleText, s, false, false);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.a != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.a = 4L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.ViewCommonExceptionBinding
    public void setMessage(@Nullable CharSequence charSequence0) {
        this.mMessage = charSequence0;
        synchronized(this) {
            this.a |= 2L;
        }
        this.notifyPropertyChanged(BR.message);
        super.requestRebind();
    }

    @Override  // com.kakao.tistory.presentation.databinding.ViewCommonExceptionBinding
    public void setTitle(@Nullable String s) {
        this.mTitle = s;
        synchronized(this) {
            this.a |= 1L;
        }
        this.notifyPropertyChanged(BR.title);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.title == v) {
            this.setTitle(((String)object0));
            return true;
        }
        if(BR.message == v) {
            this.setMessage(((CharSequence)object0));
            return true;
        }
        return false;
    }
}

