package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamLocalUriFetcher extends LocalUriFetcher {
    public static final UriMatcher d;

    static {
        UriMatcher uriMatcher0 = new UriMatcher(-1);
        StreamLocalUriFetcher.d = uriMatcher0;
        uriMatcher0.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher0.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher0.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher0.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher0.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher0.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public StreamLocalUriFetcher(ContentResolver contentResolver0, Uri uri0) {
        super(contentResolver0, uri0);
    }

    public void close(InputStream inputStream0) throws IOException {
        inputStream0.close();
    }

    @Override  // com.bumptech.glide.load.data.LocalUriFetcher
    public void close(Object object0) throws IOException {
        this.close(((InputStream)object0));
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class getDataClass() {
        return InputStream.class;
    }

    public InputStream loadResource(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        InputStream inputStream0;
        switch(StreamLocalUriFetcher.d.match(uri0)) {
            case 3: {
                inputStream0 = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver0, uri0, true);
                break;
            }
            case 1: 
            case 5: {
                Uri uri1 = ContactsContract.Contacts.lookupContact(contentResolver0, uri0);
                if(uri1 == null) {
                    throw new FileNotFoundException("Contact cannot be found");
                }
                inputStream0 = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver0, uri1, true);
                break;
            }
            default: {
                inputStream0 = contentResolver0.openInputStream(uri0);
            }
        }
        if(inputStream0 == null) {
            throw new FileNotFoundException("InputStream is null for " + uri0);
        }
        return inputStream0;
    }

    @Override  // com.bumptech.glide.load.data.LocalUriFetcher
    public Object loadResource(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        return this.loadResource(uri0, contentResolver0);
    }
}

