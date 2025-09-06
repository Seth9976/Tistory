package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.w0;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final Handler b;
    public IResultReceiver c;

    static {
        ResultReceiver.CREATOR = new m(17);
    }

    public ResultReceiver(Handler handler0) {
        this.a = true;
        this.b = handler0;
    }

    public ResultReceiver(Parcel parcel0) {
        this.a = false;
        this.b = null;
        this.c = Stub.asInterface(parcel0.readStrongBinder());
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onReceiveResult(int v, Bundle bundle0) {
    }

    public void send(int v, Bundle bundle0) {
        if(this.a) {
            Handler handler0 = this.b;
            if(handler0 != null) {
                handler0.post(new w0(this, v, bundle0, 3));
            }
            return;
        }
        IResultReceiver iResultReceiver0 = this.c;
        if(iResultReceiver0 != null) {
            try {
                iResultReceiver0.send(v, bundle0);
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        synchronized(this) {
            if(this.c == null) {
                this.c = new c(this);
            }
            parcel0.writeStrongBinder(this.c.asBinder());
        }
    }
}

