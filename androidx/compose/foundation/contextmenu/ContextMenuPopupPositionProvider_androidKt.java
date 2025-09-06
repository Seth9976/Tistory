package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A1\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "position", "popupLength", "windowLength", "", "closeAffinity", "alignPopupAxis", "(IIIZ)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ContextMenuPopupPositionProvider_androidKt {
    @VisibleForTesting
    public static final int alignPopupAxis(int v, int v1, int v2, boolean z) {
        if(v1 >= v2) {
            return z ? 0 : v2 - v1;
        }
        if(!z) {
            if(v1 <= v) {
                return v - v1;
            }
        }
        else if(v2 - v1 > v) {
            return v;
        }
        if(z) {
            if(v1 <= v) {
                return v - v1;
            }
        }
        else if(v2 - v1 > v) {
            return v;
        }
        return z ? v2 - v1 : 0;
    }

    public static int alignPopupAxis$default(int v, int v1, int v2, boolean z, int v3, Object object0) {
        if((v3 & 8) != 0) {
            z = true;
        }
        return ContextMenuPopupPositionProvider_androidKt.alignPopupAxis(v, v1, v2, z);
    }
}

