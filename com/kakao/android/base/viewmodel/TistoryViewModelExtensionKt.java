package com.kakao.android.base.viewmodel;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import md.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A+\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0086\b\u001A+\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\b2\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0086\b\u001A+\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0086\b¨\u0006\t"}, d2 = {"getActivityViewModels", "Lkotlin/Lazy;", "VM", "Lcom/kakao/android/base/viewmodel/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModels", "Landroidx/activity/ComponentActivity;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryViewModelExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,26:1\n1#2:27\n75#3,13:28\n106#4,15:41\n172#4,9:56\n*S KotlinDebug\n*F\n+ 1 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n*L\n11#1:28,13\n17#1:41,15\n24#1:56,9\n*E\n"})
public final class TistoryViewModelExtensionKt {
    public static final Lazy getActivityViewModels(Fragment fragment0, Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels.1.1 tistoryViewModelExtensionKt$getActivityViewModels$1$10 = viewModelProvider$Factory0 == null ? null : new Function0(viewModelProvider$Factory0) {
            public final Factory a;

            {
                this.a = viewModelProvider$Factory0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.a;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1 tistoryViewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$default$10 = new Function0(fragment0) {
            public final Fragment a;

            {
                this.a = fragment0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore0 = this.a.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore0, "requireActivity().viewModelStore");
                return viewModelStore0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2 tistoryViewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$default$20 = new Function0(null, fragment0) {
            public final Function0 a;
            public final Fragment b;

            {
                this.a = function00;
                this.b = fragment0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras0;
                Function0 function00 = this.a;
                if(function00 == null) {
                    creationExtras0 = this.b.requireActivity().getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                }
                else {
                    creationExtras0 = (CreationExtras)function00.invoke();
                    if(creationExtras0 == null) {
                        creationExtras0 = this.b.requireActivity().getDefaultViewModelCreationExtras();
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
        if(tistoryViewModelExtensionKt$getActivityViewModels$1$10 == null) {
            tistoryViewModelExtensionKt$getActivityViewModels$1$10 = new Function0(fragment0) {
                public final Fragment a;

                {
                    this.a = fragment0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    Factory viewModelProvider$Factory0 = this.a.requireActivity().getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "requireActivity().defaultViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return new BaseViewModelLazy(fragment0, FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, tistoryViewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$default$10, tistoryViewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$default$20, tistoryViewModelExtensionKt$getActivityViewModels$1$10));
    }

    public static Lazy getActivityViewModels$default(Fragment fragment0, Factory viewModelProvider$Factory0, int v, Object object0) {
        if((v & 1) != 0) {
            viewModelProvider$Factory0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels.1.1 tistoryViewModelExtensionKt$getActivityViewModels$1$10 = viewModelProvider$Factory0 == null ? null : new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels.1.1(viewModelProvider$Factory0);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1 tistoryViewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(fragment0);
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2 tistoryViewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$default$20 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, fragment0);
        if(tistoryViewModelExtensionKt$getActivityViewModels$1$10 == null) {
            tistoryViewModelExtensionKt$getActivityViewModels$1$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(fragment0);
        }
        return new BaseViewModelLazy(fragment0, FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, tistoryViewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$default$10, tistoryViewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$default$20, tistoryViewModelExtensionKt$getActivityViewModels$1$10));
    }

    public static final Lazy getViewModels(ComponentActivity componentActivity0, Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(componentActivity0, "<this>");
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.1.1 tistoryViewModelExtensionKt$getViewModels$1$10 = viewModelProvider$Factory0 == null ? null : new Function0(viewModelProvider$Factory0) {
            public final Factory a;

            {
                this.a = viewModelProvider$Factory0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.a;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(tistoryViewModelExtensionKt$getViewModels$1$10 == null) {
            tistoryViewModelExtensionKt$getViewModels$1$10 = new Function0(componentActivity0) {
                public final ComponentActivity a;

                {
                    this.a = componentActivity0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    return this.a.getDefaultViewModelProviderFactory();
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new BaseViewModelLazy(componentActivity0, new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new Function0(componentActivity0) {
            public final ComponentActivity a;

            {
                this.a = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return this.a.getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, tistoryViewModelExtensionKt$getViewModels$1$10, new Function0(null, componentActivity0) {
            public final Function0 a;
            public final ComponentActivity b;

            {
                this.a = function00;
                this.b = componentActivity0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.a;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    return creationExtras0 == null ? this.b.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.b.getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }));
    }

    public static final Lazy getViewModels(Fragment fragment0, Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2 tistoryViewModelExtensionKt$getViewModels$20 = new Function0(fragment0) {
            public final Fragment a;

            {
                this.a = fragment0;
                super(0);
            }

            @NotNull
            public final ViewModelStoreOwner invoke() {
                return this.a;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.3.1 tistoryViewModelExtensionKt$getViewModels$3$10 = viewModelProvider$Factory0 == null ? null : new Function0(viewModelProvider$Factory0) {
            public final Factory a;

            {
                this.a = viewModelProvider$Factory0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.a;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new Function0(tistoryViewModelExtensionKt$getViewModels$20) {
            public final Function0 a;

            {
                this.a = function00;
                super(0);
            }

            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner)this.a.invoke();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$50 = new Function0(lazy0) {
            public final Lazy a;

            {
                this.a = lazy0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.access$viewModels$lambda-1(this.a).getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$60 = new Function0(null, lazy0) {
            public final Function0 a;
            public final Lazy b;

            {
                this.a = function00;
                this.b = lazy0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.a;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    if(creationExtras0 != null) {
                        return creationExtras0;
                    }
                }
                ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.b);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                return hasDefaultViewModelProviderFactory0 != null ? hasDefaultViewModelProviderFactory0.getDefaultViewModelCreationExtras() : Empty.INSTANCE;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(tistoryViewModelExtensionKt$getViewModels$3$10 == null) {
            tistoryViewModelExtensionKt$getViewModels$3$10 = new Function0(fragment0, lazy0) {
                public final Fragment a;
                public final Lazy b;

                {
                    this.a = fragment0;
                    this.b = lazy0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    Factory viewModelProvider$Factory0;
                    ViewModelStoreOwner viewModelStoreOwner0 = FragmentViewModelLazyKt.access$viewModels$lambda-1(this.b);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0) : null;
                    if(hasDefaultViewModelProviderFactory0 == null) {
                        viewModelProvider$Factory0 = this.a.getDefaultViewModelProviderFactory();
                        Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "defaultViewModelProviderFactory");
                    }
                    else {
                        viewModelProvider$Factory0 = hasDefaultViewModelProviderFactory0.getDefaultViewModelProviderFactory();
                        if(viewModelProvider$Factory0 == null) {
                            viewModelProvider$Factory0 = this.a.getDefaultViewModelProviderFactory();
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
        return new BaseViewModelLazy(fragment0, FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$50, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$60, tistoryViewModelExtensionKt$getViewModels$3$10));
    }

    public static Lazy getViewModels$default(ComponentActivity componentActivity0, Factory viewModelProvider$Factory0, int v, Object object0) {
        if((v & 1) != 0) {
            viewModelProvider$Factory0 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity0, "<this>");
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.1.1 tistoryViewModelExtensionKt$getViewModels$1$10 = viewModelProvider$Factory0 == null ? null : new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.1.1(viewModelProvider$Factory0);
        if(tistoryViewModelExtensionKt$getViewModels$1$10 == null) {
            tistoryViewModelExtensionKt$getViewModels$1$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(componentActivity0);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new BaseViewModelLazy(componentActivity0, new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(componentActivity0), tistoryViewModelExtensionKt$getViewModels$1$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, componentActivity0)));
    }

    public static Lazy getViewModels$default(Fragment fragment0, Factory viewModelProvider$Factory0, int v, Object object0) {
        if((v & 1) != 0) {
            viewModelProvider$Factory0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2 tistoryViewModelExtensionKt$getViewModels$20 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(fragment0);
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.3.1 tistoryViewModelExtensionKt$getViewModels$3$10 = viewModelProvider$Factory0 == null ? null : new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.3.1(viewModelProvider$Factory0);
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(tistoryViewModelExtensionKt$getViewModels$20);
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$50 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0);
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$60 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0);
        if(tistoryViewModelExtensionKt$getViewModels$3$10 == null) {
            tistoryViewModelExtensionKt$getViewModels$3$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(fragment0, lazy0);
        }
        return new BaseViewModelLazy(fragment0, FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$50, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$60, tistoryViewModelExtensionKt$getViewModels$3$10));
    }
}

