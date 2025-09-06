package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.m;
import java.util.Arrays;

public class DateValidatorPointBackward implements DateValidator {
    public static final Parcelable.Creator CREATOR;
    public final long a;

    static {
        DateValidatorPointBackward.CREATOR = new m(7);
    }

    public DateValidatorPointBackward(long v) {
        this.a = v;
    }

    @NonNull
    public static DateValidatorPointBackward before(long v) {
        return new DateValidatorPointBackward(v);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof DateValidatorPointBackward ? this.a == ((DateValidatorPointBackward)object0).a : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // com.google.android.material.datepicker.CalendarConstraints$DateValidator
    public boolean isValid(long v) {
        return v <= this.a;
    }

    @NonNull
    public static DateValidatorPointBackward now() {
        return DateValidatorPointBackward.before(i0.f().getTimeInMillis());
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
    }
}

