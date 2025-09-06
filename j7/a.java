package j7;

import com.google.android.gms.internal.common.zzab;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

public abstract class a extends zzab {
    public Object[] a;
    public int b;
    public boolean c;

    public a() {
        this.a = new Object[4];
        this.b = 0;
    }

    @CanIgnoreReturnValue
    public final a zza(Object object0) {
        object0.getClass();
        int v = this.b;
        Object[] arr_object = this.a;
        if(arr_object.length < v + 1) {
            int v1 = arr_object.length + (arr_object.length >> 1) + 1;
            if(v1 < v + 1) {
                int v2 = Integer.highestOneBit(v);
                v1 = v2 + v2;
            }
            if(v1 < 0) {
                v1 = 0x7FFFFFFF;
            }
            this.a = Arrays.copyOf(arr_object, v1);
            this.c = false;
        }
        else if(this.c) {
            this.a = (Object[])arr_object.clone();
            this.c = false;
        }
        int v3 = this.b;
        this.b = v3 + 1;
        this.a[v3] = object0;
        return this;
    }
}

