package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class JvmType {
    public static final class Array extends JvmType {
        public final JvmType i;

        public Array(@NotNull JvmType jvmType0) {
            Intrinsics.checkNotNullParameter(jvmType0, "elementType");
            super(null);
            this.i = jvmType0;
        }

        @NotNull
        public final JvmType getElementType() {
            return this.i;
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.a;
        }

        @NotNull
        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.c;
        }

        @NotNull
        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.b;
        }

        @NotNull
        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.h;
        }

        @NotNull
        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.f;
        }

        @NotNull
        public final Primitive getINT$descriptors_jvm() {
            return JvmType.e;
        }

        @NotNull
        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.g;
        }

        @NotNull
        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.d;
        }
    }

    public static final class Object extends JvmType {
        public final String i;

        public Object(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "internalName");
            super(null);
            this.i = s;
        }

        @NotNull
        public final String getInternalName() {
            return this.i;
        }
    }

    public static final class Primitive extends JvmType {
        public final JvmPrimitiveType i;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType0) {
            super(null);
            this.i = jvmPrimitiveType0;
        }

        @Nullable
        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.i;
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final Primitive a;
    public static final Primitive b;
    public static final Primitive c;
    public static final Primitive d;
    public static final Primitive e;
    public static final Primitive f;
    public static final Primitive g;
    public static final Primitive h;

    static {
        JvmType.Companion = new Companion(null);
        JvmType.a = new Primitive(JvmPrimitiveType.BOOLEAN);
        JvmType.b = new Primitive(JvmPrimitiveType.CHAR);
        JvmType.c = new Primitive(JvmPrimitiveType.BYTE);
        JvmType.d = new Primitive(JvmPrimitiveType.SHORT);
        JvmType.e = new Primitive(JvmPrimitiveType.INT);
        JvmType.f = new Primitive(JvmPrimitiveType.FLOAT);
        JvmType.g = new Primitive(JvmPrimitiveType.LONG);
        JvmType.h = new Primitive(JvmPrimitiveType.DOUBLE);
    }

    public JvmType(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Override
    @NotNull
    public String toString() {
        return d.b(this);
    }
}

