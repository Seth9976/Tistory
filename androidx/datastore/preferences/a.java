package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat.FieldType;

public abstract class a {
    public static final MapEntryLite a;

    static {
        Value preferencesProto$Value0 = Value.getDefaultInstance();
        a.a = MapEntryLite.newDefaultInstance(FieldType.STRING, "", FieldType.MESSAGE, preferencesProto$Value0);
    }
}

