package com.kakao.android.base.viewmodel;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.kakao.android.base.tiara.TiaraListener;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001A*\u0010\u0000\u001A\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005H\u0087\b¢\u0006\u0002\u0010\u0006\u001A+\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00010\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\t2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005H\u0087\b\u001A+\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00010\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u000B2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005H\u0087\b\u001A+\u0010\n\u001A\b\u0012\u0004\u0012\u0002H\u00010\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\t2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005H\u0087\b\u001A\u0014\u0010\f\u001A\u00020\r*\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u0003H\u0007¨\u0006\u000F"}, d2 = {"createViewModel", "VM", "Lcom/kakao/android/base/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)Lcom/kakao/android/base/viewmodel/BaseViewModel;", "getActivityViewModels", "Lkotlin/Lazy;", "Landroidx/fragment/app/Fragment;", "getViewModels", "Landroidx/activity/ComponentActivity;", "setTiara", "", "viewModelStoreOwner", "base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewModelExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelExtension.kt\ncom/kakao/android/base/viewmodel/ViewModelExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,42:1\n1#2:43\n43#3,5:44\n58#4:49\n79#4,2:50\n*S KotlinDebug\n*F\n+ 1 ViewModelExtension.kt\ncom/kakao/android/base/viewmodel/ViewModelExtensionKt\n*L\n25#1:44,5\n29#1:49\n33#1:50,2\n*E\n"})
public final class ViewModelExtensionKt {
    @Deprecated(message = "use viewModels (viewmodel tiara 를 사용하면 안됨)")
    public static final BaseViewModel createViewModel(ViewModelStoreOwner viewModelStoreOwner0, Factory viewModelProvider$Factory0) {
        BaseViewModel baseViewModel0;
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "<this>");
        Class class0 = BaseViewModel.class;
        if(viewModelProvider$Factory0 == null) {
        label_7:
            ViewModelProvider viewModelProvider1 = new ViewModelProvider(viewModelStoreOwner0);
            Intrinsics.reifiedOperationMarker(4, "VM");
            baseViewModel0 = (BaseViewModel)viewModelProvider1.get(class0);
        }
        else {
            ViewModelProvider viewModelProvider0 = new ViewModelProvider(viewModelStoreOwner0, viewModelProvider$Factory0);
            Intrinsics.reifiedOperationMarker(4, "VM");
            baseViewModel0 = (BaseViewModel)viewModelProvider0.get(class0);
            if(baseViewModel0 == null) {
                goto label_7;
            }
        }
        ViewModelExtensionKt.setTiara(baseViewModel0, viewModelStoreOwner0);
        return baseViewModel0;
    }

    public static BaseViewModel createViewModel$default(ViewModelStoreOwner viewModelStoreOwner0, Factory viewModelProvider$Factory0, int v, Object object0) {
        BaseViewModel baseViewModel0;
        if((v & 1) != 0) {
            viewModelProvider$Factory0 = null;
        }
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "<this>");
        Class class0 = BaseViewModel.class;
        if(viewModelProvider$Factory0 == null) {
        label_9:
            ViewModelProvider viewModelProvider1 = new ViewModelProvider(viewModelStoreOwner0);
            Intrinsics.reifiedOperationMarker(4, "VM");
            baseViewModel0 = (BaseViewModel)viewModelProvider1.get(class0);
        }
        else {
            ViewModelProvider viewModelProvider0 = new ViewModelProvider(viewModelStoreOwner0, viewModelProvider$Factory0);
            Intrinsics.reifiedOperationMarker(4, "VM");
            baseViewModel0 = (BaseViewModel)viewModelProvider0.get(class0);
            if(baseViewModel0 == null) {
                goto label_9;
            }
        }
        ViewModelExtensionKt.setTiara(baseViewModel0, viewModelStoreOwner0);
        return baseViewModel0;
    }

    @Deprecated(message = "use activityViewModels, don\'t use viewmodel tiara information")
    public static final Lazy getActivityViewModels(Fragment fragment0, Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getActivityViewModels.1.1 viewModelExtensionKt$getActivityViewModels$1$10 = viewModelProvider$Factory0 == null ? null : new Function0(viewModelProvider$Factory0) {
            public final Factory w;

            {
                this.w = viewModelProvider$Factory0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.w;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.1 viewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$10 = new Function0(fragment0) {
            public final Fragment w;

            {
                this.w = fragment0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                FragmentActivity fragmentActivity0 = this.w.requireActivity();
                Intrinsics.checkExpressionValueIsNotNull(fragmentActivity0, "requireActivity()");
                ViewModelStore viewModelStore0 = fragmentActivity0.getViewModelStore();
                Intrinsics.checkExpressionValueIsNotNull(viewModelStore0, "requireActivity().viewModelStore");
                return viewModelStore0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(viewModelExtensionKt$getActivityViewModels$1$10 == null) {
            viewModelExtensionKt$getActivityViewModels$1$10 = new Function0(fragment0) {
                public final Fragment w;

                {
                    this.w = fragment0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    FragmentActivity fragmentActivity0 = this.w.requireActivity();
                    Intrinsics.checkExpressionValueIsNotNull(fragmentActivity0, "requireActivity()");
                    Factory viewModelProvider$Factory0 = fragmentActivity0.getDefaultViewModelProviderFactory();
                    Intrinsics.checkExpressionValueIsNotNull(viewModelProvider$Factory0, "requireActivity().defaultViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        return new BaseViewModelLazy(fragment0, FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, viewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$10, viewModelExtensionKt$getActivityViewModels$1$10));
    }

    public static Lazy getActivityViewModels$default(Fragment fragment0, Factory viewModelProvider$Factory0, int v, Object object0) {
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getActivityViewModels.1.1 viewModelExtensionKt$getActivityViewModels$1$10 = null;
        if((v & 1) != 0) {
            viewModelProvider$Factory0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        if(viewModelProvider$Factory0 != null) {
            viewModelExtensionKt$getActivityViewModels$1$10 = new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getActivityViewModels.1.1(viewModelProvider$Factory0);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.1 viewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$10 = new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.1(fragment0);
        if(viewModelExtensionKt$getActivityViewModels$1$10 == null) {
            viewModelExtensionKt$getActivityViewModels$1$10 = new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.2(fragment0);
        }
        return new BaseViewModelLazy(fragment0, FragmentViewModelLazyKt.createViewModelLazy(fragment0, kClass0, viewModelExtensionKt$getActivityViewModels$$inlined$activityViewModels$10, viewModelExtensionKt$getActivityViewModels$1$10));
    }

    @Deprecated(message = "use viewModels, don\'t use viewmodel tiara information")
    public static final Lazy getViewModels(ComponentActivity componentActivity0, Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(componentActivity0, "<this>");
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.1.1 viewModelExtensionKt$getViewModels$1$10 = viewModelProvider$Factory0 == null ? null : new Function0(viewModelProvider$Factory0) {
            public final Factory w;

            {
                this.w = viewModelProvider$Factory0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.w;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        if(viewModelExtensionKt$getViewModels$1$10 == null) {
            viewModelExtensionKt$getViewModels$1$10 = new Function0(componentActivity0) {
                public final ComponentActivity w;

                {
                    this.w = componentActivity0;
                    super(0);
                }

                @NotNull
                public final Factory invoke() {
                    Factory viewModelProvider$Factory0 = this.w.getDefaultViewModelProviderFactory();
                    Intrinsics.checkExpressionValueIsNotNull(viewModelProvider$Factory0, "defaultViewModelProviderFactory");
                    return viewModelProvider$Factory0;
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new BaseViewModelLazy(componentActivity0, new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new Function0(componentActivity0) {
            public final ComponentActivity w;

            {
                this.w = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore0 = this.w.getViewModelStore();
                Intrinsics.checkExpressionValueIsNotNull(viewModelStore0, "viewModelStore");
                return viewModelStore0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, viewModelExtensionKt$getViewModels$1$10));
    }

    @Deprecated(message = "use viewModels, don\'t use viewmodel tiara information")
    public static final Lazy getViewModels(Fragment fragment0, Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.2 viewModelExtensionKt$getViewModels$20 = new Function0(fragment0) {
            public final Fragment w;

            {
                this.w = fragment0;
                super(0);
            }

            @NotNull
            public final ViewModelStoreOwner invoke() {
                return this.w;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.3.1 viewModelExtensionKt$getViewModels$3$10 = viewModelProvider$Factory0 == null ? null : new Function0(viewModelProvider$Factory0) {
            public final Factory w;

            {
                this.w = viewModelProvider$Factory0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.w;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new BaseViewModelLazy(fragment0, FragmentViewModelLazyKt.createViewModelLazy(fragment0, Reflection.getOrCreateKotlinClass(ViewModel.class), new Function0(viewModelExtensionKt$getViewModels$20) {
            public final Function0 w;

            {
                this.w = function00;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore0 = ((ViewModelStoreOwner)this.w.invoke()).getViewModelStore();
                Intrinsics.checkExpressionValueIsNotNull(viewModelStore0, "ownerProducer().viewModelStore");
                return viewModelStore0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, viewModelExtensionKt$getViewModels$3$10));
    }

    public static Lazy getViewModels$default(ComponentActivity componentActivity0, Factory viewModelProvider$Factory0, int v, Object object0) {
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.1.1 viewModelExtensionKt$getViewModels$1$10 = null;
        if((v & 1) != 0) {
            viewModelProvider$Factory0 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity0, "<this>");
        if(viewModelProvider$Factory0 != null) {
            viewModelExtensionKt$getViewModels$1$10 = new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.1.1(viewModelProvider$Factory0);
        }
        if(viewModelExtensionKt$getViewModels$1$10 == null) {
            viewModelExtensionKt$getViewModels$1$10 = new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels..inlined.viewModels.1(componentActivity0);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new BaseViewModelLazy(componentActivity0, new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels..inlined.viewModels.2(componentActivity0), viewModelExtensionKt$getViewModels$1$10));
    }

    public static Lazy getViewModels$default(Fragment fragment0, Factory viewModelProvider$Factory0, int v, Object object0) {
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.3.1 viewModelExtensionKt$getViewModels$3$10 = null;
        if((v & 1) != 0) {
            viewModelProvider$Factory0 = null;
        }
        Intrinsics.checkNotNullParameter(fragment0, "<this>");
        com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.2 viewModelExtensionKt$getViewModels$20 = new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.2(fragment0);
        if(viewModelProvider$Factory0 != null) {
            viewModelExtensionKt$getViewModels$3$10 = new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels.3.1(viewModelProvider$Factory0);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new BaseViewModelLazy(fragment0, FragmentViewModelLazyKt.createViewModelLazy(fragment0, Reflection.getOrCreateKotlinClass(ViewModel.class), new com.kakao.android.base.viewmodel.ViewModelExtensionKt.getViewModels..inlined.viewModels.3(viewModelExtensionKt$getViewModels$20), viewModelExtensionKt$getViewModels$3$10));
    }

    @Deprecated(message = "don\'t use")
    public static final void setTiara(@NotNull BaseViewModel baseViewModel0, @NotNull ViewModelStoreOwner viewModelStoreOwner0) {
        Intrinsics.checkNotNullParameter(baseViewModel0, "<this>");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "viewModelStoreOwner");
        if(viewModelStoreOwner0 instanceof TiaraListener) {
            baseViewModel0.setSection(((TiaraListener)viewModelStoreOwner0).getSection());
            baseViewModel0.setPage(((TiaraListener)viewModelStoreOwner0).getPage());
        }
    }
}

