package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0010\u001A\u00020\r*\u00020\b2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u001A\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00040\u001E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0014\u0010$\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "", "onModifierLocalsUpdated", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/foundation/layout/WindowInsets;", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,490:1\n81#2:491\n107#2,2:492\n81#2:494\n107#2,2:495\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n343#1:491\n343#1:492,2\n344#1:494\n344#1:495,2\n*E\n"})
public final class InsetsPaddingModifier implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider {
    public static final int $stable;
    public final WindowInsets a;
    public final MutableState b;
    public final MutableState c;

    public InsetsPaddingModifier(@NotNull WindowInsets windowInsets0) {
        this.a = windowInsets0;
        this.b = SnapshotStateKt.mutableStateOf$default(windowInsets0, null, 2, null);
        this.c = SnapshotStateKt.mutableStateOf$default(windowInsets0, null, 2, null);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof InsetsPaddingModifier ? Intrinsics.areEqual(((InsetsPaddingModifier)object0).a, this.a) : false;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
    }

    @NotNull
    public WindowInsets getValue() {
        return (WindowInsets)this.c.getValue();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this.getValue();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        int v1 = ((WindowInsets)this.b.getValue()).getLeft(measureScope0, measureScope0.getLayoutDirection());
        int v2 = ((WindowInsets)this.b.getValue()).getTop(measureScope0);
        int v3 = ((WindowInsets)this.b.getValue()).getRight(measureScope0, measureScope0.getLayoutDirection()) + v1;
        int v4 = ((WindowInsets)this.b.getValue()).getBottom(measureScope0) + v2;
        Placeable placeable0 = measurable0.measure-BRTryo0(ConstraintsKt.offset-NN6Ew-U(v, -v3, -v4));
        return MeasureScope.layout$default(measureScope0, ConstraintsKt.constrainWidth-K40F9xA(v, placeable0.getWidth() + v3), ConstraintsKt.constrainHeight-K40F9xA(v, placeable0.getHeight() + v4), null, new y2(placeable0, v1, v2), 4, null);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope modifierLocalReadScope0) {
        WindowInsets windowInsets0 = (WindowInsets)modifierLocalReadScope0.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        WindowInsets windowInsets1 = WindowInsetsKt.exclude(this.a, windowInsets0);
        this.b.setValue(windowInsets1);
        WindowInsets windowInsets2 = WindowInsetsKt.union(windowInsets0, this.a);
        this.c.setValue(windowInsets2);
    }
}

