package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DeclaredMemberIndex {
    public static final class Empty implements DeclaredMemberIndex {
        @NotNull
        public static final Empty INSTANCE;

        static {
            Empty.INSTANCE = new Empty();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        public JavaField findFieldByName(@NotNull Name name0) {
            Intrinsics.checkNotNullParameter(name0, "name");
            return null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        public Collection findMethodsByName(Name name0) {
            return this.findMethodsByName(name0);
        }

        @NotNull
        public List findMethodsByName(@NotNull Name name0) {
            Intrinsics.checkNotNullParameter(name0, "name");
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        public JavaRecordComponent findRecordComponentByName(@NotNull Name name0) {
            Intrinsics.checkNotNullParameter(name0, "name");
            return null;
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set getFieldNames() {
            return f0.emptySet();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set getMethodNames() {
            return f0.emptySet();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set getRecordComponentNames() {
            return f0.emptySet();
        }
    }

    @Nullable
    JavaField findFieldByName(@NotNull Name arg1);

    @NotNull
    Collection findMethodsByName(@NotNull Name arg1);

    @Nullable
    JavaRecordComponent findRecordComponentByName(@NotNull Name arg1);

    @NotNull
    Set getFieldNames();

    @NotNull
    Set getMethodNames();

    @NotNull
    Set getRecordComponentNames();
}

