package hg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.internal.TaggedDecoder;

public final class l extends Lambda implements Function0 {
    public final int w;
    public final TaggedDecoder x;
    public final DeserializationStrategy y;
    public final Object z;

    public l(TaggedDecoder taggedDecoder0, DeserializationStrategy deserializationStrategy0, Object object0, int v) {
        this.w = v;
        this.x = taggedDecoder0;
        this.y = deserializationStrategy0;
        this.z = object0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            return this.x.decodeSerializableValue(this.y, this.z);
        }
        DeserializationStrategy deserializationStrategy0 = this.y;
        boolean z = deserializationStrategy0.getDescriptor().isNullable();
        TaggedDecoder taggedDecoder0 = this.x;
        return !z && !taggedDecoder0.decodeNotNullMark() ? taggedDecoder0.decodeNull() : taggedDecoder0.decodeSerializableValue(deserializationStrategy0, this.z);
    }
}

