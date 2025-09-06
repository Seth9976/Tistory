package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

public final class c extends d {
    public final int e;

    public c(int v, int v1, Bundle bundle0, int v2) {
        this.e = v2;
        super(v, v1, bundle0);
    }

    @Override  // com.google.android.gms.cloudmessaging.d
    public final void a(Bundle bundle0) {
        if(this.e != 0) {
            Bundle bundle1 = bundle0.getBundle("data");
            if(bundle1 == null) {
                bundle1 = Bundle.EMPTY;
            }
            this.d(bundle1);
            return;
        }
        if(bundle0.getBoolean("ack", false)) {
            this.d(null);
            return;
        }
        this.c(new zzq("Invalid response to one way request", null));  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    }

    @Override  // com.google.android.gms.cloudmessaging.d
    public final boolean b() {
        return this.e == 0;
    }
}

