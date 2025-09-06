package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.Preconditions;
import r0.a;

public final class f implements Compat {
    public final ClipData a;
    public final int b;
    public final int c;
    public final Uri d;
    public final Bundle e;

    public f(d d0) {
        this.a = (ClipData)Preconditions.checkNotNull(d0.a);
        this.b = Preconditions.checkArgumentInRange(d0.b, 0, 5, "source");
        this.c = Preconditions.checkFlagsArgument(d0.c, 1);
        this.d = d0.d;
        this.e = d0.e;
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final ClipData getClip() {
        return this.a;
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final Bundle getExtras() {
        return this.e;
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final int getFlags() {
        return this.c;
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final Uri getLinkUri() {
        return this.d;
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final int getSource() {
        return this.b;
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final ContentInfo getWrapped() {
        return null;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("ContentInfoCompat{clip=");
        stringBuilder0.append(this.a.getDescription());
        stringBuilder0.append(", source=");
        int v = this.b;
        switch(v) {
            case 0: {
                s = "SOURCE_APP";
                break;
            }
            case 1: {
                s = "SOURCE_CLIPBOARD";
                break;
            }
            case 2: {
                s = "SOURCE_INPUT_METHOD";
                break;
            }
            case 3: {
                s = "SOURCE_DRAG_AND_DROP";
                break;
            }
            case 4: {
                s = "SOURCE_AUTOFILL";
                break;
            }
            case 5: {
                s = "SOURCE_PROCESS_TEXT";
                break;
            }
            default: {
                s = String.valueOf(v);
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", flags=");
        stringBuilder0.append(((this.c & 1) == 0 ? String.valueOf(this.c) : "FLAG_CONVERT_TO_PLAIN_TEXT"));
        String s1 = "";
        stringBuilder0.append((this.d == null ? "" : ", hasLinkUri(" + this.d.toString().length() + ")"));
        if(this.e != null) {
            s1 = ", hasExtras";
        }
        return a.o(stringBuilder0, s1, "}");
    }
}

