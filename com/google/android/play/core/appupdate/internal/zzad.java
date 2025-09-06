package com.google.android.play.core.appupdate.internal;

public final class zzad implements zzaf {
    public volatile zzaf a;
    public volatile Object b;
    public static final Object c;

    static {
        zzad.c = new Object();
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        Object object0 = this.b;
        Object object1 = zzad.c;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.b;
                if(object0 == object1) {
                    object0 = this.a.zza();
                    Object object2 = this.b;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.b = object0;
                    this.a = null;
                }
            }
        }
        return object0;
    }

    public static zzaf zzb(zzaf zzaf0) {
        zzaf0.getClass();
        if(zzaf0 instanceof zzad) {
            return zzaf0;
        }
        zzaf zzaf1 = new zzad();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzaf1.b = zzad.c;
        zzaf1.a = zzaf0;
        return zzaf1;
    }
}

