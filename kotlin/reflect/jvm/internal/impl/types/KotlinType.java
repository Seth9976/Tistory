package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class KotlinType implements Annotated, KotlinTypeMarker {
    public int a;

    public KotlinType(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KotlinType)) {
            return false;
        }
        if(this.isMarkedNullable() == ((KotlinType)object0).isMarkedNullable()) {
            UnwrappedType unwrappedType0 = this.unwrap();
            UnwrappedType unwrappedType1 = ((KotlinType)object0).unwrap();
            return StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(unwrappedType0, unwrappedType1);
        }
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.getAnnotations(this.getAttributes());
    }

    @NotNull
    public abstract List getArguments();

    @NotNull
    public abstract TypeAttributes getAttributes();

    @NotNull
    public abstract TypeConstructor getConstructor();

    @NotNull
    public abstract MemberScope getMemberScope();

    @Override
    public final int hashCode() {
        int v1;
        int v = this.a;
        if(v != 0) {
            return v;
        }
        if(KotlinTypeKt.isError(this)) {
            v1 = super.hashCode();
        }
        else {
            int v2 = this.getConstructor().hashCode();
            int v3 = this.getArguments().hashCode();
            v1 = this.isMarkedNullable() + (v3 + v2 * 0x1F) * 0x1F;
        }
        this.a = v1;
        return v1;
    }

    public abstract boolean isMarkedNullable();

    @NotNull
    public abstract KotlinType refine(@NotNull KotlinTypeRefiner arg1);

    @NotNull
    public abstract UnwrappedType unwrap();
}

