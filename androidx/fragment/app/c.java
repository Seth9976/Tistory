package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayList;

public final class c implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    static {
        c.CREATOR = new b(0);
    }

    public c(Parcel parcel0) {
        this.a = parcel0.createIntArray();
        this.b = parcel0.createStringArrayList();
        this.c = parcel0.createIntArray();
        this.d = parcel0.createIntArray();
        this.e = parcel0.readInt();
        this.f = parcel0.readString();
        this.g = parcel0.readInt();
        this.h = parcel0.readInt();
        Parcelable.Creator parcelable$Creator0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.j = parcel0.readInt();
        this.k = (CharSequence)parcelable$Creator0.createFromParcel(parcel0);
        this.l = parcel0.createStringArrayList();
        this.m = parcel0.createStringArrayList();
        this.n = parcel0.readInt() != 0;
    }

    public c(a a0) {
        int v = a0.c.size();
        this.a = new int[v * 6];
        if(!a0.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(v);
        this.c = new int[v];
        this.d = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            p1 p10 = (p1)a0.c.get(v1);
            this.a[v2] = p10.a;
            this.b.add((p10.b == null ? null : p10.b.mWho));
            this.a[v2 + 1] = p10.c;
            this.a[v2 + 2] = p10.d;
            this.a[v2 + 3] = p10.e;
            int v3 = v2 + 5;
            this.a[v2 + 4] = p10.f;
            v2 += 6;
            this.a[v3] = p10.g;
            this.c[v1] = p10.h.ordinal();
            this.d[v1] = p10.i.ordinal();
        }
        this.e = a0.h;
        this.f = a0.k;
        this.g = a0.v;
        this.h = a0.l;
        this.i = a0.m;
        this.j = a0.n;
        this.k = a0.o;
        this.l = a0.p;
        this.m = a0.q;
        this.n = a0.r;
    }

    public final void a(a a0) {
        int v = 0;
        for(int v1 = 0; true; ++v1) {
            int[] arr_v = this.a;
            boolean z = true;
            if(v >= arr_v.length) {
                break;
            }
            p1 p10 = new p1();  // 初始化器: Ljava/lang/Object;-><init>()V
            p10.a = arr_v[v];
            if(FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Instantiate " + a0 + " op #" + v1 + " base fragment #" + arr_v[v + 1]);
            }
            State[] arr_lifecycle$State = State.values();
            p10.h = arr_lifecycle$State[this.c[v1]];
            State[] arr_lifecycle$State1 = State.values();
            p10.i = arr_lifecycle$State1[this.d[v1]];
            if(arr_v[v + 1] == 0) {
                z = false;
            }
            p10.c = z;
            int v2 = arr_v[v + 2];
            p10.d = v2;
            int v3 = arr_v[v + 3];
            p10.e = v3;
            int v4 = v + 5;
            int v5 = arr_v[v + 4];
            p10.f = v5;
            v += 6;
            int v6 = arr_v[v4];
            p10.g = v6;
            a0.d = v2;
            a0.e = v3;
            a0.f = v5;
            a0.g = v6;
            a0.a(p10);
        }
        a0.h = this.e;
        a0.k = this.f;
        a0.i = true;
        a0.l = this.h;
        a0.m = this.i;
        a0.n = this.j;
        a0.o = this.k;
        a0.p = this.l;
        a0.q = this.m;
        a0.r = this.n;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeIntArray(this.a);
        parcel0.writeStringList(this.b);
        parcel0.writeIntArray(this.c);
        parcel0.writeIntArray(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeString(this.f);
        parcel0.writeInt(this.g);
        parcel0.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel0, 0);
        parcel0.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel0, 0);
        parcel0.writeStringList(this.l);
        parcel0.writeStringList(this.m);
        parcel0.writeInt(((int)this.n));
    }
}

