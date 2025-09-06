package androidx.datastore.preferences.protobuf;

public class LazyField extends LazyFieldLite {
    public final MessageLite d;

    public LazyField(MessageLite messageLite0, ExtensionRegistryLite extensionRegistryLite0, ByteString byteString0) {
        super(extensionRegistryLite0, byteString0);
        this.d = messageLite0;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.d;
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean equals(Object object0) {
        return this.getValue().equals(object0);
    }

    public MessageLite getValue() {
        return this.getValue(this.d);
    }

    @Override  // androidx.datastore.preferences.protobuf.LazyFieldLite
    public int hashCode() {
        return this.getValue().hashCode();
    }

    @Override
    public String toString() {
        return this.getValue().toString();
    }
}

