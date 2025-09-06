package androidx.compose.ui.graphics.vector;

import a5.b;
import androidx.compose.runtime.Immutable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u001F\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0005\u0012\b\b\u0002\u0010\t\u001A\u00020\u0005\u0012\b\b\u0002\u0010\n\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0005\u0012\b\b\u0002\u0010\f\u001A\u00020\u0005\u0012\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r\u0012\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00010\r\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001A\u00020\u00012\u0006\u0010\u0014\u001A\u00020\u0013H\u0086\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0096\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0096\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b)\u0010&\u001A\u0004\b*\u0010(R\u0017\u0010\b\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b+\u0010&\u001A\u0004\b,\u0010(R\u0017\u0010\t\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b-\u0010&\u001A\u0004\b.\u0010(R\u0017\u0010\n\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b/\u0010&\u001A\u0004\b0\u0010(R\u0017\u0010\u000B\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b1\u0010&\u001A\u0004\b2\u0010(R\u0017\u0010\f\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b3\u0010&\u001A\u0004\b4\u0010(R\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u0011\u0010:\u001A\u00020\u00138F\u00A2\u0006\u0006\u001A\u0004\b9\u0010 \u00A8\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorGroup;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "", "name", "", "rotation", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "", "index", "get", "(I)Landroidx/compose/ui/graphics/vector/VectorNode;", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "F", "getRotation", "()F", "c", "getPivotX", "d", "getPivotY", "e", "getScaleX", "f", "getScaleY", "g", "getTranslationX", "h", "getTranslationY", "i", "Ljava/util/List;", "getClipPathData", "()Ljava/util/List;", "getSize", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class VectorGroup extends VectorNode implements Iterable, KMappedMarker {
    public static final int $stable;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0x3FF, null);
    }

    public VectorGroup(@NotNull String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @NotNull List list0, @NotNull List list1) {
        super(null);
        this.a = s;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = list0;
        this.j = list1;
    }

    public VectorGroup(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, List list1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? f : 0.0f), ((v & 4) == 0 ? f1 : 0.0f), ((v & 8) == 0 ? f2 : 0.0f), ((v & 16) == 0 ? f3 : 1.0f), ((v & 0x20) == 0 ? f4 : 1.0f), ((v & 0x40) == 0 ? f5 : 0.0f), ((v & 0x80) == 0 ? f6 : 0.0f), ((v & 0x100) == 0 ? list0 : VectorKt.getEmptyPath()), ((v & 0x200) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof VectorGroup) || !Intrinsics.areEqual(this.a, ((VectorGroup)object0).a)) {
            return false;
        }
        return this.b == ((VectorGroup)object0).b && this.c == ((VectorGroup)object0).c && this.d == ((VectorGroup)object0).d && this.e == ((VectorGroup)object0).e && this.f == ((VectorGroup)object0).f && this.g == ((VectorGroup)object0).g && this.h == ((VectorGroup)object0).h && Intrinsics.areEqual(this.i, ((VectorGroup)object0).i) ? Intrinsics.areEqual(this.j, ((VectorGroup)object0).j) : false;
    }

    @NotNull
    public final VectorNode get(int v) {
        return (VectorNode)this.j.get(v);
    }

    @NotNull
    public final List getClipPathData() {
        return this.i;
    }

    @NotNull
    public final String getName() [...] // 潜在的解密器

    public final float getPivotX() {
        return this.c;
    }

    public final float getPivotY() {
        return this.d;
    }

    public final float getRotation() {
        return this.b;
    }

    public final float getScaleX() {
        return this.e;
    }

    public final float getScaleY() {
        return this.f;
    }

    public final int getSize() {
        return this.j.size();
    }

    public final float getTranslationX() {
        return this.g;
    }

    public final float getTranslationY() {
        return this.h;
    }

    @Override
    public int hashCode() {
        return this.j.hashCode() + b.c(this.i, a.b(this.h, a.b(this.g, a.b(this.f, a.b(this.e, a.b(this.d, a.b(this.c, a.b(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;

            {
                this.a = vectorGroup0.j.iterator();
            }

            @NotNull
            public final Iterator getIt() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @NotNull
            public VectorNode next() {
                return this.a.next();
            }

            @Override
            public Object next() {
                return this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

