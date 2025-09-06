package com.google.firebase.encoders.proto;

public final class AtProtobuf {
    public int a;
    public IntEncoding b;

    public AtProtobuf() {
        this.b = IntEncoding.DEFAULT;
    }

    public Protobuf build() {
        return new a(this.a, this.b);
    }

    public static AtProtobuf builder() {
        return new AtProtobuf();
    }

    public AtProtobuf intEncoding(IntEncoding protobuf$IntEncoding0) {
        this.b = protobuf$IntEncoding0;
        return this;
    }

    public AtProtobuf tag(int v) {
        this.a = v;
        return this;
    }
}

