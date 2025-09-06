package we;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

public abstract class a implements AnnotationArrayArgumentVisitor {
    public final ArrayList a;

    public a() {
        this.a = new ArrayList();
    }

    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "enumEntryName";
                break;
            }
            case 2: {
                arr_object[0] = "classLiteralValue";
                break;
            }
            case 3: {
                arr_object[0] = "classId";
                break;
            }
            default: {
                arr_object[0] = "enumClassId";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
        switch(v) {
            case 2: {
                arr_object[2] = "visitClassLiteral";
                break;
            }
            case 3: {
                arr_object[2] = "visitAnnotation";
                break;
            }
            default: {
                arr_object[2] = "visitEnum";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    public abstract void b(String[] arg1);

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
    public final void visit(Object object0) {
        if(object0 instanceof String) {
            this.a.add(((String)object0));
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
    public final AnnotationArgumentVisitor visitAnnotation(ClassId classId0) {
        if(classId0 != null) {
            return null;
        }
        a.a(3);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
    public final void visitClassLiteral(ClassLiteralValue classLiteralValue0) {
        if(classLiteralValue0 != null) {
            return;
        }
        a.a(2);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
    public final void visitEnd() {
        this.b(((String[])this.a.toArray(new String[0])));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
    public final void visitEnum(ClassId classId0, Name name0) {
        if(classId0 != null) {
            if(name0 != null) {
                return;
            }
            a.a(1);
            throw null;
        }
        a.a(0);
        throw null;
    }
}

