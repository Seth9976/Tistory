package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public abstract class UnwrappedType extends KotlinType {
    public UnwrappedType(DefaultConstructorMarker defaultConstructorMarker0) {
        super(null);
    }

    @NotNull
    public abstract UnwrappedType makeNullableAsSpecified(boolean arg1);

    @NotNull
    public abstract UnwrappedType refine(@NotNull KotlinTypeRefiner arg1);

    @NotNull
    public abstract UnwrappedType replaceAttributes(@NotNull TypeAttributes arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public final UnwrappedType unwrap() {
        return this;
    }
}

