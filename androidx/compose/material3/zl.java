package androidx.compose.material3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class zl implements SnackbarData {
    public final SnackbarVisuals a;
    public final CancellableContinuationImpl b;

    public zl(SnackbarVisuals snackbarVisuals0, CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = snackbarVisuals0;
        this.b = cancellableContinuationImpl0;
    }

    @Override  // androidx.compose.material3.SnackbarData
    public final void dismiss() {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.b;
        if(cancellableContinuationImpl0.isActive()) {
            cancellableContinuationImpl0.resumeWith(SnackbarResult.Dismissed);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zl.class == class0 && Intrinsics.areEqual(this.a, ((zl)object0).a) ? Intrinsics.areEqual(this.b, ((zl)object0).b) : false;
        }
        return false;
    }

    @Override  // androidx.compose.material3.SnackbarData
    public final SnackbarVisuals getVisuals() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.material3.SnackbarData
    public final void performAction() {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.b;
        if(cancellableContinuationImpl0.isActive()) {
            cancellableContinuationImpl0.resumeWith(SnackbarResult.ActionPerformed);
        }
    }
}

