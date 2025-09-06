package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u000BR\u0018\u0010\"\u001A\u0006\u0012\u0002\b\u00030\u001F8PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect;", "Landroidx/compose/animation/TransitionEffect;", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Landroidx/compose/ui/Alignment;", "alignment", "<init>", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)V", "component1", "()Landroidx/compose/ui/layout/ContentScale;", "component2", "()Landroidx/compose/ui/Alignment;", "copy", "(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)Landroidx/compose/animation/ContentScaleTransitionEffect;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "b", "Landroidx/compose/ui/Alignment;", "getAlignment", "Landroidx/compose/animation/TransitionEffectKey;", "getKey$animation_release", "()Landroidx/compose/animation/TransitionEffectKey;", "key", "Key", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ContentScaleTransitionEffect extends TransitionEffect {
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect$Key;", "Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/ContentScaleTransitionEffect;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Key implements TransitionEffectKey {
        public Key(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Key Key;
    public final ContentScale a;
    public final Alignment b;

    static {
        ContentScaleTransitionEffect.Key = new Key(null);
    }

    public ContentScaleTransitionEffect(@NotNull ContentScale contentScale0, @NotNull Alignment alignment0) {
        super(null);
        this.a = contentScale0;
        this.b = alignment0;
    }

    @NotNull
    public final ContentScale component1() {
        return this.a;
    }

    @NotNull
    public final Alignment component2() {
        return this.b;
    }

    @NotNull
    public final ContentScaleTransitionEffect copy(@NotNull ContentScale contentScale0, @NotNull Alignment alignment0) {
        return new ContentScaleTransitionEffect(contentScale0, alignment0);
    }

    public static ContentScaleTransitionEffect copy$default(ContentScaleTransitionEffect contentScaleTransitionEffect0, ContentScale contentScale0, Alignment alignment0, int v, Object object0) {
        if((v & 1) != 0) {
            contentScale0 = contentScaleTransitionEffect0.a;
        }
        if((v & 2) != 0) {
            alignment0 = contentScaleTransitionEffect0.b;
        }
        return contentScaleTransitionEffect0.copy(contentScale0, alignment0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ContentScaleTransitionEffect)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((ContentScaleTransitionEffect)object0).a) ? Intrinsics.areEqual(this.b, ((ContentScaleTransitionEffect)object0).b) : false;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.b;
    }

    @NotNull
    public final ContentScale getContentScale() {
        return this.a;
    }

    @Override  // androidx.compose.animation.TransitionEffect
    @NotNull
    public TransitionEffectKey getKey$animation_release() {
        return ContentScaleTransitionEffect.Key;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "ContentScaleTransitionEffect(contentScale=" + this.a + ", alignment=" + this.b + ')';
    }
}

