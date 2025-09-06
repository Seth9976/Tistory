package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

@Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_CANCELED;
    @NonNull
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_INTERNAL_ERROR;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_INTERRUPTED;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    @VisibleForTesting
    public static final Status RESULT_SUCCESS;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    @VisibleForTesting
    public static final Status RESULT_SUCCESS_CACHE;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final Status RESULT_TIMEOUT;
    public final int a;
    public final int b;
    public final String c;
    public final PendingIntent d;
    public final ConnectionResult e;
    @NonNull
    @ShowFirstParty
    public static final Status zza;

    static {
        Status.RESULT_SUCCESS_CACHE = new Status(-1);
        Status.RESULT_SUCCESS = new Status(0);
        Status.RESULT_INTERRUPTED = new Status(14);
        Status.RESULT_INTERNAL_ERROR = new Status(8);
        Status.RESULT_TIMEOUT = new Status(15);
        Status.RESULT_CANCELED = new Status(16);
        Status.zza = new Status(17);
        Status.RESULT_DEAD_CLIENT = new Status(18);
        Status.CREATOR = new zzb();
    }

    public Status(int v) {
        this(v, null);
    }

    public Status(int v, int v1, String s, PendingIntent pendingIntent0, ConnectionResult connectionResult0) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = pendingIntent0;
        this.e = connectionResult0;
    }

    public Status(int v, @Nullable String s) {
        this(1, v, s, null, null);
    }

    public Status(int v, @Nullable String s, @Nullable PendingIntent pendingIntent0) {
        this(1, v, s, pendingIntent0, null);
    }

    public Status(@NonNull ConnectionResult connectionResult0, @NonNull String s) {
        this(connectionResult0, s, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult0, @NonNull String s, int v) {
        this(1, v, s, connectionResult0.getResolution(), connectionResult0);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Status ? this.a == ((Status)object0).a && this.b == ((Status)object0).b && Objects.equal(this.c, ((Status)object0).c) && Objects.equal(this.d, ((Status)object0).d) && Objects.equal(this.e, ((Status)object0).e) : false;
    }

    @Nullable
    public ConnectionResult getConnectionResult() {
        return this.e;
    }

    @Nullable
    public PendingIntent getResolution() {
        return this.d;
    }

    @Override  // com.google.android.gms.common.api.Result
    @NonNull
    @CanIgnoreReturnValue
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.b;
    }

    @Nullable
    public String getStatusMessage() {
        return this.c;
    }

    @VisibleForTesting
    public boolean hasResolution() {
        return this.d != null;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public boolean isCanceled() {
        return this.b == 16;
    }

    public boolean isInterrupted() {
        return this.b == 14;
    }

    @CheckReturnValue
    public boolean isSuccess() {
        return this.b <= 0;
    }

    public void startResolutionForResult(@NonNull Activity activity0, int v) throws IntentSender.SendIntentException {
        if(!this.hasResolution()) {
            return;
        }
        Preconditions.checkNotNull(this.d);
        activity0.startIntentSenderForResult(this.d.getIntentSender(), v, null, 0, 0, 0);
    }

    @Override
    @NonNull
    public String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this);
        objects$ToStringHelper0.add("statusCode", this.zza());
        objects$ToStringHelper0.add("resolution", this.d);
        return objects$ToStringHelper0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getStatusCode());
        SafeParcelWriter.writeString(parcel0, 2, this.getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.d, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.getConnectionResult(), v, false);
        SafeParcelWriter.writeInt(parcel0, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @NonNull
    public final String zza() {
        return this.c == null ? CommonStatusCodes.getStatusCodeString(this.b) : this.c;
    }
}

