package com.google.android.gms.internal.measurement;

public final class g1 implements zzly {
    public final f1 a;
    public static final z0 b;

    static {
        g1.b = new z0(1);
    }

    public g1() {
        zzlk zzlk0;
        try {
            zzlk0 = (zzlk)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        }
        catch(Exception unused_ex) {
            zzlk0 = g1.b;
        }
        f1 f10 = new f1(new zzlk[]{z0.b, zzlk0});
        super();
        this.a = f10;
    }

    @Override  // com.google.android.gms.internal.measurement.zzly
    public final zzlx zza(Class class0) {
        Class class1 = zzkf.class;
        if(!class1.isAssignableFrom(class0) && (r1.a != null && !r1.a.isAssignableFrom(class0))) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        zzlj zzlj0 = this.a.zzb(class0);
        if(zzlj0.zzb()) {
            if(class1.isAssignableFrom(class0)) {
                zzlm zzlm0 = zzlj0.zza();
                return new l1(r1.d, w0.a, zzlm0);
            }
            x1 x10 = r1.b;
            v0 v00 = w0.b;
            if(v00 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            return new l1(x10, v00, zzlj0.zza());
        }
        if(class1.isAssignableFrom(class0)) {
            return zzlj0.zzc() == 1 ? k1.x(zzlj0, d1.b, r1.d, w0.a, i1.b) : k1.x(zzlj0, d1.b, r1.d, null, i1.b);
        }
        if(zzlj0.zzc() == 1) {
            b1 b10 = d1.a;
            x1 x11 = r1.b;
            v0 v01 = w0.b;
            if(v01 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            return k1.x(zzlj0, b10, x11, v01, i1.a);
        }
        return k1.x(zzlj0, d1.a, r1.c, null, i1.a);
    }
}

