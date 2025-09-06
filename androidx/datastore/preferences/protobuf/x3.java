package androidx.datastore.preferences.protobuf;

public final class x3 extends w3 {
    @Override  // androidx.datastore.preferences.protobuf.w3
    public final UnknownFieldSetLite a(Object object0) {
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        if(unknownFieldSetLite0 == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite0 = new UnknownFieldSetLite();
            ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
        }
        return unknownFieldSetLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.w3
    public final void b(Object object0) {
        ((GeneratedMessageLite)object0).unknownFields.makeImmutable();
    }

    @Override  // androidx.datastore.preferences.protobuf.w3
    public final void d(Object object0, Object object1) {
        ((GeneratedMessageLite)object0).unknownFields = (UnknownFieldSetLite)object1;
    }
}

