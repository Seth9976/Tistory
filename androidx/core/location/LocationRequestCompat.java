package androidx.core.location;

import a5.b;
import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build.VERSION;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import g.a;
import g3.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class LocationRequestCompat {
    public static final class Builder {
        public long a;
        public int b;
        public long c;
        public int d;
        public long e;
        public float f;
        public long g;

        public Builder(long v) {
            this.setIntervalMillis(v);
            this.b = 102;
            this.c = 0x7FFFFFFFFFFFFFFFL;
            this.d = 0x7FFFFFFF;
            this.e = -1L;
            this.f = 0.0f;
            this.g = 0L;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat0) {
            this.a = locationRequestCompat0.b;
            this.b = locationRequestCompat0.a;
            this.c = locationRequestCompat0.d;
            this.d = locationRequestCompat0.e;
            this.e = locationRequestCompat0.c;
            this.f = locationRequestCompat0.f;
            this.g = locationRequestCompat0.g;
        }

        @NonNull
        public LocationRequestCompat build() {
            Preconditions.checkState(this.a != 0x7FFFFFFFFFFFFFFFL || this.e != -1L, "passive location requests must have an explicit minimum update interval");
            return new LocationRequestCompat(this.a, this.b, this.c, this.d, Math.min(this.e, this.a), this.f, this.g);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.e = -1L;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@IntRange(from = 1L) long v) {
            this.c = Preconditions.checkArgumentInRange(v, 1L, 0x7FFFFFFFFFFFFFFFL, "durationMillis");
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@IntRange(from = 0L) long v) {
            this.a = Preconditions.checkArgumentInRange(v, 0L, 0x7FFFFFFFFFFFFFFFL, "intervalMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0L) long v) {
            this.g = Preconditions.checkArgumentInRange(v, 0L, 0x7FFFFFFFFFFFFFFFL, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@IntRange(from = 1L, to = 0x7FFFFFFFL) int v) {
            this.d = Preconditions.checkArgumentInRange(v, 1, 0x7FFFFFFF, "maxUpdates");
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0, to = 3.402823E+38) float f) {
            this.f = Preconditions.checkArgumentInRange(f, 0.0f, 3.402823E+38f, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0L) long v) {
            this.e = Preconditions.checkArgumentInRange(v, 0L, 0x7FFFFFFFFFFFFFFFL, "minUpdateIntervalMillis");
            return this;
        }

        @NonNull
        public Builder setQuality(int v) {
            Preconditions.checkArgument(v == 100 || v == 102 || v == 104, "quality must be a defined QUALITY constant, not %d", new Object[]{v});
            this.b = v;
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    public static final long PASSIVE_INTERVAL = 0x7FFFFFFFFFFFFFFFL;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final float f;
    public final long g;

    public LocationRequestCompat(long v, int v1, long v2, int v3, long v4, float f, long v5) {
        this.b = v;
        this.a = v1;
        this.c = v4;
        this.d = v2;
        this.e = v3;
        this.f = f;
        this.g = v5;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LocationRequestCompat ? this.a == ((LocationRequestCompat)object0).a && this.b == ((LocationRequestCompat)object0).b && this.c == ((LocationRequestCompat)object0).c && this.d == ((LocationRequestCompat)object0).d && this.e == ((LocationRequestCompat)object0).e && Float.compare(((LocationRequestCompat)object0).f, this.f) == 0 && this.g == ((LocationRequestCompat)object0).g : false;
    }

    @IntRange(from = 1L)
    public long getDurationMillis() {
        return this.d;
    }

    @IntRange(from = 0L)
    public long getIntervalMillis() {
        return this.b;
    }

    @IntRange(from = 0L)
    public long getMaxUpdateDelayMillis() {
        return this.g;
    }

    @IntRange(from = 1L, to = 0x7FFFFFFFL)
    public int getMaxUpdates() {
        return this.e;
    }

    @FloatRange(from = 0.0, to = 3.402823E+38)
    public float getMinUpdateDistanceMeters() {
        return this.f;
    }

    @IntRange(from = 0L)
    public long getMinUpdateIntervalMillis() {
        return this.c == -1L ? this.b : this.c;
    }

    public int getQuality() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return (this.a * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
    }

    @NonNull
    @RequiresApi(0x1F)
    public LocationRequest toLocationRequest() {
        return x.a(this);
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public LocationRequest toLocationRequest(@NonNull String s) {
        Object object0 = null;
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return this.toLocationRequest();
        }
        try {
            if(a.e == null) {
                a.e = LocationRequest.class;
            }
            if(a.f == null) {
                Method method0 = a.e.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                a.f = method0;
                method0.setAccessible(true);
            }
            Object object1 = a.f.invoke(null, s, this.getIntervalMillis(), this.getMinUpdateDistanceMeters(), Boolean.FALSE);
            if(object1 != null) {
                if(a.g == null) {
                    Method method1 = a.e.getDeclaredMethod("setQuality", Integer.TYPE);
                    a.g = method1;
                    method1.setAccessible(true);
                }
                a.g.invoke(object1, this.getQuality());
                if(a.h == null) {
                    Method method2 = a.e.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    a.h = method2;
                    method2.setAccessible(true);
                }
                a.h.invoke(object1, this.getMinUpdateIntervalMillis());
                if(this.getMaxUpdates() < 0x7FFFFFFF) {
                    if(a.i == null) {
                        Method method3 = a.e.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        a.i = method3;
                        method3.setAccessible(true);
                    }
                    a.i.invoke(object1, this.getMaxUpdates());
                }
                if(this.getDurationMillis() < 0x7FFFFFFFFFFFFFFFL) {
                    if(a.j == null) {
                        Method method4 = a.e.getDeclaredMethod("setExpireIn", Long.TYPE);
                        a.j = method4;
                        method4.setAccessible(true);
                    }
                    a.j.invoke(object1, this.getDurationMillis());
                }
                object0 = object1;
            }
        }
        catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException | ClassNotFoundException unused_ex) {
        }
        return (LocationRequest)object0;
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = b.t("Request[");
        long v = this.b;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append("PASSIVE");
        }
        else {
            stringBuilder0.append("@");
            TimeUtils.formatDuration(v, stringBuilder0);
            switch(this.a) {
                case 100: {
                    stringBuilder0.append(" HIGH_ACCURACY");
                    break;
                }
                case 102: {
                    stringBuilder0.append(" BALANCED");
                    break;
                }
                case 104: {
                    stringBuilder0.append(" LOW_POWER");
                }
            }
        }
        long v1 = this.d;
        if(v1 != 0x7FFFFFFFFFFFFFFFL) {
            stringBuilder0.append(", duration=");
            TimeUtils.formatDuration(v1, stringBuilder0);
        }
        int v2 = this.e;
        if(v2 != 0x7FFFFFFF) {
            stringBuilder0.append(", maxUpdates=");
            stringBuilder0.append(v2);
        }
        long v3 = this.c;
        if(v3 != -1L && v3 < v) {
            stringBuilder0.append(", minUpdateInterval=");
            TimeUtils.formatDuration(v3, stringBuilder0);
        }
        float f = this.f;
        if(((double)f) > 0.0) {
            stringBuilder0.append(", minUpdateDistance=");
            stringBuilder0.append(f);
        }
        long v4 = this.g;
        if(v4 / 2L > v) {
            stringBuilder0.append(", maxUpdateDelay=");
            TimeUtils.formatDuration(v4, stringBuilder0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

