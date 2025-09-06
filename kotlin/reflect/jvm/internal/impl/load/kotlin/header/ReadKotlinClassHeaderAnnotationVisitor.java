package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import we.e;
import we.h;

public class ReadKotlinClassHeaderAnnotationVisitor implements AnnotationVisitor {
    public int[] a;
    public String b;
    public int c;
    public String d;
    public String[] e;
    public String[] f;
    public String[] g;
    public Kind h;
    public String[] i;
    public static final boolean j;
    public static final HashMap k;

    static {
        ReadKotlinClassHeaderAnnotationVisitor.j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        HashMap hashMap0 = new HashMap();
        ReadKotlinClassHeaderAnnotationVisitor.k = hashMap0;
        hashMap0.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), Kind.CLASS);
        hashMap0.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), Kind.FILE_FACADE);
        hashMap0.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), Kind.MULTIFILE_CLASS);
        hashMap0.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), Kind.MULTIFILE_CLASS_PART);
        hashMap0.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), Kind.SYNTHETIC_CLASS);
    }

    public ReadKotlinClassHeaderAnnotationVisitor() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "source" : "classId";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        arr_object[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Nullable
    public KotlinClassHeader createHeader(JvmMetadataVersion jvmMetadataVersion0) {
        byte[] arr_b = null;
        if(this.h != null && this.a != null) {
            JvmMetadataVersion jvmMetadataVersion1 = new JvmMetadataVersion(this.a, (this.c & 8) != 0);
            if(!jvmMetadataVersion1.isCompatible(jvmMetadataVersion0)) {
                this.g = this.e;
                this.e = null;
            }
            else if((this.h == Kind.CLASS || this.h == Kind.FILE_FACADE || this.h == Kind.MULTIFILE_CLASS_PART) && this.e == null) {
                return null;
            }
            String[] arr_s = this.i;
            if(arr_s != null) {
                arr_b = BitEncoding.decodeBytes(arr_s);
            }
            return new KotlinClassHeader(this.h, jvmMetadataVersion1, this.e, this.g, this.f, this.b, this.c, this.d, arr_b);
        }
        return null;
    }

    @Nullable
    public KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return this.createHeader(JvmMetadataVersion.INSTANCE);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationVisitor
    @Nullable
    public AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId0, @NotNull SourceElement sourceElement0) {
        if(classId0 != null) {
            if(sourceElement0 != null) {
                FqName fqName0 = classId0.asSingleFqName();
                if(fqName0.equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
                    return new a(this);
                }
                if(fqName0.equals(JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
                    return new e(this);
                }
                if(ReadKotlinClassHeaderAnnotationVisitor.j) {
                    return null;
                }
                if(this.h != null) {
                    return null;
                }
                Kind kotlinClassHeader$Kind0 = (Kind)ReadKotlinClassHeaderAnnotationVisitor.k.get(classId0);
                if(kotlinClassHeader$Kind0 != null) {
                    this.h = kotlinClassHeader$Kind0;
                    return new h(this);
                }
                return null;
            }
            ReadKotlinClassHeaderAnnotationVisitor.a(1);
            throw null;
        }
        ReadKotlinClassHeaderAnnotationVisitor.a(0);
        throw null;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationVisitor
    public void visitEnd() {
    }
}

