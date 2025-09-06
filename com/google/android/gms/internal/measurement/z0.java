package com.google.android.gms.internal.measurement;

public final class z0 implements zzlk {
    public final int a;
    public static final z0 b;

    static {
        z0.b = new z0(0);
    }

    public z0(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlk
    public final zzlj zzb(Class class0) {
        if(this.a != 0) {
            throw new IllegalStateException("This should never be called.");
        }
        Class class1 = zzkf.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (zzlj)zzkf.g(class0.asSubclass(class1)).zzl(3, null, null);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.zzlk
    public final boolean zzc(Class class0) {
        return this.a == 0 ? zzkf.class.isAssignableFrom(class0) : false;
    }
}

