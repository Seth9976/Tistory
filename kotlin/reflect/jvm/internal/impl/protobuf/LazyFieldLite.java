package kotlin.reflect.jvm.internal.impl.protobuf;

public class LazyFieldLite {
    protected volatile MessageLite value;

    public void ensureInitialized(MessageLite messageLite0) {
        if(this.value != null) {
            return;
        }
        synchronized(this) {
            if(this.value != null) {
                return;
            }
            this.value = messageLite0;
        }
    }

    public int getSerializedSize() {
        return this.value.getSerializedSize();
    }

    public MessageLite getValue(MessageLite messageLite0) {
        this.ensureInitialized(messageLite0);
        return this.value;
    }

    public MessageLite setValue(MessageLite messageLite0) {
        MessageLite messageLite1 = this.value;
        this.value = messageLite0;
        return messageLite1;
    }
}

