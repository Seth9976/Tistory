package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AnnotationDescriptorImpl implements AnnotationDescriptor {
    public final KotlinType a;
    public final Map b;
    public final SourceElement c;

    public AnnotationDescriptorImpl(@NotNull KotlinType kotlinType0, @NotNull Map map0, @NotNull SourceElement sourceElement0) {
        if(kotlinType0 != null) {
            if(map0 != null) {
                if(sourceElement0 != null) {
                    super();
                    this.a = kotlinType0;
                    this.b = map0;
                    this.c = sourceElement0;
                    return;
                }
                AnnotationDescriptorImpl.a(2);
                throw null;
            }
            AnnotationDescriptorImpl.a(1);
            throw null;
        }
        AnnotationDescriptorImpl.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 3 || v == 4 || v == 5 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "valueArguments";
                break;
            }
            case 2: {
                arr_object[0] = "source";
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "annotationType";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "getType";
                break;
            }
            case 4: {
                arr_object[1] = "getAllValueArguments";
                break;
            }
            case 5: {
                arr_object[1] = "getSource";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
            }
        }
        if(v != 3 && v != 4 && v != 5) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 3 || v == 4 || v == 5 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 3 || v == 4 || v == 5 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map getAllValueArguments() {
        Map map0 = this.b;
        if(map0 != null) {
            return map0;
        }
        AnnotationDescriptorImpl.a(4);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    public FqName getFqName() {
        return DefaultImpls.getFqName(this);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement0 = this.c;
        if(sourceElement0 != null) {
            return sourceElement0;
        }
        AnnotationDescriptorImpl.a(5);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType0 = this.a;
        if(kotlinType0 != null) {
            return kotlinType0;
        }
        AnnotationDescriptorImpl.a(3);
        throw null;
    }

    @Override
    public String toString() {
        return DescriptorRenderer.FQ_NAMES_IN_TYPES.renderAnnotation(this, null);
    }
}

