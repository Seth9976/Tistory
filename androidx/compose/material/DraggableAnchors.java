package androidx.compose.material;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterialApi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\ba\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0007\u001A\u0004\u0018\u00018\u00002\u0006\u0010\b\u001A\u00020\tH&¢\u0006\u0002\u0010\nJ\u001F\u0010\u0007\u001A\u0004\u0018\u00018\u00002\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\fH&¢\u0006\u0002\u0010\rJ\u0015\u0010\u000E\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001A\u00020\tH&J\b\u0010\u0012\u001A\u00020\tH&J\u0015\u0010\u0013\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0014R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/material/DraggableAnchors;", "T", "", "size", "", "getSize", "()I", "closestAnchor", "position", "", "(F)Ljava/lang/Object;", "searchUpwards", "", "(FZ)Ljava/lang/Object;", "hasAnchorFor", "value", "(Ljava/lang/Object;)Z", "maxAnchor", "minAnchor", "positionOf", "(Ljava/lang/Object;)F", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DraggableAnchors {
    @Nullable
    Object closestAnchor(float arg1);

    @Nullable
    Object closestAnchor(float arg1, boolean arg2);

    int getSize();

    boolean hasAnchorFor(Object arg1);

    float maxAnchor();

    float minAnchor();

    float positionOf(Object arg1);
}

