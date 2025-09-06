package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.1 implements MemberVisitor {
    public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements MethodAnnotationVisitor {
        public final AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.1 d;

        public AnnotationVisitorForMethod(@NotNull MemberSignature memberSignature0) {
            Intrinsics.checkNotNullParameter(memberSignature0, "signature");
            this.d = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$10;
            super(memberSignature0);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$MethodAnnotationVisitor
        @Nullable
        public AnnotationArgumentVisitor visitParameterAnnotation(int v, @NotNull ClassId classId0, @NotNull SourceElement sourceElement0) {
            Intrinsics.checkNotNullParameter(classId0, "classId");
            Intrinsics.checkNotNullParameter(sourceElement0, "source");
            MemberSignature memberSignature0 = MemberSignature.Companion.fromMethodSignatureAndParameterIndex(this.getSignature(), v);
            AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$10 = this.d;
            List list0 = (List)abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$10.b.get(memberSignature0);
            if(list0 == null) {
                list0 = new ArrayList();
                abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$10.b.put(memberSignature0, list0);
            }
            return abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$10.a.loadAnnotationIfNotSpecial(classId0, sourceElement0, list0);
        }
    }

    public class MemberAnnotationVisitor implements AnnotationVisitor {
        public final MemberSignature a;
        public final ArrayList b;
        public final AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.1 c;

        public MemberAnnotationVisitor(@NotNull MemberSignature memberSignature0) {
            Intrinsics.checkNotNullParameter(memberSignature0, "signature");
            this.c = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$10;
            super();
            this.a = memberSignature0;
            this.b = new ArrayList();
        }

        @NotNull
        public final MemberSignature getSignature() {
            return this.a;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationVisitor
        @Nullable
        public AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId0, @NotNull SourceElement sourceElement0) {
            Intrinsics.checkNotNullParameter(classId0, "classId");
            Intrinsics.checkNotNullParameter(sourceElement0, "source");
            return this.c.a.loadAnnotationIfNotSpecial(classId0, sourceElement0, this.b);
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationVisitor
        public void visitEnd() {
            ArrayList arrayList0 = this.b;
            if(!arrayList0.isEmpty()) {
                this.c.b.put(this.a, arrayList0);
            }
        }
    }

    public final AbstractBinaryClassAnnotationAndConstantLoader a;
    public final HashMap b;
    public final KotlinJvmBinaryClass c;
    public final HashMap d;

    public AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader0, HashMap hashMap0, KotlinJvmBinaryClass kotlinJvmBinaryClass0, HashMap hashMap1) {
        this.a = abstractBinaryClassAnnotationAndConstantLoader0;
        this.b = hashMap0;
        this.c = kotlinJvmBinaryClass0;
        this.d = hashMap1;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$MemberVisitor
    @Nullable
    public AnnotationVisitor visitField(@NotNull Name name0, @NotNull String s, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(s, "desc");
        String s1 = name0.asString();
        Intrinsics.checkNotNullExpressionValue(s1, "name.asString()");
        MemberSignature memberSignature0 = MemberSignature.Companion.fromFieldNameAndDesc(s1, s);
        if(object0 != null) {
            Object object1 = this.a.loadConstant(s, object0);
            if(object1 != null) {
                this.d.put(memberSignature0, object1);
            }
        }
        return new MemberAnnotationVisitor(this, memberSignature0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$MemberVisitor
    @Nullable
    public MethodAnnotationVisitor visitMethod(@NotNull Name name0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(name0, "name");
        Intrinsics.checkNotNullParameter(s, "desc");
        String s1 = name0.asString();
        Intrinsics.checkNotNullExpressionValue(s1, "name.asString()");
        return new AnnotationVisitorForMethod(this, MemberSignature.Companion.fromMethodNameAndDesc(s1, s));
    }
}

