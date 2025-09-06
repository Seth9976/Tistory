package kotlinx.serialization;

import fg.b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u001B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0011\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000ER \u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001B\u0010\u0018\u001A\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlinx/serialization/PolymorphicSerializer;", "", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lkotlin/reflect/KClass;", "baseClass", "<init>", "(Lkotlin/reflect/KClass;)V", "", "", "classAnnotations", "(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PolymorphicSerializer extends AbstractPolymorphicSerializer {
    public final KClass a;
    public final List b;
    public final Lazy c;

    public PolymorphicSerializer(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        super();
        this.a = kClass0;
        this.b = CollectionsKt__CollectionsKt.emptyList();
        b b0 = new b(this);
        this.c = c.lazy(LazyThreadSafetyMode.PUBLICATION, b0);
    }

    @PublishedApi
    public PolymorphicSerializer(@NotNull KClass kClass0, @NotNull Annotation[] arr_annotation) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        Intrinsics.checkNotNullParameter(arr_annotation, "classAnnotations");
        this(kClass0);
        this.b = ArraysKt___ArraysJvmKt.asList(arr_annotation);
    }

    public static final List access$get_annotations$p(PolymorphicSerializer polymorphicSerializer0) {
        return polymorphicSerializer0.b;
    }

    @Override  // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    @NotNull
    public KClass getBaseClass() {
        return this.a;
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }

    @Override
    @NotNull
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.getBaseClass() + ')';
    }
}

