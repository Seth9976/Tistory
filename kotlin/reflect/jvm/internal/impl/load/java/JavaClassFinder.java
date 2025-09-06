package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaClassFinder {
    public static final class Request {
        public final ClassId a;
        public final byte[] b;
        public final JavaClass c;

        public Request(@NotNull ClassId classId0, @Nullable byte[] arr_b, @Nullable JavaClass javaClass0) {
            Intrinsics.checkNotNullParameter(classId0, "classId");
            super();
            this.a = classId0;
            this.b = arr_b;
            this.c = javaClass0;
        }

        public Request(ClassId classId0, byte[] arr_b, JavaClass javaClass0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                arr_b = null;
            }
            if((v & 4) != 0) {
                javaClass0 = null;
            }
            this(classId0, arr_b, javaClass0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Request)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Request)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((Request)object0).b) ? Intrinsics.areEqual(this.c, ((Request)object0).c) : false;
        }

        @NotNull
        public final ClassId getClassId() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = 0;
            int v2 = this.b == null ? 0 : Arrays.hashCode(this.b);
            JavaClass javaClass0 = this.c;
            if(javaClass0 != null) {
                v1 = javaClass0.hashCode();
            }
            return (v * 0x1F + v2) * 0x1F + v1;
        }

        @Override
        @NotNull
        public String toString() {
            return "Request(classId=" + this.a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.b) + ", outerClass=" + this.c + ')';
        }
    }

    @Nullable
    JavaClass findClass(@NotNull Request arg1);

    @Nullable
    JavaPackage findPackage(@NotNull FqName arg1, boolean arg2);

    @Nullable
    Set knownClassNamesInPackage(@NotNull FqName arg1);
}

