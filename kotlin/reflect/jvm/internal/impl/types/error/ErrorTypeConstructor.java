package kotlin.reflect.jvm.internal.impl.types.error;

import a5.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

public final class ErrorTypeConstructor implements TypeConstructor {
    public final ErrorTypeKind a;
    public final String[] b;
    public final String c;

    public ErrorTypeConstructor(@NotNull ErrorTypeKind errorTypeKind0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorTypeKind0, "kind");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        super();
        this.a = errorTypeKind0;
        this.b = arr_s;
        Object[] arr_object = Arrays.copyOf(arr_s, arr_s.length);
        this.c = b.f(1, "[Error type: %s]", "format(this, *args)", new Object[]{b.f(arr_object.length, errorTypeKind0.getDebugMessage(), "format(this, *args)", arr_object)});
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return DefaultBuiltIns.Companion.getInstance();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public ClassifierDescriptor getDeclarationDescriptor() {
        return ErrorUtils.INSTANCE.getErrorClass();
    }

    @NotNull
    public final ErrorTypeKind getKind() {
        return this.a;
    }

    @NotNull
    public final String getParam(int v) {
        return this.b[v];
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List getParameters() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection getSupertypes() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner0) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner0, "kotlinTypeRefiner");
        return this;
    }

    @Override
    @NotNull
    public String toString() {
        return this.c;
    }
}

