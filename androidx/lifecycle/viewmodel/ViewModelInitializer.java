package androidx.lifecycle.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\t\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000BB0\b\u0016\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0017\u0010\t\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\rR \u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R+\u0010\t\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", "T", "", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "initializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/reflect/KClass;", "getClazz$lifecycle_viewmodel_release", "()Lkotlin/reflect/KClass;", "b", "Lkotlin/jvm/functions/Function1;", "getInitializer$lifecycle_viewmodel_release", "()Lkotlin/jvm/functions/Function1;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ViewModelInitializer {
    public final KClass a;
    public final Function1 b;

    public ViewModelInitializer(@NotNull Class class0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(class0, "clazz");
        Intrinsics.checkNotNullParameter(function10, "initializer");
        this(JvmClassMappingKt.getKotlinClass(class0), function10);
    }

    public ViewModelInitializer(@NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kClass0, "clazz");
        Intrinsics.checkNotNullParameter(function10, "initializer");
        super();
        this.a = kClass0;
        this.b = function10;
    }

    @NotNull
    public final KClass getClazz$lifecycle_viewmodel_release() {
        return this.a;
    }

    @NotNull
    public final Function1 getInitializer$lifecycle_viewmodel_release() {
        return this.b;
    }
}

