package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A \u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "width", "height", "", "checkMeasuredSize", "(II)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,491:1\n42#2,7:492\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n341#1:492,7\n*E\n"})
public final class LookaheadDelegateKt {
    public static final void checkMeasuredSize(int v, int v1) {
        if((v & 0xFF000000) != 0 || (0xFF000000 & v1) != 0) {
            InlineClassHelperKt.throwIllegalStateException(("Size(" + v + " x " + v1 + ") is out of range. Each dimension must be between 0 and 16777215."));
        }
    }
}

