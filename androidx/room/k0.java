package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import androidx.sqlite.db.SupportSQLiteCompat.Api19Impl;
import androidx.sqlite.db.SupportSQLiteCompat.Api23Impl;
import androidx.sqlite.db.SupportSQLiteCompat.Api29Impl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class k0 implements Cursor {
    public final Cursor a;
    public final AutoCloser b;

    public k0(Cursor cursor0, AutoCloser autoCloser0) {
        Intrinsics.checkNotNullParameter(cursor0, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser0, "autoCloser");
        super();
        this.a = cursor0;
        this.b = autoCloser0;
    }

    @Override  // android.database.Cursor
    public final void close() {
        this.a.close();
        this.b.decrementCountAndScheduleClose();
    }

    @Override  // android.database.Cursor
    public final void copyStringToBuffer(int v, CharArrayBuffer charArrayBuffer0) {
        this.a.copyStringToBuffer(v, charArrayBuffer0);
    }

    @Override  // android.database.Cursor
    public final void deactivate() {
        this.a.deactivate();
    }

    @Override  // android.database.Cursor
    public final byte[] getBlob(int v) {
        return this.a.getBlob(v);
    }

    @Override  // android.database.Cursor
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override  // android.database.Cursor
    public final int getColumnIndex(String s) {
        return this.a.getColumnIndex(s);
    }

    @Override  // android.database.Cursor
    public final int getColumnIndexOrThrow(String s) {
        return this.a.getColumnIndexOrThrow(s);
    }

    @Override  // android.database.Cursor
    public final String getColumnName(int v) {
        return this.a.getColumnName(v);
    }

    @Override  // android.database.Cursor
    public final String[] getColumnNames() {
        return this.a.getColumnNames();
    }

    @Override  // android.database.Cursor
    public final int getCount() {
        return this.a.getCount();
    }

    @Override  // android.database.Cursor
    public final double getDouble(int v) {
        return this.a.getDouble(v);
    }

    @Override  // android.database.Cursor
    public final Bundle getExtras() {
        return this.a.getExtras();
    }

    @Override  // android.database.Cursor
    public final float getFloat(int v) {
        return this.a.getFloat(v);
    }

    @Override  // android.database.Cursor
    public final int getInt(int v) {
        return this.a.getInt(v);
    }

    @Override  // android.database.Cursor
    public final long getLong(int v) {
        return this.a.getLong(v);
    }

    @Override  // android.database.Cursor
    public final Uri getNotificationUri() {
        return Api19Impl.getNotificationUri(this.a);
    }

    @Override  // android.database.Cursor
    public final List getNotificationUris() {
        return Api29Impl.getNotificationUris(this.a);
    }

    @Override  // android.database.Cursor
    public final int getPosition() {
        return this.a.getPosition();
    }

    @Override  // android.database.Cursor
    public final short getShort(int v) {
        return this.a.getShort(v);
    }

    @Override  // android.database.Cursor
    public final String getString(int v) {
        return this.a.getString(v);
    }

    @Override  // android.database.Cursor
    public final int getType(int v) {
        return this.a.getType(v);
    }

    @Override  // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.a.getWantsAllOnMoveCalls();
    }

    @Override  // android.database.Cursor
    public final boolean isAfterLast() {
        return this.a.isAfterLast();
    }

    @Override  // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.a.isBeforeFirst();
    }

    @Override  // android.database.Cursor
    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @Override  // android.database.Cursor
    public final boolean isFirst() {
        return this.a.isFirst();
    }

    @Override  // android.database.Cursor
    public final boolean isLast() {
        return this.a.isLast();
    }

    @Override  // android.database.Cursor
    public final boolean isNull(int v) {
        return this.a.isNull(v);
    }

    @Override  // android.database.Cursor
    public final boolean move(int v) {
        return this.a.move(v);
    }

    @Override  // android.database.Cursor
    public final boolean moveToFirst() {
        return this.a.moveToFirst();
    }

    @Override  // android.database.Cursor
    public final boolean moveToLast() {
        return this.a.moveToLast();
    }

    @Override  // android.database.Cursor
    public final boolean moveToNext() {
        return this.a.moveToNext();
    }

    @Override  // android.database.Cursor
    public final boolean moveToPosition(int v) {
        return this.a.moveToPosition(v);
    }

    @Override  // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.a.moveToPrevious();
    }

    @Override  // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver0) {
        this.a.registerContentObserver(contentObserver0);
    }

    @Override  // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver0) {
        this.a.registerDataSetObserver(dataSetObserver0);
    }

    @Override  // android.database.Cursor
    public final boolean requery() {
        return this.a.requery();
    }

    @Override  // android.database.Cursor
    public final Bundle respond(Bundle bundle0) {
        return this.a.respond(bundle0);
    }

    @Override  // android.database.Cursor
    public final void setExtras(Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "extras");
        Api23Impl.setExtras(this.a, bundle0);
    }

    @Override  // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver0, Uri uri0) {
        this.a.setNotificationUri(contentResolver0, uri0);
    }

    @Override  // android.database.Cursor
    public final void setNotificationUris(ContentResolver contentResolver0, List list0) {
        Intrinsics.checkNotNullParameter(contentResolver0, "cr");
        Intrinsics.checkNotNullParameter(list0, "uris");
        Api29Impl.setNotificationUris(this.a, contentResolver0, list0);
    }

    @Override  // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver0) {
        this.a.unregisterContentObserver(contentObserver0);
    }

    @Override  // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver0) {
        this.a.unregisterDataSetObserver(dataSetObserver0);
    }
}

