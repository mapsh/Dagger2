package com.mapsh.dagger2.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author mapsh on 2017/11/13 18:06.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}