package f2;

import android.os.CancellationSignal.OnCancelListener;
import androidx.activity.h;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import g3.o;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;

public final class d implements CancellationSignal.OnCancelListener {
    public final int a;
    public final Object b;

    public d(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        switch(this.a) {
            case 0: {
                DefaultImpls.cancel$default(((Job)this.b), null, 1, null);
                return;
            }
            case 1: {
                o o0 = (o)this.b;
                synchronized(o0) {
                    if(o0.e) {
                        return;
                    }
                    o0.e = true;
                }
                o0.d = null;
                o0.a.removeUpdates(o0);
                h h0 = o0.f;
                if(h0 != null) {
                    o0.c.removeCallbacks(h0);
                    o0.f = null;
                }
                return;
            }
            case 2: {
                TextFieldSelectionManager textFieldSelectionManager0 = (TextFieldSelectionManager)this.b;
                if(textFieldSelectionManager0 != null) {
                    textFieldSelectionManager0.clearPreviewHighlight$foundation_release();
                }
                return;
            }
            default: {
                TextFieldState textFieldState0 = ((TransformedTextFieldState)this.b).a;
                textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                textFieldState0.getMainBuffer$foundation_release().clearHighlight();
                TextFieldState.access$commitEditAsUser(textFieldState0, ((TransformedTextFieldState)this.b).b, true, TextFieldEditUndoBehavior.MergeIfPossible);
            }
        }
    }
}

