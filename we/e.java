package we;

import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

public final class e implements AnnotationArgumentVisitor {
    public final ReadKotlinClassHeaderAnnotationVisitor a;

    public e(ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor0) {
        this.a = readKotlinClassHeaderAnnotationVisitor0;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "enumClassId";
                break;
            }
            case 2: {
                arr_object[0] = "enumEntryName";
                break;
            }
            case 3: {
                arr_object[0] = "classId";
                break;
            }
            default: {
                arr_object[0] = "classLiteralValue";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
        switch(v) {
            case 1: 
            case 2: {
                arr_object[2] = "visitEnum";
                break;
            }
            case 3: {
                arr_object[2] = "visitAnnotation";
                break;
            }
            default: {
                arr_object[2] = "visitClassLiteral";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final void visit(Name name0, Object object0) {
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final AnnotationArgumentVisitor visitAnnotation(Name name0, ClassId classId0) {
        if(classId0 != null) {
            return null;
        }
        e.a(3);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final AnnotationArrayArgumentVisitor visitArray(Name name0) {
        return "b".equals((name0 == null ? null : name0.asString())) ? new d(this) : null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final void visitClassLiteral(Name name0, ClassLiteralValue classLiteralValue0) {
        if(classLiteralValue0 != null) {
            return;
        }
        e.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final void visitEnd() {
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final void visitEnum(Name name0, ClassId classId0, Name name1) {
        if(classId0 != null) {
            if(name1 != null) {
                return;
            }
            e.a(2);
            throw null;
        }
        e.a(1);
        throw null;
    }
}

