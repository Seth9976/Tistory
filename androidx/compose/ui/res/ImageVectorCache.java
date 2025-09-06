package androidx.compose.ui.res;

import a5.b;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001A\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rJ \u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\u000B¢\u0006\u0004\b\u0011\u0010\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache;", "", "<init>", "()V", "Landroidx/compose/ui/res/ImageVectorCache$Key;", "key", "Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "get", "(Landroidx/compose/ui/res/ImageVectorCache$Key;)Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "configChanges", "", "prune", "(I)V", "imageVectorEntry", "set", "(Landroidx/compose/ui/res/ImageVectorCache$Key;Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;)V", "clear", "ImageVectorEntry", "Key", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ImageVectorCache {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000BJ\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u000B¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "configFlags", "<init>", "(Landroidx/compose/ui/graphics/vector/ImageVector;I)V", "component1", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component2", "()I", "copy", "(Landroidx/compose/ui/graphics/vector/ImageVector;I)Landroidx/compose/ui/res/ImageVectorCache$ImageVectorEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getImageVector", "b", "I", "getConfigFlags", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ImageVectorEntry {
        public static final int $stable;
        public final ImageVector a;
        public final int b;

        public ImageVectorEntry(@NotNull ImageVector imageVector0, int v) {
            this.a = imageVector0;
            this.b = v;
        }

        @NotNull
        public final ImageVector component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final ImageVectorEntry copy(@NotNull ImageVector imageVector0, int v) {
            return new ImageVectorEntry(imageVector0, v);
        }

        public static ImageVectorEntry copy$default(ImageVectorEntry imageVectorCache$ImageVectorEntry0, ImageVector imageVector0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                imageVector0 = imageVectorCache$ImageVectorEntry0.a;
            }
            if((v1 & 2) != 0) {
                v = imageVectorCache$ImageVectorEntry0.b;
            }
            return imageVectorCache$ImageVectorEntry0.copy(imageVector0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ImageVectorEntry)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ImageVectorEntry)object0).a) ? this.b == ((ImageVectorEntry)object0).b : false;
        }

        public final int getConfigFlags() {
            return this.b;
        }

        @NotNull
        public final ImageVector getImageVector() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("ImageVectorEntry(imageVector=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", configFlags=");
            return b.p(stringBuilder0, this.b, ')');
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\n\u0010\u0004\u001A\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001A\u00060\u0002R\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ(\u0010\r\u001A\u00020\u00002\f\b\u0002\u0010\u0004\u001A\u00060\u0002R\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001B\u0010\u0004\u001A\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\f¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "", "id", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "component1", "()Landroid/content/res/Resources$Theme;", "component2", "()I", "copy", "(Landroid/content/res/Resources$Theme;I)Landroidx/compose/ui/res/ImageVectorCache$Key;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/res/Resources$Theme;", "getTheme", "b", "I", "getId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Key {
        public static final int $stable = 8;
        public final Resources.Theme a;
        public final int b;

        public Key(@NotNull Resources.Theme resources$Theme0, int v) {
            this.a = resources$Theme0;
            this.b = v;
        }

        @NotNull
        public final Resources.Theme component1() {
            return this.a;
        }

        public final int component2() {
            return this.b;
        }

        @NotNull
        public final Key copy(@NotNull Resources.Theme resources$Theme0, int v) {
            return new Key(resources$Theme0, v);
        }

        public static Key copy$default(Key imageVectorCache$Key0, Resources.Theme resources$Theme0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                resources$Theme0 = imageVectorCache$Key0.a;
            }
            if((v1 & 2) != 0) {
                v = imageVectorCache$Key0.b;
            }
            return imageVectorCache$Key0.copy(resources$Theme0, v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Key)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((Key)object0).a) ? this.b == ((Key)object0).b : false;
        }

        public final int getId() {
            return this.b;
        }

        @NotNull
        public final Resources.Theme getTheme() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Key(theme=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", id=");
            return b.p(stringBuilder0, this.b, ')');
        }
    }

    public static final int $stable = 8;
    public final HashMap a;

    public ImageVectorCache() {
        this.a = new HashMap();
    }

    public final void clear() {
        this.a.clear();
    }

    @Nullable
    public final ImageVectorEntry get(@NotNull Key imageVectorCache$Key0) {
        WeakReference weakReference0 = (WeakReference)this.a.get(imageVectorCache$Key0);
        return weakReference0 == null ? null : ((ImageVectorEntry)weakReference0.get());
    }

    public final void prune(int v) {
        Iterator iterator0 = this.a.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ImageVectorEntry imageVectorCache$ImageVectorEntry0 = (ImageVectorEntry)((WeakReference)((Map.Entry)object0).getValue()).get();
            if(imageVectorCache$ImageVectorEntry0 == null || Configuration.needNewResources(v, imageVectorCache$ImageVectorEntry0.getConfigFlags())) {
                iterator0.remove();
            }
        }
    }

    public final void set(@NotNull Key imageVectorCache$Key0, @NotNull ImageVectorEntry imageVectorCache$ImageVectorEntry0) {
        WeakReference weakReference0 = new WeakReference(imageVectorCache$ImageVectorEntry0);
        this.a.put(imageVectorCache$Key0, weakReference0);
    }
}

