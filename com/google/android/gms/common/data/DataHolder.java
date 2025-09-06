package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.TWR;

@KeepForSdk
@KeepName
@Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static class Builder {
        public final String[] a;
        public final ArrayList b;

        public Builder(String[] arr_s) {
            this.a = (String[])Preconditions.checkNotNull(arr_s);
            this.b = new ArrayList();
            new HashMap();
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int v) {
            return new DataHolder(this, v);
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int v, @NonNull Bundle bundle0) {
            CursorWindow[] arr_cursorWindow = DataHolder.b(this);
            return new DataHolder(this.a, arr_cursorWindow, v, bundle0);
        }

        @NonNull
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues0) {
            Asserts.checkNotNull(contentValues0);
            HashMap hashMap0 = new HashMap(contentValues0.size());
            for(Object object0: contentValues0.valueSet()) {
                hashMap0.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
            }
            return this.zaa(hashMap0);
        }

        @NonNull
        public Builder zaa(@NonNull HashMap hashMap0) {
            Asserts.checkNotNull(hashMap0);
            this.b.add(hashMap0);
            return this;
        }
    }

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    public boolean i;
    public final boolean j;
    public static final a k;

    static {
        DataHolder.CREATOR = new zaf();
        DataHolder.k = new a(new String[0]);  // 初始化器: Lcom/google/android/gms/common/data/DataHolder$Builder;-><init>([Ljava/lang/String;)V
    }

    public DataHolder(int v, String[] arr_s, CursorWindow[] arr_cursorWindow, int v1, Bundle bundle0) {
        this.i = false;
        this.j = true;
        this.a = v;
        this.b = arr_s;
        this.d = arr_cursorWindow;
        this.e = v1;
        this.f = bundle0;
    }

    @KeepForSdk
    public DataHolder(@NonNull Cursor cursor0, int v, @Nullable Bundle bundle0) {
        int v2;
        CursorWrapper cursorWrapper0 = new CursorWrapper(cursor0);
        String[] arr_s = cursorWrapper0.getColumnNames();
        ArrayList arrayList0 = new ArrayList();
        try {
            int v1 = cursorWrapper0.getCount();
            CursorWindow cursorWindow0 = cursorWrapper0.getWindow();
            if(cursorWindow0 == null || cursorWindow0.getStartPosition() != 0) {
                v2 = 0;
            }
            else {
                cursorWindow0.acquireReference();
                cursorWrapper0.setWindow(null);
                arrayList0.add(cursorWindow0);
                v2 = cursorWindow0.getNumRows();
            }
            while(v2 < v1 && cursorWrapper0.moveToPosition(v2)) {
                CursorWindow cursorWindow1 = cursorWrapper0.getWindow();
                if(cursorWindow1 == null) {
                    cursorWindow1 = new CursorWindow(false);
                    cursorWindow1.setStartPosition(v2);
                    cursorWrapper0.fillWindow(v2, cursorWindow1);
                }
                else {
                    cursorWindow1.acquireReference();
                    cursorWrapper0.setWindow(null);
                }
                if(cursorWindow1.getNumRows() == 0) {
                    break;
                }
                arrayList0.add(cursorWindow1);
                v2 = cursorWindow1.getStartPosition() + cursorWindow1.getNumRows();
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursorWrapper0, throwable0);
            throw throwable0;
        }
        cursorWrapper0.close();
        this(arr_s, ((CursorWindow[])arrayList0.toArray(new CursorWindow[arrayList0.size()])), v, bundle0);
    }

    public DataHolder(Builder dataHolder$Builder0, int v) {
        CursorWindow[] arr_cursorWindow = DataHolder.b(dataHolder$Builder0);
        this(dataHolder$Builder0.a, arr_cursorWindow, v, null);
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] arr_s, @NonNull CursorWindow[] arr_cursorWindow, int v, @Nullable Bundle bundle0) {
        this.i = false;
        this.j = true;
        this.a = 1;
        this.b = (String[])Preconditions.checkNotNull(arr_s);
        this.d = (CursorWindow[])Preconditions.checkNotNull(arr_cursorWindow);
        this.e = v;
        this.f = bundle0;
        this.zad();
    }

    public final void a(int v, String s) {
        if(this.c != null && this.c.containsKey(s)) {
            if(this.isClosed()) {
                throw new IllegalArgumentException("Buffer is closed.");
            }
            if(v < 0 || v >= this.h) {
                throw new CursorIndexOutOfBoundsException(v, this.h);
            }
            return;
        }
        String s1 = String.valueOf(s);
        throw new IllegalArgumentException((s1.length() == 0 ? new String("No such column: ") : "No such column: " + s1));
    }

    public static CursorWindow[] b(Builder dataHolder$Builder0) {
        if(dataHolder$Builder0.a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList0 = dataHolder$Builder0.b;
        int v1 = arrayList0.size();
        CursorWindow cursorWindow0 = new CursorWindow(false);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(cursorWindow0);
        String[] arr_s = dataHolder$Builder0.a;
        cursorWindow0.setNumColumns(arr_s.length);
        int v2 = 0;
        boolean z = false;
        while(v2 < v1) {
            try {
                if(!cursorWindow0.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + v2 + ")");
                    cursorWindow0 = new CursorWindow(false);
                    cursorWindow0.setStartPosition(v2);
                    cursorWindow0.setNumColumns(arr_s.length);
                    arrayList1.add(cursorWindow0);
                    if(!cursorWindow0.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList1.remove(cursorWindow0);
                        return (CursorWindow[])arrayList1.toArray(new CursorWindow[arrayList1.size()]);
                    }
                }
                Map map0 = (Map)arrayList0.get(v2);
                int v3 = 0;
                boolean z1 = true;
                while(v3 < arr_s.length) {
                    if(!z1) {
                        goto label_57;
                    }
                    String s = arr_s[v3];
                    Object object0 = map0.get(s);
                    if(object0 == null) {
                        z1 = cursorWindow0.putNull(v2, v3);
                    }
                    else if(object0 instanceof String) {
                        z1 = cursorWindow0.putString(((String)object0), v2, v3);
                    }
                    else if(object0 instanceof Long) {
                        z1 = cursorWindow0.putLong(((long)(((Long)object0))), v2, v3);
                    }
                    else if(object0 instanceof Integer) {
                        z1 = cursorWindow0.putLong(((long)(((int)(((Integer)object0))))), v2, v3);
                    }
                    else if(object0 instanceof Boolean) {
                        z1 = cursorWindow0.putLong((((Boolean)object0).booleanValue() ? 1L : 0L), v2, v3);
                    }
                    else if(object0 instanceof byte[]) {
                        z1 = cursorWindow0.putBlob(((byte[])object0), v2, v3);
                    }
                    else if(object0 instanceof Double) {
                        z1 = cursorWindow0.putDouble(((double)(((Double)object0))), v2, v3);
                    }
                    else {
                        if(!(object0 instanceof Float)) {
                            throw new IllegalArgumentException("Unsupported object for column " + s + ": " + object0.toString());
                        }
                        z1 = cursorWindow0.putDouble(((double)(((float)(((Float)object0))))), v2, v3);
                    }
                    ++v3;
                }
                if(z1) {
                    z = false;
                }
                else {
                label_57:
                    if(z) {
                        throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    Log.d("DataHolder", "Couldn\'t populate window data for row " + v2 + " - allocating new window.");
                    cursorWindow0.freeLastRow();
                    cursorWindow0 = new CursorWindow(false);
                    cursorWindow0.setStartPosition(v2);
                    cursorWindow0.setNumColumns(arr_s.length);
                    arrayList1.add(cursorWindow0);
                    --v2;
                    z = true;
                }
                ++v2;
                continue;
            label_72:
                int v4 = arrayList1.size();
            }
            catch(RuntimeException runtimeException0) {
                goto label_72;
            }
            for(int v = 0; v < v4; ++v) {
                ((CursorWindow)arrayList1.get(v)).close();
            }
            throw runtimeException0;
        }
        return (CursorWindow[])arrayList1.toArray(new CursorWindow[arrayList1.size()]);
    }

    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] arr_s) {
        return new Builder(arr_s);
    }

    @Override
    @KeepForSdk
    public void close() {
        synchronized(this) {
            if(!this.i) {
                this.i = true;
                for(int v1 = 0; true; ++v1) {
                    CursorWindow[] arr_cursorWindow = this.d;
                    if(v1 >= arr_cursorWindow.length) {
                        break;
                    }
                    arr_cursorWindow[v1].close();
                }
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int v) {
        return new DataHolder(DataHolder.k, v);
    }

    @Override
    public final void finalize() throws Throwable {
        try {
            if(this.j && this.d.length > 0 && !this.isClosed()) {
                this.close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + this.toString() + ")");
            }
        }
        finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String s, int v, int v1) {
        this.a(v, s);
        return this.d[v1].getLong(v, this.c.getInt(s)) == 1L;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String s, int v, int v1) {
        this.a(v, s);
        return this.d[v1].getBlob(v, this.c.getInt(s));
    }

    @KeepForSdk
    public int getCount() {
        return this.h;
    }

    @KeepForSdk
    public int getInteger(@NonNull String s, int v, int v1) {
        this.a(v, s);
        return this.d[v1].getInt(v, this.c.getInt(s));
    }

    @KeepForSdk
    public long getLong(@NonNull String s, int v, int v1) {
        this.a(v, s);
        return this.d[v1].getLong(v, this.c.getInt(s));
    }

    @Nullable
    @KeepForSdk
    public Bundle getMetadata() {
        return this.f;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.e;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String s, int v, int v1) {
        this.a(v, s);
        return this.d[v1].getString(v, this.c.getInt(s));
    }

    @KeepForSdk
    public int getWindowIndex(int v) {
        int v2;
        int v1 = 0;
        Preconditions.checkState(v >= 0 && v < this.h);
        while(true) {
            int[] arr_v = this.g;
            v2 = arr_v.length;
            if(v1 >= v2) {
                break;
            }
            if(v < arr_v[v1]) {
                --v1;
                return v1 == v2 ? v1 - 1 : v1;
            }
            ++v1;
        }
        return v1 == v2 ? v1 - 1 : v1;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String s) {
        return this.c.containsKey(s);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String s, int v, int v1) {
        this.a(v, s);
        return this.d[v1].isNull(v, this.c.getInt(s));
    }

    @KeepForSdk
    public boolean isClosed() {
        synchronized(this) {
        }
        return this.i;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeStringArray(parcel0, 1, this.b, false);
        SafeParcelWriter.writeTypedArray(parcel0, 2, this.d, v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.getStatusCode());
        SafeParcelWriter.writeBundle(parcel0, 4, this.getMetadata(), false);
        SafeParcelWriter.writeInt(parcel0, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
        if((v & 1) != 0) {
            this.close();
        }
    }

    public final double zaa(@NonNull String s, int v, int v1) {
        this.a(v, s);
        return this.d[v1].getDouble(v, this.c.getInt(s));
    }

    public final float zab(@NonNull String s, int v, int v1) {
        this.a(v, s);
        return this.d[v1].getFloat(v, this.c.getInt(s));
    }

    public final void zac(@NonNull String s, int v, int v1, @NonNull CharArrayBuffer charArrayBuffer0) {
        this.a(v, s);
        this.d[v1].copyStringToBuffer(v, this.c.getInt(s), charArrayBuffer0);
    }

    public final void zad() {
        this.c = new Bundle();
        for(int v1 = 0; true; ++v1) {
            String[] arr_s = this.b;
            if(v1 >= arr_s.length) {
                break;
            }
            this.c.putInt(arr_s[v1], v1);
        }
        CursorWindow[] arr_cursorWindow = this.d;
        this.g = new int[arr_cursorWindow.length];
        int v2 = 0;
        for(int v = 0; v < arr_cursorWindow.length; ++v) {
            this.g[v] = v2;
            int v3 = arr_cursorWindow[v].getStartPosition();
            v2 += arr_cursorWindow[v].getNumRows() - (v2 - v3);
        }
        this.h = v2;
    }
}

