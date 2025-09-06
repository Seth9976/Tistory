package com.google.firebase.encoders.proto;

public final class a implements Protobuf {
    public final int a;
    public final IntEncoding b;

    public a(int v, IntEncoding protobuf$IntEncoding0) {
        this.a = v;
        this.b = protobuf$IntEncoding0;
    }

    @Override
    public final Class annotationType() {
        return Protobuf.class;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Protobuf ? this.a == ((a)(((Protobuf)object0))).a && this.b.equals(((a)(((Protobuf)object0))).b) : false;
    }

    @Override
    public final int hashCode() {
        return (0xDE0D66 ^ this.a) + (this.b.hashCode() ^ 2041407134);
    }

    @Override  // com.google.firebase.encoders.proto.Protobuf
    public final IntEncoding intEncoding() {
        return this.b;
    }

    @Override  // com.google.firebase.encoders.proto.Protobuf
    public final int tag() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}

