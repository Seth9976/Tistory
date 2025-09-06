package androidx.compose.ui.res;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0001\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\f\u0010\u0003¨\u0006\r"}, d2 = {"Landroidx/compose/ui/res/ResourceIdCache;", "", "<init>", "()V", "Landroid/content/res/Resources;", "res", "", "id", "Landroid/util/TypedValue;", "resolveResourcePath", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "", "clear", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ResourceIdCache {
    public static final int $stable = 8;
    public final MutableIntObjectMap a;

    public ResourceIdCache() {
        this.a = new MutableIntObjectMap(0, 1, null);
    }

    public final void clear() {
        synchronized(this) {
            this.a.clear();
        }
    }

    @NotNull
    public final TypedValue resolveResourcePath(@NotNull Resources resources0, @DrawableRes int v) {
        synchronized(this) {
            TypedValue typedValue0 = (TypedValue)this.a.get(v);
            if(typedValue0 == null) {
                typedValue0 = new TypedValue();
                resources0.getValue(v, typedValue0, true);
                this.a.put(v, typedValue0);
            }
            return typedValue0;
        }
    }
}

