package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import j2.j;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import md.c;
import org.jetbrains.annotations.NotNull;

public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {
    public final KotlinBuiltIns a;
    public final FqName b;
    public final Map c;
    public final Lazy d;

    public BuiltInAnnotationDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns0, @NotNull FqName fqName0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns0, "builtIns");
        Intrinsics.checkNotNullParameter(fqName0, "fqName");
        Intrinsics.checkNotNullParameter(map0, "allValueArguments");
        super();
        this.a = kotlinBuiltIns0;
        this.b = fqName0;
        this.c = map0;
        j j0 = new j(this, 19);
        this.d = c.lazy(LazyThreadSafetyMode.PUBLICATION, j0);
    }

    public static final KotlinBuiltIns access$getBuiltIns$p(BuiltInAnnotationDescriptor builtInAnnotationDescriptor0) {
        return builtInAnnotationDescriptor0.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map getAllValueArguments() {
        return this.c;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public FqName getFqName() {
        return this.b;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
        return SourceElement.NO_SOURCE;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        Object object0 = this.d.getValue();
        Intrinsics.checkNotNullExpressionValue(object0, "<get-type>(...)");
        return (KotlinType)object0;
    }
}

