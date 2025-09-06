package p0;

import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarDuration;
import androidx.compose.material.SnackbarResult;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class b9 implements SnackbarData {
    public final String a;
    public final String b;
    public final SnackbarDuration c;
    public final CancellableContinuationImpl d;

    public b9(String s, String s1, SnackbarDuration snackbarDuration0, CancellableContinuationImpl cancellableContinuationImpl0) {
        this.a = s;
        this.b = s1;
        this.c = snackbarDuration0;
        this.d = cancellableContinuationImpl0;
    }

    @Override  // androidx.compose.material.SnackbarData
    public final void dismiss() {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.d;
        if(cancellableContinuationImpl0.isActive()) {
            cancellableContinuationImpl0.resumeWith(SnackbarResult.Dismissed);
        }
    }

    @Override  // androidx.compose.material.SnackbarData
    public final String getActionLabel() {
        return this.b;
    }

    @Override  // androidx.compose.material.SnackbarData
    public final SnackbarDuration getDuration() {
        return this.c;
    }

    @Override  // androidx.compose.material.SnackbarData
    public final String getMessage() {
        return this.a;
    }

    @Override  // androidx.compose.material.SnackbarData
    public final void performAction() {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.d;
        if(cancellableContinuationImpl0.isActive()) {
            cancellableContinuationImpl0.resumeWith(SnackbarResult.ActionPerformed);
        }
    }
}

