package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class MaterialTextInputPicker extends c0 {
    public DateSelector A;
    public CalendarConstraints B;
    public int z;

    @NonNull
    public DateSelector getDateSelector() {
        DateSelector dateSelector0 = this.A;
        if(dateSelector0 == null) {
            throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
        }
        return dateSelector0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.z = bundle0.getInt("THEME_RES_ID_KEY");
        this.A = (DateSelector)bundle0.getParcelable("DATE_SELECTOR_KEY");
        this.B = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        LayoutInflater layoutInflater1 = layoutInflater0.cloneInContext(new ContextThemeWrapper(this.getContext(), this.z));
        return this.A.onCreateTextInputView(layoutInflater1, viewGroup0, bundle0, this.B, new x(this, 0));
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("THEME_RES_ID_KEY", this.z);
        bundle0.putParcelable("DATE_SELECTOR_KEY", this.A);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.B);
    }
}

