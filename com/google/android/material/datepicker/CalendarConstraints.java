package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

public final class CalendarConstraints implements Parcelable {
    public static final class Builder {
        public long a;
        public long b;
        public Long c;
        public int d;
        public DateValidator e;
        public static final long f;
        public static final long g;

        static {
            Builder.f = i0.a(y.b(1900, 0).f);
            Builder.g = i0.a(y.b(2100, 11).f);
        }

        public Builder() {
            this.a = Builder.f;
            this.b = Builder.g;
            this.e = DateValidatorPointForward.from(0x8000000000000000L);
        }

        @NonNull
        public CalendarConstraints build() {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            y y0 = y.c(this.a);
            y y1 = y.c(this.b);
            Parcelable parcelable0 = bundle0.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            return this.c == null ? new CalendarConstraints(y0, y1, ((DateValidator)parcelable0), null, this.d) : new CalendarConstraints(y0, y1, ((DateValidator)parcelable0), y.c(((long)this.c)), this.d);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setEnd(long v) {
            this.b = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int v) {
            this.d = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOpenAt(long v) {
            this.c = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setStart(long v) {
            this.a = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setValidator(@NonNull DateValidator calendarConstraints$DateValidator0) {
            Objects.requireNonNull(calendarConstraints$DateValidator0, "validator cannot be null");
            this.e = calendarConstraints$DateValidator0;
            return this;
        }
    }

    public interface DateValidator extends Parcelable {
        boolean isValid(long arg1);
    }

    public static final Parcelable.Creator CREATOR;
    public final y a;
    public final y b;
    public final DateValidator c;
    public y d;
    public final int e;
    public final int f;
    public final int g;

    static {
        CalendarConstraints.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public CalendarConstraints(y y0, y y1, DateValidator calendarConstraints$DateValidator0, y y2, int v) {
        Objects.requireNonNull(y0, "start cannot be null");
        Objects.requireNonNull(y1, "end cannot be null");
        Objects.requireNonNull(calendarConstraints$DateValidator0, "validator cannot be null");
        this.a = y0;
        this.b = y1;
        this.d = y2;
        this.e = v;
        this.c = calendarConstraints$DateValidator0;
        if(y2 != null && y0.a.compareTo(y2.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if(y2 != null && y2.a.compareTo(y1.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if(v < 0 || v > i0.g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.g = y0.e(y1) + 1;
        this.f = y1.c - y0.c + 1;
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
        return object0 instanceof CalendarConstraints ? this.a.equals(((CalendarConstraints)object0).a) && this.b.equals(((CalendarConstraints)object0).b) && ObjectsCompat.equals(this.d, ((CalendarConstraints)object0).d) && this.e == ((CalendarConstraints)object0).e && this.c.equals(((CalendarConstraints)object0).c) : false;
    }

    public DateValidator getDateValidator() {
        return this.c;
    }

    public long getEndMs() {
        return this.b.f;
    }

    @Nullable
    public Long getOpenAtMs() {
        return this.d == null ? null : this.d.f;
    }

    public long getStartMs() {
        return this.a.f;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.e, this.c});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.a, 0);
        parcel0.writeParcelable(this.b, 0);
        parcel0.writeParcelable(this.d, 0);
        parcel0.writeParcelable(this.c, 0);
        parcel0.writeInt(this.e);
    }
}

