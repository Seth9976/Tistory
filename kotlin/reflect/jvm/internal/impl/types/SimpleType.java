package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    @NotNull
    public abstract SimpleType makeNullableAsSpecified(boolean arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType makeNullableAsSpecified(boolean z) {
        return this.makeNullableAsSpecified(z);
    }

    @NotNull
    public abstract SimpleType replaceAttributes(@NotNull TypeAttributes arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType replaceAttributes(TypeAttributes typeAttributes0) {
        return this.replaceAttributes(typeAttributes0);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.getAnnotations()) {
            m.append(stringBuilder0, new String[]{"[", DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.DEBUG_TEXT, ((AnnotationDescriptor)object0), null, 2, null), "] "});
        }
        stringBuilder0.append(this.getConstructor());
        if(!this.getArguments().isEmpty()) {
            CollectionsKt___CollectionsKt.joinTo$default(this.getArguments(), stringBuilder0, ", ", "<", ">", 0, null, null, 0x70, null);
        }
        if(this.isMarkedNullable()) {
            stringBuilder0.append("?");
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

