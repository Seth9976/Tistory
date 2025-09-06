package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0006¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/Lazy;", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "getValue", "()Landroidx/lifecycle/ViewModel;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelLazy.kt\nandroidx/lifecycle/ViewModelLazy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class ViewModelLazy implements Lazy {
    public final KClass a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public ViewModel e;

    @JvmOverloads
    public ViewModelLazy(@NotNull KClass kClass0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(kClass0, "viewModelClass");
        Intrinsics.checkNotNullParameter(function00, "storeProducer");
        Intrinsics.checkNotNullParameter(function01, "factoryProducer");
        this(kClass0, function00, function01, null, 8, null);
    }

    @JvmOverloads
    public ViewModelLazy(@NotNull KClass kClass0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02) {
        Intrinsics.checkNotNullParameter(kClass0, "viewModelClass");
        Intrinsics.checkNotNullParameter(function00, "storeProducer");
        Intrinsics.checkNotNullParameter(function01, "factoryProducer");
        Intrinsics.checkNotNullParameter(function02, "extrasProducer");
        super();
        this.a = kClass0;
        this.b = function00;
        this.c = function01;
        this.d = function02;
    }

    public ViewModelLazy(KClass kClass0, Function0 function00, Function0 function01, Function0 function02, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            function02 = q0.w;
        }
        this(kClass0, function00, function01, function02);
    }

    @NotNull
    public ViewModel getValue() {
        ViewModel viewModel0 = this.e;
        if(viewModel0 == null) {
            ViewModelStore viewModelStore0 = (ViewModelStore)this.b.invoke();
            Factory viewModelProvider$Factory0 = (Factory)this.c.invoke();
            CreationExtras creationExtras0 = (CreationExtras)this.d.invoke();
            viewModel0 = ViewModelProvider.Companion.create(viewModelStore0, viewModelProvider$Factory0, creationExtras0).get(this.a);
            this.e = viewModel0;
        }
        return viewModel0;
    }

    @Override  // kotlin.Lazy
    public Object getValue() {
        return this.getValue();
    }

    @Override  // kotlin.Lazy
    public boolean isInitialized() {
        return this.e != null;
    }
}

