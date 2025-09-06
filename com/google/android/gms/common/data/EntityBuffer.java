package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

@KeepForSdk
public abstract class EntityBuffer extends AbstractDataBuffer {
    public boolean a;
    public ArrayList b;

    @KeepForSdk
    public EntityBuffer(@NonNull DataHolder dataHolder0) {
        super(dataHolder0);
        this.a = false;
    }

    public final int a(int v) {
        if(v < 0 || v >= this.b.size()) {
            throw new IllegalArgumentException("Position " + v + " is out of bounds for this buffer");
        }
        return (int)(((Integer)this.b.get(v)));
    }

    public final void b() {
        synchronized(this) {
            if(!this.a) {
                int v1 = ((DataHolder)Preconditions.checkNotNull(this.mDataHolder)).getCount();
                ArrayList arrayList0 = new ArrayList();
                this.b = arrayList0;
                if(v1 > 0) {
                    arrayList0.add(0);
                    String s = this.getPrimaryDataMarkerColumn();
                    int v2 = this.mDataHolder.getWindowIndex(0);
                    String s1 = this.mDataHolder.getString(s, 0, v2);
                    for(int v3 = 1; v3 < v1; ++v3) {
                        int v4 = this.mDataHolder.getWindowIndex(v3);
                        String s2 = this.mDataHolder.getString(s, v3, v4);
                        if(s2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + s + ", at row: " + v3 + ", for window: " + v4);
                        }
                        if(!s2.equals(s1)) {
                            this.b.add(v3);
                            s1 = s2;
                        }
                    }
                }
                this.a = true;
            }
        }
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    @NonNull
    @KeepForSdk
    public final Object get(int v) {
        int v4;
        int v3;
        this.b();
        int v1 = this.a(v);
        int v2 = 0;
        if(v >= 0 && v != this.b.size()) {
            v3 = v == this.b.size() - 1 ? ((DataHolder)Preconditions.checkNotNull(this.mDataHolder)).getCount() : ((int)(((Integer)this.b.get(v + 1))));
            v4 = (int)(((Integer)this.b.get(v)));
            int v5 = v3 - v4;
            if(v5 == 1) {
                int v6 = this.a(v);
                ((DataHolder)Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(v6);
                return this.getEntry(v1, 1);
            }
            v2 = v5;
        }
        return this.getEntry(v1, v2);
    }

    @Nullable
    @KeepForSdk
    public String getChildDataMarkerColumn() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    @KeepForSdk
    public int getCount() {
        this.b();
        return this.b.size();
    }

    @NonNull
    @KeepForSdk
    public abstract Object getEntry(int arg1, int arg2);

    @NonNull
    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();
}

