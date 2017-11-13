package com.mapsh.dagger2.di.components;

import android.content.Context;

import dagger.Component;

/**
 * @author mapsh on 2017/11/13 18:00.
 */

@Component
interface AppComponent {
    
    Context getContext();
}
