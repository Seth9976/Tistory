package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.activity.h;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import java.text.SimpleDateFormat;
import java.util.Collection;

@RestrictTo({Scope.LIBRARY_GROUP})
public interface DateSelector extends Parcelable {
    @StyleRes
    int getDefaultThemeResId(Context arg1);

    @StringRes
    int getDefaultTitleResId();

    @Nullable
    String getError();

    @NonNull
    Collection getSelectedDays();

    @NonNull
    Collection getSelectedRanges();

    @Nullable
    Object getSelection();

    @NonNull
    String getSelectionContentDescription(@NonNull Context arg1);

    @NonNull
    String getSelectionDisplayString(Context arg1);

    boolean isSelectionComplete();

    @NonNull
    View onCreateTextInputView(@NonNull LayoutInflater arg1, @Nullable ViewGroup arg2, @Nullable Bundle arg3, @NonNull CalendarConstraints arg4, @NonNull OnSelectionChangedListener arg5);

    void select(long arg1);

    void setSelection(@NonNull Object arg1);

    void setTextInputFormat(@Nullable SimpleDateFormat arg1);

    static void showKeyboardWithAutoHideBehavior(@NonNull EditText[] arr_editText) {
        if(arr_editText.length == 0) {
            return;
        }
        i i0 = new i(arr_editText, 0);
        for(int v = 0; v < arr_editText.length; ++v) {
            arr_editText[v].setOnFocusChangeListener(i0);
        }
        EditText editText0 = arr_editText[0];
        editText0.postDelayed(new h(editText0, 11), 100L);
    }
}

