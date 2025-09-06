package com.kakao.keditor;

import com.kakao.keditor.util.eventbus.ViewRequest;
import kotlin.jvm.functions.Function0;

public final class c implements Runnable {
    public final int a;
    public final KeditorView b;
    public final int c;
    public final Object d;

    public c(KeditorView keditorView0, int v, Object object0, int v1) {
        this.a = v1;
        this.b = keditorView0;
        this.c = v;
        this.d = object0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                com.kakao.keditor.KeditorView.startViewRequestCollector.2.c(this.b, this.c, ((ViewRequest)this.d));
                return;
            }
            case 1: {
                com.kakao.keditor.KeditorView.startViewRequestCollector.2.a(this.b, this.c, ((ViewRequest)this.d));
                return;
            }
            default: {
                KeditorView.r(this.b, this.c, ((Function0)this.d));
            }
        }
    }
}

