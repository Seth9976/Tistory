package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import we.b;
import we.c;

public final class a implements AnnotationArgumentVisitor {
    public final ReadKotlinClassHeaderAnnotationVisitor a;

    public a(ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor0) {
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
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
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
        if(name0 == null) {
            return;
        }
        String s = name0.asString();
        ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor0 = this.a;
        if("k".equals(s)) {
            if(object0 instanceof Integer) {
                readKotlinClassHeaderAnnotationVisitor0.h = Kind.getById(((int)(((Integer)object0))));
            }
        }
        else if("mv".equals(s)) {
            if(object0 instanceof int[]) {
                readKotlinClassHeaderAnnotationVisitor0.a = (int[])object0;
            }
        }
        else if("xs".equals(s)) {
            if(object0 instanceof String && !((String)object0).isEmpty()) {
                readKotlinClassHeaderAnnotationVisitor0.b = (String)object0;
            }
        }
        else if("xi".equals(s)) {
            if(object0 instanceof Integer) {
                readKotlinClassHeaderAnnotationVisitor0.c = (int)(((Integer)object0));
            }
        }
        else if("pn".equals(s) && object0 instanceof String && !((String)object0).isEmpty()) {
            readKotlinClassHeaderAnnotationVisitor0.d = (String)object0;
        }
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final AnnotationArgumentVisitor visitAnnotation(Name name0, ClassId classId0) {
        if(classId0 != null) {
            return null;
        }
        a.a(3);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final AnnotationArrayArgumentVisitor visitArray(Name name0) {
        String s = name0 == null ? null : name0.asString();
        if("d1".equals(s)) {
            return new b(this);
        }
        return "d2".equals(s) ? new c(this) : null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public final void visitClassLiteral(Name name0, ClassLiteralValue classLiteralValue0) {
        if(classLiteralValue0 != null) {
            return;
        }
        a.a(0);
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
            a.a(2);
            throw null;
        }
        a.a(1);
        throw null;
    }
}

