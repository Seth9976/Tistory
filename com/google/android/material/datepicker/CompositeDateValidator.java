package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import java.util.List;

public final class CompositeDateValidator implements DateValidator {
    interface Operator {
        int getId();

        boolean isValid(@NonNull List arg1, long arg2);
    }

    public static final Parcelable.Creator CREATOR;
    public final Operator a;
    public final List b;
    public static final d c;
    public static final e d;

    static {
        CompositeDateValidator.c = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        CompositeDateValidator.d = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        CompositeDateValidator.CREATOR = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public CompositeDateValidator(List list0, Operator compositeDateValidator$Operator0) {
        this.b = list0;
        this.a = compositeDateValidator$Operator0;
    }

    @NonNull
    public static DateValidator allOf(@NonNull List list0) {
        return new CompositeDateValidator(list0, CompositeDateValidator.d);
    }

    @NonNull
    public static DateValidator anyOf(@NonNull List list0) {
        return new CompositeDateValidator(list0, CompositeDateValidator.c);
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
        return object0 instanceof CompositeDateValidator ? this.b.equals(((CompositeDateValidator)object0).b) && this.a.getId() == ((CompositeDateValidator)object0).a.getId() : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override  // com.google.android.material.datepicker.CalendarConstraints$DateValidator
    public boolean isValid(long v) {
        return this.a.isValid(this.b, v);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeList(this.b);
        parcel0.writeInt(this.a.getId());
    }
}

