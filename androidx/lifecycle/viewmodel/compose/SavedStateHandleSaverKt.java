package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.lifecycle.SavedStateHandle;
import h1.a;
import h1.b;
import j4.c;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.PropertyDelegateProvider;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AK\u0010\t\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0016\b\u0002\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001AQ\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0014\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\u0012\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007H\u0007¢\u0006\u0004\b\t\u0010\r\u001A_\u0010\t\u001A\u001E\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u000F0\u000E\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0016\b\u0002\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\u0010\u001Ao\u0010\t\u001A\u001E\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00028\u00000\u00120\u000E\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000E\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\f*\u00020\u00022\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"", "T", "Landroidx/lifecycle/SavedStateHandle;", "", "key", "Landroidx/compose/runtime/saveable/Saver;", "saver", "Lkotlin/Function0;", "init", "saveable", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/MutableState;", "Lkotlin/properties/PropertyDelegateProvider;", "Lkotlin/properties/ReadOnlyProperty;", "(Landroidx/lifecycle/SavedStateHandle;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;)Lkotlin/properties/PropertyDelegateProvider;", "M", "Lkotlin/properties/ReadWriteProperty;", "saveableMutableState", "lifecycle-viewmodel-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "SavedStateHandleSaverKt")
@SourceDebugExtension({"SMAP\nSavedStateHandleSaver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.android.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
public final class SavedStateHandleSaverKt {
    @SavedStateHandleSaveableApi
    @NotNull
    public static final MutableState saveable(@NotNull SavedStateHandle savedStateHandle0, @NotNull String s, @NotNull Saver saver0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(saver0, "stateSaver");
        Intrinsics.checkNotNullParameter(function00, "init");
        Intrinsics.checkNotNull(saver0, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return (MutableState)SavedStateHandleSaverKt.saveable(savedStateHandle0, s, SaverKt.Saver(new a(saver0, 1), new b(saver0, 1)), function00);
    }

    @SavedStateHandleSaveableApi
    @NotNull
    public static final Object saveable(@NotNull SavedStateHandle savedStateHandle0, @NotNull String s, @NotNull Saver saver0, @NotNull Function0 function00) {
        Object object1;
        Intrinsics.checkNotNullParameter(savedStateHandle0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(saver0, "saver");
        Intrinsics.checkNotNullParameter(function00, "init");
        Bundle bundle0 = (Bundle)savedStateHandle0.get(s);
        if(bundle0 == null) {
            object1 = function00.invoke();
        }
        else {
            Object object0 = bundle0.get("value");
            if(object0 == null) {
                object1 = function00.invoke();
            }
            else {
                object1 = saver0.restore(object0);
                if(object1 == null) {
                    object1 = function00.invoke();
                }
            }
        }
        savedStateHandle0.setSavedStateProvider(s, new c(object1, saver0));
        return object1;
    }

    @SavedStateHandleSaveableApi
    @NotNull
    public static final PropertyDelegateProvider saveable(@NotNull SavedStateHandle savedStateHandle0, @NotNull Saver saver0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "<this>");
        Intrinsics.checkNotNullParameter(saver0, "saver");
        Intrinsics.checkNotNullParameter(function00, "init");
        return new j4.b(savedStateHandle0, saver0, function00, 0);
    }

    public static Object saveable$default(SavedStateHandle savedStateHandle0, String s, Saver saver0, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            saver0 = SaverKt.autoSaver();
        }
        return SavedStateHandleSaverKt.saveable(savedStateHandle0, s, saver0, function00);
    }

    public static PropertyDelegateProvider saveable$default(SavedStateHandle savedStateHandle0, Saver saver0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            saver0 = SaverKt.autoSaver();
        }
        return SavedStateHandleSaverKt.saveable(savedStateHandle0, saver0, function00);
    }

    @SavedStateHandleSaveableApi
    @JvmName(name = "saveableMutableState")
    @NotNull
    public static final PropertyDelegateProvider saveableMutableState(@NotNull SavedStateHandle savedStateHandle0, @NotNull Saver saver0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "<this>");
        Intrinsics.checkNotNullParameter(saver0, "stateSaver");
        Intrinsics.checkNotNullParameter(function00, "init");
        return new j4.b(savedStateHandle0, saver0, function00, 1);

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0003\u001A\u00028\u00002\b\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002¢\u0006\u0002\u0010\u0007J,\u0010\b\u001A\u00020\t2\b\u0010\u0004\u001A\u0004\u0018\u00010\u00022\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000B¨\u0006\f"}, d2 = {"androidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$1", "Lkotlin/properties/ReadWriteProperty;", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSavedStateHandleSaver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSaver.android.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,199:1\n81#2:200\n107#2,2:201\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSaver.android.kt\nandroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt$saveable$3$1\n*L\n170#1:200\n173#1:201,2\n*E\n"})
        public final class androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable.3.1 implements ReadWriteProperty {
            public final MutableState a;

            public androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.saveable.3.1(MutableState mutableState0) {
                this.a = mutableState0;
            }

            @Override  // kotlin.properties.ReadWriteProperty
            @NotNull
            public Object getValue(@Nullable Object object0, @NotNull KProperty kProperty0) {
                Intrinsics.checkNotNullParameter(kProperty0, "property");
                return this.a.getValue();
            }

            @Override  // kotlin.properties.ReadWriteProperty
            public void setValue(@Nullable Object object0, @NotNull KProperty kProperty0, @NotNull Object object1) {
                Intrinsics.checkNotNullParameter(kProperty0, "property");
                Intrinsics.checkNotNullParameter(object1, "value");
                this.a.setValue(object1);
            }
        }

    }

    public static PropertyDelegateProvider saveableMutableState$default(SavedStateHandle savedStateHandle0, Saver saver0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            saver0 = SaverKt.autoSaver();
        }
        return SavedStateHandleSaverKt.saveableMutableState(savedStateHandle0, saver0, function00);
    }
}

