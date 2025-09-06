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
import com.kakao.tistory.presentation.R.id;

public class DialogCommonBindingImpl extends DialogCommonBinding {
    public long a;
    public static final SparseIntArray b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        DialogCommonBindingImpl.b = sparseIntArray0;
        sparseIntArray0.put(id.common_dialog_title_text, 1);
        sparseIntArray0.put(id.common_dialog_message_text, 2);
        sparseIntArray0.put(id.common_dialog_divider1, 3);
        sparseIntArray0.put(id.common_dialog_left_button, 4);
        sparseIntArray0.put(id.common_dialog_divider2, 5);
        sparseIntArray0.put(id.common_dialog_right_button, 6);
    }

    public DialogCommonBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 7, null, DialogCommonBindingImpl.b);
        super(dataBindingComponent0, view0, 0, ((View)arr_object[3]), ((View)arr_object[5]), ((AppCompatButton)arr_object[4]), ((TextView)arr_object[2]), ((AppCompatButton)arr_object[6]), ((TextView)arr_object[1]));
        this.a = -1L;
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            this.a = 0L;
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
            this.a = 1L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        return true;
    }
}

