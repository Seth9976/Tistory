package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TapOnPosition;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader;
import java.io.InputStream;

public final class g0 implements TapOnPosition, QueueFile.ElementReader {
    public boolean a;
    public final Object b;

    public g0() {
        this.b = new Handler(Looper.getMainLooper(), new f0(0));
    }

    public g0(TextFieldSelectionState textFieldSelectionState0, boolean z) {
        this.b = textFieldSelectionState0;
        this.a = z;
    }

    public g0(StringBuilder stringBuilder0) {
        this.b = stringBuilder0;
        this.a = true;
    }

    public void a(Resource resource0, boolean z) {
        synchronized(this) {
            if(this.a || z) {
                ((Handler)this.b).obtainMessage(1, resource0).sendToTarget();
            }
            else {
                this.a = true;
                resource0.recycle();
                this.a = false;
            }
        }
    }

    @Override  // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
    public void onEvent-k-4lQ0M(long v) {
        TextFieldSelectionState textFieldSelectionState0 = (TextFieldSelectionState)this.b;
        TextFieldSelectionState.access$markStartContentVisibleOffset(textFieldSelectionState0);
        textFieldSelectionState0.updateHandleDragging-Uv8p0NA((this.a ? Handle.SelectionStart : Handle.SelectionEnd), SelectionHandlesKt.getAdjustedCoordinates-k-4lQ0M(textFieldSelectionState0.c(this.a)));
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementReader
    public void read(InputStream inputStream0, int v) {
        boolean z = this.a;
        StringBuilder stringBuilder0 = (StringBuilder)this.b;
        if(z) {
            this.a = false;
        }
        else {
            stringBuilder0.append(", ");
        }
        stringBuilder0.append(v);
    }
}

