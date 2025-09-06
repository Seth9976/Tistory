package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001A\u0010\t\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/DeadKeyCombiner;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "", "consume-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "consume", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class DeadKeyCombiner {
    public static final int $stable = 8;
    public Integer a;

    @Nullable
    public final Integer consume-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        int v = KeyEvent_androidKt.getUtf16CodePoint-ZmokQxo(keyEvent0);
        Integer integer0 = null;
        if((0x80000000 & v) != 0) {
            this.a = (int)(v & 0x7FFFFFFF);
            return null;
        }
        Integer integer1 = this.a;
        if(integer1 != null) {
            this.a = null;
            Integer integer2 = KeyCharacterMap.getDeadChar(((int)integer1), v);
            if(integer2.intValue() != 0) {
                integer0 = integer2;
            }
            return integer0 == null ? v : integer0;
        }
        return v;
    }
}

