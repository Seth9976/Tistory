package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A4\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b\u00F8\u0001\u0000\u001AF\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b\u00F8\u0001\u0000\u001AJ\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00062\u0010\b\u0002\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001AZ\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\t0\u00062\u0010\b\u0002\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001AD\u0010\u000F\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000E\b\n\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00110\u00062\u0010\b\n\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b\u00F8\u0001\u0000\u001AV\u0010\u000F\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000E\b\n\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00110\u00062\u0010\b\n\u0010\b\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\b\u00F8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006\u0012\u00B2\u0006\u0016\u0010\u0013\u001A\u00020\u0011\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008A\u0084\u0002\u00B2\u0006\u0016\u0010\u0013\u001A\u00020\u0011\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008A\u0084\u0002"}, d2 = {"activityViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "createViewModelLazy", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "viewModels", "ownerProducer", "Landroidx/lifecycle/ViewModelStoreOwner;", "fragment-ktx_release", "owner"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FragmentViewModelLazyKt {
    public static final ViewModelStoreOwner access$viewModels$lambda-0(Lazy lazy0) {
        return (ViewModelStoreOwner)lazy0.getValue();
    }

    public static final ViewModelStoreOwner access$viewModels$lambda-1(Lazy lazy0) {
        return (ViewModelStoreOwner)lazy0.getValue();
    }

    @MainThread
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    public static final Lazy activityViewModels(Fragment fragment0, Function0 function00) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.1 fragmentViewModelLazyKt$activityViewModels$10 = new Function0(fragment0) {
            public final Fragment w;

            {
                this.w = fragment0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore0 = this.w.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore0, "requireActivity().viewModelStore");
                return viewModelStore0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.2 fragmentViewModelLazyKt$activityViewModels$20 = new Function0(fragment0) {
            public final Fragment w;

            {
                this.w = fragment0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras0 = this.w.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                return creationExtras0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(function00 == null) {
            function00 = new Function0(fragment0) {
                public final Fragment w;

                {
                    this.w = fragment0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    Factory viewModelProvider$Factory0 = this.w.requireActivity().getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "requireActivity().defaultViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, fragmentViewModelLazyKt$activityViewModels$10, fragmentViewModelLazyKt$activityViewModels$20, function00);
    }

    @MainThread
    public static final Lazy activityViewModels(Fragment fragment0, Function0 function00, Function0 function01) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.4 fragmentViewModelLazyKt$activityViewModels$40 = new Function0(fragment0) {
            public final Fragment w;

            {
                this.w = fragment0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore0 = this.w.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore0, "requireActivity().viewModelStore");
                return viewModelStore0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.5 fragmentViewModelLazyKt$activityViewModels$50 = new Function0(function00, fragment0) {
            public final Function0 w;
            public final Fragment x;

            {
                this.w = function00;
                this.x = fragment0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras0;
                Function0 function00 = this.w;
                if(function00 == null) {
                    creationExtras0 = this.x.requireActivity().getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                }
                else {
                    creationExtras0 = (CreationExtras)function00.invoke();
                    if(creationExtras0 == null) {
                        creationExtras0 = this.x.requireActivity().getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullExpressionValue(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                        return creationExtras0;
                    }
                }
                return creationExtras0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(function01 == null) {
            function01 = new Function0(fragment0) {
                public final Fragment w;

                {
                    this.w = fragment0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    Factory viewModelProvider$Factory0 = this.w.requireActivity().getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "requireActivity().defaultViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, fragmentViewModelLazyKt$activityViewModels$40, fragmentViewModelLazyKt$activityViewModels$50, function01);
    }

    public static Lazy activityViewModels$default(Fragment fragment0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.1 fragmentViewModelLazyKt$activityViewModels$10 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.1(fragment0);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.2 fragmentViewModelLazyKt$activityViewModels$20 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.2(fragment0);
        if(function00 == null) {
            function00 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.3(fragment0);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, fragmentViewModelLazyKt$activityViewModels$10, fragmentViewModelLazyKt$activityViewModels$20, function00);
    }

    public static Lazy activityViewModels$default(Fragment fragment0, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = null;
        }
        if((v & 2) != 0) {
            function01 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.4 fragmentViewModelLazyKt$activityViewModels$40 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.4(fragment0);
        androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.5 fragmentViewModelLazyKt$activityViewModels$50 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.5(function00, fragment0);
        if(function01 == null) {
            function01 = new androidx.fragment.app.FragmentViewModelLazyKt.activityViewModels.6(fragment0);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, fragmentViewModelLazyKt$activityViewModels$40, fragmentViewModelLazyKt$activityViewModels$50, function01);
    }

    @MainThread
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    public static final Lazy createViewModelLazy(Fragment fragment0, KClass kClass0, Function0 function00, Function0 function01) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "viewModelClass");
        Intrinsics.checkNotNullParameter(function00, "storeProducer");
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, function00, new x1(fragment0, 0), function01);
    }

    @MainThread
    @NotNull
    public static final Lazy createViewModelLazy(@NotNull Fragment fragment0, @NotNull KClass kClass0, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Function0 function02) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "viewModelClass");
        Intrinsics.checkNotNullParameter(function00, "storeProducer");
        Intrinsics.checkNotNullParameter(function01, "extrasProducer");
        if(function02 == null) {
            function02 = new y1(fragment0);
        }
        return new ViewModelLazy(kClass0, function00, function02, function01);
    }

    public static Lazy createViewModelLazy$default(Fragment fragment0, KClass kClass0, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 4) != 0) {
            function01 = null;
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, function00, function01);
    }

    public static Lazy createViewModelLazy$default(Fragment fragment0, KClass kClass0, Function0 function00, Function0 function01, Function0 function02, int v, Object object0) {
        if((v & 4) != 0) {
            function01 = new x1(fragment0, 1);
        }
        if((v & 8) != 0) {
            function02 = null;
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, function00, function01, function02);
    }

    @MainThread
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    public static final Lazy viewModels(Fragment fragment0, Function0 function00, Function0 function01) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "ownerProducer");
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.2 fragmentViewModelLazyKt$viewModels$owner$20 = new Function0(function00) {
            public final Function0 w;

            {
                this.w = function00;
                super(0);
            }

            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner)this.w.invoke();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, fragmentViewModelLazyKt$viewModels$owner$20);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.2 fragmentViewModelLazyKt$viewModels$20 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.access$viewModels$lambda-0(this.w).getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.3 fragmentViewModelLazyKt$viewModels$30 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.access$viewModels$lambda-0(this.w);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                if(hasDefaultViewModelProviderFactory0 != null) {
                    CreationExtras creationExtras0 = hasDefaultViewModelProviderFactory0.getDefaultViewModelCreationExtras();
                    if(creationExtras0 != null) {
                        return creationExtras0;
                    }
                }
                return Empty.INSTANCE;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(function01 == null) {
            function01 = new Function0(fragment0, lazy0) {
                public final Fragment w;
                public final Lazy x;

                {
                    this.w = fragment0;
                    this.x = lazy0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    Factory viewModelProvider$Factory0;
                    ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.access$viewModels$lambda-0(this.x);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                    if(hasDefaultViewModelProviderFactory0 == null) {
                        viewModelProvider$Factory0 = this.w.getDefaultViewModelProviderFactory();
                        Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "defaultViewModelProviderFactory");
                    }
                    else {
                        viewModelProvider$Factory0 = hasDefaultViewModelProviderFactory0.getDefaultViewModelProviderFactory();
                        if(viewModelProvider$Factory0 == null) {
                            viewModelProvider$Factory0 = this.w.getDefaultViewModelProviderFactory();
                            Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "defaultViewModelProviderFactory");
                            return viewModelProvider$Factory0;
                        }
                    }
                    return viewModelProvider$Factory0;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, fragmentViewModelLazyKt$viewModels$20, fragmentViewModelLazyKt$viewModels$30, function01);
    }

    @MainThread
    public static final Lazy viewModels(Fragment fragment0, Function0 function00, Function0 function01, Function0 function02) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "ownerProducer");
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.4 fragmentViewModelLazyKt$viewModels$owner$40 = new Function0(function00) {
            public final Function0 w;

            {
                this.w = function00;
                super(0);
            }

            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner)this.w.invoke();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, fragmentViewModelLazyKt$viewModels$owner$40);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.6 fragmentViewModelLazyKt$viewModels$60 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.access$viewModels$lambda-1(this.w).getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.7 fragmentViewModelLazyKt$viewModels$70 = new Function0(function01, lazy0) {
            public final Function0 w;
            public final Lazy x;

            {
                this.w = function00;
                this.x = lazy0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.w;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    if(creationExtras0 != null) {
                        return creationExtras0;
                    }
                }
                ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.x);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                return hasDefaultViewModelProviderFactory0 != null ? hasDefaultViewModelProviderFactory0.getDefaultViewModelCreationExtras() : Empty.INSTANCE;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(function02 == null) {
            function02 = new Function0(fragment0, lazy0) {
                public final Fragment w;
                public final Lazy x;

                {
                    this.w = fragment0;
                    this.x = lazy0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    Factory viewModelProvider$Factory0;
                    ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.x);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                    if(hasDefaultViewModelProviderFactory0 == null) {
                        viewModelProvider$Factory0 = this.w.getDefaultViewModelProviderFactory();
                        Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "defaultViewModelProviderFactory");
                    }
                    else {
                        viewModelProvider$Factory0 = hasDefaultViewModelProviderFactory0.getDefaultViewModelProviderFactory();
                        if(viewModelProvider$Factory0 == null) {
                            viewModelProvider$Factory0 = this.w.getDefaultViewModelProviderFactory();
                            Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "defaultViewModelProviderFactory");
                            return viewModelProvider$Factory0;
                        }
                    }
                    return viewModelProvider$Factory0;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, fragmentViewModelLazyKt$viewModels$60, fragmentViewModelLazyKt$viewModels$70, function02);
    }

    public static Lazy viewModels$default(Fragment fragment0, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = new Function0(fragment0) {
                public final Fragment w;

                {
                    this.w = fragment0;
                    super(0);
                }

                @NotNull
                public final Fragment invoke() {
                    return this.w;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        if((v & 2) != 0) {
            function01 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "ownerProducer");
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.2 fragmentViewModelLazyKt$viewModels$owner$20 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.2(function00);
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, fragmentViewModelLazyKt$viewModels$owner$20);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.2 fragmentViewModelLazyKt$viewModels$20 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.2(lazy0);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.3 fragmentViewModelLazyKt$viewModels$30 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.3(lazy0);
        if(function01 == null) {
            function01 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.4(fragment0, lazy0);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, fragmentViewModelLazyKt$viewModels$20, fragmentViewModelLazyKt$viewModels$30, function01);
    }

    public static Lazy viewModels$default(Fragment fragment0, Function0 function00, Function0 function01, Function0 function02, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = new Function0(fragment0) {
                public final Fragment w;

                {
                    this.w = fragment0;
                    super(0);
                }

                @NotNull
                public final Fragment invoke() {
                    return this.w;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        if((v & 2) != 0) {
            function01 = null;
        }
        if((v & 4) != 0) {
            function02 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "ownerProducer");
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.4 fragmentViewModelLazyKt$viewModels$owner$40 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.owner.4(function00);
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, fragmentViewModelLazyKt$viewModels$owner$40);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.6 fragmentViewModelLazyKt$viewModels$60 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.6(lazy0);
        androidx.fragment.app.FragmentViewModelLazyKt.viewModels.7 fragmentViewModelLazyKt$viewModels$70 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.7(function01, lazy0);
        if(function02 == null) {
            function02 = new androidx.fragment.app.FragmentViewModelLazyKt.viewModels.8(fragment0, lazy0);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, fragmentViewModelLazyKt$viewModels$60, fragmentViewModelLazyKt$viewModels$70, function02);
    }
}

