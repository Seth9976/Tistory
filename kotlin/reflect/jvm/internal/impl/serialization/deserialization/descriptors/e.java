package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

public final class e extends Lambda implements Function1 {
    public final f w;
    public final DeserializedClassDescriptor x;

    public e(f f0, DeserializedClassDescriptor deserializedClassDescriptor0) {
        this.w = f0;
        this.x = deserializedClassDescriptor0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Name)object0), "name");
        f f0 = this.w;
        EnumEntry protoBuf$EnumEntry0 = (EnumEntry)f0.a.get(((Name)object0));
        if(protoBuf$EnumEntry0 != null) {
            StorageManager storageManager0 = this.x.getC().getStorageManager();
            DeserializedAnnotations deserializedAnnotations0 = new DeserializedAnnotations(this.x.getC().getStorageManager(), new d(this.x, protoBuf$EnumEntry0));
            return EnumEntrySyntheticClassDescriptor.create(storageManager0, this.x, ((Name)object0), f0.c, deserializedAnnotations0, SourceElement.NO_SOURCE);
        }
        return null;
    }
}

