package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@KeepForSdk
@Class(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final long c;

    static {
        Feature.CREATOR = new zzc();
    }

    @Constructor
    public Feature(@NonNull @Param(id = 1) String s, @Param(id = 2) int v, @Param(id = 3) long v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @KeepForSdk
    public Feature(@NonNull String s, long v) {
        this.a = s;
        this.c = v;
        this.b = -1;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(@Nullable Object object0) {
        return object0 instanceof Feature && (this.getName() != null && this.getName().equals(((Feature)object0).getName()) || this.getName() == null && ((Feature)object0).getName() == null) && this.getVersion() == ((Feature)object0).getVersion();
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.a;
    }

    @KeepForSdk
    public long getVersion() {
        return this.c == -1L ? ((long)this.b) : this.c;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.getName(), this.getVersion()});
    }

    @Override
    @NonNull
    public final String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this);
        objects$ToStringHelper0.add("name", this.getName());
        objects$ToStringHelper0.add("version", this.getVersion());
        return objects$ToStringHelper0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.getName(), false);
        SafeParcelWriter.writeInt(parcel0, 2, this.b);
        SafeParcelWriter.writeLong(parcel0, 3, this.getVersion());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

