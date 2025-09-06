package com.google.android.gms.internal.measurement;

import androidx.room.a;
import java.util.Arrays;
import java.util.List;

public abstract class r1 {
    public static final Class a;
    public static final x1 b;
    public static final x1 c;
    public static final x1 d;

    static {
        Class class0 = null;
        try {
            class0 = Class.forName("com.google.protobuf.GeneratedMessage");
        }
        catch(Throwable unused_ex) {
        }
        r1.a = class0;
        r1.b = r1.x(false);
        r1.c = r1.x(true);
        r1.d = new x1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static int A(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjm.zzz(v) * v1 + r1.B(list0);
    }

    public static int B(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof a1) {
            v2 = 0;
            while(v1 < v) {
                ((a1)list0).b(v1);
                v2 += zzjm.zzv(((a1)list0).b[v1]);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjm.zzv(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int C(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : (zzjm.zzA(v << 3) + 4) * v1;
    }

    public static int D(List list0) {
        return list0.size() * 4;
    }

    public static int E(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : (zzjm.zzA(v << 3) + 8) * v1;
    }

    public static int F(List list0) {
        return list0.size() * 8;
    }

    public static int G(int v, List list0, zzlx zzlx0) {
        int v1 = list0.size();
        if(v1 != 0) {
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                v3 += zzjm.a(v, ((zzlm)list0.get(v2)), zzlx0);
            }
            return v3;
        }
        return 0;
    }

    public static int H(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjm.zzz(v) * v1 + r1.I(list0);
    }

    public static int I(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof a1) {
            v2 = 0;
            while(v1 < v) {
                ((a1)list0).b(v1);
                v2 += zzjm.zzv(((a1)list0).b[v1]);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjm.zzv(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int J(int v, List list0) {
        return list0.size() == 0 ? 0 : zzjm.zzz(v) * list0.size() + r1.K(list0);
    }

    public static int K(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof e1) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjm.zzB(((e1)list0).zza(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjm.zzB(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int L(int v, Object object0, zzlx zzlx0) {
        if(object0 instanceof zzks) {
            int v1 = ((zzks)object0).zza();
            return a.a(v1, v1, zzjm.zzA(v << 3));
        }
        int v2 = ((zzio)(((zzlm)object0))).a(zzlx0);
        return a.a(v2, v2, zzjm.zzA(v << 3));
    }

    public static int M(int v, List list0, zzlx zzlx0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzjm.zzz(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            if(object0 instanceof zzks) {
                v3 = zzjm.zzw(((zzks)object0)) + v3;
            }
            else {
                int v4 = ((zzio)(((zzlm)object0))).a(zzlx0);
                v3 = a.a(v4, v4, v3);
            }
        }
        return v3;
    }

    public static int N(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjm.zzz(v) * v1 + r1.O(list0);
    }

    public static int O(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof a1) {
            v2 = 0;
            while(v1 < v) {
                ((a1)list0).b(v1);
                int v3 = ((a1)list0).b[v1];
                v2 += zzjm.zzA(v3 >> 0x1F ^ v3 + v3);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            int v4 = (int)(((Integer)list0.get(v1)));
            v2 += zzjm.zzA(v4 >> 0x1F ^ v4 + v4);
            ++v1;
        }
        return v2;
    }

    public static int P(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjm.zzz(v) * v1 + r1.Q(list0);
    }

    public static int Q(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof e1) {
            v2 = 0;
            while(v1 < v) {
                long v3 = ((e1)list0).zza(v1);
                v2 += zzjm.zzB(v3 >> 0x3F ^ v3 + v3);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            long v4 = (long)(((Long)list0.get(v1)));
            v2 += zzjm.zzB(v4 >> 0x3F ^ v4 + v4);
            ++v1;
        }
        return v2;
    }

    public static int R(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzjm.zzz(v) * v1;
        if(list0 instanceof zzku) {
            while(v2 < v1) {
                Object object0 = ((zzku)list0).zzf(v2);
                v3 = (object0 instanceof zzje ? zzjm.zzt(((zzje)object0)) : zzjm.zzy(((String)object0))) + v3;
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 = (object1 instanceof zzje ? zzjm.zzt(((zzje)object1)) : zzjm.zzy(((String)object1))) + v3;
            ++v2;
        }
        return v3;
    }

    public static int S(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjm.zzz(v) * v1 + r1.T(list0);
    }

    public static int T(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof a1) {
            v2 = 0;
            while(v1 < v) {
                ((a1)list0).b(v1);
                v2 += zzjm.zzA(((a1)list0).b[v1]);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjm.zzA(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int U(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjm.zzz(v) * v1 + r1.V(list0);
    }

    public static int V(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof e1) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjm.zzB(((e1)list0).zza(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjm.zzB(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static void a(Object object0, int v, zzkm zzkm0, zzkj zzkj0, x1 x10) {
        Object object1 = null;
        if(zzkj0 == null) {
            return;
        }
        if(zzkm0 == null) {
            throw new NullPointerException();
        }
        int v1 = zzkm0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            Integer integer0 = (Integer)zzkm0.get(v2);
            int v4 = (int)integer0;
            if(zzkj0.zza(v4)) {
                if(v2 != v3) {
                    zzkm0.set(v3, integer0);
                }
                ++v3;
            }
            else {
                object1 = r1.b(object0, v, v4, object1, x10);
            }
        }
        if(v3 != v1) {
            zzkm0.subList(v3, v1).clear();
        }
    }

    public static Object b(Object object0, int v, int v1, Object object1, x1 x10) {
        if(object1 == null) {
            x10.getClass();
            object1 = ((zzkf)object0).zzc;
            if(object1 == zzmp.zzc()) {
                object1 = zzmp.a();
                ((zzkf)object0).zzc = object1;
            }
        }
        x10.getClass();
        ((zzmp)object1).b(v << 3, ((long)v1));
        return object1;
    }

    public static void c(x1 x10, Object object0, Object object1) {
        x10.getClass();
        zzmp zzmp0 = ((zzkf)object0).zzc;
        zzmp zzmp1 = ((zzkf)object1).zzc;
        if(!zzmp.zzc().equals(zzmp1)) {
            if(zzmp.zzc().equals(zzmp0)) {
                int v = zzmp0.a + zzmp1.a;
                int[] arr_v = Arrays.copyOf(zzmp0.b, v);
                System.arraycopy(zzmp1.b, 0, arr_v, zzmp0.a, zzmp1.a);
                Object[] arr_object = Arrays.copyOf(zzmp0.c, v);
                System.arraycopy(zzmp1.c, 0, arr_object, zzmp0.a, zzmp1.a);
                zzmp0 = new zzmp(v, arr_v, arr_object, true);
            }
            else {
                zzmp0.getClass();
                if(!zzmp1.equals(zzmp.f)) {
                    if(!zzmp0.e) {
                        throw new UnsupportedOperationException();
                    }
                    int v1 = zzmp0.a + zzmp1.a;
                    zzmp0.c(v1);
                    System.arraycopy(zzmp1.b, 0, zzmp0.b, zzmp0.a, zzmp1.a);
                    System.arraycopy(zzmp1.c, 0, zzmp0.c, zzmp0.a, zzmp1.a);
                    zzmp0.a = v1;
                }
            }
        }
        ((zzkf)object0).zzc = zzmp0;
    }

    public static void d(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzc(v, list0, z);
        }
    }

    public static void e(int v, List list0, zzng zzng0) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zze(v, list0);
        }
    }

    public static void f(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzg(v, list0, z);
        }
    }

    public static void g(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzj(v, list0, z);
        }
    }

    public static void h(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzl(v, list0, z);
        }
    }

    public static void i(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzn(v, list0, z);
        }
    }

    public static void j(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzp(v, list0, z);
        }
    }

    public static void k(int v, List list0, zzng zzng0, zzlx zzlx0) {
        if(list0 != null && !list0.isEmpty()) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ((t0)zzng0).zzq(v, list0.get(v1), zzlx0);
            }
        }
    }

    public static void l(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzs(v, list0, z);
        }
    }

    public static void m(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzu(v, list0, z);
        }
    }

    public static void n(int v, List list0, zzng zzng0, zzlx zzlx0) {
        if(list0 != null && !list0.isEmpty()) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ((t0)zzng0).zzv(v, list0.get(v1), zzlx0);
            }
        }
    }

    public static void o(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzx(v, list0, z);
        }
    }

    public static void p(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzz(v, list0, z);
        }
    }

    public static void q(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzB(v, list0, z);
        }
    }

    public static void r(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzD(v, list0, z);
        }
    }

    public static void s(int v, List list0, zzng zzng0) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzG(v, list0);
        }
    }

    public static void t(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzI(v, list0, z);
        }
    }

    public static void u(int v, List list0, zzng zzng0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzng0.zzK(v, list0, z);
        }
    }

    // 去混淆评级： 低(20)
    public static boolean v(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static int w(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : (zzjm.zzA(v << 3) + 1) * v1;
    }

    public static x1 x(boolean z) {
        Class class0 = null;
        try {
            class0 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
        }
        if(class0 == null) {
            return null;
        }
        try {
            return (x1)class0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static int y(List list0) {
        return list0.size();
    }

    public static int z(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzjm.zzz(v) * v1;
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += zzjm.zzt(((zzje)list0.get(v2)));
        }
        return v3;
    }
}

