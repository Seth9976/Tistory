package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\u001A>\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u00062\u0010\b\n\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001AP\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u00062\u0010\b\n\u0010\n\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\b2\u0010\b\n\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001A<\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0010\b\n\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001AN\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0010\b\n\u0010\n\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\b2\u0010\b\n\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000E²\u0006\u0016\u0010\u000F\u001A\u00020\u0010\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008A\u0084\u0002²\u0006\u0016\u0010\u000F\u001A\u00020\u0010\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008A\u0084\u0002²\u0006\u0016\u0010\u000F\u001A\u00020\u0010\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008A\u0084\u0002²\u0006\u0016\u0010\u000F\u001A\u00020\u0010\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u008A\u0084\u0002"}, d2 = {"navGraphViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "navGraphId", "", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "navGraphRoute", "", "navigation-fragment_release", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class NavGraphViewModelLazyKt {
    public static final NavBackStackEntry access$navGraphViewModels$lambda-0(Lazy lazy0) {
        return (NavBackStackEntry)lazy0.getValue();
    }

    public static final NavBackStackEntry access$navGraphViewModels$lambda-1(Lazy lazy0) {
        return (NavBackStackEntry)lazy0.getValue();
    }

    public static final NavBackStackEntry access$navGraphViewModels$lambda-2(Lazy lazy0) {
        return (NavBackStackEntry)lazy0.getValue();
    }

    public static final NavBackStackEntry access$navGraphViewModels$lambda-3(Lazy lazy0) {
        return (NavBackStackEntry)lazy0.getValue();
    }

    @MainThread
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    public static final Lazy navGraphViewModels(Fragment fragment0, @IdRes int v, Function0 function00) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Lazy lazy0 = c.lazy(new Function0(fragment0, v) {
            public final Fragment w;
            public final int x;

            {
                this.w = fragment0;
                this.x = v;
                super(0);
            }

            @NotNull
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this.w).getBackStackEntry(this.x);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$10 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-0(this.w).getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.1 navGraphViewModelLazyKt$navGraphViewModels$10 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-0(this.w).getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(function00 == null) {
            function00 = new Function0(lazy0) {
                public final Lazy w;

                {
                    this.w = lazy0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-0(this.w).getDefaultViewModelProviderFactory();
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$10, navGraphViewModelLazyKt$navGraphViewModels$10, function00);
    }

    @MainThread
    public static final Lazy navGraphViewModels(Fragment fragment0, @IdRes int v, Function0 function00, Function0 function01) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Lazy lazy0 = c.lazy(new Function0(fragment0, v) {
            public final Fragment w;
            public final int x;

            {
                this.w = fragment0;
                this.x = v;
                super(0);
            }

            @NotNull
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this.w).getBackStackEntry(this.x);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$20 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-1(this.w).getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.3 navGraphViewModelLazyKt$navGraphViewModels$30 = new Function0(function00, lazy0) {
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
                    return creationExtras0 == null ? NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-1(this.x).getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-1(this.x).getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(function01 == null) {
            function01 = new Function0(lazy0) {
                public final Lazy w;

                {
                    this.w = lazy0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-1(this.w).getDefaultViewModelProviderFactory();
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$20, navGraphViewModelLazyKt$navGraphViewModels$30, function01);
    }

    @MainThread
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    public static final Lazy navGraphViewModels(Fragment fragment0, String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(s, "navGraphRoute");
        Lazy lazy0 = c.lazy(new Function0(fragment0, s) {
            public final Fragment w;
            public final String x;

            {
                this.w = fragment0;
                this.x = s;
                super(0);
            }

            @NotNull
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this.w).getBackStackEntry(this.x);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$30 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-2(this.w).getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.5 navGraphViewModelLazyKt$navGraphViewModels$50 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-2(this.w).getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(function00 == null) {
            function00 = new Function0(lazy0) {
                public final Lazy w;

                {
                    this.w = lazy0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-2(this.w).getDefaultViewModelProviderFactory();
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$30, navGraphViewModelLazyKt$navGraphViewModels$50, function00);
    }

    @MainThread
    public static final Lazy navGraphViewModels(Fragment fragment0, String s, Function0 function00, Function0 function01) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(s, "navGraphRoute");
        Lazy lazy0 = c.lazy(new Function0(fragment0, s) {
            public final Fragment w;
            public final String x;

            {
                this.w = fragment0;
                this.x = s;
                super(0);
            }

            @NotNull
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this.w).getBackStackEntry(this.x);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$40 = new Function0(lazy0) {
            public final Lazy w;

            {
                this.w = lazy0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-3(this.w).getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.7 navGraphViewModelLazyKt$navGraphViewModels$70 = new Function0(function00, lazy0) {
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
                    return creationExtras0 == null ? NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-3(this.x).getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-3(this.x).getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(function01 == null) {
            function01 = new Function0(lazy0) {
                public final Lazy w;

                {
                    this.w = lazy0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    return NavGraphViewModelLazyKt.access$navGraphViewModels$lambda-3(this.w).getDefaultViewModelProviderFactory();
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$40, navGraphViewModelLazyKt$navGraphViewModels$70, function01);
    }

    public static Lazy navGraphViewModels$default(Fragment fragment0, int v, Function0 function00, int v1, Object object0) {
        if((v1 & 2) != 0) {
            function00 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Lazy lazy0 = c.lazy(new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.backStackEntry.2(fragment0, v));
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$10 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.1(lazy0);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.1 navGraphViewModelLazyKt$navGraphViewModels$10 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.1(lazy0);
        if(function00 == null) {
            function00 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.2(lazy0);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$10, navGraphViewModelLazyKt$navGraphViewModels$10, function00);
    }

    public static Lazy navGraphViewModels$default(Fragment fragment0, int v, Function0 function00, Function0 function01, int v1, Object object0) {
        if((v1 & 2) != 0) {
            function00 = null;
        }
        if((v1 & 4) != 0) {
            function01 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Lazy lazy0 = c.lazy(new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.backStackEntry.4(fragment0, v));
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$20 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.2(lazy0);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.3 navGraphViewModelLazyKt$navGraphViewModels$30 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.3(function00, lazy0);
        if(function01 == null) {
            function01 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.4(lazy0);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$20, navGraphViewModelLazyKt$navGraphViewModels$30, function01);
    }

    public static Lazy navGraphViewModels$default(Fragment fragment0, String s, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            function00 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(s, "navGraphRoute");
        Lazy lazy0 = c.lazy(new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.backStackEntry.6(fragment0, s));
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$30 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.3(lazy0);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.5 navGraphViewModelLazyKt$navGraphViewModels$50 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.5(lazy0);
        if(function00 == null) {
            function00 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.6(lazy0);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$30, navGraphViewModelLazyKt$navGraphViewModels$50, function00);
    }

    public static Lazy navGraphViewModels$default(Fragment fragment0, String s, Function0 function00, Function0 function01, int v, Object object0) {
        if((v & 2) != 0) {
            function00 = null;
        }
        if((v & 4) != 0) {
            function01 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        Intrinsics.checkNotNullParameter(s, "navGraphRoute");
        Lazy lazy0 = c.lazy(new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.backStackEntry.8(fragment0, s));
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$40 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.storeProducer.4(lazy0);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.7 navGraphViewModelLazyKt$navGraphViewModels$70 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.7(function00, lazy0);
        if(function01 == null) {
            function01 = new androidx.navigation.NavGraphViewModelLazyKt.navGraphViewModels.8(lazy0);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$40, navGraphViewModelLazyKt$navGraphViewModels$70, function01);
    }
}

