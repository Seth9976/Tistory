package androidx.core.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import com.google.android.material.color.c;
import com.google.android.material.color.f;
import com.google.android.material.color.i;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

public final class y {
    public final int a;
    public Object b;
    public final Object c;
    public final Object d;
    public static HandlerThread e;
    public static Handler f;

    public y(int v) {
        this.b = new SparseIntArray[9];
        this.c = new ArrayList();
        this.d = new x(this);
        this.a = v;
    }

    public y(int v, DataOutputStream dataOutputStream0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        this.b = byteArrayOutputStream0;
        this.c = new DataOutputStream(byteArrayOutputStream0);
        this.a = v;
        this.d = dataOutputStream0;
    }

    public y(List list0) {
        int v1;
        this.a = ((c)list0.get(list0.size() - 1)).c + 1;
        HashSet hashSet0 = new HashSet();
        for(Object object0: list0) {
            hashSet0.add(((c)object0).c);
        }
        this.c = new int[this.a];
        for(int v = 0; true; v = (short)(v + 1)) {
            v1 = this.a;
            if(v >= v1) {
                break;
            }
            if(hashSet0.contains(((short)v))) {
                ((int[])this.c)[v] = 0x40000000;
            }
        }
        this.b = new f(0x202, 16, v1 * 4 + 16);
        this.d = new i(list0, hashSet0, v1);
    }

    public y(Flow flow0, CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        this.b = flow0;
        this.a = v;
        this.c = bufferOverflow0;
        this.d = coroutineContext0;
    }

    public static void a(SparseIntArray sparseIntArray0, long v) {
        if(sparseIntArray0 != null) {
            int v1 = (int)((v + 500000L) / 1000000L);
            if(v >= 0L) {
                sparseIntArray0.put(v1, sparseIntArray0.get(v1) + 1);
            }
        }
    }
}

