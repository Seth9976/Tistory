package com.google.gson.internal;

public final class j extends l {
    public final int f;

    public j(LinkedTreeMap linkedTreeMap0, int v) {
        this.f = v;
        super(linkedTreeMap0);
    }

    @Override  // com.google.gson.internal.l
    public Object next() {
        return this.f == 1 ? this.a().f : super.next();
    }
}

