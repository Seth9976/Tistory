package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    public final List a;

    public UninitializedMessageException(MessageLite messageLite0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.a = null;
    }

    public UninitializedMessageException(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for(Object object0: list0) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((String)object0));
        }
        super(stringBuilder0.toString());
        this.a = list0;
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(this.getMessage());
    }

    public List getMissingFields() {
        return Collections.unmodifiableList(this.a);
    }
}

