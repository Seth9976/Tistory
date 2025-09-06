package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AnnotationsTypeAttribute extends TypeAttribute {
    public final Annotations a;

    public AnnotationsTypeAttribute(@NotNull Annotations annotations0) {
        Intrinsics.checkNotNullParameter(annotations0, "annotations");
        super();
        this.a = annotations0;
    }

    @NotNull
    public AnnotationsTypeAttribute add(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute0) {
        return annotationsTypeAttribute0 == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.composeAnnotations(this.a, annotationsTypeAttribute0.a));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public TypeAttribute add(TypeAttribute typeAttribute0) {
        return this.add(((AnnotationsTypeAttribute)typeAttribute0));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof AnnotationsTypeAttribute ? Intrinsics.areEqual(((AnnotationsTypeAttribute)object0).a, this.a) : false;
    }

    @NotNull
    public final Annotations getAnnotations() {
        return this.a;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public KClass getKey() {
        return Reflection.getOrCreateKotlinClass(AnnotationsTypeAttribute.class);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public AnnotationsTypeAttribute intersect(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute0) {
        return Intrinsics.areEqual(annotationsTypeAttribute0, this) ? this : null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public TypeAttribute intersect(TypeAttribute typeAttribute0) {
        return this.intersect(((AnnotationsTypeAttribute)typeAttribute0));
    }
}

