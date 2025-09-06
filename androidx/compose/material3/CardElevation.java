package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\'\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00020\u000F2\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u000B2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/CardElevation;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "shadowElevation$material3_release", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "shadowElevation", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1223#2,6:852\n1223#2,6:858\n1223#2,6:864\n1223#2,6:870\n1223#2,6:876\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n*L\n662#1:852,6\n672#1:858,6\n673#1:864,6\n725#1:870,6\n727#1:876,6\n*E\n"})
public final class CardElevation {
    public static final int $stable;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public CardElevation(float f, float f1, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !(object0 instanceof CardElevation) || !Dp.equals-impl0(this.a, ((CardElevation)object0).a)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((CardElevation)object0).b)) {
            return false;
        }
        if(!Dp.equals-impl0(this.c, ((CardElevation)object0).c)) {
            return false;
        }
        return Dp.equals-impl0(this.d, ((CardElevation)object0).d) ? Dp.equals-impl0(this.f, ((CardElevation)object0).f) : false;
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.f) + a.C(this.d, a.C(this.c, a.C(this.b, Dp.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Composable
    @NotNull
    public final State shadowElevation$material3_release(boolean z, @Nullable InteractionSource interactionSource0, @Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(0x96E3690B);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x96E3690B, v, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:659)");
        }
        composer0.startReplaceGroup(-734838460);
        float f = this.a;
        if(interactionSource0 == null) {
            MutableState mutableState0 = composer0.rememberedValue();
            if(mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(f), null, 2, null);
                composer0.updateRememberedValue(mutableState0);
            }
            composer0.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer0.endReplaceGroup();
            return mutableState0;
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xAB3FAB46, v & 0x3FE, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:670)");
        }
        SnapshotStateList snapshotStateList0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(snapshotStateList0 == composer$Companion0.getEmpty()) {
            snapshotStateList0 = SnapshotStateKt.mutableStateListOf();
            composer0.updateRememberedValue(snapshotStateList0);
        }
        int v1 = 1;
        boolean z1 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changed(interactionSource0) || (v & 0x30) == 0x20;
        p2 p20 = composer0.rememberedValue();
        if(z1 || p20 == composer$Companion0.getEmpty()) {
            p20 = new p2(interactionSource0, snapshotStateList0, null);
            composer0.updateRememberedValue(p20);
        }
        EffectsKt.LaunchedEffect(interactionSource0, p20, composer0, (v & 0x3FE) >> 3 & 14);
        Object object0 = CollectionsKt___CollectionsKt.lastOrNull(snapshotStateList0);
        if(!z) {
            f = this.f;
        }
        else if(((Interaction)object0) instanceof Press) {
            f = this.b;
        }
        else if(((Interaction)object0) instanceof Enter) {
            f = this.d;
        }
        else if(((Interaction)object0) instanceof Focus) {
            f = this.c;
        }
        else if(((Interaction)object0) instanceof Start) {
            f = this.e;
        }
        Animatable animatable0 = composer0.rememberedValue();
        if(animatable0 == composer$Companion0.getEmpty()) {
            animatable0 = new Animatable(Dp.box-impl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer0.updateRememberedValue(animatable0);
        }
        Dp dp0 = Dp.box-impl(f);
        boolean z2 = composer0.changedInstance(animatable0);
        boolean z3 = composer0.changed(f);
        int v2 = ((v & 14 ^ 6) <= 4 || !composer0.changed(z)) && (v & 6) != 4 ? 0 : 1;
        if(((v & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(this)) && (v & 0x180) != 0x100) {
            v1 = 0;
        }
        boolean z4 = composer0.changedInstance(((Interaction)object0));
        q2 q20 = composer0.rememberedValue();
        if((z2 | z3 | v2 | v1 | z4) != 0 || q20 == composer$Companion0.getEmpty()) {
            q2 q21 = new q2(animatable0, f, z, this, ((Interaction)object0), null);
            composer0.updateRememberedValue(q21);
            q20 = q21;
        }
        EffectsKt.LaunchedEffect(dp0, q20, composer0, 0);
        State state0 = animatable0.asState();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }
}

