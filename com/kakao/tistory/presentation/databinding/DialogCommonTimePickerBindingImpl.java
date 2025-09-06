package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TimePicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.view.common.widget.CommonTimePickerTimeWidget;

public class DialogCommonTimePickerBindingImpl extends DialogCommonTimePickerBinding {
    public long a;
    public static final SparseIntArray b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        DialogCommonTimePickerBindingImpl.b = sparseIntArray0;
        sparseIntArray0.put(id.common_time_state_container, 1);
        sparseIntArray0.put(id.common_time_start, 2);
        sparseIntArray0.put(id.common_time_end, 3);
        sparseIntArray0.put(id.common_time_picker, 4);
        sparseIntArray0.put(id.common_dialog_left_button, 5);
        sparseIntArray0.put(id.common_dialog_divider2, 6);
        sparseIntArray0.put(id.common_dialog_right_button, 7);
    }

    public DialogCommonTimePickerBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 8, null, DialogCommonTimePickerBindingImpl.b);
        super(dataBindingComponent0, view0, 0, ((View)arr_object[6]), ((AppCompatButton)arr_object[5]), ((AppCompatButton)arr_object[7]), ((CommonTimePickerTimeWidget)arr_object[3]), ((TimePicker)arr_object[4]), ((CommonTimePickerTimeWidget)arr_object[2]), ((ConstraintLayout)arr_object[1]));
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

