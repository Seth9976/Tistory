package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ErrorUtils {
    @NotNull
    public static final ErrorUtils INSTANCE;
    public static final ErrorModuleDescriptor a;
    public static final ErrorClassDescriptor b;
    public static final ErrorType c;
    public static final ErrorType d;
    public static final Set e;

    static {
        ErrorUtils.INSTANCE = new ErrorUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
        ErrorUtils.a = ErrorModuleDescriptor.INSTANCE;
        Arrays.copyOf(new Object[]{"unknown class"}, 1);
        Intrinsics.checkNotNullExpressionValue("<Error class: unknown class>", "format(this, *args)");
        Name name0 = Name.special("<Error class: unknown class>");
        Intrinsics.checkNotNullExpressionValue(name0, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        ErrorUtils.b = new ErrorClassDescriptor(name0);
        ErrorUtils.c = ErrorUtils.createErrorType(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        ErrorUtils.d = ErrorUtils.createErrorType(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        ErrorUtils.e = e0.setOf(new ErrorPropertyDescriptor());
    }

    @JvmStatic
    @NotNull
    public static final ErrorScope createErrorScope(@NotNull ErrorScopeKind errorScopeKind0, boolean z, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorScopeKind0, "kind");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        return z ? new ThrowingScope(errorScopeKind0, ((String[])Arrays.copyOf(arr_s, arr_s.length))) : new ErrorScope(errorScopeKind0, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @JvmStatic
    @NotNull
    public static final ErrorScope createErrorScope(@NotNull ErrorScopeKind errorScopeKind0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorScopeKind0, "kind");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        return ErrorUtils.createErrorScope(errorScopeKind0, false, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @JvmStatic
    @NotNull
    public static final ErrorType createErrorType(@NotNull ErrorTypeKind errorTypeKind0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorTypeKind0, "kind");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        String[] arr_s1 = (String[])Arrays.copyOf(arr_s, arr_s.length);
        return ErrorUtils.INSTANCE.createErrorTypeWithArguments(errorTypeKind0, CollectionsKt__CollectionsKt.emptyList(), arr_s1);
    }

    @NotNull
    public final ErrorType createErrorType(@NotNull ErrorTypeKind errorTypeKind0, @NotNull TypeConstructor typeConstructor0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorTypeKind0, "kind");
        Intrinsics.checkNotNullParameter(typeConstructor0, "typeConstructor");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        return this.createErrorTypeWithArguments(errorTypeKind0, CollectionsKt__CollectionsKt.emptyList(), typeConstructor0, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @NotNull
    public final ErrorTypeConstructor createErrorTypeConstructor(@NotNull ErrorTypeKind errorTypeKind0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorTypeKind0, "kind");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        return new ErrorTypeConstructor(errorTypeKind0, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @NotNull
    public final ErrorType createErrorTypeWithArguments(@NotNull ErrorTypeKind errorTypeKind0, @NotNull List list0, @NotNull TypeConstructor typeConstructor0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorTypeKind0, "kind");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        Intrinsics.checkNotNullParameter(typeConstructor0, "typeConstructor");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        return new ErrorType(typeConstructor0, ErrorUtils.createErrorScope(ErrorScopeKind.ERROR_TYPE_SCOPE, new String[]{typeConstructor0.toString()}), errorTypeKind0, list0, false, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @NotNull
    public final ErrorType createErrorTypeWithArguments(@NotNull ErrorTypeKind errorTypeKind0, @NotNull List list0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(errorTypeKind0, "kind");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        Intrinsics.checkNotNullParameter(arr_s, "formatParams");
        return this.createErrorTypeWithArguments(errorTypeKind0, list0, this.createErrorTypeConstructor(errorTypeKind0, ((String[])Arrays.copyOf(arr_s, arr_s.length))), ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @NotNull
    public final ErrorClassDescriptor getErrorClass() {
        return ErrorUtils.b;
    }

    @NotNull
    public final ModuleDescriptor getErrorModule() {
        return ErrorUtils.a;
    }

    @NotNull
    public final Set getErrorPropertyGroup() {
        return ErrorUtils.e;
    }

    @NotNull
    public final KotlinType getErrorPropertyType() {
        return ErrorUtils.d;
    }

    @NotNull
    public final KotlinType getErrorTypeForLoopInSupertypes() {
        return ErrorUtils.c;
    }

    @JvmStatic
    public static final boolean isError(@Nullable DeclarationDescriptor declarationDescriptor0) {
        if(declarationDescriptor0 != null) {
            ErrorUtils.INSTANCE.getClass();
            return declarationDescriptor0 instanceof ErrorClassDescriptor || declarationDescriptor0.getContainingDeclaration() instanceof ErrorClassDescriptor || declarationDescriptor0 == ErrorUtils.a;
        }
        return false;
    }

    @JvmStatic
    public static final boolean isUninferredTypeVariable(@Nullable KotlinType kotlinType0) {
        if(kotlinType0 == null) {
            return false;
        }
        TypeConstructor typeConstructor0 = kotlinType0.getConstructor();
        return typeConstructor0 instanceof ErrorTypeConstructor && ((ErrorTypeConstructor)typeConstructor0).getKind() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    @NotNull
    public final String unresolvedTypeAsItIs(@NotNull KotlinType kotlinType0) {
        Intrinsics.checkNotNullParameter(kotlinType0, "type");
        TypeUtilsKt.isUnresolvedType(kotlinType0);
        TypeConstructor typeConstructor0 = kotlinType0.getConstructor();
        Intrinsics.checkNotNull(typeConstructor0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((ErrorTypeConstructor)typeConstructor0).getParam(0);
    }
}

