package coil.compose;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0001H&J\u0012\u0010\u0006\u001A\u00020\u00072\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcoil/compose/EqualityDelegate;", "", "equals", "", "self", "other", "hashCode", "", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface EqualityDelegate {
    boolean equals(@Nullable Object arg1, @Nullable Object arg2);

    int hashCode(@Nullable Object arg1);
}

