package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    @NonNull
    public static final Parcelable.Creator CREATOR = null;
    public static final int DEVELOPER_ERROR = 10;
    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public static final ConnectionResult RESULT_SUCCESS = null;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    @KeepForSdk
    public static final int UNKNOWN = -1;
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String d;

    static {
        ConnectionResult.RESULT_SUCCESS = new ConnectionResult(0);
        ConnectionResult.CREATOR = new zzb();
    }

    public ConnectionResult(int v) {
        this(v, null, null);
    }

    public ConnectionResult(int v, int v1, PendingIntent pendingIntent0, String s) {
        this.a = v;
        this.b = v1;
        this.c = pendingIntent0;
        this.d = s;
    }

    public ConnectionResult(int v, @Nullable PendingIntent pendingIntent0) {
        this(v, pendingIntent0, null);
    }

    public ConnectionResult(int v, @Nullable PendingIntent pendingIntent0, @Nullable String s) {
        this(1, v, pendingIntent0, s);
    }

    public static String a(int v) {
        switch(v) {
            case -1: {
                return "UNKNOWN";
            }
            case 0: {
                return "SUCCESS";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 13: {
                return "CANCELED";
            }
            case 14: {
                return "TIMEOUT";
            }
            case 15: {
                return "INTERRUPTED";
            }
            case 16: {
                return "API_UNAVAILABLE";
            }
            case 17: {
                return "SIGN_IN_FAILED";
            }
            case 18: {
                return "SERVICE_UPDATING";
            }
            case 19: {
                return "SERVICE_MISSING_PERMISSION";
            }
            case 20: {
                return "RESTRICTED_PROFILE";
            }
            case 21: {
                return "API_VERSION_UPDATE_REQUIRED";
            }
            case 22: {
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
            }
            case 23: {
                return "API_DISABLED";
            }
            case 24: {
                return "API_DISABLED_FOR_CONNECTION";
            }
            case 99: {
                return "UNFINISHED";
            }
            case 1500: {
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
            default: {
                return "UNKNOWN_ERROR_CODE(" + v + ")";
            }
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof ConnectionResult ? this.b == ((ConnectionResult)object0).b && Objects.equal(this.c, ((ConnectionResult)object0).c) && Objects.equal(this.d, ((ConnectionResult)object0).d) : false;
    }

    public int getErrorCode() {
        return this.b;
    }

    @Nullable
    public String getErrorMessage() {
        return this.d;
    }

    @Nullable
    public PendingIntent getResolution() {
        return this.c;
    }

    public boolean hasResolution() {
        return this.b != 0 && this.c != null;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.b, this.c, this.d});
    }

    public boolean isSuccess() {
        return this.b == 0;
    }

    public void startResolutionForResult(@NonNull Activity activity0, int v) throws IntentSender.SendIntentException {
        if(!this.hasResolution()) {
            return;
        }
        Preconditions.checkNotNull(this.c);
        activity0.startIntentSenderForResult(this.c.getIntentSender(), v, null, 0, 0, 0);
    }

    @Override
    @NonNull
    public String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this);
        objects$ToStringHelper0.add("statusCode", ConnectionResult.a(this.b));
        objects$ToStringHelper0.add("resolution", this.c);
        objects$ToStringHelper0.add("message", this.d);
        return objects$ToStringHelper0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeInt(parcel0, 2, this.getErrorCode());
        SafeParcelWriter.writeParcelable(parcel0, 3, this.getResolution(), v, false);
        SafeParcelWriter.writeString(parcel0, 4, this.getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

