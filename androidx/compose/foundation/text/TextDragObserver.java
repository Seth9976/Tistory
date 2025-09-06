package androidx.compose.foundation.text;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\u001A\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\bJ\u001A\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\bJ\b\u0010\u000F\u001A\u00020\u0003H&J\b\u0010\u0010\u001A\u00020\u0003H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextDragObserver;", "", "onCancel", "", "onDown", "point", "Landroidx/compose/ui/geometry/Offset;", "onDown-k-4lQ0M", "(J)V", "onDrag", "delta", "onDrag-k-4lQ0M", "onStart", "startPoint", "onStart-k-4lQ0M", "onStop", "onUp", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TextDragObserver {
    void onCancel();

    void onDown-k-4lQ0M(long arg1);

    void onDrag-k-4lQ0M(long arg1);

    void onStart-k-4lQ0M(long arg1);

    void onStop();

    void onUp();
}

