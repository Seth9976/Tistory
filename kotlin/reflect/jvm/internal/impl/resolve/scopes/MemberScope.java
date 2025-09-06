package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MemberScope extends ResolutionScope {
    public static final class Companion {
        public static final Companion a;
        public static final b b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = b.w;
        }

        @NotNull
        public final Function1 getALL_NAME_FILTER() {
            return Companion.b;
        }
    }

    public static final class DefaultImpls {
        public static void recordLookup(@NotNull MemberScope memberScope0, @NotNull Name name0, @NotNull LookupLocation lookupLocation0) {
            Intrinsics.checkNotNullParameter(name0, "name");
            Intrinsics.checkNotNullParameter(lookupLocation0, "location");
            kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.recordLookup(memberScope0, name0, lookupLocation0);
        }
    }

    public static final class Empty extends MemberScopeImpl {
        @NotNull
        public static final Empty INSTANCE;

        static {
            Empty.INSTANCE = new Empty();  // 初始化器: Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScopeImpl;-><init>()V
        }

        @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
        @NotNull
        public Set getClassifierNames() {
            return f0.emptySet();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
        @NotNull
        public Set getFunctionNames() {
            return f0.emptySet();
        }

        @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl
        @NotNull
        public Set getVariableNames() {
            return f0.emptySet();
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        MemberScope.Companion = Companion.a;
    }

    @Nullable
    Set getClassifierNames();

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    Collection getContributedFunctions(@NotNull Name arg1, @NotNull LookupLocation arg2);

    @NotNull
    Collection getContributedVariables(@NotNull Name arg1, @NotNull LookupLocation arg2);

    @NotNull
    Set getFunctionNames();

    @NotNull
    Set getVariableNames();
}

