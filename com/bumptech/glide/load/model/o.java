package com.bumptech.glide.load.model;

import r0.a;

public final class o implements LazyHeaderFactory {
    public final String a;

    public o(String s) {
        this.a = s;
    }

    @Override  // com.bumptech.glide.load.model.LazyHeaderFactory
    public final String buildHeader() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof o ? this.a.equals(((o)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return a.o(new StringBuilder("StringHeaderFactory{value=\'"), this.a, "\'}");
    }
}

