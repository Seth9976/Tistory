package androidx.datastore.preferences.protobuf;

public final class n1 implements Converter {
    public final EnumLiteMap a;
    public final EnumLite b;

    public n1(EnumLiteMap internal$EnumLiteMap0, EnumLite internal$EnumLite0) {
        this.a = internal$EnumLiteMap0;
        this.b = internal$EnumLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$MapAdapter$Converter
    public final Object doBackward(Object object0) {
        return ((EnumLite)object0).getNumber();
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$MapAdapter$Converter
    public final Object doForward(Object object0) {
        EnumLite internal$EnumLite0 = this.a.findValueByNumber(((int)(((Integer)object0))));
        return internal$EnumLite0 == null ? this.b : internal$EnumLite0;
    }
}

