package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class LazyFieldLite {
    public ByteString a;
    public ExtensionRegistryLite b;
    public volatile ByteString c;
    protected volatile MessageLite value;

    static {
        ExtensionRegistryLite.getEmptyRegistry();
    }

    public LazyFieldLite() {
    }

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite0, ByteString byteString0) {
        if(extensionRegistryLite0 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if(byteString0 == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.b = extensionRegistryLite0;
        this.a = byteString0;
    }

    public void clear() {
        this.a = null;
        this.value = null;
        this.c = null;
    }

    public boolean containsDefaultInstance() {
        return this.c == ByteString.EMPTY || this.value == null && (this.a == null || this.a == ByteString.EMPTY);
    }

    public void ensureInitialized(MessageLite messageLite0) {
        if(this.value != null) {
            return;
        }
        synchronized(this) {
            if(this.value != null) {
                return;
            }
            try {
                if(this.a == null) {
                    this.value = messageLite0;
                    this.c = ByteString.EMPTY;
                }
                else {
                    this.value = (MessageLite)messageLite0.getParserForType().parseFrom(this.a, this.b);
                    this.c = this.a;
                }
            }
            catch(InvalidProtocolBufferException unused_ex) {
                this.value = messageLite0;
                this.c = ByteString.EMPTY;
            }
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LazyFieldLite)) {
            return false;
        }
        MessageLite messageLite0 = this.value;
        MessageLite messageLite1 = ((LazyFieldLite)object0).value;
        if(messageLite0 == null && messageLite1 == null) {
            return this.toByteString().equals(((LazyFieldLite)object0).toByteString());
        }
        if(messageLite0 != null && messageLite1 != null) {
            return messageLite0.equals(messageLite1);
        }
        return messageLite0 == null ? this.getValue(messageLite1.getDefaultInstanceForType()).equals(messageLite1) : messageLite0.equals(((LazyFieldLite)object0).getValue(messageLite0.getDefaultInstanceForType()));
    }

    public static LazyFieldLite fromValue(MessageLite messageLite0) {
        LazyFieldLite lazyFieldLite0 = new LazyFieldLite();
        lazyFieldLite0.setValue(messageLite0);
        return lazyFieldLite0;
    }

    public int getSerializedSize() {
        if(this.c != null) {
            return this.c.size();
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            return byteString0.size();
        }
        return this.value == null ? 0 : this.value.getSerializedSize();
    }

    public MessageLite getValue(MessageLite messageLite0) {
        this.ensureInitialized(messageLite0);
        return this.value;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public void merge(LazyFieldLite lazyFieldLite0) {
        MessageLite messageLite1;
        MessageLite messageLite0;
        if(lazyFieldLite0.containsDefaultInstance()) {
            return;
        }
        if(this.containsDefaultInstance()) {
            this.set(lazyFieldLite0);
            return;
        }
        if(this.b == null) {
            this.b = lazyFieldLite0.b;
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            ByteString byteString1 = lazyFieldLite0.a;
            if(byteString1 != null) {
                this.a = byteString0.concat(byteString1);
                return;
            }
        }
        if(this.value == null && lazyFieldLite0.value != null) {
            try {
                messageLite0 = lazyFieldLite0.value;
                ByteString byteString2 = this.a;
                ExtensionRegistryLite extensionRegistryLite0 = this.b;
                messageLite0 = messageLite0.toBuilder().mergeFrom(byteString2, extensionRegistryLite0).build();
            }
            catch(InvalidProtocolBufferException unused_ex) {
            }
            this.setValue(messageLite0);
            return;
        }
        if(this.value != null && lazyFieldLite0.value == null) {
            try {
                messageLite1 = this.value;
                ByteString byteString3 = lazyFieldLite0.a;
                ExtensionRegistryLite extensionRegistryLite1 = lazyFieldLite0.b;
                messageLite1 = messageLite1.toBuilder().mergeFrom(byteString3, extensionRegistryLite1).build();
            }
            catch(InvalidProtocolBufferException unused_ex) {
            }
            this.setValue(messageLite1);
            return;
        }
        this.setValue(this.value.toBuilder().mergeFrom(lazyFieldLite0.value).build());
    }

    public void mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        if(this.containsDefaultInstance()) {
            this.setByteString(codedInputStream0.readBytes(), extensionRegistryLite0);
            return;
        }
        if(this.b == null) {
            this.b = extensionRegistryLite0;
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            this.setByteString(byteString0.concat(codedInputStream0.readBytes()), this.b);
            return;
        }
        try {
            this.setValue(this.value.toBuilder().mergeFrom(codedInputStream0, extensionRegistryLite0).build());
        }
        catch(InvalidProtocolBufferException unused_ex) {
        }
    }

    public void set(LazyFieldLite lazyFieldLite0) {
        this.a = lazyFieldLite0.a;
        this.value = lazyFieldLite0.value;
        this.c = lazyFieldLite0.c;
        ExtensionRegistryLite extensionRegistryLite0 = lazyFieldLite0.b;
        if(extensionRegistryLite0 != null) {
            this.b = extensionRegistryLite0;
        }
    }

    public void setByteString(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) {
        if(extensionRegistryLite0 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if(byteString0 == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.a = byteString0;
        this.b = extensionRegistryLite0;
        this.value = null;
        this.c = null;
    }

    public MessageLite setValue(MessageLite messageLite0) {
        MessageLite messageLite1 = this.value;
        this.a = null;
        this.c = null;
        this.value = messageLite0;
        return messageLite1;
    }

    public ByteString toByteString() {
        if(this.c != null) {
            return this.c;
        }
        ByteString byteString0 = this.a;
        if(byteString0 != null) {
            return byteString0;
        }
        synchronized(this) {
            if(this.c != null) {
                return this.c;
            }
            this.c = this.value == null ? ByteString.EMPTY : this.value.toByteString();
            return this.c;
        }
    }
}

