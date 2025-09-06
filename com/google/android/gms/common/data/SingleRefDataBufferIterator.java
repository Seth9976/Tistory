package com.google.android.gms.common.data;

import a5.b;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

@KeepForSdk
public class SingleRefDataBufferIterator extends DataBufferIterator {
    public Object a;

    public SingleRefDataBufferIterator(@NonNull DataBuffer dataBuffer0) {
        super(dataBuffer0);
    }

    @Override  // com.google.android.gms.common.data.DataBufferIterator
    @NonNull
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
        }
        int v = this.zab + 1;
        this.zab = v;
        if(v == 0) {
            Object object0 = Preconditions.checkNotNull(this.zaa.get(0));
            this.a = object0;
            if(!(object0 instanceof DataBufferRef)) {
                String s = String.valueOf(object0.getClass());
                throw new IllegalStateException(b.q(new StringBuilder(s.length() + 44), "DataBuffer reference of type ", s, " is not movable"));
            }
        }
        else {
            ((DataBufferRef)Preconditions.checkNotNull(this.a)).zaa(this.zab);
        }
        return this.a;
    }
}

