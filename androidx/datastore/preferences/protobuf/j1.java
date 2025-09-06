package androidx.datastore.preferences.protobuf;

public final class j1 implements FieldSet.FieldDescriptorLite {
    public final EnumLiteMap a;
    public final int b;
    public final FieldType c;
    public final boolean d;
    public final boolean e;

    public j1(EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, boolean z, boolean z1) {
        this.a = internal$EnumLiteMap0;
        this.b = v;
        this.c = wireFormat$FieldType0;
        this.d = z;
        this.e = z1;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.b - ((j1)object0).b;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
    public final EnumLiteMap getEnumType() {
        return this.a;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
    public final JavaType getLiteJavaType() {
        return this.c.getJavaType();
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
    public final FieldType getLiteType() {
        return this.c;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.b;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
    public final Builder internalMergeFrom(Builder messageLite$Builder0, MessageLite messageLite0) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder)messageLite$Builder0).mergeFrom(((GeneratedMessageLite)messageLite0));
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.e;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.d;
    }
}

