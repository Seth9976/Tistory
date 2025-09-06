package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.m;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
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
import java.util.TimeZone;

@RestrictTo({Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR;
    public CharSequence a;
    public String b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public SimpleDateFormat g;

    static {
        RangeDateSelector.CREATOR = new m(10);
    }

    public RangeDateSelector() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public static void a(RangeDateSelector rangeDateSelector0, TextInputLayout textInputLayout0, TextInputLayout textInputLayout1, OnSelectionChangedListener onSelectionChangedListener0) {
        Long long0 = rangeDateSelector0.e;
        if(long0 == null || rangeDateSelector0.f == null) {
            if(textInputLayout0.getError() != null && rangeDateSelector0.b.contentEquals(textInputLayout0.getError())) {
                textInputLayout0.setError(null);
            }
            if(textInputLayout1.getError() != null && " ".contentEquals(textInputLayout1.getError())) {
                textInputLayout1.setError(null);
            }
            onSelectionChangedListener0.onIncompleteSelectionChanged();
        }
        else if(((long)long0) <= ((long)rangeDateSelector0.f)) {
            rangeDateSelector0.c = rangeDateSelector0.e;
            rangeDateSelector0.d = rangeDateSelector0.f;
            onSelectionChangedListener0.onSelectionChanged(rangeDateSelector0.getSelection());
        }
        else {
            textInputLayout0.setError(rangeDateSelector0.b);
            textInputLayout1.setError(" ");
            onSelectionChangedListener0.onIncompleteSelectionChanged();
        }
        if(!TextUtils.isEmpty(textInputLayout0.getError())) {
            rangeDateSelector0.a = textInputLayout0.getError();
            return;
        }
        if(!TextUtils.isEmpty(textInputLayout1.getError())) {
            rangeDateSelector0.a = textInputLayout1.getError();
            return;
        }
        rangeDateSelector0.a = null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
        int v = resources0.getDimensionPixelSize(dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis);
        return Math.min(displayMetrics0.widthPixels, displayMetrics0.heightPixels) <= v ? MaterialAttributes.resolveOrThrow(context0, attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName()) : MaterialAttributes.resolveOrThrow(context0, attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return string.mtrl_picker_range_header_title;
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
        Long long0 = this.c;
        if(long0 != null) {
            ((ArrayList)collection0).add(long0);
        }
        Long long1 = this.d;
        if(long1 != null) {
            ((ArrayList)collection0).add(long1);
        }
        return collection0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection getSelectedRanges() {
        Collection collection0 = new ArrayList();
        ((ArrayList)collection0).add(new Pair(this.c, this.d));
        return collection0;
    }

    @NonNull
    public Pair getSelection() {
        return new Pair(this.c, this.d);
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Object getSelection() {
        return this.getSelection();
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        Pair pair0 = j.a(this.c, this.d);
        String s = pair0.first == null ? resources0.getString(string.mtrl_picker_announce_current_selection_none) : ((String)pair0.first);
        Object object0 = pair0.second;
        if(object0 == null) {
            String s1 = resources0.getString(string.mtrl_picker_announce_current_selection_none);
            return resources0.getString(string.mtrl_picker_announce_current_range_selection, new Object[]{s, s1});
        }
        return resources0.getString(string.mtrl_picker_announce_current_range_selection, new Object[]{s, ((String)object0)});
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        Long long0 = this.c;
        if(long0 == null && this.d == null) {
            return resources0.getString(string.mtrl_picker_range_header_unselected);
        }
        Long long1 = this.d;
        if(long1 == null) {
            return resources0.getString(string.mtrl_picker_range_header_only_start_selected, new Object[]{j.b(((long)long0))});
        }
        if(long0 == null) {
            return resources0.getString(string.mtrl_picker_range_header_only_end_selected, new Object[]{j.b(((long)long1))});
        }
        Pair pair0 = j.a(long0, long1);
        return resources0.getString(string.mtrl_picker_range_header_selected, new Object[]{pair0.first, pair0.second});
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.c != null && this.d != null && ((long)this.c) <= ((long)this.d);
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0, CalendarConstraints calendarConstraints0, @NonNull OnSelectionChangedListener onSelectionChangedListener0) {
        boolean z = false;
        View view0 = layoutInflater0.inflate(layout.mtrl_picker_text_input_date_range, viewGroup0, false);
        View view1 = view0.findViewById(id.mtrl_picker_text_input_range_start);
        View view2 = view0.findViewById(id.mtrl_picker_text_input_range_end);
        EditText editText0 = ((TextInputLayout)view1).getEditText();
        EditText editText1 = ((TextInputLayout)view2).getEditText();
        if(ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText0.setInputType(17);
            editText1.setInputType(17);
        }
        this.b = view0.getResources().getString(string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat0 = this.g;
        if(simpleDateFormat0 == null) {
            simpleDateFormat0 = i0.d();
        }
        else {
            z = true;
        }
        Long long0 = this.c;
        if(long0 != null) {
            editText0.setText(simpleDateFormat0.format(long0));
            this.e = this.c;
        }
        Long long1 = this.d;
        if(long1 != null) {
            editText1.setText(simpleDateFormat0.format(long1));
            this.f = this.d;
        }
        String s = z ? simpleDateFormat0.toPattern() : i0.e(view0.getResources(), simpleDateFormat0);
        ((TextInputLayout)view1).setPlaceholderText(s);
        ((TextInputLayout)view2).setPlaceholderText(s);
        editText0.addTextChangedListener(new d0(this, s, simpleDateFormat0, ((TextInputLayout)view1), calendarConstraints0, ((TextInputLayout)view1), ((TextInputLayout)view2), onSelectionChangedListener0, 0));
        editText1.addTextChangedListener(new d0(this, s, simpleDateFormat0, ((TextInputLayout)view2), calendarConstraints0, ((TextInputLayout)view1), ((TextInputLayout)view2), onSelectionChangedListener0, 1));
        DateSelector.showKeyboardWithAutoHideBehavior(new EditText[]{editText0, editText1});
        return view0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void select(long v) {
        Long long0 = this.c;
        if(long0 == null) {
            this.c = v;
            return;
        }
        if(this.d == null && ((long)long0) <= v) {
            this.d = v;
            return;
        }
        this.d = null;
        this.c = v;
    }

    public void setSelection(@NonNull Pair pair0) {
        Object object0 = pair0.first;
        if(object0 != null && pair0.second != null) {
            Preconditions.checkArgument(((long)(((Long)object0))) <= ((long)(((Long)pair0.second))));
        }
        Long long0 = null;
        this.c = pair0.first == null ? null : i0.a(((long)(((Long)pair0.first))));
        Object object1 = pair0.second;
        if(object1 != null) {
            long0 = i0.a(((long)(((Long)object1))));
        }
        this.d = long0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void setSelection(@NonNull Object object0) {
        this.setSelection(((Pair)object0));
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat0) {
        if(simpleDateFormat0 != null) {
            DateFormat dateFormat0 = (DateFormat)simpleDateFormat0.clone();
            dateFormat0.setTimeZone(TimeZone.getTimeZone("UTC"));
            simpleDateFormat0 = (SimpleDateFormat)dateFormat0;
        }
        this.g = simpleDateFormat0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeValue(this.c);
        parcel0.writeValue(this.d);
    }
}

