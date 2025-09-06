package com.kakao.keditor;

import com.kakao.keditor.util.eventbus.ViewRequest;
import kotlin.jvm.functions.Function0;

public final class b implements Runnable {
    public final int a;
    public final Object b;

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                com.kakao.keditor.KeditorView.startViewRequestCollector.2.b(((ViewRequest)this.b));
                return;
            }
            case 1: {
                KeditorView.s(((Function0)this.b));
                return;
            }
            default: {
                KeditorView.p(((KeditorView)this.b));
            }
        }
    }
}

