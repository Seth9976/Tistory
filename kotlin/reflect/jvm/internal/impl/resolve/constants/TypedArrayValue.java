package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.compose.foundation.text.selection.g1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class TypedArrayValue extends ArrayValue {
    public final KotlinType c;

    public TypedArrayValue(@NotNull List list0, @NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(list0, "value");
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        super(list0, new g1(kotlinType0, 15));
        this.c = kotlinType0;
    }

    @NotNull
    public final KotlinType getType() {
        return this.c;
    }
}

