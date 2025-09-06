package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.m;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.TimeZone;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR;
    public CharSequence a;
    public Long b;
    public SimpleDateFormat c;

    static {
        SingleDateSelector.CREATOR = new m(11);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context0) {
        return MaterialAttributes.resolveOrThrow(context0, attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return string.mtrl_picker_date_header_title;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        return TextUtils.isEmpty(this.a) ? null : this.a.toString();
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection getSelectedDays() {
        Collection collection0 = new ArrayList();
        Long long0 = this.b;
        if(long0 != null) {
            ((ArrayList)collection0).add(long0);
        }
        return collection0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection getSelectedRanges() {
        return new ArrayList();
    }

    @Nullable
    public Long getSelection() {
        return this.b;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @Nullable
    public Object getSelection() {
        return this.getSelection();
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context0) {
        String s;
        Resources resources0 = context0.getResources();
        Long long0 = this.b;
        if(long0 == null) {
            s = resources0.getString(string.mtrl_picker_announce_current_selection_none);
            return resources0.getString(string.mtrl_picker_announce_current_selection, new Object[]{s});
        }
        s = j.d(((long)long0), Locale.getDefault());
        return resources0.getString(string.mtrl_picker_announce_current_selection, new Object[]{s});
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        Long long0 = this.b;
        if(long0 == null) {
            return resources0.getString(string.mtrl_picker_date_header_unselected);
        }
        Object[] arr_object = {j.d(((long)long0), Locale.getDefault())};
        return resources0.getString(string.mtrl_picker_date_header_selected, arr_object);
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.b != null;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0, CalendarConstraints calendarConstraints0, @NonNull OnSelectionChangedListener onSelectionChangedListener0) {
        boolean z = false;
        View view0 = layoutInflater0.inflate(layout.mtrl_picker_text_input_date, viewGroup0, false);
        View view1 = view0.findViewById(id.mtrl_picker_text_input_date);
        EditText editText0 = ((TextInputLayout)view1).getEditText();
        if(ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText0.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat0 = this.c;
        if(simpleDateFormat0 == null) {
            simpleDateFormat0 = i0.d();
        }
        else {
            z = true;
        }
        String s = z ? simpleDateFormat0.toPattern() : i0.e(view0.getResources(), simpleDateFormat0);
        ((TextInputLayout)view1).setPlaceholderText(s);
        Long long0 = this.b;
        if(long0 != null) {
            editText0.setText(simpleDateFormat0.format(long0));
        }
        editText0.addTextChangedListener(new e0(this, s, simpleDateFormat0, ((TextInputLayout)view1), calendarConstraints0, onSelectionChangedListener0, ((TextInputLayout)view1)));
        DateSelector.showKeyboardWithAutoHideBehavior(new EditText[]{editText0});
        return view0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void select(long v) {
        this.b = v;
    }

    public void setSelection(@Nullable Long long0) {
        this.b = long0 == null ? null : i0.a(((long)long0));
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void setSelection(@Nullable Object object0) {
        this.setSelection(((Long)object0));
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat0) {
        if(simpleDateFormat0 != null) {
            DateFormat dateFormat0 = (DateFormat)simpleDateFormat0.clone();
            dateFormat0.setTimeZone(TimeZone.getTimeZone("UTC"));
            simpleDateFormat0 = (SimpleDateFormat)dateFormat0;
        }
        this.c = simpleDateFormat0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeValue(this.b);
    }
}

