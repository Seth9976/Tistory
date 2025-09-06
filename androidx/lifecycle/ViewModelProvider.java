package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders.ViewModelKey;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\b\u0016\u0018\u0000 \u001A2\u00020\u0001:\u0005\u001B\u001A\u001C\u001D\u001EB#\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0012\u001A\u00028\u0000\"\b\b\u0000\u0010\u000F*\u00020\u000E2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0012\u001A\u00028\u0000\"\b\b\u0000\u0010\u000F*\u00020\u000E2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0097\u0002¢\u0006\u0004\b\u0012\u0010\u0015J0\u0010\u0012\u001A\u00028\u0000\"\b\b\u0000\u0010\u000F*\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u00162\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0018J0\u0010\u0012\u001A\u00028\u0000\"\b\b\u0000\u0010\u000F*\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u00162\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0097\u0002¢\u0006\u0004\b\u0012\u0010\u0019¨\u0006\u001F"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "Landroidx/lifecycle/ViewModelStore;", "store", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultCreationExtras", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "get", "(Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "", "key", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ViewModelProvider {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J/\u0010\r\u001A\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\'\u0010\r\u001A\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\r\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "<init>", "()V", "Landroid/app/Application;", "application", "(Landroid/app/Application;)V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001A\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "Landroid/app/Application;", "application", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "getInstance", "(Landroid/app/Application;)Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "_instance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            @NotNull
            public final AndroidViewModelFactory getInstance(@NotNull Application application0) {
                Intrinsics.checkNotNullParameter(application0, "application");
                if(AndroidViewModelFactory.c == null) {
                    AndroidViewModelFactory.c = new AndroidViewModelFactory(application0);
                }
                AndroidViewModelFactory viewModelProvider$AndroidViewModelFactory0 = AndroidViewModelFactory.c;
                Intrinsics.checkNotNull(viewModelProvider$AndroidViewModelFactory0);
                return viewModelProvider$AndroidViewModelFactory0;
            }
        }

        @JvmField
        @NotNull
        public static final Key APPLICATION_KEY;
        @NotNull
        public static final Companion Companion;
        public final Application b;
        public static AndroidViewModelFactory c;

        static {
            AndroidViewModelFactory.Companion = new Companion(null);
            AndroidViewModelFactory.APPLICATION_KEY = new ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        public AndroidViewModelFactory(@NotNull Application application0) {
            Intrinsics.checkNotNullParameter(application0, "application");
            this(application0, 0);
        }

        public AndroidViewModelFactory(Application application0, int v) {
            this.b = application0;
        }

        public final ViewModel a(Class class0, Application application0) {
            ViewModel viewModel0;
            if(AndroidViewModel.class.isAssignableFrom(class0)) {
                try {
                    viewModel0 = (ViewModel)class0.getConstructor(Application.class).newInstance(application0);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, noSuchMethodException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, illegalAccessException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, instantiationException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, invocationTargetException0);
                }
                Intrinsics.checkNotNullExpressionValue(viewModel0, "{\n                try {\n…          }\n            }");
                return viewModel0;
            }
            return super.create(class0);
        }

        @Override  // androidx.lifecycle.ViewModelProvider$NewInstanceFactory
        @NotNull
        public ViewModel create(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "modelClass");
            Application application0 = this.b;
            if(application0 == null) {
                throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return this.a(class0, application0);
        }

        @Override  // androidx.lifecycle.ViewModelProvider$NewInstanceFactory
        @NotNull
        public ViewModel create(@NotNull Class class0, @NotNull CreationExtras creationExtras0) {
            Intrinsics.checkNotNullParameter(class0, "modelClass");
            Intrinsics.checkNotNullParameter(creationExtras0, "extras");
            if(this.b != null) {
                return this.create(class0);
            }
            Application application0 = (Application)creationExtras0.get(AndroidViewModelFactory.APPLICATION_KEY);
            if(application0 != null) {
                return this.a(class0, application0);
            }
            if(AndroidViewModel.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.create(class0);
        }

        @JvmStatic
        @NotNull
        public static final AndroidViewModelFactory getInstance(@NotNull Application application0) {
            return AndroidViewModelFactory.Companion.getInstance(application0);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J+\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\t\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\rR\u001A\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Companion;", "", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "Landroidx/lifecycle/ViewModelProvider;", "create", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModelProvider;", "Landroidx/lifecycle/ViewModelStore;", "store", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModelProvider;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.lifecycle.ViewModelProvider.Companion {
        public androidx.lifecycle.ViewModelProvider.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final ViewModelProvider create(@NotNull ViewModelStore viewModelStore0, @NotNull Factory viewModelProvider$Factory0, @NotNull CreationExtras creationExtras0) {
            Intrinsics.checkNotNullParameter(viewModelStore0, "store");
            Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "factory");
            Intrinsics.checkNotNullParameter(creationExtras0, "extras");
            return new ViewModelProvider(viewModelStore0, viewModelProvider$Factory0, creationExtras0);
        }

        @JvmStatic
        @NotNull
        public final ViewModelProvider create(@NotNull ViewModelStoreOwner viewModelStoreOwner0, @NotNull Factory viewModelProvider$Factory0, @NotNull CreationExtras creationExtras0) {
            Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "owner");
            Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "factory");
            Intrinsics.checkNotNullParameter(creationExtras0, "extras");
            return new ViewModelProvider(viewModelStoreOwner0.getViewModelStore(), viewModelProvider$Factory0, creationExtras0);
        }

        public static ViewModelProvider create$default(androidx.lifecycle.ViewModelProvider.Companion viewModelProvider$Companion0, ViewModelStore viewModelStore0, Factory viewModelProvider$Factory0, CreationExtras creationExtras0, int v, Object object0) {
            if((v & 2) != 0) {
                viewModelProvider$Factory0 = DefaultViewModelProviderFactory.INSTANCE;
            }
            if((v & 4) != 0) {
                creationExtras0 = Empty.INSTANCE;
            }
            return viewModelProvider$Companion0.create(viewModelStore0, viewModelProvider$Factory0, creationExtras0);
        }

        public static ViewModelProvider create$default(androidx.lifecycle.ViewModelProvider.Companion viewModelProvider$Companion0, ViewModelStoreOwner viewModelStoreOwner0, Factory viewModelProvider$Factory0, CreationExtras creationExtras0, int v, Object object0) {
            if((v & 2) != 0) {
                viewModelProvider$Factory0 = ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner0);
            }
            if((v & 4) != 0) {
                creationExtras0 = ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(viewModelStoreOwner0);
            }
            return viewModelProvider$Companion0.create(viewModelStoreOwner0, viewModelProvider$Factory0, creationExtras0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ%\u0010\u0002\u001A\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007J-\u0010\u0002\u001A\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\b\u001A\u00020\tH\u0016¢\u0006\u0002\u0010\nJ-\u0010\u0002\u001A\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00030\u000B2\u0006\u0010\b\u001A\u00020\tH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Factory {
        @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J+\u0010\u0006\u001A\u00020\u00052\u001A\u0010\u0004\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Landroidx/lifecycle/ViewModelProvider$Factory;", "from", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.lifecycle.ViewModelProvider.Factory.Companion {
            public static final androidx.lifecycle.ViewModelProvider.Factory.Companion a;

            static {
                androidx.lifecycle.ViewModelProvider.Factory.Companion.a = new androidx.lifecycle.ViewModelProvider.Factory.Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            }

            @JvmStatic
            @NotNull
            public final Factory from(@NotNull ViewModelInitializer[] arr_viewModelInitializer) {
                Intrinsics.checkNotNullParameter(arr_viewModelInitializer, "initializers");
                ViewModelInitializer[] arr_viewModelInitializer1 = (ViewModelInitializer[])Arrays.copyOf(arr_viewModelInitializer, arr_viewModelInitializer.length);
                return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release(arr_viewModelInitializer1);
            }
        }

        @NotNull
        public static final androidx.lifecycle.ViewModelProvider.Factory.Companion Companion;

        static {
            Factory.Companion = androidx.lifecycle.ViewModelProvider.Factory.Companion.a;
        }

        @NotNull
        default ViewModel create(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "modelClass");
            return ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
        }

        @NotNull
        default ViewModel create(@NotNull Class class0, @NotNull CreationExtras creationExtras0) {
            Intrinsics.checkNotNullParameter(class0, "modelClass");
            Intrinsics.checkNotNullParameter(creationExtras0, "extras");
            return this.create(class0);
        }

        @NotNull
        default ViewModel create(@NotNull KClass kClass0, @NotNull CreationExtras creationExtras0) {
            Intrinsics.checkNotNullParameter(kClass0, "modelClass");
            Intrinsics.checkNotNullParameter(creationExtras0, "extras");
            return this.create(JvmClassMappingKt.getJavaClass(kClass0), creationExtras0);
        }

        @JvmStatic
        @NotNull
        static Factory from(@NotNull ViewModelInitializer[] arr_viewModelInitializer) {
            return Factory.Companion.from(arr_viewModelInitializer);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000E2\u00020\u0001:\u0001\u000EB\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001A\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\bJ-\u0010\u0003\u001A\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\t\u001A\u00020\nH\u0016¢\u0006\u0002\u0010\u000BJ-\u0010\u0003\u001A\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00040\f2\u0006\u0010\t\u001A\u00020\nH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class NewInstanceFactory implements Factory {
        @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0007\u001A\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0003\u0010\u0004R\u001A\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000BR\u0018\u0010\f\u001A\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getInstance", "()Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getInstance$annotations", "()V", "instance", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "_instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion {
            public androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @RestrictTo({Scope.LIBRARY_GROUP})
            @NotNull
            public final NewInstanceFactory getInstance() {
                if(NewInstanceFactory.a == null) {
                    NewInstanceFactory.a = new NewInstanceFactory();
                }
                NewInstanceFactory viewModelProvider$NewInstanceFactory0 = NewInstanceFactory.a;
                Intrinsics.checkNotNull(viewModelProvider$NewInstanceFactory0);
                return viewModelProvider$NewInstanceFactory0;
            }

            @JvmStatic
            public static void getInstance$annotations() {
            }
        }

        @NotNull
        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion Companion;
        @JvmField
        @NotNull
        public static final Key VIEW_MODEL_KEY;
        public static NewInstanceFactory a;

        static {
            NewInstanceFactory.Companion = new androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion(null);
            NewInstanceFactory.VIEW_MODEL_KEY = ViewModelKey.INSTANCE;
        }

        @Override  // androidx.lifecycle.ViewModelProvider$Factory
        @NotNull
        public ViewModel create(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "modelClass");
            return JvmViewModelProviders.INSTANCE.createViewModel(class0);
        }

        @Override  // androidx.lifecycle.ViewModelProvider$Factory
        @NotNull
        public ViewModel create(@NotNull Class class0, @NotNull CreationExtras creationExtras0) {
            Intrinsics.checkNotNullParameter(class0, "modelClass");
            Intrinsics.checkNotNullParameter(creationExtras0, "extras");
            return this.create(class0);
        }

        @Override  // androidx.lifecycle.ViewModelProvider$Factory
        @NotNull
        public ViewModel create(@NotNull KClass kClass0, @NotNull CreationExtras creationExtras0) {
            Intrinsics.checkNotNullParameter(kClass0, "modelClass");
            Intrinsics.checkNotNullParameter(creationExtras0, "extras");
            return this.create(JvmClassMappingKt.getJavaClass(kClass0), creationExtras0);
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @NotNull
        public static final NewInstanceFactory getInstance() {
            return NewInstanceFactory.Companion.getInstance();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "()V", "onRequery", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static class OnRequeryFactory {
        public void onRequery(@NotNull ViewModel viewModel0) {
            Intrinsics.checkNotNullParameter(viewModel0, "viewModel");
        }
    }

    @NotNull
    public static final androidx.lifecycle.ViewModelProvider.Companion Companion;
    @JvmField
    @NotNull
    public static final Key VIEW_MODEL_KEY;
    public final ViewModelProviderImpl a;

    static {
        ViewModelProvider.Companion = new androidx.lifecycle.ViewModelProvider.Companion(null);
        ViewModelProvider.VIEW_MODEL_KEY = ViewModelKey.INSTANCE;
    }

    @JvmOverloads
    public ViewModelProvider(@NotNull ViewModelStore viewModelStore0, @NotNull Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(viewModelStore0, "store");
        Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "factory");
        this(viewModelStore0, viewModelProvider$Factory0, null, 4, null);
    }

    @JvmOverloads
    public ViewModelProvider(@NotNull ViewModelStore viewModelStore0, @NotNull Factory viewModelProvider$Factory0, @NotNull CreationExtras creationExtras0) {
        Intrinsics.checkNotNullParameter(viewModelStore0, "store");
        Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "factory");
        Intrinsics.checkNotNullParameter(creationExtras0, "defaultCreationExtras");
        ViewModelProviderImpl viewModelProviderImpl0 = new ViewModelProviderImpl(viewModelStore0, viewModelProvider$Factory0, creationExtras0);
        super();
        this.a = viewModelProviderImpl0;
    }

    public ViewModelProvider(ViewModelStore viewModelStore0, Factory viewModelProvider$Factory0, CreationExtras creationExtras0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            creationExtras0 = Empty.INSTANCE;
        }
        this(viewModelStore0, viewModelProvider$Factory0, creationExtras0);
    }

    public ViewModelProvider(@NotNull ViewModelStoreOwner viewModelStoreOwner0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "owner");
        this(viewModelStoreOwner0.getViewModelStore(), ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner0), ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(viewModelStoreOwner0));
    }

    public ViewModelProvider(@NotNull ViewModelStoreOwner viewModelStoreOwner0, @NotNull Factory viewModelProvider$Factory0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "owner");
        Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "factory");
        this(viewModelStoreOwner0.getViewModelStore(), viewModelProvider$Factory0, ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(viewModelStoreOwner0));
    }

    @JvmStatic
    @NotNull
    public static final ViewModelProvider create(@NotNull ViewModelStore viewModelStore0, @NotNull Factory viewModelProvider$Factory0, @NotNull CreationExtras creationExtras0) {
        return ViewModelProvider.Companion.create(viewModelStore0, viewModelProvider$Factory0, creationExtras0);
    }

    @JvmStatic
    @NotNull
    public static final ViewModelProvider create(@NotNull ViewModelStoreOwner viewModelStoreOwner0, @NotNull Factory viewModelProvider$Factory0, @NotNull CreationExtras creationExtras0) {
        return ViewModelProvider.Companion.create(viewModelStoreOwner0, viewModelProvider$Factory0, creationExtras0);
    }

    @MainThread
    @NotNull
    public ViewModel get(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        return this.get(JvmClassMappingKt.getKotlinClass(class0));
    }

    @MainThread
    @NotNull
    public ViewModel get(@NotNull String s, @NotNull Class class0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        KClass kClass0 = JvmClassMappingKt.getKotlinClass(class0);
        return this.a.getViewModel$lifecycle_viewmodel_release(kClass0, s);
    }

    @MainThread
    @NotNull
    public final ViewModel get(@NotNull String s, @NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        return this.a.getViewModel$lifecycle_viewmodel_release(kClass0, s);
    }

    @MainThread
    @NotNull
    public final ViewModel get(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        return ViewModelProviderImpl.getViewModel$lifecycle_viewmodel_release$default(this.a, kClass0, null, 2, null);
    }
}

