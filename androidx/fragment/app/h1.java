package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle.State;

public final class h1 implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final String l;
    public final int m;
    public final boolean n;

    static {
        h1.CREATOR = new b(4);
    }

    public h1(Parcel parcel0) {
        this.a = parcel0.readString();
        this.b = parcel0.readString();
        boolean z = false;
        this.c = parcel0.readInt() != 0;
        this.d = parcel0.readInt();
        this.e = parcel0.readInt();
        this.f = parcel0.readString();
        this.g = parcel0.readInt() != 0;
        this.h = parcel0.readInt() != 0;
        this.i = parcel0.readInt() != 0;
        this.j = parcel0.readInt() != 0;
        this.k = parcel0.readInt();
        this.l = parcel0.readString();
        this.m = parcel0.readInt();
        if(parcel0.readInt() != 0) {
            z = true;
        }
        this.n = z;
    }

    public h1(Fragment fragment0) {
        this.a = fragment0.getClass().getName();
        this.b = fragment0.mWho;
        this.c = fragment0.mFromLayout;
        this.d = fragment0.mFragmentId;
        this.e = fragment0.mContainerId;
        this.f = fragment0.mTag;
        this.g = fragment0.mRetainInstance;
        this.h = fragment0.mRemoving;
        this.i = fragment0.mDetached;
        this.j = fragment0.mHidden;
        this.k = fragment0.mMaxState.ordinal();
        this.l = fragment0.mTargetWho;
        this.m = fragment0.mTargetRequestCode;
        this.n = fragment0.mUserVisibleHint;
    }

    public final Fragment a(FragmentFactory fragmentFactory0, ClassLoader classLoader0) {
        Fragment fragment0 = fragmentFactory0.instantiate(classLoader0, this.a);
        fragment0.mWho = this.b;
        fragment0.mFromLayout = this.c;
        fragment0.mRestored = true;
        fragment0.mFragmentId = this.d;
        fragment0.mContainerId = this.e;
        fragment0.mTag = this.f;
        fragment0.mRetainInstance = this.g;
        fragment0.mRemoving = this.h;
        fragment0.mDetached = this.i;
        fragment0.mHidden = this.j;
        State[] arr_lifecycle$State = State.values();
        fragment0.mMaxState = arr_lifecycle$State[this.k];
        fragment0.mTargetWho = this.l;
        fragment0.mTargetRequestCode = this.m;
        fragment0.mUserVisibleHint = this.n;
        return fragment0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentState{");
        stringBuilder0.append(this.a);
        stringBuilder0.append(" (");
        stringBuilder0.append(this.b);
        stringBuilder0.append(")}:");
        if(this.c) {
            stringBuilder0.append(" fromLayout");
        }
        int v = this.e;
        if(v != 0) {
            stringBuilder0.append(" id=0x");
            stringBuilder0.append(Integer.toHexString(v));
        }
        String s = this.f;
        if(s != null && !s.isEmpty()) {
            stringBuilder0.append(" tag=");
            stringBuilder0.append(s);
        }
        if(this.g) {
            stringBuilder0.append(" retainInstance");
        }
        if(this.h) {
            stringBuilder0.append(" removing");
        }
        if(this.i) {
            stringBuilder0.append(" detached");
        }
        if(this.j) {
            stringBuilder0.append(" hidden");
        }
        String s1 = this.l;
        if(s1 != null) {
            stringBuilder0.append(" targetWho=");
            stringBuilder0.append(s1);
            stringBuilder0.append(" targetRequestCode=");
            stringBuilder0.append(this.m);
        }
        if(this.n) {
            stringBuilder0.append(" userVisibleHint");
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeString(this.f);
        parcel0.writeInt(((int)this.g));
        parcel0.writeInt(((int)this.h));
        parcel0.writeInt(((int)this.i));
        parcel0.writeInt(((int)this.j));
        parcel0.writeInt(this.k);
        parcel0.writeString(this.l);
        parcel0.writeInt(this.m);
        parcel0.writeInt(((int)this.n));
    }
}

