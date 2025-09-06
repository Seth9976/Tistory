package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A+\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001A!\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0006\u001A\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000B\u0010\f\"*\u0010\u0011\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r8\u0006@BX\u0087\u000E¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u0012\u0004\b\u0013\u0010\u0002\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "enableLiveLiterals", "()V", "T", "", "key", "value", "Landroidx/compose/runtime/State;", "liveLiteral", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/runtime/State;", "", "updateLiveLiteralValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "<set-?>", "b", "Z", "isLiveLiteralsEnabled", "()Z", "isLiveLiteralsEnabled$annotations", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,100:1\n361#2,7:101\n361#2,7:108\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:101,7\n92#1:108,7\n*E\n"})
public final class LiveLiteralKt {
    public static final HashMap a;
    public static boolean b;

    static {
        LiveLiteralKt.a = new HashMap();
    }

    @InternalComposeApi
    public static final void enableLiveLiterals() {
        LiveLiteralKt.b = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return LiveLiteralKt.b;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static void isLiveLiteralsEnabled$annotations() {
    }

    @ComposeCompilerApi
    @InternalComposeApi
    @NotNull
    public static final State liveLiteral(@NotNull String s, Object object0) {
        HashMap hashMap0 = LiveLiteralKt.a;
        MutableState mutableState0 = hashMap0.get(s);
        if(mutableState0 == null) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            hashMap0.put(s, mutableState0);
        }
        Intrinsics.checkNotNull(mutableState0, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return mutableState0;
    }

    @InternalComposeApi
    public static final void updateLiveLiteralValue(@NotNull String s, @Nullable Object object0) {
        boolean z;
        HashMap hashMap0 = LiveLiteralKt.a;
        MutableState mutableState0 = hashMap0.get(s);
        if(mutableState0 == null) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            hashMap0.put(s, mutableState0);
            z = false;
        }
        else {
            z = true;
        }
        if(z) {
            mutableState0.setValue(object0);
        }
    }
}

