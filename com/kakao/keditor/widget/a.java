package com.kakao.keditor.widget;

public final class a implements Runnable {
    public final KeditorEditText a;
    public final int b;
    public final int c;

    public a(KeditorEditText keditorEditText0, int v, int v1) {
        this.a = keditorEditText0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final void run() {
        KeditorEditText.b(this.a, this.b, this.c);
    }
}

