package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite;

public final class a extends FlagField {
    public final EnumLite[] a;

    public a(int v, EnumLite[] arr_internal$EnumLite) {
        if(arr_internal$EnumLite == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'enumEntries\' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int v1 = 1;
        int v2 = arr_internal$EnumLite.length - 1;
        if(v2 != 0) {
            for(int v3 = 0x1F; v3 >= 0; --v3) {
                if((1 << v3 & v2) != 0) {
                    v1 = v3 + 1;
                    super(v, v1);
                    this.a = arr_internal$EnumLite;
                    return;
                }
            }
            throw new IllegalStateException("Empty enum: " + arr_internal$EnumLite.getClass());
        }
        super(v, v1);
        this.a = arr_internal$EnumLite;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField
    public final Object get(int v) {
        int v1 = (v & (1 << this.bitWidth) - 1 << this.offset) >> this.offset;
        EnumLite[] arr_internal$EnumLite = this.a;
        int v2 = 0;
        while(v2 < arr_internal$EnumLite.length) {
            EnumLite internal$EnumLite0 = arr_internal$EnumLite[v2];
            if(internal$EnumLite0.getNumber() != v1) {
                ++v2;
                continue;
            }
            return internal$EnumLite0;
        }
        return null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField
    public final int toFlags(Object object0) {
        return ((EnumLite)object0).getNumber() << this.offset;
    }
}

