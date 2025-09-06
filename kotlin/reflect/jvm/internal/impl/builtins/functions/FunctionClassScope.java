package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class FunctionClassScope extends GivenFunctionsMemberScope {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FunctionClassKind.values().length];
            try {
                arr_v[FunctionClassKind.Function.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FunctionClassKind.SuspendFunction.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public FunctionClassScope(@NotNull StorageManager storageManager0, @NotNull FunctionClassDescriptor functionClassDescriptor0) {
        Intrinsics.checkNotNullParameter(storageManager0, "storageManager");
        Intrinsics.checkNotNullParameter(functionClassDescriptor0, "containingClass");
        super(storageManager0, functionClassDescriptor0);
    }

    @Override  // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @NotNull
    public List computeDeclaredFunctions() {
        ClassDescriptor classDescriptor0 = this.getContainingClass();
        Intrinsics.checkNotNull(classDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        switch(WhenMappings.$EnumSwitchMapping$0[((FunctionClassDescriptor)classDescriptor0).getFunctionKind().ordinal()]) {
            case 1: {
                return k.listOf(FunctionInvokeDescriptor.Factory.create(((FunctionClassDescriptor)this.getContainingClass()), false));
            }
            case 2: {
                return k.listOf(FunctionInvokeDescriptor.Factory.create(((FunctionClassDescriptor)this.getContainingClass()), true));
            }
            default: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
    }
}

