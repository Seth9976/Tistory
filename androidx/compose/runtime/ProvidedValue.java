package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bl\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u000E\u0010\t\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000E\u0010\u000B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0019\u0010\u000F\u001A\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\b\u000E\u0012\u0006\u0010\u0010\u001A\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\"\u0010\u000B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R-\u0010\u000F\u001A\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\b\u000E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u001A\u0010\u0010\u001A\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R$\u0010-\u001A\u00020\u00062\u0006\u0010*\u001A\u00020\u00068G@BX\u0086\u000E¢\u0006\f\n\u0004\b+\u0010\'\u001A\u0004\b,\u0010)R\u0017\u0010\u0005\u001A\u00028\u00008F¢\u0006\f\u0012\u0004\b0\u00101\u001A\u0004\b.\u0010/R\u001A\u00104\u001A\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b3\u00101\u001A\u0004\b2\u0010/R\u0014\u00106\u001A\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b5\u0010)¨\u00067"}, d2 = {"Landroidx/compose/runtime/ProvidedValue;", "T", "", "Landroidx/compose/runtime/CompositionLocal;", "compositionLocal", "value", "", "explicitNull", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "mutationPolicy", "Landroidx/compose/runtime/MutableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "compute", "isDynamic", "<init>", "(Landroidx/compose/runtime/CompositionLocal;Ljava/lang/Object;ZLandroidx/compose/runtime/SnapshotMutationPolicy;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Z)V", "ifNotAlreadyProvided$runtime_release", "()Landroidx/compose/runtime/ProvidedValue;", "ifNotAlreadyProvided", "a", "Landroidx/compose/runtime/CompositionLocal;", "getCompositionLocal", "()Landroidx/compose/runtime/CompositionLocal;", "c", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getMutationPolicy$runtime_release", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "d", "Landroidx/compose/runtime/MutableState;", "getState$runtime_release", "()Landroidx/compose/runtime/MutableState;", "e", "Lkotlin/jvm/functions/Function1;", "getCompute$runtime_release", "()Lkotlin/jvm/functions/Function1;", "f", "Z", "isDynamic$runtime_release", "()Z", "<set-?>", "h", "getCanOverride", "canOverride", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "()V", "getEffectiveValue$runtime_release", "getEffectiveValue$runtime_release$annotations", "effectiveValue", "isStatic$runtime_release", "isStatic", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ProvidedValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4582:1\n1#2:4583\n*E\n"})
public final class ProvidedValue {
    public static final int $stable = 8;
    public final CompositionLocal a;
    public final boolean b;
    public final SnapshotMutationPolicy c;
    public final MutableState d;
    public final Function1 e;
    public final boolean f;
    public final Object g;
    public boolean h;

    public ProvidedValue(@NotNull CompositionLocal compositionLocal0, @Nullable Object object0, boolean z, @Nullable SnapshotMutationPolicy snapshotMutationPolicy0, @Nullable MutableState mutableState0, @Nullable Function1 function10, boolean z1) {
        this.a = compositionLocal0;
        this.b = z;
        this.c = snapshotMutationPolicy0;
        this.d = mutableState0;
        this.e = function10;
        this.f = z1;
        this.g = object0;
        this.h = true;
    }

    @JvmName(name = "getCanOverride")
    public final boolean getCanOverride() {
        return this.h;
    }

    @NotNull
    public final CompositionLocal getCompositionLocal() {
        return this.a;
    }

    @Nullable
    public final Function1 getCompute$runtime_release() {
        return this.e;
    }

    public final Object getEffectiveValue$runtime_release() {
        if(this.b) {
            return null;
        }
        MutableState mutableState0 = this.d;
        if(mutableState0 != null) {
            return mutableState0.getValue();
        }
        Object object0 = this.g;
        if(object0 != null) {
            return object0;
        }
        ComposerKt.composeRuntimeError("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public static void getEffectiveValue$runtime_release$annotations() {
    }

    @Nullable
    public final SnapshotMutationPolicy getMutationPolicy$runtime_release() {
        return this.c;
    }

    @Nullable
    public final MutableState getState$runtime_release() {
        return this.d;
    }

    public final Object getValue() {
        return this.g;
    }

    public static void getValue$annotations() {
    }

    @NotNull
    public final ProvidedValue ifNotAlreadyProvided$runtime_release() {
        this.h = false;
        return this;
    }

    public final boolean isDynamic$runtime_release() {
        return this.f;
    }

    // 去混淆评级： 低(20)
    public final boolean isStatic$runtime_release() {
        return (this.b || this.getValue() != null) && !this.f;
    }
}

