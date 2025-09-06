package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import org.jetbrains.annotations.NotNull;

public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {
    public static final class RuntimeSourceElement implements JavaSourceElement {
        public final ReflectJavaElement a;

        public RuntimeSourceElement(@NotNull ReflectJavaElement reflectJavaElement0) {
            Intrinsics.checkNotNullParameter(reflectJavaElement0, "javaElement");
            super();
            this.a = reflectJavaElement0;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        @NotNull
        public SourceFile getContainingFile() {
            Intrinsics.checkNotNullExpressionValue(SourceFile.NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return SourceFile.NO_SOURCE_FILE;
        }

        @NotNull
        public ReflectJavaElement getJavaElement() {
            return this.a;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        public JavaElement getJavaElement() {
            return this.getJavaElement();
        }

        // 去混淆评级： 低(40)
        @Override
        @NotNull
        public String toString() {
            return "kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory$RuntimeSourceElement: " + this.getJavaElement();
        }
    }

    @NotNull
    public static final RuntimeSourceElementFactory INSTANCE;

    static {
        RuntimeSourceElementFactory.INSTANCE = new RuntimeSourceElementFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    @NotNull
    public JavaSourceElement source(@NotNull JavaElement javaElement0) {
        Intrinsics.checkNotNullParameter(javaElement0, "javaElement");
        return new RuntimeSourceElement(((ReflectJavaElement)javaElement0));
    }
}

