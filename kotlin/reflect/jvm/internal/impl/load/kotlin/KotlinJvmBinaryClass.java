package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KotlinJvmBinaryClass {
    public interface AnnotationArgumentVisitor {
        void visit(@Nullable Name arg1, @Nullable Object arg2);

        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@Nullable Name arg1, @NotNull ClassId arg2);

        @Nullable
        AnnotationArrayArgumentVisitor visitArray(@Nullable Name arg1);

        void visitClassLiteral(@Nullable Name arg1, @NotNull ClassLiteralValue arg2);

        void visitEnd();

        void visitEnum(@Nullable Name arg1, @NotNull ClassId arg2, @NotNull Name arg3);
    }

    public interface AnnotationArrayArgumentVisitor {
        void visit(@Nullable Object arg1);

        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId arg1);

        void visitClassLiteral(@NotNull ClassLiteralValue arg1);

        void visitEnd();

        void visitEnum(@NotNull ClassId arg1, @NotNull Name arg2);
    }

    public interface AnnotationVisitor {
        @Nullable
        AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId arg1, @NotNull SourceElement arg2);

        void visitEnd();
    }

    public interface MemberVisitor {
        @Nullable
        AnnotationVisitor visitField(@NotNull Name arg1, @NotNull String arg2, @Nullable Object arg3);

        @Nullable
        MethodAnnotationVisitor visitMethod(@NotNull Name arg1, @NotNull String arg2);
    }

    public interface MethodAnnotationVisitor extends AnnotationVisitor {
        @Nullable
        AnnotationArgumentVisitor visitParameterAnnotation(int arg1, @NotNull ClassId arg2, @NotNull SourceElement arg3);
    }

    @NotNull
    KotlinClassHeader getClassHeader();

    @NotNull
    ClassId getClassId();

    @NotNull
    String getLocation();

    void loadClassAnnotations(@NotNull AnnotationVisitor arg1, @Nullable byte[] arg2);

    void visitMembers(@NotNull MemberVisitor arg1, @Nullable byte[] arg2);
}

