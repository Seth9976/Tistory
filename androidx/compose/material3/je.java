package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.jvm.functions.Function1;

public final class je implements RowScope, MultiChoiceSegmentedButtonRowScope {
    public final RowScopeInstance a;

    public je(RowScopeInstance rowScopeInstance0) {
        this.a = rowScopeInstance0;
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    public final Modifier align(Modifier modifier0, Vertical alignment$Vertical0) {
        return this.a.align(modifier0, alignment$Vertical0);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    public final Modifier alignBy(Modifier modifier0, HorizontalAlignmentLine horizontalAlignmentLine0) {
        return this.a.alignBy(modifier0, horizontalAlignmentLine0);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    public final Modifier alignBy(Modifier modifier0, Function1 function10) {
        return this.a.alignBy(modifier0, function10);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    public final Modifier alignByBaseline(Modifier modifier0) {
        return this.a.alignByBaseline(modifier0);
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    public final Modifier weight(Modifier modifier0, float f, boolean z) {
        return this.a.weight(modifier0, f, z);
    }
}

