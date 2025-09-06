package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CalendarView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.id;

public class DialogCommonDatePickerBindingImpl extends DialogCommonDatePickerBinding {
    public long a;
    public static final SparseIntArray b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        DialogCommonDatePickerBindingImpl.b = sparseIntArray0;
        sparseIntArray0.put(id.common_date_picker, 1);
        sparseIntArray0.put(id.common_date_picker_divider1, 2);
        sparseIntArray0.put(id.common_date_picker_left_button, 3);
        sparseIntArray0.put(id.common_date_picker_divider2, 4);
        sparseIntArray0.put(id.common_date_picker_right_button, 5);
    }

    public DialogCommonDatePickerBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 6, null, DialogCommonDatePickerBindingImpl.b);
        super(dataBindingComponent0, view0, 0, ((CalendarView)arr_object[1]), ((View)arr_object[2]), ((View)arr_object[4]), ((AppCompatButton)arr_object[3]), ((AppCompatButton)arr_object[5]));
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

