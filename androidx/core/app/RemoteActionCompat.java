package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.VersionedParcelable;

public final class RemoteActionCompat implements VersionedParcelable {
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public PendingIntent mActionIntent;
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public CharSequence mContentDescription;
    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean mEnabled;
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public IconCompat mIcon;
    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean mShouldShowIcon;
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public CharSequence mTitle;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@NonNull RemoteActionCompat remoteActionCompat0) {
        Preconditions.checkNotNull(remoteActionCompat0);
        this.mIcon = remoteActionCompat0.mIcon;
        this.mTitle = remoteActionCompat0.mTitle;
        this.mContentDescription = remoteActionCompat0.mContentDescription;
        this.mActionIntent = remoteActionCompat0.mActionIntent;
        this.mEnabled = remoteActionCompat0.mEnabled;
        this.mShouldShowIcon = remoteActionCompat0.mShouldShowIcon;
    }

    public RemoteActionCompat(@NonNull IconCompat iconCompat0, @NonNull CharSequence charSequence0, @NonNull CharSequence charSequence1, @NonNull PendingIntent pendingIntent0) {
        this.mIcon = (IconCompat)Preconditions.checkNotNull(iconCompat0);
        this.mTitle = (CharSequence)Preconditions.checkNotNull(charSequence0);
        this.mContentDescription = (CharSequence)Preconditions.checkNotNull(charSequence1);
        this.mActionIntent = (PendingIntent)Preconditions.checkNotNull(pendingIntent0);
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    @NonNull
    @RequiresApi(26)
    public static RemoteActionCompat createFromRemoteAction(@NonNull RemoteAction remoteAction0) {
        Preconditions.checkNotNull(remoteAction0);
        RemoteActionCompat remoteActionCompat0 = new RemoteActionCompat(IconCompat.createFromIcon(w2.d(remoteAction0)), w2.e(remoteAction0), w2.c(remoteAction0), w2.b(remoteAction0));
        remoteActionCompat0.setEnabled(w2.f(remoteAction0));
        if(Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat0.setShouldShowIcon(x2.b(remoteAction0));
        }
        return remoteActionCompat0;
    }

    @NonNull
    public PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    @NonNull
    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    @NonNull
    public IconCompat getIcon() {
        return this.mIcon;
    }

    @NonNull
    public CharSequence getTitle() {
        return this.mTitle;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setShouldShowIcon(boolean z) {
        this.mShouldShowIcon = z;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    @NonNull
    @RequiresApi(26)
    public RemoteAction toRemoteAction() {
        RemoteAction remoteAction0 = w2.a(this.mIcon.toIcon(), this.mTitle, this.mContentDescription, this.mActionIntent);
        w2.g(remoteAction0, this.isEnabled());
        if(Build.VERSION.SDK_INT >= 28) {
            x2.a(remoteAction0, this.shouldShowIcon());
        }
        return remoteAction0;
    }
}

