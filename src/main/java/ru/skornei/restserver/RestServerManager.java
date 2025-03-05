package ru.skornei.restserver;

import android.content.Context;

public final class RestServerManager {

    private RestServerManager() {
        throw new RuntimeException();
    }

    public static void initialize(Context context) {
        Cache.initialize(context);
    }
}
