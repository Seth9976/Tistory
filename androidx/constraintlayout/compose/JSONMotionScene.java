package androidx.constraintlayout.compose;

import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u000B\u0010\nJ\u0019\u0010\f\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001A\u00020\b2\u0006\u0010\u0004\u001A\u00020\u0003H\u0014¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u0019\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00020\u0012H\u0014¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/constraintlayout/compose/JSONMotionScene;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/MotionScene;", "", "content", "<init>", "(Ljava/lang/String;)V", "name", "", "setConstraintSetContent", "(Ljava/lang/String;Ljava/lang/String;)V", "setTransitionContent", "getConstraintSet", "(Ljava/lang/String;)Ljava/lang/String;", "", "index", "(I)Ljava/lang/String;", "getTransition", "", "getForcedProgress", "()F", "resetForcedProgress", "()V", "onNewContent", "progress", "onNewProgress", "(F)V", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class JSONMotionScene extends EditableJSONLayout implements MotionScene {
    public final HashMap j;
    public final HashMap k;
    public float l;

    public JSONMotionScene(@Language("json5") @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "content");
        super(s);
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = NaNf;
        this.initialization();
    }

    @Override  // androidx.constraintlayout.compose.MotionScene
    @Nullable
    public String getConstraintSet(int v) {
        Collection collection0 = this.j.values();
        Intrinsics.checkNotNullExpressionValue(collection0, "constraintSetsContent.values");
        return (String)CollectionsKt___CollectionsKt.elementAtOrNull(collection0, v);
    }

    @Override  // androidx.constraintlayout.compose.MotionScene
    @Nullable
    public String getConstraintSet(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return (String)this.j.get(s);
    }

    @Override  // androidx.constraintlayout.compose.MotionScene
    public float getForcedProgress() {
        return this.l;
    }

    @Override  // androidx.constraintlayout.compose.MotionScene
    @Nullable
    public String getTransition(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return (String)this.k.get(s);
    }

    @Override  // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewContent(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "content");
        super.onNewContent(s);
        try {
            ConstraintSetParserKt.parseMotionSceneJSON(this, s);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewProgress(float f) {
        this.l = f;
        this.signalUpdate();
    }

    @Override  // androidx.constraintlayout.compose.MotionScene
    public void resetForcedProgress() {
        this.l = NaNf;
    }

    @Override  // androidx.constraintlayout.compose.MotionScene
    public void setConstraintSetContent(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "content");
        this.j.put(s, s1);
    }

    @Override  // androidx.constraintlayout.compose.MotionScene
    public void setTransitionContent(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "content");
        this.k.put(s, s1);
    }
}

