package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor implements AnnotationArgumentVisitor {
    public final BinaryClassAnnotationAndConstantLoaderImpl a;

    public BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl0) {
        this.a = binaryClassAnnotationAndConstantLoaderImpl0;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public void visit(@Nullable Name name0, @Nullable Object object0) {
        this.visitConstantValue(name0, BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(this.a, name0, object0));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    @Nullable
    public AnnotationArgumentVisitor visitAnnotation(@Nullable Name name0, @NotNull ClassId classId0) {
        Intrinsics.checkNotNullParameter(classId0, "classId");
        ArrayList arrayList0 = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
        AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0 = this.a.loadAnnotation(classId0, SourceElement.NO_SOURCE, arrayList0);
        Intrinsics.checkNotNull(kotlinJvmBinaryClass$AnnotationArgumentVisitor0);
        return new AnnotationArgumentVisitor() {
            public final AnnotationArgumentVisitor a;
            public final AnnotationArgumentVisitor b;
            public final BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor c;
            public final Name d;
            public final ArrayList e;

            {
                AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor binaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor0 = name0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Name name0 = arrayList0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.b = kotlinJvmBinaryClass$AnnotationArgumentVisitor0;
                this.c = binaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor0;
                this.d = name0;
                this.e = arrayList0;
                this.a = kotlinJvmBinaryClass$AnnotationArgumentVisitor0;
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
            public void visit(@Nullable Name name0, @Nullable Object object0) {
                this.a.visit(name0, object0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
            @Nullable
            public AnnotationArgumentVisitor visitAnnotation(@Nullable Name name0, @NotNull ClassId classId0) {
                Intrinsics.checkNotNullParameter(classId0, "classId");
                return this.a.visitAnnotation(name0, classId0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
            @Nullable
            public AnnotationArrayArgumentVisitor visitArray(@Nullable Name name0) {
                return this.a.visitArray(name0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
            public void visitClassLiteral(@Nullable Name name0, @NotNull ClassLiteralValue classLiteralValue0) {
                Intrinsics.checkNotNullParameter(classLiteralValue0, "value");
                this.a.visitClassLiteral(name0, classLiteralValue0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
            public void visitEnd() {
                this.b.visitEnd();
                AnnotationValue annotationValue0 = new AnnotationValue(((AnnotationDescriptor)CollectionsKt___CollectionsKt.single(this.e)));
                this.c.visitConstantValue(this.d, annotationValue0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
            public void visitEnum(@Nullable Name name0, @NotNull ClassId classId0, @NotNull Name name1) {
                Intrinsics.checkNotNullParameter(classId0, "enumClassId");
                Intrinsics.checkNotNullParameter(name1, "enumEntryName");
                this.a.visitEnum(name0, classId0, name1);
            }
        };
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    @Nullable
    public AnnotationArrayArgumentVisitor visitArray(@Nullable Name name0) {
        return new AnnotationArrayArgumentVisitor() {
            public final ArrayList a;
            public final BinaryClassAnnotationAndConstantLoaderImpl b;
            public final Name c;
            public final BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor d;

            {
                BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl0 = name0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Name name0 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.b = binaryClassAnnotationAndConstantLoaderImpl0;
                this.c = name0;
                this.d = binaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor0;
                this.a = new ArrayList();
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
            public void visit(@Nullable Object object0) {
                ConstantValue constantValue0 = BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(this.b, this.c, object0);
                this.a.add(constantValue0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
            @Nullable
            public AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId0) {
                Intrinsics.checkNotNullParameter(classId0, "classId");
                ArrayList arrayList0 = new ArrayList();
                Intrinsics.checkNotNullExpressionValue(SourceElement.NO_SOURCE, "NO_SOURCE");
                AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0 = this.b.loadAnnotation(classId0, SourceElement.NO_SOURCE, arrayList0);
                Intrinsics.checkNotNull(kotlinJvmBinaryClass$AnnotationArgumentVisitor0);
                return new AnnotationArgumentVisitor() {
                    public final AnnotationArgumentVisitor a;
                    public final AnnotationArgumentVisitor b;
                    public final kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor.visitArray.1 c;
                    public final ArrayList d;

                    {
                        AnnotationArgumentVisitor kotlinJvmBinaryClass$AnnotationArgumentVisitor0 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor.visitArray.1 binaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$10 = arrayList0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        this.b = kotlinJvmBinaryClass$AnnotationArgumentVisitor0;
                        this.c = binaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$10;
                        this.d = arrayList0;
                        this.a = kotlinJvmBinaryClass$AnnotationArgumentVisitor0;
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
                    public void visit(@Nullable Name name0, @Nullable Object object0) {
                        this.a.visit(name0, object0);
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
                    @Nullable
                    public AnnotationArgumentVisitor visitAnnotation(@Nullable Name name0, @NotNull ClassId classId0) {
                        Intrinsics.checkNotNullParameter(classId0, "classId");
                        return this.a.visitAnnotation(name0, classId0);
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
                    @Nullable
                    public AnnotationArrayArgumentVisitor visitArray(@Nullable Name name0) {
                        return this.a.visitArray(name0);
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
                    public void visitClassLiteral(@Nullable Name name0, @NotNull ClassLiteralValue classLiteralValue0) {
                        Intrinsics.checkNotNullParameter(classLiteralValue0, "value");
                        this.a.visitClassLiteral(name0, classLiteralValue0);
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
                    public void visitEnd() {
                        this.b.visitEnd();
                        this.c.a.add(new AnnotationValue(((AnnotationDescriptor)CollectionsKt___CollectionsKt.single(this.d))));
                    }

                    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
                    public void visitEnum(@Nullable Name name0, @NotNull ClassId classId0, @NotNull Name name1) {
                        Intrinsics.checkNotNullParameter(classId0, "enumClassId");
                        Intrinsics.checkNotNullParameter(name1, "enumEntryName");
                        this.a.visitEnum(name0, classId0, name1);
                    }
                };
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
            public void visitClassLiteral(@NotNull ClassLiteralValue classLiteralValue0) {
                Intrinsics.checkNotNullParameter(classLiteralValue0, "value");
                KClassValue kClassValue0 = new KClassValue(classLiteralValue0);
                this.a.add(kClassValue0);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
            public void visitEnd() {
                this.d.visitArrayValue(this.c, this.a);
            }

            @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArrayArgumentVisitor
            public void visitEnum(@NotNull ClassId classId0, @NotNull Name name0) {
                Intrinsics.checkNotNullParameter(classId0, "enumClassId");
                Intrinsics.checkNotNullParameter(name0, "enumEntryName");
                EnumValue enumValue0 = new EnumValue(classId0, name0);
                this.a.add(enumValue0);
            }
        };
    }

    public abstract void visitArrayValue(Name arg1, ArrayList arg2);

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public void visitClassLiteral(@Nullable Name name0, @NotNull ClassLiteralValue classLiteralValue0) {
        Intrinsics.checkNotNullParameter(classLiteralValue0, "value");
        this.visitConstantValue(name0, new KClassValue(classLiteralValue0));
    }

    public abstract void visitConstantValue(Name arg1, ConstantValue arg2);

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor
    public void visitEnum(@Nullable Name name0, @NotNull ClassId classId0, @NotNull Name name1) {
        Intrinsics.checkNotNullParameter(classId0, "enumClassId");
        Intrinsics.checkNotNullParameter(name1, "enumEntryName");
        this.visitConstantValue(name0, new EnumValue(classId0, name1));
    }
}

